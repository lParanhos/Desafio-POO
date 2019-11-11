package App;
/**
 * 
 * @author Equipe
 * Classe que representa um jogador com atributos privados
 * acessados por métodos getters e setters.
 *
 */
public class Jogador {
	
	private String nome;
	private String simbolo;
	public int numCasas; // Utilizado pela classe jogo para saber quantas casas deve andar.
	public boolean vez; // Utilizado pela classe jogo para saber de qual jogador é a vez.
	
	/**
	 * Classe getter do atributo nome.
	 * @return nome do jogador.
	 */
	public String getNome() {
		return nome;
	}
	
	/**
	 * Classe setter do atributo nome.
	 * @param nome Nome do jogador.
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/**
	 * Classe getter do atributo simbolo do carrinho.
	 * @return simbolo que representa o carrinho.
	 */
	public String getSimbolo() {
		return simbolo;
	}
	
	/**
	 * Classe setter do atributo Simbolo.
	 * @param simbolo Simbolo do jogador.
	 */
	public void setSimbolo(String simbolo) {
		this.simbolo = simbolo;
	}

}