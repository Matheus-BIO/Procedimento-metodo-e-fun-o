package exercicios_m�todo;

import java.util.Scanner;

public class Resposta_n1 {

	public static void main(String[] args) {
		
		multi();
		
	}
		
		public static void multi() {
		
			Scanner leitor= new Scanner(System.in);
			
			int multiplicacao;
			int x, y;
		
			System.out.printf("Digite dois n�meros inteiros: " );
			x=leitor.nextInt();
			System.out.println("Digite o pr�ximo n�mero: ");
			y=leitor.nextInt();
			
			multiplicacao = x*y;
			
			System.out.println("O resultado �: "+multiplicacao);
		
		
		
		
		
		
		
		
		

	}

}
