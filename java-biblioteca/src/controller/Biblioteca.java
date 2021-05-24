package controller;

import java.util.GregorianCalendar;

import javax.swing.JOptionPane;

import model.Autor;
import model.Data;
import model.Editora;
import model.Livro;
import model.Locacao;
import model.Usuario;

/**
 * Classe para controlar o cadastro de usuários e livros, pesquisa e locação
 *
 * @author Israel Oliveira Rodrigues
 * @since 18 de fev. de 2021
 * 
 */
public class Biblioteca {

	// Variáveis globais para incrementar o código de usuário e código de livro
	int contadorUsuarios = 1;
	int contadorLivros = 1;
	int contadorAutores = 1;
	int contadorLocacoes = 1;

	// Vetor para armazenar os livros cadastrados
	private Livro livros[];

	// Vetor para armazenar os usuários cadastrados
	private Usuario usuarios[];

	// Vetor para armazenar as locações
	private Locacao locacoes[];

	// Veriável auxiliar para definir a quantidade de livros a serem cadastrados
	private int cadastroLivros = 0;

	// Veriável auxiliar para definir a quantidade de usuários a serem cadastrados
	private int cadastroUsuario = 0;

	// Veriável auxiliar para definir a quantidade de locações a serem cadastradas
	private int cadastroLocacoes = 0;

	// Método construtor da classe
	public Biblioteca() {
		processar();
	}

	// Método principal do programa
	public void processar() {

		// Capturando do usuário o tamanho do estoque
		// Do While nos três imputs para verificar se os valoes fornecidos são maiores
		// que zero
		do {
			cadastroLivros = Integer
					.parseInt(JOptionPane.showInputDialog("Informe a quantidade de livros a serem cadastrados: "));
			if (cadastroLivros <= 0) {
				JOptionPane.showMessageDialog(null, "Você digitou um valor inválido", "Erro!!", 0);
			}
		} while (cadastroLivros <= 0);

		// Capturando do usuário o tamanho do vetor usuários para armazenar clientes
		do {
			cadastroUsuario = Integer
					.parseInt(JOptionPane.showInputDialog("Informe a quantidade de usuários a serem cadastrados: "));
			if (cadastroUsuario <= 0) {
				JOptionPane.showMessageDialog(null, "Você digitou um valor inválido", "Erro!!", 0);
			}
		} while (cadastroUsuario <= 0);

		// Captirando do usuário o limite de locações
		do {
			cadastroLocacoes = Integer
					.parseInt(JOptionPane.showInputDialog("Informe a quantidade de locações a serem cadastradas: "));
			if (cadastroLocacoes <= 0) {
				JOptionPane.showMessageDialog(null, "Você digitou um valor inválido", "Erro!!", 0);
			}
		} while (cadastroLocacoes <= 0);

		// Atribuindo valor de tamanho aos vetores de acordo com o valor informado pelo
		// usuários
		// Definindo a quantidade de livros a serem cadastrados
		livros = new Livro[cadastroLivros];

		// Definindo a quantidade de usuários a serem cadastrados
		usuarios = new Usuario[cadastroUsuario];

		// Definindo a quantidade de locações a serem cadastradas
		locacoes = new Locacao[cadastroLocacoes];

		// Função para popular a aplicação com alguns cadastros e registros

		//cadastroAutomatico();

		// Processamento de looping do programa
		while (true) {
			escolhaUsuario();
		}
	}

	// Método para capturar do usuário a opção
	public void escolhaUsuario() {
		// Criando string de apresentação do menu
		String menu = "==========M E N U==========\n\n" + "OPÇÃO 1: Cadastrar livro\n" + "OPÇÃO 2: Cadastrar usuário\n"
				+ "OPÇÃO 3: Efetuar locação de livros\n" + "OPÇÃO 4: Efetuar devolução de livros\n"
				+ "OPÇÃO 5: Listar todos os livros cadastrados\n" + "OPÇÃO 6: Listar todos os usuários cadastrados\n"
				+ "OPÇÃO 7: Pesquisar livros por editora\n" + "OPÇÃO 8: Pesquisar livros por autor\n"
				+ "OPÇÃO 9: Pesquisar locações por data\n" + "OPÇÃO 10: Sair do sistema"
				+ "\n\nInforme a opção desejada:\n\n";

		// Capturando a escolha do usuário
		int escolha = Integer.parseInt(JOptionPane.showInputDialog(menu));

		// Chamando o método de processamento da opção escolhida
		escolhaProcessamento(escolha);
	}

