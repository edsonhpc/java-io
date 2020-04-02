package br.com.alura.teste;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 * 
 * @author Edson Cavalcanti
 * - O codepoint é um número decimal associnado dentro da tabela universal de unicode.
 * - Ainda na tabela unicode sua definição é em bytes.
 * - Não é o unicode que define como os dados serão gravados no HD e sim o Encoding / Charset.
 * - Há padrões de conversão de caracteres em binários, e um dos mais comuns está registrado na tabela ASCII
 *   - American Standard Code For Information Interchange;
 * - Temos a letra, e a ela há um número associado, a parte deste, é criado uma sequência binária.
 * - Unicode é uma tabela cujo objetivo é de apresentar todos os caracteres do mundo, ela também conta com um número associado a cada caracter.
 * - O Unicode não define como as informações devem ser salvas no HD, isto é tarefa dos encodings. 
 * - O Unicode é apenas o mapeamento do caractere, e não nos fornece a informação de como armazenar este, isso é trabalho do encoding.
 * - É o caso dos UTFs = Unico Transformation Format, ela está vinculada desde o nascimento da tabela Unicode, para traduzir os codepoints para binário.
 * - Charset em tradução literal significa conjunto de caracteres.
 * - É importante saber o Charset pois é este que define como traduzir o codepoint em sequência de bits e bytes.
 * - StandardCharsets é uma nova forma de acessar os Charsets essa classe é do nio, ou seja, novo io.
 */
public class TesteUnicodeEEncoding {

	public static void main(String[] args) throws UnsupportedEncodingException {
		
		String s = "ç";
		System.out.println(s.codePointAt(0)); // Imprimindo o codepoint de acordo com a posição do caracter dentro de uma String.
		
		
		Charset charset = Charset.defaultCharset(); // Essa chasse Charset é a que representa o encoding
		System.out.println(charset.displayName()); // Buscando o charset padrão do sistema operacional.
		
		
		byte[] bytes = s.getBytes("windows-1252"); // Quardando String em um array de byte e forçando um charset em questão.
		System.out.print(bytes.length + " , windows-1252 ");
		String sNovo = new String(bytes, "windows-1252"); // Transformando os bytes em nova String e especificando o Charset
		System.out.println(sNovo);
		
		bytes = s.getBytes("UTF-16"); 
		System.out.print(bytes.length + " , UTF-16 "); // Se aparecer também caracter estranho isso porque ele ocupa 4 bytes.
		sNovo = new String(bytes, "UTF-16"); // Tranformando a representaçã binária em String novamente e especificando o Charset.
		System.out.println(sNovo);
		
		bytes = s.getBytes(StandardCharsets.US_ASCII); // Nova forma de acessar o Charset
		System.out.print(bytes.length + " , US_ASCII ");
		sNovo = new String(bytes, StandardCharsets.US_ASCII);
		System.out.println(sNovo);
		
		
	}
}
