package desafio4;
import java.util.Scanner;

public class Elefante {
    public static void main(String[] args) {
        
        int vezesElefanteIncomoda;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira quantas vezes o elefante incomoda: ");
        vezesElefanteIncomoda = scanner.nextInt();
        scanner.close();

        for( int i = 1; i <= vezesElefanteIncomoda ; i++){
            System.out.print("Incomoda, ");
        }

        System.out.print("muito mais");
    }
}