	// Método para popular alguns registros da aplicação
	public void cadastroAutomatico() {
		Usuario usuario1 = new Usuario();
		Usuario usuario2 = new Usuario();
		Usuario usuario3 = new Usuario();
		Usuario usuario4 = new Usuario();
		Usuario usuario5 = new Usuario();
		Usuario usuario6 = new Usuario();
		Usuario usuario7 = new Usuario();

		Autor autor1 = new Autor();
		Autor autor2 = new Autor();
		Autor autor3 = new Autor();
		Editora editora1 = new Editora();
		Editora editora2 = new Editora();
		Editora editora3 = new Editora();
		Data data = new Data();

		autor1.setCodigo(001);
		autor1.setNacionalidade("BR");
		autor1.setNome("Machado de Assis");

		autor2.setCodigo(002);
		autor2.setNacionalidade("USA");
		autor2.setNome("Kathy Sierra");

		autor3.setCodigo(003);
		autor3.setNacionalidade("BR");
		autor3.setNome("Mauro Augusto");

		editora1.setCodigo(001);
		editora1.setNome("Abril");
		editora1.setPais("BR");

		editora2.setCodigo(002);
		editora2.setNome("Maia");
		editora2.setPais("BR");

		editora3.setCodigo(003);
		editora3.setNome("Alta Books");
		editora3.setPais("BR");

		Livro livro1 = new Livro();
		Livro livro2 = new Livro();
		Livro livro3 = new Livro();
		Livro livro4 = new Livro();
		Livro livro5 = new Livro();
		Livro livro6 = new Livro();
		Livro livro7 = new Livro();
		Livro livro8 = new Livro();
		Livro livro9 = new Livro();
		Livro livro10 = new Livro();

		Locacao locacao1 = new Locacao();
		Locacao locacao2 = new Locacao();
		Locacao locacao3 = new Locacao();

		data.setDia(01);
		data.setMes(03);
		data.setAno(2000);

		usuario1.setCodigo(001);
		usuario1.setEmail("gustavo.com");
		usuario1.setNome("Gustavo");
		usuario1.setTelefone("99887766");
		usuario1.setDataNascimento(data);

		usuario2.setCodigo(002);
		usuario2.setEmail("renato.com");
		usuario2.setNome("Renato");
		usuario2.setTelefone("99887766");
		usuario2.setDataNascimento(data);

		usuario3.setCodigo(003);
		usuario3.setEmail("gustavo.com");
		usuario3.setNome("Nathi");
		usuario3.setTelefone("99887766");
		usuario3.setDataNascimento(data);

		usuario4.setCodigo(004);
		usuario4.setEmail("gustavo.com");
		usuario4.setNome("Matheus");
		usuario4.setTelefone("99887766");
		usuario4.setDataNascimento(data);

		usuario5.setCodigo(005);
		usuario5.setEmail("gustavo.com");
		usuario5.setNome("Israel");
		usuario5.setTelefone("99887766");
		usuario5.setDataNascimento(data);

		usuario6.setCodigo(006);
		usuario6.setEmail("gustavo.com");
		usuario6.setNome("Mayke");
		usuario6.setTelefone("99887766");
		usuario6.setDataNascimento(data);

		usuario7.setCodigo(007);
		usuario7.setEmail("gustavo.com");
		usuario7.setNome("Eric");
		usuario7.setTelefone("99887766");
		usuario7.setDataNascimento(data);

		/*livro1.setAnoPublicacao(2000);
		livro1.setAutor(autor1);
		livro1.setCodigo(1);
		livro1.setDisponivel(true);
		livro1.setEditora(editora1);
		livro1.setTitulo("Dom casmurro");

		livro2.setAnoPublicacao(2000);
		livro2.setAutor(autor2);
		livro2.setCodigo(2);
		livro2.setDisponivel(true);
		livro2.setEditora(editora2);
		livro2.setTitulo("11 minutos");

		livro3.setAnoPublicacao(2000);
		livro3.setAutor(autor3);
		livro3.setCodigo(3);
		livro3.setDisponivel(true);
		livro3.setEditora(editora3);
		livro3.setTitulo("Codigo da vinci");

		livro4.setAnoPublicacao(2000);
		livro4.setAutor(autor1);
		livro4.setCodigo(4);
		livro4.setDisponivel(true);
		livro4.setEditora(editora2);
		livro4.setTitulo("Eloquent Javascript");

		livro5.setAnoPublicacao(2000);
		livro5.setAutor(autor2);
		livro5.setCodigo(5);
		livro5.setDisponivel(true);
		livro5.setEditora(editora1);
		livro5.setTitulo("Linux");

		/*livro6.setAnoPublicacao(2000);
		livro6.setAutor(autor3);
		livro6.setCodigo(6);
		livro6.setDisponivel(true);
		livro6.setEditora(editora3);
		livro6.setTitulo("Design Patterns");*/

		/*livro7.setAnoPublicacao(2000);
		livro7.setAutor(autor1);
		livro7.setCodigo(7);
		livro7.setDisponivel(true);
		livro7.setEditora(editora1);
		livro7.setTitulo("MySQL");*/

		/*livro8.setAnoPublicacao(2000);
		livro8.setAutor(autor2);
		livro8.setCodigo(8);
		livro8.setDisponivel(false);
		livro8.setEditora(editora2);
		livro8.setTitulo("Use a cabeça - Java");*/

		/*livro9.setAnoPublicacao(2000);
		livro9.setAutor(autor3);
		livro9.setCodigo(9);
		livro9.setDisponivel(false);
		livro9.setEditora(editora3);
		livro9.setTitulo("Vidas secas");*/

		/*livro10.setAnoPublicacao(2000);
		livro10.setAutor(autor1);
		livro10.setCodigo(10);
		livro10.setDisponivel(false);
		livro10.setEditora(editora1);
		livro10.setTitulo("Capitães de areia");*/

		Livro livros1[] = new Livro[1];
		Livro livros2[] = new Livro[1];
		Livro livros3[] = new Livro[1];

		livros1[0] = livro10;
		livros2[0] = livro9;
		livros3[0] = livro8;

		locacao1.setCodigo(01);
		locacao1.setDataDevolucao(data);
		locacao1.setDataLocacao(data);
		locacao1.setLivros(livros1);
		locacao1.setUsuario(usuario7);

		locacao2.setCodigo(02);
		locacao2.setDataDevolucao(data);
		locacao2.setDataLocacao(data);
		locacao2.setLivros(livros2);
		locacao2.setUsuario(usuario6);

		locacao3.setCodigo(03);
		locacao3.setDataDevolucao(data);
		locacao3.setDataLocacao(data);
		locacao3.setLivros(livros3);
		locacao3.setUsuario(usuario5);

		locacoes[0] = locacao1;
		locacoes[1] = locacao2;
		locacoes[2] = locacao3;

		usuarios[0] = usuario1;
		usuarios[1] = usuario2;
		usuarios[2] = usuario3;
		usuarios[3] = usuario4;
		usuarios[4] = usuario5;
		usuarios[5] = usuario6;
		usuarios[6] = usuario7;

		livros[0] = livro1;
		livros[1] = livro2;
		livros[2] = livro3;
		livros[3] = livro4;
		livros[4] = livro5;
		livros[5] = livro6;
		livros[6] = livro7;
		livros[7] = livro8;
		livros[8] = livro9;
		livros[9] = livro10;
	}

