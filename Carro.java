public class Carro extends Automovel{
    protected int quantDePortas;
    protected String tipoDeCarro;
    protected int valorDoCarro;

    public Carro(String marca, String ano, String placa, String cor, int quantDePortas, String tipoDeCarro, int valorDoCarro) {
        super(marca, ano, placa, cor);
        this.quantDePortas = quantDePortas;
        this.tipoDeCarro = tipoDeCarro;
        this.valorDoCarro = valorDoCarro;
    }

    public int getQuantDePortas() {
        return quantDePortas;
    }

    public void setQuantDePortas(int quantDePortas) {
        this.quantDePortas = quantDePortas;
    }

    public String getTipoDeCarro() {
        return tipoDeCarro;
    }

    public void setTipoDeCarro(String tipoDeCarro) {
        this.tipoDeCarro = tipoDeCarro;
    }

    public int getValorDoCarro() {
        return valorDoCarro;
    }

    public void setValorDoCarro(int valorDoCarro) {
        this.valorDoCarro = valorDoCarro;
    }

    @Override
    public String mostrarFaixaDePreco() {
        return "Carro Pequeno -> R$ 10.000 - 70.000" + " || Carro Médio -> R$ 65.000 - 140.000"
                + " || Carro Grande -> R$ 200.000 - 1.500.000";
    }

    @Override
    public String toString() {
        return "Carro{" +
                "quantDePortas=" + quantDePortas +
                ", tipoDeCarro='" + tipoDeCarro + '\'' +
                ", valorDoCarro=" + valorDoCarro +
                ", marca='" + marca + '\'' +
                ", ano='" + ano + '\'' +
                ", placa='" + placa + '\'' +
                ", cor='" + cor + '\'' +
                '}';
    }
}
