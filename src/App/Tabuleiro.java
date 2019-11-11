package App;
/**
 * 
 * @author Equipe
 * Interface tabuleiro que o jogo deve implementar.
 *
 */
public interface Tabuleiro {
	
	/**
	 * M�todo que recebe um array e preenche sua posi��es conforme regra do jogo
	 * @param array Recebe um array de 100 posi��es para utiliza��o correta do jogo.
	 */
	public void preencheArray(String[] array);
	
	/**
	 * Cria o tabuleiro, o design que deve seguir.
	 * @param array Recebe um array de 100 posi��es para utiliza��o correta do jogo.
	 */
	public void criaTabuleiro(String[] array);
	
}
