import java.io.StringReader;
import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
       // Atendente atendente_1 = new Atendente("Carol");

        Funcionario funcionario = new Atendente("Carol");

        Scanner prompt = new Scanner(System.in);
        System.out.println("Digite");
        String i = prompt.nextLine();

        System.out.println(funcionario.realizarAtividade(i));

    }
}
