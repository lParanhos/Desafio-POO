package App;

/**
 * 
 * @author Equipe
 * Classe abstrata que não pode ser instanciada
 * servindo como classe pai com atributos estáticos.
 *
 */
public abstract class Informacoes {
	
	protected static final String ID_AUTOR = "Rafael Barboza";
	protected static final String ID_AUTOR_DOIS = "Leonardo Coslopi Batista";
	protected static final String ID_AUTOR_TRES = "Leandro Gabriel Paranhos";
	protected static final String ID_RA_UM = "142844412002";
	protected static final String ID_RA_DOIS = "142790312002";
	protected static final String ID_RA_TRES = "142774412002";
	protected static final String CURSO = "Programação Orientada à Objetos";
	
	protected static final String AJUDA_UM = "• O jogador 1 escolhe cara ou coroa e se ganhar o sorteio começa jogando, caso\r\n" + 
								"contrário o jogador 2 começa.\r\n" + 
								"• Os jogadores vão se intercalando.\r\n" + 
								"• Vence quem chegar ao fim do tabuleiro.";
	
	protected static final String AJUDA_DOIS = "• O jogador escolhe cara ou coroa e se ganhar o sorteio começa jogando, caso\r\n" + 
								"contrário o programa começa.\r\n" + 
								"• O jogador se intercala com o programa.\r\n" + 
								"• Vence quem chegar ao fim do tabuleiro.";
	/**
	 * Método que deve ser implementado pelas classes que herdam deste método.
	 */
	public abstract void info();
	
}
