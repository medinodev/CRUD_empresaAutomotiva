public class Atendente extends Funcionario{
    public Atendente(String nome){ this.nome = nome; }

    public Atendente(String nome, int idade, String cpf, float salario) {
        super(nome, idade, cpf, salario);
    }


    @Override
    public void descricaoDoCargo() {
        System.out.println(" Responsável por fazer o atendimento ao cliente, de modo gentil e eficaz. Além disso, " +
                "também será responsável pela organização da loja e recepção de fornecedores, " +
                "de acordo com as demandas estabelecidas pelo (a) gerente ou supervisor(a) de vendas.");;
    }

    @Override
    public void responsabilidades() {
        System.out.println("Recepcionar os clientes \n " +
                "Esclarecer dúvidas \n" +
                "Apresentar opções de compras \n" +
                "Organizar diariamente o estoque");
    }

    public void realizarAtividade(boolean atendendoCliente) {
        if(atendendoCliente){
            System.out.println(getNome() + " esta ocupado atendendo um cliente");
        } else {
            System.out.println(getNome() + " não esta atendendo");
        }
    }

    @Override
    public String toString() {
        return "Atendente{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cpf='" + cpf + '\'' +
                ", salario=" + salario +
                '}';
    }
}
