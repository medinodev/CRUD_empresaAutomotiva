import java.util.*;

public class MainAutomovel {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);

        List<Automovel> automoveis = new ArrayList<>();
        Map<String, Automovel> automovelMap = new HashMap<>();

        int opcao = 0;


        while  (opcao != 5) {
            System.out.println("Sistema de cadastro de automovel iniciado.");
            System.out.println("Digite 1 para Cadastrar");
            System.out.println("Digite 2 para Visualizar");
            System.out.println("Digite 3 para Alterar os dados do cliente");
            System.out.println("Digite 4 para Excluir");
            System.out.println("Digite 5 para Sair");

            try {
                opcao = prompt.nextInt();
                prompt.nextLine();
            } catch (InputMismatchException erro){
                System.out.println("Voce digitou uma letra");
                prompt.nextLine();
                opcao = prompt.nextInt();
            }

            if (opcao == 1) {
                System.out.println("Escolha qual automovel você quer cadastrar...");
                System.out.println("Digite 1 para Carro");
                System.out.println("Digite 2 para Moto");

                int opcao2 = 0;
                opcao2 = prompt.nextInt();
                prompt.nextLine();

                if (opcao2 == 1){
                    System.out.println("Digite os dados solicitados do AUTOMOVEL para cadastro...");

                    System.out.println("Digite a marca...");
                    String marca = prompt.nextLine();
                    System.out.println("Digite o ano...");
                    String ano = prompt.nextLine();
                    System.out.println("Digite a placa...");
                    String placa = prompt.nextLine();
                    System.out.println("Digite a cor...");
                    String cor = prompt.nextLine();
                    System.out.println("Digite a quantidade de portas...");
                    int quantDePortas = prompt.nextInt();
                    System.out.println("Digite o tipo de carro...");
                    String tipoDeCarro = prompt.nextLine();
                    System.out.println("Digite o valor ...");
                    int valorDoCarro = prompt.nextInt();

                    Carro novoCarro = new Carro(marca, ano, placa, cor, quantDePortas, tipoDeCarro, valorDoCarro);
                    automoveis.add(novoCarro);
                    automovelMap.put(placa,novoCarro);

                    System.out.println("Dados do funcionário --> " + novoCarro);

                } else if (opcao2 == 2) {
                    System.out.println("Digite os dados solicitados do AUTOMOVEL para cadastro...");

                    System.out.println("Digite a marca...");
                    String marca = prompt.nextLine();
                    System.out.println("Digite o ano...");
                    String ano = prompt.nextLine();
                    System.out.println("Digite a placa...");
                    String placa = prompt.nextLine();
                    System.out.println("Digite a cor...");
                    String cor = prompt.nextLine();
                    System.out.println("Digite o tipo de moto...");
                    String tipoDeMoto = prompt.nextLine();
                    System.out.println("Digite o valor ...");
                    int valorMoto = prompt.nextInt();

                    Moto novaMoto = new Moto(marca, ano, placa, cor, tipoDeMoto, valorMoto);
                    automoveis.add(novaMoto);
                    automovelMap.put(placa,novaMoto);

                    System.out.println("Dados do funcionário --> " + novaMoto);

                }

            } else if (opcao == 2) {
                System.out.println("Visualizar Automoveis");
                for (int i = 0; i < automoveis.size() ; i++) {
                    System.out.println(automoveis.get(i));
                }
            } else if (opcao == 3) {
                System.out.println("Alteração de automovel");
                System.out.println("Lista de automoveis cadastrados");

                for (int i = 0; i < automoveis.size(); i++) {
                    System.out.println(automoveis.get(i));
                }

                System.out.println("Digite a placa do automovel que voce quer alterar");
                String placa = prompt.nextLine();

                Automovel automovel = automovelMap.get(placa);

                int opcao3 = 0;
                System.out.println("Dados do automovel para alteração" + automovel);
                while (opcao3 != 3) {
                    System.out.println("Digite 1 para alterar a marca.");
                    System.out.println("Digite 2 para alterar a cor.");
                    System.out.println("Digite 3 para retornar para o menu anterior");

                    opcao3 = prompt.nextInt();
                    prompt.nextLine();

                    if (opcao3 == 1) {
                        System.out.println("A marca atual do automovel é " + automovel.getPlaca());
                        System.out.println("Para qual marca deseja alterar? ");
                        automovel.setPlaca(prompt.nextLine());
                        System.out.println("A nova marca é " + automovel.getPlaca());
                    } else if (opcao3 == 2) {
                        System.out.println("A cor atual do automovel é " + automovel.getCor());
                        System.out.println("Para qual cor deseja alterar? ");
                        automovel.setCor(prompt.nextLine());
                        System.out.println("A nova cor é " + automovel.getCor());
                    }
                }
            } else if (opcao == 4) {
                System.out.println("Exclusão do automovel");
                System.out.println("Listagem de automoveis cadastrados");

                for (int i = 0; i < automoveis.size() ; i++) {
                    System.out.println(automoveis.get(i));
                }

                System.out.println("Digite a placa do automovel que voce quer excluir");
                String placa = prompt.nextLine();

                Automovel automovel = automovelMap.get(placa);

                System.out.println("O automovel que será excluido será: " + automovel);

                automoveis.remove(automovel);
                automovelMap.remove(placa);

                System.out.println("Automovel excluido com Sucesso !!!");

            }
        }
    }
}
