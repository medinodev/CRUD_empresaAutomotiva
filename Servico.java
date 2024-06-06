public abstract class Servico {
    protected String tipoDeServico;

    public Servico(){}


    public Servico(String tipoDeServico) {
        this.tipoDeServico = tipoDeServico;
    }

    public String getTipoDeServico(){
        return tipoDeServico;
    }
    public void setTipoDeServico(String tipoDeServico){
        this.tipoDeServico = tipoDeServico;
    }

    public void mensagemDeCarregamento(){
        System.out.println("Carregando...");
    }

}
