public class ServicoDeLocacao extends Servico{
    protected String empresaSolicitante;
    protected int quantFrota;
    protected int tempoAluguel;

    public ServicoDeLocacao(){
    }

    public ServicoDeLocacao(String tipoDeServico, String empresaSolicitante, int quantFrota, int tempoAluguel) {
        super(tipoDeServico);
        this.empresaSolicitante = empresaSolicitante;
        this.quantFrota = quantFrota;
        this.tempoAluguel = tempoAluguel;
    }

    public String getEmpresaSolicitante() {
        return empresaSolicitante;
    }

    public void setEmpresaSolicitante(String empresaSolicitante) {
        this.empresaSolicitante = empresaSolicitante;
    }

    public int getQuantFrota() {
        return quantFrota;
    }

    public void setQuantFrota(int quantFrota) {
        this.quantFrota = quantFrota;
    }

    public int getTempoAluguel() {
        return tempoAluguel;
    }

    public void setTempoAluguel(int tempoAluguel) {
        this.tempoAluguel = tempoAluguel;
    }

    @Override
    public void mensagemDeCarregamento() {
        System.out.println("As informações estão sendo inseridas no sistema de locação de veículos... " +
                "Carregamento completo!");
    }

    public ServicoDeLocacao(String tipoDeServico) {
        super(tipoDeServico);
    }

    public float calcularValorLocacao(float quantFrota, float tempoAluguel) throws NumerosInvalidosException{
        if (quantFrota < 0 || tempoAluguel < 0) {
            throw new NumerosInvalidosException();
        }

        if (quantFrota > 30 && tempoAluguel > 30){
            return quantFrota * (30 + (tempoAluguel - 30) * 50000);
        }
        return 100000;
    }


    public int calcularValorLocacao(int quantFrota, int tempoAluguel) throws NumerosInvalidosException{
        if (quantFrota < 0 || tempoAluguel < 0) {
            throw new NumerosInvalidosException();
        }

        if (quantFrota > 30 && tempoAluguel > 30){
            return quantFrota * (30 + (tempoAluguel - 30) * 50000);
        }
        return 100000;
    }

    @Override
    public String toString() {
        return "ServicoDeLocacao{" +
                "empresaSolicitante='" + empresaSolicitante + '\'' +
                ", quantFrota=" + quantFrota +
                ", tempoAluguel=" + tempoAluguel +
                ", tipoDeServico='" + tipoDeServico + '\'' +
                '}';
    }
}

