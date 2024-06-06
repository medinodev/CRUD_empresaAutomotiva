import java.util.InputMismatchException;
import java.util.Scanner;

public class MainCliente {
    public static void main(String[] args) throws cpfInvalidoException {
        Scanner prompt = new Scanner(System.in);

        Cliente clientes[] = new Cliente[10]; //teste
        int op = 0;
        int cont = 0;

        while  (op != 5) {
            System.out.println("Sistema de cadastro de cliente iniciado.");
            System.out.println("Digite 1 para Cadastrar");
            System.out.println("Digite 2 para Visualizar");
            System.out.println("Digite 3 para Alterar os dados do cliente");
            System.out.println("Digite 4 para Excluir");
            System.out.println("Digite 5 para Sair");

            op = prompt.nextInt();
            prompt.nextLine();
            int idade;
            if(op == 1){
                System.out.println("Digite os dados solicitados para cadastro...");
                System.out.println("Digite o nome do cliente...");
                String nome = prompt.nextLine();
                System.out.println("Digite o sobrenome do cliente...");
                String sobrenome = prompt.nextLine();
                try {
                    System.out.println("Idade...");
                    idade = prompt.nextInt();
                    prompt.nextLine();
                } catch (InputMismatchException erro){
                    //erro.printStackTrace();
                    System.out.println("Erro: " + erro);
                    System.out.println("No campo idade não pode haver letras");
                    prompt.nextLine();
                    idade = prompt.nextInt();
                    prompt.nextLine();
                }


                System.out.println("CPF...");
                String cpf = prompt.nextLine();
                if (cpf.length()<8)
                    throw new cpfInvalidoException();


                System.out.println("Gênero...");
                String genero = prompt.nextLine();
                clientes[cont] = new Cliente(nome, sobrenome, idade, cpf, genero);

                System.out.println("Dados do cliente --> " + clientes[cont]);
                cont++;
            } else if (op == 2) {
                System.out.println("Visualizar Clientes");
                for (int i = 0; i < cont ; i++) {
                    System.out.println(clientes[i]);
                }

            } else if (op == 3) {
                System.out.println("Alteração de Cliente");
                System.out.println("Lista de clientes ativos");

                for (int i = 0; i < cont ; i++) {
                    System.out.println("ID "+i+" - "+clientes[i]);
                }

                System.out.println("Digite o ID do cliente que você quer alterar");
                int id = prompt.nextInt();

                int op2 = 0;
                System.out.println("Dados do cliente para alteração" + clientes[id]);
                while (op2 != 4){
                    System.out.println("Digite 1 para alterar o nome.");
                    System.out.println("Digite 2 para alterar o sobrenome.");
                    System.out.println("Digite 3 para alterar a idade.");
                    System.out.println("Digite 4 para retornar para o menu anterior");
                    op2 = prompt.nextInt();
                    prompt.nextLine();

                    if (op2 == 1){
                        System.out.println("O nome atual do aluno é " + clientes[id].getNome());
                        System.out.println("Para qual nome deseja alterar? ");
                        clientes[id].setNome(prompt.nextLine());
                        System.out.println("O novo nome do cliente é " + clientes[id].getNome());
                    } else if (op2 == 2) {
                        System.out.println("O sobrenome atual do aluno é " + clientes[id].getSobrenome());
                        System.out.println("Para qual sobrenome deseja alterar? ");
                        clientes[id].setSobrenome(prompt.nextLine());
                        System.out.println("O novo sobrenome do cliente é " + clientes[id].getSobrenome());

                    } else if (op2 == 3) {
                        System.out.println("A idade atual do aluno é " + clientes[id].getIdade());
                        System.out.println("Para qual idade deseja alterar? ");
                        clientes[id].setIdade(prompt.nextInt());
                        System.out.println("A nova idade do cliente é " + clientes[id].getIdade());
                    }
                }

            } else if (op == 4) {
                System.out.println("Exclusão do Cliente");
                System.out.println("Listagem de clientes cadastrados");
                for (int i = 0; i < cont ; i++) {
                    System.out.println("ID "+i+" - "+clientes[i]);
                }
                System.out.println("Digite o ID do cliente que deseja excluir");
                int id = prompt.nextInt();
                System.out.println("O cliente que será excluido será: " + clientes[id]);
                clientes[id] = null;
                System.out.println("Cliente excluido com Sucesso !!!");
            }
        }
    }
}
