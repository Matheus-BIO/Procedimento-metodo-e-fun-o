package exercicios_m�todo;

import java.util.Scanner;

public class Resposta_n2 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int x,y;
		double soma=0;
		int v=1;
		
		System.out.println("Digite dois n�meros com valores diferentes: ");
		System.out.println();
		System.out.println("Digite o "+v+"� n�mero.");
		x = leitor.nextInt();
		v++;
		System.out.println("Digite o "+v+"� n�mero.");
		y = leitor.nextInt();
		

		if (x<y) {
			
			do {
			
			soma=x+soma;
			x++;
		}
		
		while (x<y);
		
		
		System.out.println("A soma de todos n�meros interios de um ao outro � igual �: "+(soma+y));}
		
		
		if(x>y) {
		
			do {
				
				soma=y+soma;
				y++;
			}
			
			while (y<x);
		
			System.out.println("A soma de todos n�meros interios de um ao outro � igual �: "+(soma+x));}


				
		
	}


}