	// Método para selação das opções do programa
	public void escolhaProcessamento(int opcao) {
		// Switch para escolher a opção do usuário e levar ao método referente
		switch (opcao) {
		case 1:
			cadastrarLivro();
			break;
		case 2:
			cadastrarUsuario();
			break;
		case 3:
			validaLocacao();
			break;
		case 4:
			efetuarDevolucaoLivros();
			break;
		case 5:
			listarLivrosCadastrados();
			break;
		case 6:
			listarUsuariosCadastrados();
			break;
		case 7:
			pesquisarLivrosPorEditora();
			break;
		case 8:
			pesquisarLivrosPorAutor();
			break;
		case 9:
			pesquisarLocacaoPorData();
			break;
		case 10:
			sairDoSistema();
			break;

		default:
			JOptionPane.showMessageDialog(null, "Opção inválida!", "MENU", 0);
			break;
		}
	}

	// Método para efetuar o cadastro de um novo livro no acervo
	public void cadastrarLivro() {
		// variável auxiliar para verificar se o livro foi cadastrado com aucesso
		boolean gravado = false;

		// Varrendo o vetor de livros para verificar se tem espaço no acervo para
		// atribuir novo cadastro na primeira posição vazia
		for (int i = 0; i < livros.length; i++) {
			if (livros[i] == null) {
				// Chamando método para criar livro na posição disponível
				livros[i] = criarLivro();
				// Validando cadastro para apresentar mensagem de sucesso
				gravado = true;
				break;
			}
		}

		// Apresentando mensagem de sucesso ou não para o usuário
		if (gravado) {
			JOptionPane.showMessageDialog(null, "Livro gravado com sucesso!", "Cadastro de Livros", 1);
		} else {
			JOptionPane.showMessageDialog(null, "Acervo cheio!", "Cadastro de Livros", 2);
		}
	}

