public class NumerosInvalidosException extends Exception{
    @Override
    public String getMessage() {
        return "ERRO: Os numero digitados sao negativos";
    }
}
