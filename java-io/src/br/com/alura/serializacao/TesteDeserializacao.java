package br.com.alura.serializacao;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TesteDeserializacao {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		// Definição do fluxo de entrada lendo os bits e bytes e tranformando em objeto java 
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"));
		String nome = (String) ois.readObject(); // Transforma o fluxo de bits e bytes em objeto.
		ois.close();
		
		System.out.println(nome);
		
	}
}
