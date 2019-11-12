package App;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Replay {

	public void PrintReplay() {
		//Carrego meu arquivo
		File file = new File("Replay.txt");
		String linha ;
		try {
			
			if(!file.exists()) {
			System.out.println("Ops ... Nenhum dado de jogo encontrado no momento :(" );
			return;
			}
			
			//Prepara e lê o arquivo
			FileReader ler = new FileReader(file.getAbsoluteFile());
			BufferedReader reader = new BufferedReader(ler);	
			
			if(reader.readLine() == null) {
				System.out.println("Ops ... Nenhum dado de jogo encontrado no momento :(" );
			}
			
			while((linha = reader.readLine()) != null ) {
				System.out.println(linha);
			}			
			reader.close();
			System.in.read();
		} catch (Exception e) {
			System.out.println(e);
			System.err.println("Erro no game :(");
		}
		
		
	}
}
