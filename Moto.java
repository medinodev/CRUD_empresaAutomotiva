public class Moto extends Automovel{
    protected String tipoDeMoto;
    protected int valorMoto;

    public Moto(String marca, String ano, String placa, String cor, String tipoDeMoto, int valorMoto) {
        super(marca, ano, placa, cor);
        this.tipoDeMoto = tipoDeMoto;
        this.valorMoto = valorMoto;
    }

    public String getTipoDeMoto() {
        return tipoDeMoto;
    }

    public void setTipoDeMoto(String tipoDeMoto) {
        this.tipoDeMoto = tipoDeMoto;
    }

    public int getValorMoto() {
        return valorMoto;
    }

    public void setValorMoto(int valorMoto) {
        this.valorMoto = valorMoto;
    }

    @Override
    public String mostrarFaixaDePreco() {
        return "Moto Popular -> R$ 8.000 - 20.000" + " || Moto Sport -> R$ 35.000 - 100.000"
                + " || Moto Luxo -> R$ 150.000 - 500.000";
    }

    @Override
    public String toString() {
        return "Moto{" +
                "tipoDeMoto='" + tipoDeMoto + '\'' +
                ", valorMoto=" + valorMoto +
                ", marca='" + marca + '\'' +
                ", ano='" + ano + '\'' +
                ", placa='" + placa + '\'' +
                ", cor='" + cor + '\'' +
                '}';
    }
}