	// Método para criar um novo livro no acervo
	public Livro criarLivro() {

		// Instanciando os objetos livro, autor e editora
		Livro livro = new Livro();
		Autor autor = new Autor();
		Editora editora = new Editora();

		// Capturando do usuário as informações do autor do livro a ser cadastrado
		autor.setNome(JOptionPane.showInputDialog("Informe o Nome do Autor:"));
		autor.setNacionalidade(JOptionPane.showInputDialog("Informe a Nacionalidade de Autor:"));
		autor.setCodigo(contadorAutores);
		contadorAutores++;

		// Atribuindo o autor ao livro
		livro.setAutor(autor);

		// Capturando do usuário as informações da editora do livro a ser cadastrado
		editora.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Informe o Codigo do Editora:")));
		editora.setNome(JOptionPane.showInputDialog("Informe o Nome da Editora:"));
		editora.setPais(JOptionPane.showInputDialog("Informe o País da Editora:"));

		// Atribuindo a editora ao livro
		livro.setEditora(editora);

		// Capturando do usuário as informações do livro a ser cadastrado
		livro.setTitulo(JOptionPane.showInputDialog("Informe o Titulo do Livro:"));
		livro.setAnoPublicacao(Integer.parseInt(JOptionPane.showInputDialog("Informe o Ano de Publicação do Livro:")));
		livro.setCodigo(contadorLivros);
		contadorLivros++;
		livro.setDisponivel(true);

		// Retornando o livro cadastrado
		return livro;
	}

	// Método para efetuar o cadastro de um novo usuário
	public void cadastrarUsuario() {

		// Variável auxiliar para verificar se o usuário foi gravado com sucesso
		boolean gravado = false;

		// Laço para varrer o vetor e verificar se ainda possui espaço para cadastro do
		// novo usuário
		for (int i = 0; i < usuarios.length; i++) {
			// Checando a primeira posição disponível
			if (usuarios[i] == null) {
				// Criando usuário na posição livre
				usuarios[i] = criarUsuario();
				// Validando o cadastro de usuário
				gravado = true;
				break;
			}
		}
		// Condicional para retornar a mensagem de sucesso ou fracasso dependendo se o
		// cadastro foi realizado ou não
		if (gravado) {
			JOptionPane.showMessageDialog(null, "Usuario gravado com sucesso!", "Cadastro de Usuários", 1);
		} else {
			JOptionPane.showMessageDialog(null, "Sem espaço para cadastro de usuário!", "Cadastro de  Usuários", 2);
		}
	}

