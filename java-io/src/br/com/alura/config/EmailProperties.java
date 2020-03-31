package br.com.alura.config;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;

/**
 * 
 * @author Edson Cavalcanti
 * - Classe de configuração para arquivos externos da aplicação
 *
 */
public class EmailProperties {

	
	public static void main(String[] args) throws Exception {
	
		// Fluxo de saída para criação do arquivo properties
		Properties propsCreate = new Properties(); 
		propsCreate.setProperty("login", "sysdba");    // Informo a chama e valor
		propsCreate.setProperty("senha", "masterkey");
		propsCreate.setProperty("porta", "3050");
		
		// Criar o arquivo properties com as configurações acima.
		propsCreate.store(new FileWriter("conf.properties"), "Arquivo de configuração de e-mail");
		
		// Fluxo de entrada para leitura do arquivo 
		Properties propsRead = new Properties();        
		propsRead.load(new FileReader("conf.properties")); // Busca o arquivo no dirétorio raiz

		String login = propsRead.getProperty("login"); // Método para acessar a chave e recuperar o valor
		String senha = propsRead.getProperty("senha");
		String porta = propsRead.getProperty("porta");

		System.out.println(String.format("%s , %s , %s", login, senha, porta));
		
	}
	

	
}
