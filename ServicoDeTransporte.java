public class ServicoDeTransporte extends Servico{
    protected String localDeEntrega;
    protected float quantKM;
    protected String nomeDoSolicitante;
    protected int quantCarros;

    public ServicoDeTransporte(){}

    public ServicoDeTransporte(String tipoDeSevico, String localDeEntrega, float quantKM, String nomeDoSolicitante, int quantCarros) {
        this.tipoDeServico = tipoDeSevico;
        this.localDeEntrega = localDeEntrega;
        this.quantKM = quantKM;
        this.nomeDoSolicitante = nomeDoSolicitante;
        this.quantCarros = quantCarros;
    }

    public String getLocalDeEntrega() {
        return localDeEntrega;
    }

    public void setLocalDeEntrega(String localDeEntrega) {
        this.localDeEntrega = localDeEntrega;
    }

    public String getNomeDoSolicitante() {
        return nomeDoSolicitante;
    }

    public void setNomeDoSolicitante(String nomeDoSolicitante) {
        this.nomeDoSolicitante = nomeDoSolicitante;
    }

    public float getQuantKM() {
        return quantKM;
    }

    public void setQuantKM(float quantKM) {
        this.quantKM = quantKM;
    }

    public int getQuantCarros() {
        return quantCarros;
    }

    public void setQuantCarros(int quantCarros) {
        this.quantCarros = quantCarros;
    }

    @Override
    public void mensagemDeCarregamento() {
        System.out.println("As informações estão sendo inseridas no sistema de locação de transporte de veículos... " +
                "Carregamento completo!");
    }

    public float calcularValorTransporte(float quantKM, float quantCarros){
        if(quantKM <= 5 && quantCarros == 1){
            return 500.0f;
        }
        return 500 + (quantKM * 50) * quantCarros;
    }



    @Override
    public String toString() {
        return "ServicoDeTransporte{" +
                "localDeEntrega='" + localDeEntrega + '\'' +
                ", quantKM=" + quantKM +
                ", nomeDoSolicitante='" + nomeDoSolicitante + '\'' +
                ", quantCarros=" + quantCarros +
                ", tipoDeServico='" + tipoDeServico + '\'' +
                '}';
    }
}
