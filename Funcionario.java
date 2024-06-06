public abstract class Funcionario implements Descricao{
    protected String nome;
    protected int idade;
    protected String cpf;
    protected float salario;

    public Funcionario(){}

    public Funcionario(String nome, int idade, String cpf, float salario) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public void descricaoDoCargo() {
        System.out.println("Descrição em andamento");
    }

    public void responsabilidades(){}

    public void realizarAtividade(){
        System.out.println(getNome() + " esta ocupado.");
    }

    public String realizarAtividade(String atividade){
        return getNome() + " esta ocupado fazendo " + atividade + ".";
    }

}
