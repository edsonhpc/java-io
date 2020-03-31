package br.com.alura.teste;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

/**
 * 
 * @author Edson Cavalcanti
 * - BufferedWriter criamos a saída e estamos "embrulhando" nessa classe.
 * - PrintStream por meio dela é possível fazermos uma impressão para um fluxo binário.
 * 	 - È também uma classe de mais alto nível, que aceita uma grande variedade de construtores, como é o caso do new File.
 *   - Antigamente não existia os Writers e Readers eles foram criados após o Stream.
 *   
 * - PrintWriter é parecido com o PrintStream e já possui vários métodos para imprimir qualquer tipo de dados. 
 *	 - PrintWriter oferece alguns métodos adicionais de formatação, como o println, printf enquanto FileWrite possui um conjunto básico de métodos.
 */
public class TesteEscritaPrintStreamPrintWriter {

	public static void main(String[] args) throws IOException {
		 
		// Estabelecendo o fluxo de saída
		PrintWriter pw = new PrintWriter("lorem.txt"); // Funciona de forma similar, no entanto essa classe é um Write.
		PrintStream ps = new PrintStream("lorem.txt"); // Lançado na primeira versão do java somente depois entrou o Write e Reader.
		
        ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
        ps.println();
        ps.print("Edson master developer");
		
		ps.close(); 
	}
}
