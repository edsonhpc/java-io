package br.com.alura.serializacao;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LerAquivo {

	private static FileInputStream fis;

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        fis = new FileInputStream("cliente.bin");

       
        while(fis.available()>0) {
        	ObjectInputStream ois = new ObjectInputStream(fis);
        	Object object = ois.readObject();
        	Cliente cliente = (Cliente) object;
        	System.out.println(cliente.getCpf());
        }

    }
}
