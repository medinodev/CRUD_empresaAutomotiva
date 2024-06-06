import java.util.*;

public class MainServico {

    public static void main(String[] args) throws SenhaInvalidaException, NumerosInvalidosException {

        List<Servico> servicos = new ArrayList<>();
        Map<String,Servico> servicoMap = new HashMap<>();

        String senhaCorreta = "1234";

        Verificacao liberarAcesso = new Verificacao(senhaCorreta);

        Scanner prompt = new Scanner(System.in);
        String senhaUsuario;

        System.out.println("Digite sua senha para acesso do sistema");
        senhaUsuario = prompt.nextLine();

        if(liberarAcesso.verificarSenha(senhaUsuario)){
            System.out.println("Senha correta... Carregando menu do sistema!");
        } else throw new SenhaInvalidaException();

        int opcao = 0;

        while  (opcao != 5) {
           System.out.println("Sistema de cadastro de servico iniciado.");
           System.out.println("Digite 1 para Cadastrar");
           System.out.println("Digite 2 para Visualizar");
           System.out.println("Digite 3 para Alterar ");
           System.out.println("Digite 4 para Excluir");
           System.out.println("Digite 5 para Sair");

            opcao = prompt.nextInt();
            prompt.nextLine();

            if (opcao == 1) {
                System.out.println("Escolha qual servico você quer cadastrar...");
                System.out.println("Digite 1 para Servico de Venda");
                System.out.println("Digite 2 para Servico de Transporte");
                System.out.println("Digite 3 para Servico de Locacao");

                int opcao2 = 0;
                opcao2 = prompt.nextInt();
                prompt.nextLine();

                if (opcao2 == 1) {
                    System.out.println("Digite os dados solicitados do servico de vendas para cadastro...");
                    System.out.println("Digite o tipo de servico...");
                    String tipoDeServico = prompt.nextLine();
                    System.out.println("Digite o nome do vendedor...");
                    String nomeDoVendedor = prompt.nextLine();
                    System.out.println("Digite o nome do cliente...");
                    String nomeDoCliente = prompt.nextLine();

                    ServicoDeVenda novoServicoDeVendas = new ServicoDeVenda(tipoDeServico, nomeDoVendedor, nomeDoCliente);
                    servicos.add(novoServicoDeVendas);
                    servicoMap.put(tipoDeServico,novoServicoDeVendas);

                    System.out.println("Dados da venda --> " + novoServicoDeVendas);

                    novoServicoDeVendas.mensagemDeCarregamento();

                } else if (opcao2 == 2) {
                    System.out.println("Digite os dados solicitados do servico de transporte para cadastro...");
                    System.out.println("Digite o tipo de servico...");
                    String tipoDeServico = prompt.nextLine();
                    System.out.println("Digite o nome do local de entrega...");
                    String localDeEntrega = prompt.nextLine();
                    System.out.println("Digite a quantidade de KM...");
                    float quantKM = prompt.nextFloat();
                    System.out.println("Digite o nome do solicitante...");
                    String nomeDoSolicitante = prompt.nextLine();
                    System.out.println("Digite a quantidade de carros...");
                    int quantCarros = prompt.nextInt();

                    ServicoDeTransporte novoServicoDeTransporte = new ServicoDeTransporte(tipoDeServico, localDeEntrega, quantKM, nomeDoSolicitante, quantCarros );
                    servicos.add(novoServicoDeTransporte);
                    servicoMap.put(tipoDeServico,novoServicoDeTransporte);

                    System.out.println("Dados do servico --> " + novoServicoDeTransporte);

                    novoServicoDeTransporte.calcularValorTransporte(quantKM, quantCarros);
                    novoServicoDeTransporte.mensagemDeCarregamento();

                } else if (opcao2 == 3) {
                    System.out.println("Digite os dados solicitados do servico de locacao para cadastro...");
                    System.out.println("Digite o tipo de servico...");
                    String tipoDeServico = prompt.nextLine();
                    System.out.println("Digite o nome da empresa solicitante...");
                    String empresaSolicitante = prompt.nextLine();
                    System.out.println("Digite a quantidade da frota...");
                    int quantFrota = prompt.nextInt();
                    System.out.println("Digite o tempo de aluguel...");
                    int tempoAluguel = prompt.nextInt();

                    ServicoDeLocacao novoServicoDeLocacao = new ServicoDeLocacao(tipoDeServico, empresaSolicitante, quantFrota, tempoAluguel);
                    servicos.add(novoServicoDeLocacao);
                    servicoMap.put(tipoDeServico,novoServicoDeLocacao);

                    novoServicoDeLocacao.calcularValorLocacao(quantFrota, tempoAluguel);
                    novoServicoDeLocacao.mensagemDeCarregamento();
                }

            }  else if (opcao == 2) {
                System.out.println("Visualizar Servicos");
                for (int i = 0; i < servicos.size(); i++) {
                    System.out.println(servicos.get(i));
                }

            } else if (opcao == 3) {
                System.out.println("Alteração de Servico");
                System.out.println("Lista de servicos cadastrados");

                for (int i = 0; i < servicos.size() ; i++) {
                    System.out.println(servicos.get(i));
                }

                System.out.println("Digite o tipo de servico que voce quer alterar");
                String tipoDeServico = prompt.nextLine();

                Servico servico = servicoMap.get(tipoDeServico);
                //ServicoDeLocacao servico1 = servicoMap.get(tipoDeServico);

                int opcao3=0;
                System.out.println("Dados do servico para alteração" + servico);
                while (opcao3 != 4) {
                    System.out.println("Digite 1 para alterar o nome do vendedor.");
                    System.out.println("Digite 2 para alterar o quantidade de carros.");
                    System.out.println("Digite 3 para alterar o tempo de aluguel.");
                    System.out.println("Digite 4 para retornar para o menu anterior");

                    opcao3 = prompt.nextInt();
                    prompt.nextLine();

                    if (opcao3 == 1) {
                        ServicoDeVenda servicoDeVenda = (ServicoDeVenda) servico;
                        System.out.println("O nome atual do vendedor é " + servicoDeVenda.getNomeDoVendedor());
                        System.out.println("Para qual nome deseja alterar? ");
                        servicoDeVenda.setNomeDoVendedor(prompt.nextLine());
                        System.out.println("O novo nome do vendedor é " + servicoDeVenda.getNomeDoVendedor());
                    } else if (opcao3 == 2) {
                        ServicoDeTransporte servicoDeTransporte = (ServicoDeTransporte) servico; 
                        System.out.println("A quantidade de carros é " + servicoDeTransporte.getQuantCarros());
                        System.out.println("Para qual quantidade deseja alterar? ");
                        servicoDeTransporte.setQuantCarros(prompt.nextInt());
                        System.out.println("A nova quantidade é " + servicoDeTransporte.getQuantCarros());
                    } else if (opcao3 == 3) {
                        ServicoDeLocacao servicoDeLocacao = (ServicoDeLocacao) servico;
                        System.out.println("A quantidade da frota é " + servicoDeLocacao.getQuantFrota());
                        System.out.println("Para qual quantidade deseja alterar? ");
                        servicoDeLocacao.setQuantFrota(prompt.nextInt());
                        System.out.println("A nova quantidade é " + servicoDeLocacao.getQuantFrota());

                    }    

                }

            } else if (opcao == 4) {

                System.out.println("Exclusão do servico");
                System.out.println("Listagem de servicos cadastrados");

                for (int i = 0; i < servicos.size() ; i++) {
                    System.out.println(servicos.get(i));
                }

                System.out.println("Digite o tipo de servico que voce quer excluir");
                String tipoDeServico = prompt.nextLine();

                Servico servico = servicoMap.get(tipoDeServico);

                System.out.println("O servico que será excluido será: " + servico);

                servicos.remove(servico);
                servicos.remove(tipoDeServico);

                System.out.println("Servico excluido com Sucesso !!!");
            }

        }

    }

}

