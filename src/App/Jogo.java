package App;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

/**
 * 
 * @author Equipe
 * Classe jogo que implementa a Interface Tabuleiro.
 *
 */
public class Jogo implements Tabuleiro{

	/**
	 * M�todo implementado da interface.
	 */
	@Override // Sobrescrevendo o m�todo e implementando.
	public void preencheArray(String[] array) {
		String pos = "|_|"; // Posi��es gerais do array.
		
		// Atribuindo o valor fixo das casas especiais.
		array[3] = "|?|";
		array[7] = "|?|";
		array[12] = "|?|";
		array[18] = "|?|";
		array[23] = "|?|";
		array[28] = "|?|";
		array[30] = "|?|";
		array[32] = "|?|";
		array[40] = "|?|";
		array[45] = "|?|";
		array[49] = "|?|";
		array[50] = "|?|";
		array[54] = "|?|";
		array[58] = "|?|";
		array[62] = "|?|";
		array[67] = "|?|";
		array[71] = "|?|";
		array[75] = "|?|";
		array[77] = "|?|";
		array[79] = "|?|";
		array[81] = "|?|";
		array[83] = "|?|";
		array[88] = "|?|";
		array[93] = "|?|";
		array[98] = "|?|";

		//Percorrendo o array e atribuindo o valor geral da variavel pos
		//nas posi��es nulas e mantendo o valor das casas especiais.
		for(int i = 0; i < array.length; i++) {	
			if(array[i] == null) {
				array[i] = pos;
			} else {
				array[i] = array[i];
			}	
		}
	}

	/**
	 * M�todo implementado da interface.
	 */
	@Override
	public void criaTabuleiro(String[] array) {

		//Criando design do tabuleiro.
		System.out.println("-----------------------------------------------------------------------------"
				+ " L.A.R.G.A.D.A -----------------------------------------------------------------------"
				+ "----------------");
		System.out.println();
		System.out.println("____________________________________________________________________"
				+ "____________________________________________________________________________"
				+ "_______________________");
		System.out.println();
		
		//For: Completa o design e pula as linhas da pista de corrida.
		for(int i = 0; i < array.length; i++) {			

				System.out.printf(array[i]);
				System.out.printf(" --> ");		
			
			if(i == 19) {
				System.out.println();
				System.out.println("____________________________________________________________________"
						+ "____________________________________________________________________________"
						+ "_______________________");
				System.out.println();
			} else if(i == 39) {
				System.out.println();
				System.out.println("____________________________________________________________________"
						+ "____________________________________________________________________________"
						+ "_______________________");
				System.out.println();
			} else if(i == 59) {
				System.out.println();
				System.out.println("____________________________________________________________________"
						+ "____________________________________________________________________________"
						+ "_______________________");
				System.out.println();
			} else if(i == 79) {
				System.out.println();
				System.out.println("____________________________________________________________________"
						+ "____________________________________________________________________________"
						+ "_______________________");
				System.out.println();
			}
		}
		
		System.out.println();
		System.out.println("____________________________________________________________________"
				+ "____________________________________________________________________________"
				+ "_______________________");
		System.out.println();
		System.out.println();
		System.out.println("-----------------------------------------------------------------------------"
				+ " V.I.T.O.R.I.A -----------------------------------------------------------------------"
				+ "----------------");
	}

