package jogosimples;

import java.util.Scanner;


public class JogoSimples {

	/**
	 * Escreva um m�todo que transforme os segundos dados para o formato hora:minutos:segundos.
	 * @param segundos � converter
	 * @return string para retornar depois de formatado: 23:59:59
	 * 
	 * Exemplo(s): 
	 * - Se o input � 1432, printa e retorna o formato 0:23:52
	 * - Se o input � 0, printa e retorna o formato 0:0:0
	 * - Se o input n�o for v�lido (e.g. input < 0 ) retorna -1:-1:-1	
	 */
	public String converteTempo(int segundos){
			int horas;
			int minutos;
			
			if(segundos < 0) {
				return Integer.toString(-1)+":"+Integer.toString(-1)+":"+Integer.toString(-1);
			}else {
				horas = segundos/3600;
				segundos = segundos%3600;
				minutos = segundos/60;
				segundos = segundos%60;
				
				return Integer.toString(horas)+":"+Integer.toString(minutos)+":"+Integer.toString(segundos);					
			}
	}

	/**
	 * Escreva um m�todo que soma todos os digitos digitados.
	 * @param inteiro para somar digitos
	 * @return inteiro com os numeros j� somados.
	 * 
	 * Exemplo(s): 
	 * - Se o input for 524, retorna 11.
	 * - Se o input for 7, retorna 7.
	 * - Se o input for 0, retorna 0.
	 */
	public int somaDigitos(int input){
		int sum = 0;
		
		while (input != 0) {
			sum += input % 10;
			input /= 10;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		// Crie uma inst�ncia da classe JogoSimples
		// TODO: Seu c�digo aqui
		JogoSimples game = new JogoSimples();
		
		Scanner sc = new Scanner(System.in);
		
		// Pergunte ao usu�rio qual jogo deseja jogar.
		// Ent�o pergunta ao usu�rio o valor para passar ao m�todo correspondente.
		
		// se o usuario digitar 1, entao fa�a o m�todo converte tempo.
		// se digitar 2, pe�a o m�todo que soma os digitos.

		// TODO: Seu c�digo aqui
		System.out.println("Qual jogo deseja jogar?");
		System.out.println("1 - Jogo da convers�o de tempo.");
		System.out.println("2 - Jogo da soma dos digitos.");
		System.out.println("0 - Sair");
		System.out.println("Digite o numero correspondente ao jogo desejado:");
		int gameOption = sc.nextInt();
		
		while (gameOption != 0) {
			if(gameOption == 1) {
				System.out.println("Digite o n�mero de segundos que deseja calcular: ");
				int valor = sc.nextInt();
				System.out.println(game.converteTempo(valor));
				break;
			}else if(gameOption == 2) {
				System.out.println("Digite qualquer n�mero inteiro positivo: ");
				int valor = sc.nextInt();
				System.out.println(game.somaDigitos(valor));
				break;
			}else {
				System.out.println("Por favor, digite uma op��o v�lida!");
			}
		}
		
		sc.close();
		
	}	
}