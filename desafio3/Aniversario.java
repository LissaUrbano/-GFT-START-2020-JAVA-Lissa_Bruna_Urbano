package desafio3;

import java.util.Scanner;

public class Aniversario {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int dia;
        int mes;
        int ano;

        System.out.print("Digite o dia de seu nascimento: ");   
        dia = scanner.nextInt();  
    
        System.out.print("Digite o mês de seu nascimento: ");    
        mes = scanner.nextInt(); 
        
        System.out.print("Digite o ano de seu nascimento: "); 
        ano = scanner.nextInt();  

        if (dia <= 31)  
        {
            if(mes <= 12)   
            {
                if (ano <= 2018)   
                {
                    System.out.printf("Data válida");
                }
                else
                {
                    System.out.println("Ano digitado inválido, é superior a 2018.");
                }
            }
            else
            {
                System.out.println("Mes digitado inválido, ultrapassa os 12 meses do ano.");
            }
        }
        else
        {
            System.out.println("Dia digitado inválido, ultrapassa os 31 dias de cada mês.");
        }

        scanner.close();
    }
}
