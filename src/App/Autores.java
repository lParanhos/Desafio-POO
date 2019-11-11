package App;
/**
 * 
 * @author Equipe
 * Classe ajuda, herda de informações e implementa o método info.
 *
 */
public class Autores extends Informacoes{
	
	/**
	 * Retorna dados dos atributos fixos da classe pai
	 * sobre as regras do jogo.
	 */
	@Override //Sobrescrevendo o método.
	public void info() {
		System.out.println("Autores:");
		System.out.println(ID_AUTOR + ": " + ID_RA_UM);
		System.out.println(ID_AUTOR_DOIS + ": " + ID_RA_DOIS);
		System.out.println(ID_AUTOR_TRES + ": " + ID_RA_TRES);
		System.out.println(CURSO);
		System.out.println();
	}

}
