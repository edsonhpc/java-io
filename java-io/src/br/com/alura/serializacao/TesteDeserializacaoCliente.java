package br.com.alura.serializacao;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TesteDeserializacaoCliente {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		// Definição do fluxo de entrada lendo os bits e bytes e tranformando em objeto java 
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
		Cliente cliente = (Cliente) ois.readObject();
		ois.close();
		
		System.out.println(String.format("%s, %s, %s", cliente.getCpf(), cliente.getNome(), cliente.getProfissao()));
	}
}
