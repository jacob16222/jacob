package Aula_03;
import java.util.Scanner;

public class atiV3 {
	public static void main(String[] args) {
    int idade;
    Scanner ler = new Scanner(System.in);
    System.out.println("informe sua idade: ");
    idade=ler.nextInt();
    String mensagem = idade >= 18 ? "Maior de idade" : "Menor de idade";
    System.out.println(mensagem); // Imprime "maior de idade"
	}
}
