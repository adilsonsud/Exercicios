import java.util.Scanner;

public class ex01{
    public static void main(String[] args) {
        System.out.println("Exercicio 01");
        System.out.println("imprimindo segunda linha para o github");   
         System.out.println("-----------------------------------------");
        
        Scanner n = new Scanner(System.in); 
        System.out.print("Digite seu nome: ");   
        String nome = n.nextLine();
        System.out.println("-----------------------------------------");
        System.out.println("Seu nome e : " + nome);
        n.close();
        System.out.println();
         
    }
}