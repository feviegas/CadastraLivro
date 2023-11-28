package controle;

import modelo.Livro;
import visao.JanelaLivraria;

public class ProgramaPrincipal {
	
	public static void main(String[] args) {
		
		JanelaLivraria j = new JanelaLivraria();
		j.setVisible(true);
		j.setVisible(true);
		Livro liv= new Livro();
		LivroControle livCon = new LivroControle(j, liv);
	}

}