	// Método para cadastrar Usuarios na Biblioteca
	public Usuario criarUsuario() {
		// Instanciando objetos data e usuário
		Usuario usuario = new Usuario();
		Data data = new Data();

		// Recebendo do usuário o nome do usuário a ser cadastrado
		usuario.setNome(JOptionPane.showInputDialog("Informe o nome do usuário:"));

		// Recebendo do usuário a data de nascimento
		String[] dataNascimento = JOptionPane.showInputDialog("Digite a data da nascimento: (dd/mm/aaaa").split("/");
		data.setDia(Integer.parseInt(dataNascimento[0]));
		data.setMes(Integer.parseInt(dataNascimento[1]));
		data.setAno(Integer.parseInt(dataNascimento[2]));

		// Atribuindo a data de nascimento ao usuário
		usuario.setDataNascimento(data);

		// Recebendo do usuário o telefone
		usuario.setTelefone(JOptionPane.showInputDialog("Informe o telefone:"));

		// Recebendo do usuário o e-mail
		usuario.setEmail(JOptionPane.showInputDialog("Informe o e-mail:"));

		// Atribuindo um código ao usuário
		usuario.setCodigo(contadorUsuarios);
		contadorUsuarios++;

		// Retornando usuário
		return usuario;
	}

	// 3 - Efetuar locação
		public void efetuarLocacao() {
			// Declarando opção
			int opcao;
			// Checando se usuário está cadastrado
			// caso contrário o levará para cadastro
			opcao = Integer.parseInt(JOptionPane.showInputDialog("Usuário cadastrado?\n1 - Sim\n2 - Não"));
			if (opcao == 1) {
				locar();
			} else if (opcao == 2) {
				cadastrarUsuario();
			}

		}
		
		// Validar locação por lotação
		
		public void validaLocacao() {
			int contador = 0;
			int quantidadeLivros = 0;
			int quantidadeUsuarios = 0;
			for (int i = 0; i < locacoes.length; i++) {
				if (locacoes[i] != null) {
					contador++;
				}
			}
			
			for (int i = 0; i < livros.length; i++) {
				if (livros[i] != null) {
					quantidadeLivros++;
				}
			}
			
			for (int i = 0; i < usuarios.length; i++) {
				if (usuarios[i] != null)  {
					quantidadeUsuarios++;
				}
			}
			
			if ((quantidadeLivros == 0) || (quantidadeUsuarios == 0)) {
				JOptionPane.showMessageDialog(null, "Sem livros cadastrados ou usuários!\nAguarde pelo cadastramento de novos livros no acervo.", "Locação", 0);
			} else {
				if (contador == locacoes.length) {
					JOptionPane.showMessageDialog(null, "Locação indisponível!\nAguarde uma devolução", "Locação", 0);
				} else {
					efetuarLocacao();
				}
			}
		}

	// Método - locar
	public void locar() {
		// String para concatenar mensagem com nomes de usuários e seus respectivos
		// códigos
		String mensagem = "";

		// Percorrendo vetor de usuários
		for (int i = 0; i < usuarios.length; i++) {
			if (usuarios[i] != null) {
				// Concatenado a mensagem para apresentação
				mensagem += usuarios[i].getCodigo() + " - " + usuarios[i].getNome() + "\n";
			}
		}
		mensagem += "Informe o usuário";

		int codigoUsuario;
		// Recebendo código do usuário
		codigoUsuario = Integer.parseInt(JOptionPane.showInputDialog(mensagem));

		// Condicional para verificar se o usuário existe, caso sim, segue a execução,
		// caso não, retorna a mensagem de usuário inexistente
		if (usuarioExistente(codigoUsuario)) {
			// Chamando método para cadastrar locação
			cadastroLocacao(codigoUsuario);
		} else {
			JOptionPane.showInternalMessageDialog(null, "Usuário inexistente", "Locação de livros", 2);
		}
	}