	/**
	 * M�todo jogar referente ao jogo que acontece entre dois jogadores.
	 */
	public void jogar() {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		//Instancia um novo jogador solicita o nome e o simbolo do carrinho.
		Jogador jogador1 = new Jogador();
		System.out.println("Digite o nome do Jogador 1: ");
		jogador1.setNome(scanner.next());
		System.out.println("Digite uma letra para representar seu carrinho: ");
		jogador1.setSimbolo(scanner.next());
		
		//Instancia um segundo jogador solicita o nome e o simbolo do carrinho.
		Jogador jogador2 = new Jogador();
		System.out.println("Digite o nome do Jogador 2: ");
		jogador2.setNome(scanner.next());
		System.out.println("Digite uma letra para representar seu carrinho: ");
		jogador2.setSimbolo(scanner.next());
		
		System.out.println();
		System.out.println();
		
		//Solicita ao jogador 1 que escolha entre cara e coroa, e armazena em 
		//uma variavel convertendo o que foi digitado para maiusculo.
		String escolhaSorteio = "";
		
		System.out.println(jogador1.getNome() + " Cara ou Coroa??");
		escolhaSorteio = scanner.next().toUpperCase();
		
		//Validar Cara e Coroa!
		while(!Objects.equals("CARA", escolhaSorteio) && !Objects.equals("COROA", escolhaSorteio)) {
			System.out.println("Escolha uma op��o v�lida !");
			System.out.println(jogador1.getNome() + " Cara ou Coroa??");
			escolhaSorteio = scanner.next().toUpperCase();
		}
		
		//Condi��o chamando o m�todo caraCoroa que retorna um resultado boolean
		//o parametro passado � a escolha do jogador 1 escolhendo entre cara ou coroa.
		if(caraCoroa(escolhaSorteio)) {
			System.out.println(jogador1.getNome() + " joga primeiro!");
			System.out.println();
			jogador1.vez = true; //Caso a escolha for correta jogador 1 obt�m a posse da vez.
			jogador2.vez = false;//Jogador 2 perde a vez.
		}else {
			System.out.println(jogador2.getNome() + " joga primeiro!");
			System.out.println();
			jogador2.vez = true;//Caso a escolha for incorreta jogador 2 obt�m a posse da vez.
			jogador1.vez = false;//Jogador 1 perde a vez.
		}

		//Cria array de 100 posi��es.
		String[] arrayPosicao = new String[100];
		//Preenche as posi��es chamando o m�todo.
		preencheArray(arrayPosicao);
		//Cria o design do tabuleiro.
		criaTabuleiro(arrayPosicao);
		
		//Aguarda a a��o de apertar enter do jogodor para efetuar a jogada.
		System.out.printf("Aperte enter para jogar os dados e iniciar a corrida!");
		
		for(int i = 0; i < 2; i++) {	
			scanner.nextLine();
			System.out.println();
		}
		
		//Valores auxiliares para marcar o avan�o dos jogadores na corrida.
		int valorJ1 = 0;
		int valorJ2 = 0;
		
		//Enquanto um dos jogadores n�o chegar ao final da corrida o jogo n�o acaba.
		while (jogador1.getSimbolo() != arrayPosicao[99] || jogador2.getSimbolo() != arrayPosicao[99]) {
			
			//Vez do jogador 1.
			if(jogador1.vez == true) {
				
				try {
					//x e y representam os dados jogados retornando um valor de 1 a 6.
					int x = (int)(Math.random()*6) + 1;
					int y = (int)(Math.random()*6) + 1;
					
					//N�mero de casas que o jogador ir� andar.
					jogador1.numCasas = (x + y) - 1;
						//Se o resultado dos dados forem iguais, mais dois dados ser�o jogados.
						if(x == y) {
							//Dados w e z sendo jogados como jogada b�nus.
							int w = (int)(Math.random()*6) + 1;
							int z = (int)(Math.random()*6) + 1;
							jogador1.numCasas += ((w + z) - 1);
						}
						
					//Repassando o valor de casas que o jogador ir� andar para o valor auxiliar
					//que ir� controlar a posi��o da corrida que o jogador se encontra.
					valorJ1 += jogador1.numCasas;
					
					//Fazendo valida��o dos campos especiais e atribui��o de posi��es ap�s a jogada.
					if(arrayPosicao[valorJ1].contains("|?|")) {
						// LEO CUSAO ----------- Validar Casas especiais atualmente com valor fixo!
						// E atribui o valor novo.
						valorJ1-= 3;
						arrayPosicao[valorJ1] = jogador1.getSimbolo();
					}else if (arrayPosicao[valorJ1].contains("|_|")) {
						arrayPosicao[valorJ1] = jogador1.getSimbolo();
					}else if (arrayPosicao[valorJ1] == arrayPosicao[valorJ2]) {
						arrayPosicao[valorJ1] = jogador1.getSimbolo();
					}
					
					//Mudando a vez para que os jogadores se intercalem.
					jogador1.vez = false;
					jogador2.vez = true;
					
					System.out.println("Voc� tirou: " + jogador1.numCasas);
					System.out.println("Voc� est� na posi��o: " + valorJ1 + " da corrida!");
					System.out.println();
					
				//Tratando a exce��o caso o n�mero de casa andados for maior que as posi��es do array
				//E nomeando o campe�o.
				} catch (ArrayIndexOutOfBoundsException e) {
					System.out.println("Voc� tirou: " + jogador1.numCasas);
					System.out.println(jogador1.getNome() + " Venceu a partida!!!!");
					arrayPosicao[99] = jogador1.getSimbolo();
					jogador1.vez = false;
					jogador2.vez = false;
					System.out.println();
					System.out.println();
					criaTabuleiro(arrayPosicao);
					break;
				}

				criaTabuleiro(arrayPosicao);
				
				//Aguarda o retorno do enter do jogador 2 para jogado os dados.
				System.out.printf(jogador2.getNome() + " Aperte enter para jogar os dados");
				
				for(int i = 0; i < 2; i++) {	
					scanner.nextLine();
					System.out.println();
				}
			}
			
			//Repete os procedimentos acima por�m referenciando o jogador 2.
			if(jogador2.vez == true) {			
				
				try {
					
					int x = (int)(Math.random()*6) + 1;
					int y = (int)(Math.random()*6) + 1;
					jogador2.numCasas = (x + y) - 1;
						if(x == y) {
							int w = (int)(Math.random()*6) + 1;
							int z = (int)(Math.random()*6) + 1;
							jogador2.numCasas += ((w + z) - 1);
						}
					valorJ2 += jogador2.numCasas;
					
					if(arrayPosicao[valorJ2].contains("|?|")) {
						// LEO CUSAO ----------- Validar Casas especiais atualmente com valor fixo!
						// E atribui o valor novo.
						valorJ2-= 3;
						arrayPosicao[valorJ2] = jogador2.getSimbolo();
					}else if (arrayPosicao[valorJ2].contains("|_|")) {
						arrayPosicao[valorJ2] = jogador2.getSimbolo();
					}else if (arrayPosicao[valorJ2] == arrayPosicao[valorJ1]) {
						arrayPosicao[valorJ2] = jogador2.getSimbolo();
					}
					
					jogador1.vez = true;
					jogador2.vez = false;
					
					System.out.println("Voc� tirou: " + jogador2.numCasas);
					System.out.println("Voc� est� na posi��o: " + valorJ2 + " da corrida!");
					System.out.println();
					
				} catch (ArrayIndexOutOfBoundsException e) {
					System.out.println("Voc� tirou: " + jogador2.numCasas);
					System.out.println(jogador2.getNome() + " Venceu a partida!!!!");
					arrayPosicao[99] = jogador2.getSimbolo();
					jogador1.vez = false;
					jogador2.vez = false;
					System.out.println();
					System.out.println();
					criaTabuleiro(arrayPosicao);
					break;
				}
				
				criaTabuleiro(arrayPosicao);
				
				System.out.printf(jogador1.getNome() + " Aperte enter para jogar os dados");
				
				for(int i = 0; i < 2; i++) {	
					scanner.nextLine();
					System.out.println();
					
				}
			}
		}
	}
	
