package exercicios_m�todo;

import java.util.Scanner;

public class Resposta_n4 {

	public static void main(String[] args) {
		
		
		Scanner leitor= new Scanner(System.in);
	
		double x,y;
		int soma,multiplicacao,divisao,subtracao;
		int v=1;
		int operacao = 0;
		
		System.out.println("Digite dois n�meros inteiros.");
		System.out.println();
		System.out.println("Digite o "+v+"� n�mero.");
		x= leitor.nextInt();
		v++;
		System.out.println("Digite o "+v+"� n�mero.");
		y= leitor.nextInt();
		System.out.println();
		System.out.println("Agora escolha uma opera��o que deseja realizar.");
		System.out.println("1-- SOMA");
		System.out.println("2-- SUBTRA��O");
		System.out.println("3-- MULTIPLICA��O");
		System.out.println("4-- DIVIS�O");
		operacao = leitor.nextInt();
		
		
		
		switch(operacao) {
		
		case 1: {
			soma = (int) +(x+y);
			System.out.println("A soma �: "+soma);
			break;
		}
		case 2:{
			subtracao = (int) -(x-y);
			System.out.println("A subtra��o �: "+subtracao);
			break;
		}
		case 3:{
			multiplicacao = (int) (x*y);
			System.out.println("A multiplica��o �: "+multiplicacao);
			break;
		}
		case 4:{
			divisao = (int) (x/y);
			System.out.println("A divis�o �:"+divisao);
			break;
		}
		default: System.out.println("N�o � possivel realizar essaa opera��o.");
			
			
		}
		
		}
		

	}


