package br.com.alura.teste;

import java.io.File;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * 
 * @author edson
 * - A classe Scanner conta com uma série de métodos de alto nível, ela faz parte do pacote java.util.
 * - O objeto new File é que faz a abertura do arquivo.
 * - linha.split(","); 
 *   - Este método recebe como parametro uma String do tipo regex, que é um conjunto de caracteres que define regras de como analisar, ou separar uma String maior.
 * - Arrays.toString(valores);
 *   - Assim como temos na classe Collections, essa classe Arrays conta com uma porção de métodos auxiliares, que funciona da mesma forma só que para mundo dos arrays. 
 *
 * - new Locale("pt","BR") Dessa forma consigo criar o meu próprio Locale
 *   
 * - Documentação classe String.format: 
 * 	 - https://docs.oracle.com/javase/tutorial/java/data/numberformat.html
 *   - https://docs.oracle.com/javase/8/docs/api/java/util/Formatter.html
 */
public class TesteLeituraScanner {

	public static void main(String[] args) throws Exception {
	
		// Estabelecendo a entrada do arquivo
		Scanner scanner = new Scanner(new File("contas.csv"));
		
		while(scanner.hasNextLine()) { // Laço para verificar se tem próxima linha
			String linha = scanner.nextLine(); // Pŕoxima linha
			//System.out.println(linha);
			
			Scanner linhaScanner = new Scanner(linha); // Recebe o source, ou seja não e o nome do arquivo e sim a fonte de análise no caso a linha.
			linhaScanner.useLocale(Locale.US); // Com o uso do Locale não importa qual é regra padrão do sistema operacional ou arquivo ele pega a regra definida neste método.
			//linhaScanner.useLocale(new Locale("pt", "BR")); // Padrão em português.
			
			linhaScanner.useDelimiter(","); // Passando para o linhaScanner o delimeter para fazer a separação.
			
			String tipoConta = linhaScanner.next(); // Método next retorna o próximo item encontrado.
			int    agencia   = linhaScanner.nextInt(); // Preservando o tipo específico.
			int    numero    = linhaScanner.nextInt();
			String titular   = linhaScanner.next();
			double saldo     = linhaScanner.nextDouble();
			
			String linhaFormatada = String.format(new Locale("pt","BR"), "%s - %04d-%08d, %20s: %05.2f %n", 
					                                                      tipoConta, agencia, numero, titular, saldo );
			
			System.out.print(linhaFormatada);
			
			linhaScanner.close();
			
			
			//String[] valores = linha.split(",");
			//System.out.println(Arrays.toString(valores)); 
			//System.out.println(valores[3]); // Pegando uma posição específica.
		}
		
		scanner.close(); // Fechamento do scanner

		
	}

}