	/**
	 * M�todo jogar referente ao jogo que acontece entre um jogador e o computador.
	 */
	public void jogarComputador() {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		//Processamento referente ao jogador um permanece o mesmo.
		//Foram retirada as intera��es com o Jogador 2 e feitas automaticamente pelo c�digo.
		Jogador jogador1 = new Jogador();
		System.out.println("Digite o nome do Jogador: ");
		jogador1.setNome(scanner.next());
		System.out.println("Digite uma letra para representar seu carrinho: ");
		jogador1.setSimbolo(scanner.next());
		
		//Instanciando o computador e atribuindo valores automaticamente.
		Jogador computador = new Jogador();
		computador.setNome("Computador");
		computador.setSimbolo("CM");
		
		//Todas as mec�nicas do jogo permanecem as mesmas.
		System.out.println();
		System.out.println();
		
		System.out.println(jogador1.getNome() + " Cara ou Coroa??");
		String escolhaSorteio = scanner.next().toUpperCase();
		
		// LEO CUSAO ----------- Validar Cara e Coroa!
		
		if(caraCoroa(escolhaSorteio)) {
			System.out.println(jogador1.getNome() + " joga primeiro!");
			System.out.println();
			jogador1.vez = true;
			computador.vez = false;
		}else {
			System.out.println(computador.getNome() + " joga primeiro!");
			System.out.println();
			computador.vez = true;
			jogador1.vez = false;
		}

		String[] arrayPosicao = new String[100];
		preencheArray(arrayPosicao);
		criaTabuleiro(arrayPosicao);
		
		System.out.printf("Aperte enter para jogar os dados e iniciar a corrida!");
		
		for(int i = 0; i < 2; i++) {	
			scanner.nextLine();
			System.out.println();
		}
		
		int valorJ1 = 0;
		int valorJ2 = 0;
		
		while (jogador1.getSimbolo() != arrayPosicao[99] || computador.getSimbolo() != arrayPosicao[99]) {
			
			if(jogador1.vez == true) {
				
				try {
					int x = (int)(Math.random()*6) + 1;
					int y = (int)(Math.random()*6) + 1;
					jogador1.numCasas = (x + y) - 1;
						if(x == y) {
							int w = (int)(Math.random()*6) + 1;
							int z = (int)(Math.random()*6) + 1;
							jogador1.numCasas += ((w + z) - 1);
						}
					valorJ1 += jogador1.numCasas;
					
					if(arrayPosicao[valorJ1].contains("|?|")) {
						// LEO CUSAO ----------- Validar Casas especiais atualmente com valor fixo!
						// E atribui o valor novo.
						valorJ1-= 3;
						arrayPosicao[valorJ1] = jogador1.getSimbolo();
					}else if (arrayPosicao[valorJ1].contains("|_|")) {
						arrayPosicao[valorJ1] = jogador1.getSimbolo();
					}else if (arrayPosicao[valorJ1] == arrayPosicao[valorJ2]) {
						arrayPosicao[valorJ1] = jogador1.getSimbolo();
					}
					
					jogador1.vez = false;
					computador.vez = true;
					
					System.out.println("Voc� tirou: " + jogador1.numCasas);
					System.out.println("Voc� est� na posi��o: " + valorJ1 + " da corrida!");
					System.out.println();
					
				} catch (ArrayIndexOutOfBoundsException e) {
					System.out.println("Voc� tirou: " + jogador1.numCasas);
					System.out.println(jogador1.getNome() + " venceu a partida!!!!");
					arrayPosicao[99] = jogador1.getSimbolo();
					jogador1.vez = false;
					computador.vez = false;
					System.out.println();
					System.out.println();
					criaTabuleiro(arrayPosicao);
					break;
				}

				criaTabuleiro(arrayPosicao);
				
			}
			
			if(computador.vez == true) {			
				
				try {
					
					int x = (int)(Math.random()*6) + 1;
					int y = (int)(Math.random()*6) + 1;
					computador.numCasas = (x + y) - 1;
						if(x == y) {
							int w = (int)(Math.random()*6) + 1;
							int z = (int)(Math.random()*6) + 1;
							computador.numCasas += ((w + z) - 1);
						}
					valorJ2 += computador.numCasas;
					
					if(arrayPosicao[valorJ2].contains("|?|")) {
						// LEO CUSAO ----------- Validar Casas especiais atualmente com valor fixo!
						// E atribui o valor novo.
						valorJ2-= 3;
						arrayPosicao[valorJ2] = computador.getSimbolo();
					}else if (arrayPosicao[valorJ2].contains("|_|")) {
						arrayPosicao[valorJ2] = computador.getSimbolo();
					}else if (arrayPosicao[valorJ2] == arrayPosicao[valorJ1]) {
						arrayPosicao[valorJ2] = computador.getSimbolo();
					}
					
					jogador1.vez = true;
					computador.vez = false;
					
					System.out.println("Computador tirou: " + computador.numCasas);
					System.out.println("Computador est� na posi��o: " + valorJ2 + " da corrida!");
					System.out.println();
					
				} catch (ArrayIndexOutOfBoundsException e) {
					System.out.println("Computador tirou: " + computador.numCasas);
					System.out.println(computador.getNome() + " venceu a partida!!!!");
					arrayPosicao[99] = computador.getSimbolo();
					jogador1.vez = false;
					computador.vez = false;
					System.out.println();
					System.out.println();
					criaTabuleiro(arrayPosicao);
					break;
				}
				
				criaTabuleiro(arrayPosicao);
				
				System.out.printf(jogador1.getNome() + " Aperte enter para jogar os dados");
				
				for(int i = 0; i < 2; i++) {	
					scanner.nextLine();
					System.out.println();
					
				}
			}
		}
	}
	
	/**
	 * Classe que representa a jogada de cara ou coroa.
	 * @param escolha recebe a escolha do jogador.
	 * @return true se o jogador acertar e false se errar.
	 */
	public boolean caraCoroa(String escolha) {
        //Inst�ncia de Random.
        Random gerador = new Random();
 
        //O m�todo nextBoolean() devolve aleatoriamente os valores true e false.
        boolean resultado = gerador.nextBoolean();
        
        //Lado da moeda
        String lado;
        
        //Condi��o para Cara ou Coroa.
        if(resultado == true){
            lado = "CARA";
        }
        else{
            lado = "COROA";
        }
 
        //Compara a escolha e retorna true caso tenha acertado e false se errado.
        if(escolha.equals(lado)) {
        	return true;
        } else {
        	return false;
        }
	}
	
	
}
