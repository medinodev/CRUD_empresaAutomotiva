public class Verificacao implements Seguranca{
    protected String senhaCorreta;

    public Verificacao(String senhaCorreta){
        this.senhaCorreta = senhaCorreta;
    }

    public String getSenhaCorreta() {
        return senhaCorreta;
    }

    public void setSenhaCorreta(String senhaCorreta) {
        this.senhaCorreta = senhaCorreta;
    }

    @Override
    public boolean verificarSenha(String senha) {
        return senha.equals(senhaCorreta);
    }

    /*public void mensagemSucesso(){
        System.out.println("Carregando sistema... liberando");
    }

    public void mensagemFracasso(){
        System.out.println("Falha no sistema... Encerrando");
    }
    */

}
