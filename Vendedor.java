public class Vendedor extends Funcionario{
    public Vendedor(String nome, int idade, String cpf, float salario) {
        super(nome, idade, cpf, salario);
    }

    @Override
    public void descricaoDoCargo() {
        System.out.println("Os deveres e responsabilidades do Vendedor incluem trabalhar em estreita " +
                "colaboração com os clientes para determinar suas necessidades, " +
                "responder às perguntas sobre nossos produtos e recomendar as soluções certas.");;
    }

    @Override
    public void responsabilidades() {
        System.out.println("Garantir altos níveis de satisfação dos clientes \n" +
                "Avaliar as necessidades dos clientes e fornecer assistência e " +
                "informações sobre os recursos do produto \n" +
                "Dar as boas-vindas aos clientes na loja");
    }

    public void realizarAtividade(int quantDeMetasBatidas) {
        System.out.println("A quantidade de metas batidas por " + getNome() + " foram " + quantDeMetasBatidas);
    }
}
