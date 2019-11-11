package App;
/**
 * 
 * @author Equipe
 * Classe ajuda, herda de informações e implementa o método info.
 *
 */
public class Ajuda extends Informacoes{
	
	/**
	 * Retorna dados dos atributos fixos da classe pai
	 * sobre as regras do jogo.
	 */
	@Override //Sobrescrevendo o método.
	public void info() {
		System.out.println("Jogar: jogador x jogador");
		System.out.println(AJUDA_UM);
		System.out.println();
		System.out.println();
		System.out.println("Jogar: jogador x programa");
		System.out.println(AJUDA_DOIS);
		System.out.println();
		System.out.println();
	}

}
