package br.com.alura.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 
 * @author Edson Cavalcanti
 * - BufferedWriter criamos a saída e estamos "embrulhando" nessa classe.
 * - FileWriter foi criada com o propósito de estabelecer uma entrada com um arquivo de texto, po exemplo.
 */
public class TesteEscritaFileWrite {

	public static void main(String[] args) throws IOException {
		 
		long ini = System.currentTimeMillis();
		
		// Estabelecendo o fluxo de saída
		FileWriter fw = new FileWriter("lorem.txt"); // Essa classe é capaz de trabalhar com caracteres diretamente.
		BufferedWriter bw = new BufferedWriter(fw); // É altamente recomendavel usarmos está classe para juntar os caracteres.
		
        bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
        //fw.write(System.lineSeparator()); // Garantimos que a nova linha de texto é criada baseda nos caracteres do sistema operacional.
        bw.newLine();
        bw.newLine();
        bw.write("Edson developer");
		
		bw.close(); 
		
		long fim = System.currentTimeMillis();
		System.out.println("Passaram " + (fim - ini) + " milissegundos");
	}
}
