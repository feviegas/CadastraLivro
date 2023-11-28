package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import dao.LivroDAO;
import modelo.Livro;
import visao.JanelaLivraria;

public class LivroControle implements ActionListener {

	private JanelaLivraria jan;
	private Livro liv;
	private LivroDAO lidao;

	public LivroControle(JanelaLivraria jan, Livro liv) {
		this.jan = jan;
		this.liv = liv;
		lidao = new LivroDAO();
		registraListenerAcao();
	}

	public void registraListenerAcao() {
		jan.getButtonCadastrar().addActionListener(this);
		jan.getButtonConsultar().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Cadastrar"))
			
		{
			String isbn = jan.getTextField().getText();
			String titulo = jan.getFieldTitulo().getText();
			String autor = jan.getFieldAutor().getText();

			liv.setAutor(autor);
			liv.setISBN(isbn);
			liv.setTitulo(titulo);
			lidao.cadastraLivro(liv);
			System.out.println("Teste");
		}
	}

}
