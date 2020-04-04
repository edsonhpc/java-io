package br.com.alura.serializacao;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * 
 * @author Edson Cavalcanti
 *
 */
public class TesteSerializacaoCliente {

	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Cliente cliente = new Cliente();
		cliente.setCpf("36736301807");
		cliente.setNome("Edson Cavalcanti");
		cliente.setProfissao("Dev");
		
		
		// Definição do fluxo de saída de um objeto para serialização de bits e bytes.
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
		oos.writeObject(cliente); // Escreve o objeto para o arquivo
		oos.close(); 
	}
}
