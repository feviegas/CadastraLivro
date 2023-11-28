package modelo;

public class Livro {
	
	
	private String ISBN;
	private String titulo;
	private String autor;
	
	public final String getISBN() {
		return ISBN;
	}
	public final void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public final String getTitulo() {
		return titulo;
	}
	public final void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public final String getAutor() {
		return autor;
	}
	public final void setAutor(String autor) {
		this.autor = autor;
	}
	
	public String toString()
	{
		return ISBN+ "#" +titulo+"#"+autor;
	}
			
		
		}
	
	
	


