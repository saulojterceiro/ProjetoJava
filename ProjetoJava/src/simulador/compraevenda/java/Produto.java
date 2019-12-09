package simulador.compraevenda.java;

public class Produto {
	private Fornecedores fornecedores;
	private Categoria categoria;
	private int id;
	private String nome;
	private double precoVenda;
	private int qtde_estoque;
	private int qtd_produtos;
	private Unidade unidade;
        
        public Produto( Categoria categoria, int id, Fornecedores fornecedores, String nome, double precoVenda,  int qtde_estoque, Unidade unidade){
		this.categoria = categoria;
		this.id = id;
		this.fornecedores = fornecedores;
		this.nome = nome;
		this.precoVenda = precoVenda;
		this.qtde_estoque = qtde_estoque;
		this.unidade = unidade;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Fornecedores getFornecedores() {
		return fornecedores;
	}
	public void setFornecedores(Fornecedores fornecedores) {
		this.fornecedores = fornecedores;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPrecoVenda() {
		return precoVenda;
	}
	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}
	public int getQtde_estoque() {
		return qtde_estoque;
	}
	public void setQtde_estoque(int qtde_estoque) {
		this.qtde_estoque = qtde_estoque;
	}


	
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public int getQtd_produtos() {
		return qtd_produtos;
	}
	public void setQtd_produtos(int qtd_produtos) {
		this.qtd_produtos = qtd_produtos;
	}
	public Unidade getUnidade() {
		return unidade;
	}
	public void setUnidade(Unidade unidade) {
		this.unidade = unidade;
	}
	public String dadosProdutos(){
		String retorno = "\nCódigo do produto: " + this.id + "\nFornecedor: " + this.fornecedores.getNome() + "\nCategoria: " + this.categoria.getDescricao() + "\nNome: " + this.nome + "\nPreco Venda: " + this.precoVenda + "\nQuantidade de produtos: " + this.qtde_estoque + "\nUnidade: " + this.unidade.getNome();
		return retorno;
	}
	public String dadosProdutos2() {
		String retorno = "\nCódigo do produto: " + this.id + "\nNome: " + this.nome +"\nCategoria: " + this.categoria.getDescricao() + "\nPreco Venda: " + this.precoVenda + "\nQuantidade de produtos: " + this.qtde_estoque;
		return retorno;
	}

	

}
