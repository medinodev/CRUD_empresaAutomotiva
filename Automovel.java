public abstract class Automovel{
    protected String marca;
    protected String ano;
    protected String placa;
    protected String cor;

    public Automovel(){}
    public Automovel(String marca, String ano, String placa, String cor) {
        this.marca = marca;
        this.ano = ano;
        this.placa = placa;
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String mostrarFaixaDePreco(){
        return "A faixa de preço do automóvel é R$ ";
    }

}
