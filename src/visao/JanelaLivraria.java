package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JButton;

public class JanelaLivraria extends JFrame {

	public final JTextField getTextField() {
		return textField;
	}

	public final void setTextField(JTextField textField) {
		this.textField = textField;
	}

	public final JTextField getFieldTitulo() {
		return fieldTitulo;
	}

	public final void setFieldTitulo(JTextField fieldTitulo) {
		this.fieldTitulo = fieldTitulo;
	}

	public final JTextField getFieldAutor() {
		return fieldAutor;
	}

	public final void setFieldAutor(JTextField fieldAutor) {
		this.fieldAutor = fieldAutor;
	}

	public final JButton getButtonCadastrar() {
		return buttonCadastrar;
	}

	public final void setButtonCadastrar(JButton buttonCadastrar) {
		this.buttonCadastrar = buttonCadastrar;
	}

	public final JButton getButtonConsultar() {
		return buttonConsultar;
	}

	public final void setButtonConsultar(JButton buttonConsultar) {
		this.buttonConsultar = buttonConsultar;
	}

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField fieldTitulo;
	private JTextField fieldAutor;
	private JButton buttonCadastrar;
	private JButton buttonConsultar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaLivraria frame = new JanelaLivraria();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JanelaLivraria() {
		setTitle("Livraria InfoBio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 230);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel labelTItulo = new JLabel("Tela de Gerenciamento De Livro");
		labelTItulo.setFont(new Font("Times New Roman", Font.BOLD, 18));
		panel.add(labelTItulo);
		
		JPanel fieldISBN = new JPanel();
		FlowLayout fl_fieldISBN = (FlowLayout) fieldISBN.getLayout();
		fl_fieldISBN.setAlignment(FlowLayout.LEFT);
		contentPane.add(fieldISBN, BorderLayout.CENTER);
		
		JLabel labelISBN = new JLabel("ISBN");
		fieldISBN.add(labelISBN);
		
		textField = new JTextField();
		fieldISBN.add(textField);
		textField.setColumns(10);
		
		JLabel labelTituloLivro = new JLabel("Titulo");
		fieldISBN.add(labelTituloLivro);
		
		fieldTitulo = new JTextField();
		fieldISBN.add(fieldTitulo);
		fieldTitulo.setColumns(30);
		
		JLabel labelAutor = new JLabel("Autor");
		fieldISBN.add(labelAutor);
		
		fieldAutor = new JTextField();
		fieldISBN.add(fieldAutor);
		fieldAutor.setColumns(46);
		
		JPanel panel3 = new JPanel();
		FlowLayout flowLayout_2 = (FlowLayout) panel3.getLayout();
		flowLayout_2.setAlignment(FlowLayout.LEFT);
		contentPane.add(panel3, BorderLayout.SOUTH);
		
		buttonCadastrar = new JButton("Cadastrar");
		panel3.add(buttonCadastrar);
		
		buttonConsultar = new JButton("Consultar");
		panel3.add(buttonConsultar);
	}
	
}
