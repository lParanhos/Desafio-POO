package App;
/**
 * 
 * @author Equipe
 * Classe que controi o menu da aplicação.
 *
 */
public class Menu {
	
	/**
	 * Sempre que esse método é chamado o menu é carregado.
	 */
	public void carregaMenu() {
		System.out.println("******************************************");
		System.out.println("************JOGO DE CORRIDA***************");
		System.out.println("*"+" 1 - Jogar: jogador x jogador. "+"         *");
		System.out.println("*"+" 2 - Jogar: jogador x computador. "+"      *");
		System.out.println("*"+" 3 - Replay do jogo. "+"                   *");
		System.out.println("*"+" 4 - Ajuda. "+"                            *");
		System.out.println("*"+" 5 - Autores. "+"                          *");
		System.out.println("*"+" 6 - Sair. "+"                             *");
		System.out.println("******************************************");
		System.out.println("******************************************");
		System.out.println();
		System.out.println("Digite a opção desejada: ");
	}
}
