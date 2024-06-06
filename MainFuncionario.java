import java.util.*;

public class MainFuncionario {
    public static void main(String[] args) throws cpfInvalidoException {
        Scanner prompt = new Scanner(System.in);

        List<Funcionario> funcionarios = new ArrayList<>();
        Map<String, Funcionario> funcionarioMap = new HashMap<>();

        int opcao = 0;
        //int cont = 0;

        while  (opcao != 5) {
            System.out.println("Sistema de cadastro de funcionários iniciado.");
            System.out.println("Digite 1 para Cadastrar");
            System.out.println("Digite 2 para Visualizar");
            System.out.println("Digite 3 para Alterar os dados do cliente");
            System.out.println("Digite 4 para Excluir");
            System.out.println("Digite 5 para Sair");

            opcao = prompt.nextInt();
            prompt.nextLine();

            if (opcao == 1){
                System.out.println("Escolha qual funcionário você quer cadastrar...");
                System.out.println("Digite 1 para Atendente");
                System.out.println("Digite 2 para Gerente");
                System.out.println("Digite 3 para Vendedor");

                int opcao2 = 0;
                opcao2 = prompt.nextInt();
                prompt.nextLine();

                if (opcao2 == 1){
                    System.out.println("Digite os dados solicitados do ATENDENTE para cadastro...");
                    System.out.println("Digite o nome do funcionario...");
                    String nome = prompt.nextLine();

                    int idade;
                    try {
                        System.out.println("Idade...");
                        idade = prompt.nextInt();
                        prompt.nextLine();
                    } catch (InputMismatchException erro){
                        System.out.println("Erro: " + erro);
                        System.out.println("No campo idade não pode haver letras... Corrigindo erro... Tente novamente...");
                        prompt.nextLine();
                        idade = prompt.nextInt();
                        prompt.nextLine();
                        //throw new cpfInvalidoException();
                    }


                    String cpf;

                    System.out.println("Digite o CPF do funcionario...");
                    cpf = prompt.nextLine();
                    if (cpf.length()<8)
                        throw new cpfInvalidoException();


                    System.out.println("Digite o salário do funcionario...");
                    float salario = prompt.nextFloat();

                    Atendente novoAtendente = new Atendente(nome, idade, cpf, salario);
                    funcionarios.add(novoAtendente);
                    funcionarioMap.put(cpf,novoAtendente);

                    System.out.println("Dados do funcionário --> " + novoAtendente);

                } else if (opcao2 == 2) {
                    System.out.println("Digite os dados solicitados do GERENTE para cadastro...");
                    System.out.println("Digite o nome do funcionario...");
                    String nome = prompt.nextLine();

                    int idade;
                    try {
                        System.out.println("Idade...");
                        idade = prompt.nextInt();
                        prompt.nextLine();
                    } catch (InputMismatchException erro){
                        System.out.println("Erro: " + erro);
                        System.out.println("No campo idade não pode haver letras... Corrigindo erro... Tente novamente...");
                        prompt.nextLine();
                        idade = prompt.nextInt();
                        prompt.nextLine();
                        //throw new cpfInvalidoException();
                    }


                    String cpf;

                    System.out.println("Digite o CPF do funcionario...");
                    cpf = prompt.nextLine();
                    if (cpf.length()<8)
                        throw new cpfInvalidoException();


                    System.out.println("Digite o salário do funcionario...");
                    float salario = prompt.nextFloat();

                    Gerente novoGerente = new Gerente(nome, idade, cpf, salario);
                    funcionarios.add(novoGerente);
                    funcionarioMap.put(cpf,novoGerente);

                    System.out.println("Dados do funcionário --> " + novoGerente);
                    
                } else if (opcao2 == 3) {
                    System.out.println("Digite os dados solicitados do VENDEDOR para cadastro...");
                    System.out.println("Digite o nome do funcionario...");
                    String nome = prompt.nextLine();

                    int idade;
                    try {
                        System.out.println("Idade...");
                        idade = prompt.nextInt();
                        prompt.nextLine();
                    } catch (InputMismatchException erro){
                        System.out.println("Erro: " + erro);
                        System.out.println("No campo idade não pode haver letras... Corrigindo erro... Tente novamente...");
                        prompt.nextLine();
                        idade = prompt.nextInt();
                        prompt.nextLine();
                        //throw new cpfInvalidoException();
                    }


                    String cpf;

                    System.out.println("Digite o CPF do funcionario...");
                    cpf = prompt.nextLine();
                    if (cpf.length()<8)
                        throw new cpfInvalidoException();


                    System.out.println("Digite o salário do funcionario...");
                    float salario = prompt.nextFloat();

                    Vendedor novoVendedor = new Vendedor(nome, idade, cpf, salario);
                    funcionarios.add(novoVendedor);
                    funcionarioMap.put(cpf,novoVendedor);

                    System.out.println("Dados do funcionário --> " + novoVendedor);
                }
            } else if (opcao == 2) {
                System.out.println("Visualizar Clientes");
                for (int i = 0; i < funcionarios.size() ; i++) {
                    System.out.println(funcionarios.get(i));
                }

            } else if (opcao == 3) {
                System.out.println("Alteração de Funcionários");
                System.out.println("Lista de funcionários ativos");

                for (int i = 0; i < funcionarios.size() ; i++) {
                    System.out.println(funcionarios.get(i));
                }

                System.out.println("Digite o CPF do cliente que voce quer alterar");
                String cpf = prompt.nextLine();

                Funcionario funcionario = funcionarioMap.get(cpf);

                int opcao3=0;
                System.out.println("Dados do funcionario para alteração" + funcionario);
                while (opcao3 != 3){
                    System.out.println("Digite 1 para alterar o nome.");
                    System.out.println("Digite 2 para alterar o salário.");
                    System.out.println("Digite 3 para retornar para o menu anterior");

                    opcao3 = prompt.nextInt();
                    prompt.nextLine();

                    if (opcao3 == 1){
                        System.out.println("O nome atual do funcionario é " + funcionario.getNome());
                        System.out.println("Para qual nome deseja alterar? ");
                        funcionario.setNome(prompt.nextLine());
                        System.out.println("O novo nome do funcionario é " + funcionario.getNome());
                    } else if (opcao3 == 2) {
                        System.out.println("O salario atual do funcionario é " + funcionario.getSalario());
                        System.out.println("Para qual salario deseja alterar? ");
                        funcionario.setSalario(prompt.nextFloat());
                        System.out.println("O novo sobrenome do cliente é " + funcionario.getSalario());
                    }
                }
            }else if (opcao == 4) {
                System.out.println("Exclusão do funcionario");
                System.out.println("Listagem de funcionarios cadastrados");

                for (int i = 0; i < funcionarios.size() ; i++) {
                    System.out.println(funcionarios.get(i));
                }

                System.out.println("Digite o CPF do funcionario que voce quer excluir");
                String cpf = prompt.nextLine();

                Funcionario funcionario = funcionarioMap.get(cpf);

                System.out.println("O funcionario que será excluido será: " + funcionario);

                funcionarios.remove(funcionario);
                funcionarioMap.remove(cpf);

                System.out.println("Funcionario excluido com Sucesso !!!");
            }
        }
    }
}
