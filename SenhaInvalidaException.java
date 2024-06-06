public class SenhaInvalidaException extends Exception{

    @Override
    public String getMessage() {
        return "ERRO: Senha incorreta... Encerrando sistema!";
    }
}
