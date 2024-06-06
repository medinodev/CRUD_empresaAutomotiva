public class Cliente implements EmpresaAutomotiva{
    protected String nome;
    protected String sobrenome;
    protected int idade;
    protected String cpf;
    protected String genero;

    public Cliente(String nome, String sobrenome, int idade, String cpf, String genero) throws cpfInvalidoException {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.cpf = cpf;
        this.genero = genero;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }



    public void realizarAcao(){
        System.out.println("Olhando os carros");
    }

    public void realizarAcao(String pedido){
        System.out.println("O cliente quer " + pedido);
    }

    public void realizarAcao(int numCarros){
        System.out.println("O cliente quer levar " + numCarros);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", idade=" + idade +
                ", cpf='" + cpf + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }
}