	// Método - cadastro locaçao
	public Locacao cadastroLocacao(int codigoUsuario) {
		// Instanciando locação
		Locacao locacao = new Locacao();

		// Varrendo vetor usuários buscando usuário correto pelo código do usuário e
		// dando o set de seu usuário na classe locação
		for (int i = 0; i < usuarios.length; i++) {
			if (usuarios[i] != null && usuarios[i].getCodigo() == codigoUsuario) {
				locacao.setUsuario(usuarios[i]);
			}
		}

		// Recebendo quantidade de livros para atribuir ao vetor livros da classe
		// Locação
		int quantidadeLivros;
		quantidadeLivros = Integer
				.parseInt(JOptionPane.showInputDialog("Informe a quantidade de livros que deseja locar"));

		for (int j = 0; j < livros.length; j++) {
			if (livros[j] != null && livros[j].isDisponivel()) {

			}

		}
		// Verificar se a quantidade de livros fornecida pelo usuário é maior que a de
		// livros disponíveis para locação

		Livro livrosLocacao[] = new Livro[quantidadeLivros];

		// Varrendo livros para usuário escolher e fazer a locação
		for (int i = 0; i < quantidadeLivros; i++) {
			String livrosDisponiveis = " ";
			for (int j = 0; j < livros.length; j++) {
				if (livros[j] != null && livros[j].isDisponivel()) {
					livrosDisponiveis += livros[j].getCodigo() + " - " + livros[j].getTitulo() + "\n";
				}
			}

			livrosDisponiveis += "Informe o código";

			int codigoLivro;

			// Recebendo o código do livro do usuário
			codigoLivro = Integer.parseInt(JOptionPane.showInputDialog(livrosDisponiveis));

			// Fazendo locação de livro
			for (int j = 0; j < livros.length; j++) {
				// Condicional para comparar código fornecido pelo usuário com código dos livros
				// disponíveis no vetor
				if (livros[j] != null && livros[j].getCodigo() == codigoLivro && livros[j].isDisponivel()) {
					// Set disponibilidade do livro para false + inserir no vetor de locação
					livros[j].setDisponivel(false);
					livrosLocacao[i] = livros[j];
				}
			}

		}

		// Inserindo vetor de livros locados na classe
		locacao.setLivros(livrosLocacao);

		// Chamando método para criar data de locação e devolução e inserir no registro
		criarData(locacao);

		// Inserir código de locação na classe
		locacao.setCodigo(contadorLocacoes);
		contadorLocacoes++;

		// Varrendo vetor de locações e caso haja espaço cadastra a nova locação
		for (int i = 0; i < locacoes.length; i++) {
			if (locacoes[i] == null) {
				locacoes[i] = locacao;
				JOptionPane.showMessageDialog(null, "Locação efetuada com sucesso", "Locação", 1);
				break;
			}
		}
		return locacao;
	}

	public void criarData(Locacao locacao) {
		Data dataLocacao = new Data();

		GregorianCalendar calendario = new GregorianCalendar();
		int dia = calendario.get(GregorianCalendar.DAY_OF_MONTH);
		int mes = calendario.get(GregorianCalendar.MONTH);
		int ano = calendario.get(GregorianCalendar.YEAR);

		// setando a data de locacao
		dataLocacao.setDia(dia);
		dataLocacao.setMes(mes + 1);
		dataLocacao.setAno(ano);

		locacao.setDataLocacao(dataLocacao);

		// Adicionando 7 dias a data atual
		calendario.add(GregorianCalendar.DAY_OF_MONTH, 7);

		// atribuindo novos valores
		int diaDevolucao = calendario.get(GregorianCalendar.DAY_OF_MONTH);
		int mesDevolucao = calendario.get(GregorianCalendar.MONTH);
		int anoDevolucao = calendario.get(GregorianCalendar.YEAR);

		// Instanciando nova data para armazenar a data de devolução
		Data dataDevolucao = new Data();
		dataDevolucao.setAno(anoDevolucao);
		dataDevolucao.setMes(mesDevolucao + 1);
		dataDevolucao.setDia(diaDevolucao);

		// Atribuindo data de devolução ao nosso objeto locação
		locacao.setDataDevolucao(dataDevolucao);
	}

	public boolean usuarioExistente(int codigoUsuario) {
		boolean usuarioExiste = false;
		// Checando se usuário é existente
		for (int i = 0; i < usuarios.length; i++) {
			if (usuarios[i] != null && codigoUsuario == usuarios[i].getCodigo()) {
				usuarioExiste = true;
			}
		}

		return usuarioExiste;

	}

