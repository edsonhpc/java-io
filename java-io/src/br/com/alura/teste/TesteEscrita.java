package br.com.alura.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * 
 * @author Edson Cavalcanti
 */
public class TesteEscrita {

	public static void main(String[] args) throws IOException {
		 
		// Estabelecendo o fluxo de saida
		FileOutputStream fos = new FileOutputStream("lorem2.txt"); // Cria o arquivo com o nome informado gera os dados binários.
		OutputStreamWriter osw = new OutputStreamWriter(fos);    // Transforma dados binários em caracteres
		BufferedWriter bw = new BufferedWriter(osw);          // Guarda caracter por caracter até completar linhas.
		 
        bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
        bw.newLine();
        bw.write("Edson developer");
		
		bw.close(); // Faz com que tanto o FileOutputStream quanto o OutputStreamWrite sejam fechados.
	}
}
