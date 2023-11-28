package dao;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import modelo.Livro;

public class LivroDAO {

	File arq;

	public LivroDAO() {
		arq = new File("livros.txt");
	}

	public boolean cadastraLivro(Livro li)
	{
		FileWriter fw=null;
		BufferedWriter bw=null;
		
		
		try {
			fw = new FileWriter(arq, true);
			 bw = new BufferedWriter(fw);
			
			bw.write(li.toString());
			bw.newLine();
			bw.flush();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;
			}
			try {
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return true;
	}
}
