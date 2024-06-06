public class Gerente extends Funcionario{
    public Gerente(String nome) {
        this.nome = nome;
    }

    public Gerente(String nome, int idade, String cpf, float salario) {
        super(nome, idade, cpf, salario);
    }

    @Override
    public void descricaoDoCargo() {
        System.out.println("O gerente sempre terá como principais funções: planejamento, organização, controle, " +
                "definição de estratégias");
    }

    @Override
    public void responsabilidades() {
        System.out.println("Contratação de pessoas;\n" +
                "Treinamento de novos colaboradores;\n" +
                "Motivação os funcionários;\n" +
                "Incentivo à comunicação da equipe;\n" +
                "Organização geral;\n" +
                "Definição de metas;\n" +
                "Controle de entradas e saídas.");
    }

    public void realizarAtividade(int quantReunioes){
        System.out.println("O gerente " + getNome() + " participou de " + quantReunioes + " reuniões com a " +
                "diretoria esse mës.");
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cpf='" + cpf + '\'' +
                ", salario=" + salario +
                '}';
    }
}
