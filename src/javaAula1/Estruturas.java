package javaAula1;

public class Estruturas {

	public static void main(String[] args) {
		// estrutura condicional IF
		int numero = 10;
		if(numero > 5) {
			System.out.println("numero é maior");
		}
		
		// estrutura SWITCH CASE
		int num = 10;
		switch(num) {
			case 5:
				System.out.println("a variavel vale 5");
				break;
				
			case 1:
				System.out.println("variavel vale 1");
				
			default:
				System.out.println("o valor da variavel nao foi encontrado");
		}
		
		// estrutura de repetição WHILE
		int contador = 0;
		while(contador <= 5) {
			System.out.println(contador);
			contador += 1;
		}
		
		// estrutura de repetição FOR
		for(int cont = 5; cont >= 0; cont --) {
			System.out.println(cont);
		}

	}

}