	// Método para efetuar uma devolução
	public void efetuarDevolucaoLivros() {

		// Receber o código de locação através de input
		int codigoLocacao;
		boolean devolvido = false;
		codigoLocacao = Integer.parseInt(JOptionPane.showInputDialog(" Informe - Código de locação: "));

		for (int i = 0; i < locacoes.length; i++) {
			if (locacoes[i] != null && locacoes[i].getCodigo() == codigoLocacao) {
				Livro livros[] = new Livro[locacoes[i].getLivros().length];
				livros = locacoes[i].getLivros();
				for (int j = 0; j < locacoes[i].getLivros().length; j++) {
					livros[j].setDisponivel(true);
					devolvido = true;
				}
				locacoes[i] = null;
			}
		}
		if (devolvido) {
			JOptionPane.showMessageDialog(null, "Devolução efetuada com sucesso!", "Devolução de livro", 1);
		} else {
			JOptionPane.showMessageDialog(null, "Devolução inixistente, por favor, checar seu código de locação.",
					"Devolução de livro", 0);
		}
	}

	// Listar livros
	public void listarLivrosCadastrados() {
		// Variável auxiliar para exibir a lista de livros cadastrados
		String mensagem = "\n";

		// Varrendo o acervo para verificar se existem livros cadastrados
		for (int i = 0; i < livros.length; i++) {
			if (livros[i] != null) {
				// concatenando mensgem para apresentação ao usuario.
				mensagem += "Titulo : " + livros[i].getTitulo() + "\n";
				mensagem += "Código do livro : " + livros[i].getCodigo() + "\n\n";
			}
		}
		// Exibindo o acervo para o usuário
		if (livros[0] != null) {
			JOptionPane.showMessageDialog(null, mensagem, "Listagem de livros", 1);
		} else {
			JOptionPane.showMessageDialog(null, "Acervo vazio.", "Listagem de livros", 1);
		}

	}

	// Listar usuários
	public void listarUsuariosCadastrados() {
		// Variável auxiliar para exibir a lista de livros cadastrados
		String mensagem = "";

		// Varrendo o acervo para verificar se existem livros cadastrados
		for (int i = 0; i < usuarios.length; i++) {
			if (usuarios[i] != null) {
				// concatenando mensgem para apresentação ao usuario.
				mensagem += "Código do Usuario: " + usuarios[i].getCodigo() + "\n";
				mensagem += "Nome: " + usuarios[i].getNome() + "\n\n";
			}
		}
		// Exibindo a listagem de usuários
		if (usuarios[0] != null) {
			JOptionPane.showMessageDialog(null, mensagem, "Listagem de usuários", 1);
		} else {
			JOptionPane.showMessageDialog(null, "Nenhum usuário cadastrado!", "Listagem de usuários", 1);
		}

	}

	// Método para retornar todos os livros por editora
	public void pesquisarLivrosPorEditora() {
		// Recebendo do usuário qual a editora a ser pesquisada
		String editora = JOptionPane.showInputDialog("Informe a editora para pesquisa:");

		// Variavel auxiliar para exibir a mensagem do resultado pesquisado
		String mensagem = "Pesquisa por editora\n\n";

		// Variável auxiliar para verificar se existe a editora cadastrada
		boolean existe = false;

		// Varrendo o vetor e verificando a editora cadastrada
		for (int i = 0; i < livros.length; i++) {
			if (livros[i] != null && livros[i].getEditora().getNome().equals(editora)) {
				// concatenando mensgem para apresentação ao usuario.
				mensagem += "Código da editora: " + livros[i].getEditora().getCodigo() + "     |   ";
				mensagem += "Editora: " + livros[i].getEditora().getNome() + "\n";
				mensagem += "Código do livro: " + livros[i].getCodigo() + "     |   ";
				mensagem += "Titulo : " + livros[i].getTitulo() + "\n" + "\n";
				existe = true;
			}
		}

		// Exibindo o resultado da pesquisa
		if (existe) {
			JOptionPane.showMessageDialog(null, mensagem, "Listagem de editoras" + editora, 1);
		} else {
			JOptionPane.showMessageDialog(null, "Não existem livros cadastrados para a editora informada. ", "Listagem de editoras", 2);
		}
	}

