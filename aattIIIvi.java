package Aula_03;
import java.util.Scanner;

public class aattIIIvi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);

		int salario, tempo;

		System.out.println("digite seu salario");

		salario = ler.nextInt();

		System.out.println("digite seu tempo");

		tempo = ler.nextInt();

		double bonus1 = (salario*1.05);

		double bonus2 = (salario*1.07);

		if (tempo<=3) {

			System.out.println("o salario é"+bonus1);

		}

		else {

			System.out.println("o salario é"+bonus2);

		}

	}

}

 