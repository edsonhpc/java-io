package br.com.alura.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author Edson Cavalcanti
 * - FileInputStream: responsavel por buscar o arquivo e transformar em fluxo de dados binários.
 *   - File "arquivo" / Input "Entrada" / Stream "Fluxo"
 * - InputStreamReader: capaz de transformar um int em caracteres, a leitura é feita caracter a caracter.
 * - BufferedReader: responsavel por guardar cada caracter lido e o guardar até completar uma linha do texto e ler linha a linha.
 * - Trabalhando com java io é importante conhecer bem as exceptions: FileNotFoundException > IOException > Exception.
 * - Na prática o FileInputStream é administrado por meio do InputStreamReader, este por sua vez é administrado pelo BufferedReader pois é passado no constutor.
 * - BufferedReader > InputStreamReader > FileInputStream > lorem.txt | Esse padrão é chamado de decorator, ou seja um objeto está decorando a funcionalidade do outro, sucessivamente.
 * - Quando trabalhamos com arquivos texto podemos usar o InputStreamReader, porém se for um pdf usamos o InputStream.
 * - As classes InputStream e Reader são chamadas de templates, que são aquelas que pré-definem conteúdo para as filhas.
 * - Somente com InputStream é capaz de ler qualquer coisa em dados binários.
 *  - InputStreamReader é nessa classe que pode ser definida o charset visto que é ela que transforma o fluxo de bits e bytes em caracteres.
 */
public class TesteLeitura {

	public static void main(String[] args) throws IOException {
		 
		// Estabelecendo o fluxo de entrada
		FileInputStream fis = new FileInputStream("lorem.txt"); // Efetua a leitura transforma em dados binários
		InputStreamReader isr = new InputStreamReader(fis, "UTF-8"); // Transforma dados binários em caracteres e defino charset
		BufferedReader br = new BufferedReader(isr);          // Guarda caracter por caracter até completar linhas.
		 
		String linha = br.readLine();

		while(linha != null) {
			System.out.println(linha);			
			linha = br.readLine(); // Método correto para leitura da linha
		}
		
		
		br.close(); // Faz com que tanto o FileInputStream quanto o InputStreamReader sejam fechados.
	}
}
