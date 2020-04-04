package br.com.bytebank.banco.test.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteSerializacao {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		
		Cliente cliente = new Cliente();
		cliente.setCpf("36736301807");
		cliente.setNome("Edson Cavalcanti");
		cliente.setProfissao("Devenvolvedor");
		
		ContaCorrente cc = new ContaCorrente(7155, 156977);
		cc.setTitular(cliente);
		cc.deposita(200.00);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));
		oos.writeObject(cc);
		oos.close();
	}
}
