package App;

/**
 * 
 * @author Equipe
 * Classe abstrata que n�o pode ser instanciada
 * servindo como classe pai com atributos est�ticos.
 *
 */
public abstract class Informacoes {
	
	protected static final String ID_AUTOR = "Rafael Barboza";
	protected static final String ID_AUTOR_DOIS = "Leonardo Coslopi Batista";
	protected static final String ID_AUTOR_TRES = "Leandro Gabriel Paranhos";
	protected static final String ID_RA_UM = "142844412002";
	protected static final String ID_RA_DOIS = "142790312002";
	protected static final String ID_RA_TRES = "142774412002";
	protected static final String CURSO = "Programa��o Orientada � Objetos";
	
	protected static final String AJUDA_UM = "� O jogador 1 escolhe cara ou coroa e se ganhar o sorteio come�a jogando, caso\r\n" + 
								"contr�rio o jogador 2 come�a.\r\n" + 
								"� Os jogadores v�o se intercalando.\r\n" + 
								"� Vence quem chegar ao fim do tabuleiro.";
	
	protected static final String AJUDA_DOIS = "� O jogador escolhe cara ou coroa e se ganhar o sorteio come�a jogando, caso\r\n" + 
								"contr�rio o programa come�a.\r\n" + 
								"� O jogador se intercala com o programa.\r\n" + 
								"� Vence quem chegar ao fim do tabuleiro.";
	/**
	 * M�todo que deve ser implementado pelas classes que herdam deste m�todo.
	 */
	public abstract void info();
	
}
