package br.com.alura.serializacao;

import java.io.Serializable;
/**
 * 
 * @author Edson Cavalcanti
 * - Qualquer objeto que queremos serializar precisa assinar um contrato.
 * - A interface Serializable não possui nenhum método, por isso é chamada de interface de marcação, ela só marca os objetos 
 * sem definir um contrato formal, quando o java introduziu isto não havia outra forma de marcarção.
 * - serialVersionUID é um identificador próprio da classe, já que não faz parte do objeto.
 *   - Esse serial serve para administrar a versão da classe.
 * - Se não espeficicarmos o número da versão para classe o java preenche automaticamente,
 * - Esse número de versão da classe também fica salvo junto no arquivo binário, ao recuperar o arquivo o java acessa este número serial do arquivo
 * e o compara com o ID da classe, se forem iguais ele continua, caso contrário, ele para a execução lançando uma exception.
 * - Ao trabalharmos com serialização, é uma boa prática inserirmos o serialVersionUID
 *   - Gavamos o cliente.bin, e em algum momento posterior recuperaremos.
 *   - Nesse intervalo de tempo a classe Cliente pode mudar, por exemplo, ela pode ganhar mais um método.
 *   - Caso não haja o número serial, a cada alteração na classe utilizada para criar o arquivo cliente.bin, causa uma nova versão, ou seja, um novo número gerado.
 *   - Por este motivo, é uma boa pratica forçar um número de versão, desta forma as alterações - desde que compatíveis - ficarão armazenadas.
 * - Ao implementarmos Serializable, admitimos que estes objetos podem ser tranformados em um fluxo de bits e bytes, Portanto, devemos refletir
 * isso no atributo estátivo do serialVersionUID, e administra-lo.
 * - Cada alteração nos atributos, por exemplo a sua inclusão ou exclusão, merece uma alteração no número da versão.  
 */
public class Cliente implements Serializable {

	private static final long serialVersionUID = 1L;

	private String nome;
	private String cpf;
	private String profissao;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

}
