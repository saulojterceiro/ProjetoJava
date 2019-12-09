package simulador.compraevenda.java;

public class Fornecedores {

		private String cpfCnpj;
		private String endereco;
		private String nome;
		private String email;
		private String celular;
		private int id;

		public Fornecedores(String endereco,String cpfCnpj,  String nome, String email, String celular) {
                    this.endereco = endereco;
                    this.celular = celular;
                    this.nome = nome;
                    this.email = email;
                    this.cpfCnpj = cpfCnpj;
		}
                
		public String dadosFornecedores(){
			String retorno = "Código: " + id + "<br/>Nome: " + nome + "<br/>CPF ou CNPJ: " + cpfCnpj + "<br/>Endereco:" +endereco + "<br/>Email: " +  email +"<br/>Celular: " + celular +"<br/><br/>";
			return retorno;
		}
		public String dadosFornecedores2() {
			String retorno = "Código: " + id + "\nNome: " + nome;
			return retorno;
		}

		public String getCpfCnpj() {
		return cpfCnpj;
		}

		public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
		}

		public String getEndereco() {
		return endereco;
		}

		public void setEndereco(String endereco) {
		this.endereco = endereco;
		}

		public String getNome() {
		return nome;
		}

		public void setNome(String nome) {
		this.nome = nome;
		}

		public String getEmail() {
		return email;
		}

		public void setEmail(String email) {
		this.email = email;
		}


		public String getCelular() {
		return celular;
		}

		public void setCelular(String celular) {
		this.celular = celular;
		}

		public int getId() {
		return id;
		}

		public void setId(int id) {
		this.id = id;
		}



	}

