package br.com.alura.teste;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * 
 * @author edson
 * - StringTokenizer tranforma uma string passando um delimitador, para converter em Array.
 * - Com esse array consigo acessar os elementos de casa posição.
 * 
 */
public class TesteLeituraStringTokenizar {

	public static void main(String[] args) throws Exception {
	
		// Estabelecendo a entrada do arquivo
		Scanner scanner = new Scanner(new File("contas.csv"));
		
		while(scanner.hasNextLine()) { 
			String linha = scanner.nextLine();  
			scanner.useLocale(new Locale("pt", "BR"));
			
			List<String> tokens = new ArrayList<>();
			StringTokenizer tokenizer = new StringTokenizer(linha, ","); 
			while(tokenizer.hasMoreElements()) {
				
				tokens.add(tokenizer.nextToken());
			}
			
			System.out.println(tokens);
			System.out.println(tokens.get(3)); // Pegando uma posição no array;
	 	}
		
		scanner.close(); 

		
	}

}