	public void pesquisarLivrosPorAutor() {

		// Recebendo do usuário qual o autor a ser pesquisado
		String autor = JOptionPane.showInputDialog("Informe o autor para pesquisa:");

		// Variavel auxiliar para exibir a mensagem do resultado pesquisado
		String mensagem = "Pesquisa por autor\n\n";

		// Variável auxiliar para verificar se existe o autor cadastrado
		boolean existe = false;

		// Varrendo o vetor e verificando o autor cadastrado
		for (int i = 0; i < livros.length; i++) {
			if (livros[i] != null && livros[i].getAutor().getNome().equals(autor)) {
				mensagem += "Código do livro : " + livros[i].getCodigo() + "  |   ";
				mensagem += "Titulo : " + livros[i].getTitulo() + "\n";
				mensagem += "Autor  : " + livros[i].getAutor().getNome() + "  |   ";
				mensagem += "Código do Autor  : " + livros[i].getAutor().getCodigo() + "\n" + "\n";
				existe = true;
			}
		}

		// Exibindo o resultado da pesquisa
		if (existe) {
			JOptionPane.showMessageDialog(null, mensagem, "Listagem de autor" + autor, 1);
		} else {
			JOptionPane.showMessageDialog(null, "Não existem livros cadastrados para o autor informado.", "Listagem de Autor", 2);
		}
	}

	// Método para pesquisar locações por data
	public void pesquisarLocacaoPorData() {
		Locacao locacao = new Locacao();

		String dataLocacao = JOptionPane.showInputDialog("Informe a data de locação para pesquisa.");
		String dataProcura[] = dataLocacao.split("/");

		int diaProcura = Integer.parseInt(dataProcura[0]);
		int mesProcura = Integer.parseInt(dataProcura[1]);
		int anoProcura = Integer.parseInt(dataProcura[2]);

		String mensagem = " Pesquisa por Data de Locação: " + dataLocacao + "\n \n";
		boolean existe = false;

		// Varrendo todas as locaçãoes para verificar a data
		for (int i = 0; i < locacoes.length; i++) {
			// Verificando se é nulo e a posição
			if (locacoes[i] != null) {
				// Varrendo dia de locação
				int diaLocacao = (locacoes[i].getDataLocacao().getDia());
				if (diaLocacao == diaProcura) {
					// Varrendo mês de locação
					int mesLocacao = (locacoes[i].getDataLocacao().getMes());
					if (mesLocacao == mesProcura) {
						// Varrendo ano de locação
						int anoLocacao = (locacoes[i].getDataLocacao().getAno());
						if (anoLocacao == anoProcura) {
							existe = true;
							locacao.setCodigo(locacoes[i].getCodigo());
							locacao.setUsuario(locacoes[i].getUsuario());
							mensagem += "Código locação: " + locacao.getCodigo() + "\nLocação efetucada por "
									+ locacao.getUsuario().getNome() + "\n";
							for (int j = 0; j < locacoes[i].getLivros().length; j++) {
								mensagem += "Cód." + locacoes[i].getLivros()[j].getCodigo() + " - ";
								mensagem += locacoes[i].getLivros()[j].getTitulo() + "\n";
							}
							mensagem += "\n";
						}
					}
				}
			}
		}
		if (existe) {
			JOptionPane.showMessageDialog(null, mensagem, "Pesquisa por data de locação", 1);
		} else {
			JOptionPane.showMessageDialog(null, "Nenhum livro alocado na data " + dataLocacao,
					"Pesquisa por data de locacao", 2);
		}

	}

	// Método para montar mensagem para o usuário
	public String mensagem(Livro livros) {

		// Variável auxiliar para retornar a mensagem formatada
		String msg = "\n";

		// Montando a mensagem de retorno para o usuário
		msg += "Codigo: " + livros.getCodigo() + "\n";
		msg += "Autor: " + livros.getAutor().getNome() + "\n";
		msg += "Editora: " + livros.getEditora().getNome() + "\n";
		msg += "Ano de publicação: " + livros.getAnoPublicacao() + "\n";

		// Retornando a mensagem formatada
		return msg;
	}

	public void sairDoSistema() {
		System.exit(0);
	}
}
