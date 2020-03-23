package br.com.alura.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
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
public class TesteCopiarArquivoInputOutputConsole {

	public static void main(String[] args) throws IOException {
		 
		// Fluxo de entrada
		InputStream fis = System.in; 
		Reader isr = new InputStreamReader(fis);    
		BufferedReader br = new BufferedReader(isr);          
		 
		// Fluxo de saída
		OutputStream fos = System.out;
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		
		String linha = br.readLine();

		while(linha != null && !linha.isEmpty()) { // Condição de saída do loop é linha nula e linha vazia.
			
			bw.write(linha); // Entrada
			bw.newLine();
			bw.flush();  // Não cria a linha em branco faz saída completa ex: descarga
			linha = br.readLine(); // Saída
		}
		
		
		br.close(); 
		bw.close(); // Só escreve quando finaliza.
	}
}