package br.com.alura.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

/**
 * 
 * @author Edson Cavalcanti
 * 
 */
public class TesteCopiarArquivoInputConsole {

	public static void main(String[] args) throws IOException {
		 
		// Fluxo de entrada
		InputStream fis = System.in; 
		Reader isr = new InputStreamReader(fis);    
		BufferedReader br = new BufferedReader(isr);          
		 
		// Fluxo de saída
		OutputStream fos = new FileOutputStream("lorem3.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		
		String linha = br.readLine();

		while(linha != null && !linha.isEmpty()) { // Condição de saída do loop é linha nula e linha vazia.
			
			bw.write(linha);
			bw.newLine();
			linha = br.readLine(); 
		}
		
		
		br.close(); 
		bw.close();
	}
}
