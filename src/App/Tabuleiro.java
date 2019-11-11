package App;
/**
 * 
 * @author Equipe
 * Interface tabuleiro que o jogo deve implementar.
 *
 */
public interface Tabuleiro {
	
	/**
	 * Método que recebe um array e preenche sua posições conforme regra do jogo
	 * @param array Recebe um array de 100 posições para utilização correta do jogo.
	 */
	public void preencheArray(String[] array);
	
	/**
	 * Cria o tabuleiro, o design que deve seguir.
	 * @param array Recebe um array de 100 posições para utilização correta do jogo.
	 */
	public void criaTabuleiro(String[] array);
	
}
