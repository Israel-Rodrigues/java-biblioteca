package model;

/**
 * Classe para armazenar os atributos e m�todos do objeto autor
 *
 * @author Israel Oliveira Rodrigues
 * @since 18 de fev. de 2021
 * 
 */
public class Autor {

	// M�todo construtor da classe
	public Autor() {

	}

	// Declarando os atributos
	private int codigo;
	private String nome;
	private String nacionalidade;
	
	// M�todos para acessar os atributos
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
}
