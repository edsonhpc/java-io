package br.com.alura.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 
 * @author Edson Cavalcanti
 * 
 */
public class TesteCopiarArquivo {

	public static void main(String[] args) throws IOException {
		 
		// Fluxo de entrada
		FileInputStream fis = new FileInputStream("lorem.txt"); 
		InputStreamReader isr = new InputStreamReader(fis);    
		BufferedReader br = new BufferedReader(isr);          
		 
		// Fluxo de saída
		FileOutputStream fos = new FileOutputStream("lorem2.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		
		String linha = br.readLine();

		while(linha != null) {
			
			bw.write(linha);
			bw.newLine();
			linha = br.readLine(); 
		}
		
		
		br.close(); 
		bw.close();
	}
}
