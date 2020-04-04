package br.com.alura.serializacao;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * 
 * @author Edson Cavalcanti
 * - Na JVM temos a memória de objetos (HEAP), e o main, que controla esses objetos, a serialização é a tranformação do objeto java, localizado
 * na memória, em um fluxo de bits e bytes e vice-versa.
 * - java.io.ObjectOutputStream = Objeto       -> Bits e Bytes
 * - java.io.ObjectInputStream  = Bits e Bytes -> Objeto
 * - O java foi concebido com intenção de funcionar em rede, fazer com que máquinas virtuais se comuniquem, no mundo java dados são objetos,
 * portanto esse fluxo é realizado mediante a serialização.
 * -
 *
 */
public class TesteSerializacao {

	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		String nome = "Edson Cavalcanti";
		
		// Definição do fluxo de saída de um objeto para serialização de bits e bytes.
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objeto.bin"));
		oos.writeObject(nome); // Escreve o objeto para o arquivo, ou seja resposável por transformar o objeto em fluxo de bits e bits.
		oos.close(); 
	}
}
