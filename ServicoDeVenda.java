public class ServicoDeVenda extends Servico{
    protected String nomeDoVendedor;
    protected String nomeDoCliente;

    public ServicoDeVenda(){}

    public ServicoDeVenda(String tipoDeServico, String nomeDoVendedor, String nomeDoCliente) {
        super(tipoDeServico);
        this.nomeDoVendedor = nomeDoVendedor;
        this.nomeDoCliente = nomeDoCliente;
    }

    public String getNomeDoVendedor() {
        return nomeDoVendedor;
    }

    public void setNomeDoVendedor(String nomeDoVendedor) {
        this.nomeDoVendedor = nomeDoVendedor;
    }

    public String getNomeDoCliente() {
        return nomeDoCliente;
    }

    public void setNomeDoCliente(String nomeDoCliente) {
        this.nomeDoCliente = nomeDoCliente;
    }

    @Override
    public void mensagemDeCarregamento() {
        System.out.println("As informações estão sendo inseridas no sistema de venda de automóveis... " +
                "Carregamento completo!");

    }

    @Override
    public String toString() {
        return "ServicoDeVenda{" +
                "nomeDoVendedor='" + nomeDoVendedor + '\'' +
                ", nomeDoCliente='" + nomeDoCliente + '\'' +
                ", tipoDeServico='" + tipoDeServico + '\'' +
                '}';
    }
}
