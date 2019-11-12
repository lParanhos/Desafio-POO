package App;
import java.util.Scanner;

/**
 * 
 * @author equipe
 * Aplicação principal responsável por carregar o menu de opções
 * até que o jogador digite a opção de sair.
 */
public class Aplicacao {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Menu menu = new Menu();
		int opcao = 0;
		
		//Repete enquanto o jogador não escolher a opção de sair.
		while(opcao != 6) {
			System.out.println();
			System.out.println();
			menu.carregaMenu();
			opcao = scanner.nextInt();
			
			System.out.println();
			
			//Valida opções digitadas pelos jogadores.
			switch (opcao) {
				case 1:
					Jogo jogo = new Jogo();
					jogo.jogar();
					break;
				case 2:
					Jogo jogoComputer = new Jogo();
					jogoComputer.jogarComputador();
					break;
				case 3:
					Replay replay = new Replay();
					replay.PrintReplay();
					break;
				case 4:
					Ajuda infAjuda = new Ajuda();
					infAjuda.info();
					break;
				case 5:
					Autores infAutor = new Autores();
					infAutor.info();
					break;
				case 6:
					System.out.println("Saindo do Jogo.");
					System.out.println();
					System.out.println("Até mais!");
					System.exit(0);
				default:
					System.out.println("Opção incorreta.");
					System.out.println("Digite uma opção válida!");
					System.out.println();
			}			
			
		}
		
		scanner.close();
		
	}
	
}

