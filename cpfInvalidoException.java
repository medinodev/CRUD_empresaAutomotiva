public class cpfInvalidoException extends Exception{
    @Override
    public String getMessage() {
        return "ERRO: O CPF possui menos de oito dígitos!";
    }
}
