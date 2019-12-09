/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulador.compraevenda.java;

import Interface.Menu;
import java.util.ArrayList;

/**
 *
 * @author CONDUCTOR\saulo.terceiro
 */
public class Controller {
    
    
	ArrayList<Produto> listProdutos = new ArrayList<>();
	ArrayList<Categoria> listCategorias = new ArrayList<>();
        ArrayList<PessoaFisica> ListPessoaFisica = new ArrayList<>();
	ArrayList<PessoaJuridica> ListPessoaJuridica = new ArrayList<>();
	ArrayList<Fornecedores> listFornecedores = new ArrayList<>();
	ArrayList<Venda> ListVendas = new ArrayList<>();
        ArrayList<Unidade> ListUnidade = new ArrayList<>();

        public Controller(){
      		ListUnidade.add(new Unidade(1, "UND (unidade)"));
		ListUnidade.add(new Unidade(2, "M (metro)"));
		ListUnidade.add(new Unidade(3, "KG (quilo)"));
		ListUnidade.add(new Unidade(4, "L (litro)"));
        }
        
        
        public String listProdutoToString(){
                String listagemProdutos = "";
           	if (listProdutos.size() == 0) {
			return ("Lista de Produtos vazia.");
		}
		for (Produto p : listProdutos) {
			listagemProdutos = listagemProdutos +("\nProduto: ");
                        listagemProdutos = listagemProdutos + (p.dadosProdutos());
		}
                return listagemProdutos;
        }
        
        public String listCategorias(){
                String stringCategoria = "";
                if (listCategorias.isEmpty()) {
			return "Lista de categorias vazia.";
		}
		for (Categoria c : listCategorias) {
			// o c vai referenciar cada elemento na lista, um de cada vez.
			stringCategoria = stringCategoria + c.dadosCategoria();
		}
		return stringCategoria;
        }
        
        public Fornecedores getFornecedorCodigo(int codigo){
            for(int i = 0;i<listFornecedores.size();i++){
                if(listFornecedores.get(i).getId()==codigo){
                    return listFornecedores.get(i);
                }
            }
            return null;
        }
        
        public Categoria getCategoriaCodigo(int codigo){
            for(int i = 0;i<listCategorias.size();i++){
                if(listCategorias.get(i).getId()==codigo){
                    return listCategorias.get(i);
                }
            }
            return null;
        }
        
        public Unidade getUnidaedCodigo(int codigo){
            for(int i = 0;i<ListUnidade.size();i++){
                if(ListUnidade.get(i).getId()==codigo){
                    return ListUnidade.get(i);
                }
            }
            return null;
        }
        
        public void adicionarProduto(Produto produtoNovo){
            this.listProdutos.add(produtoNovo);
        }
        

        public void adicionarCategoria(String stringDescricao) {
            Categoria categoria = new Categoria(stringDescricao,listCategorias.size()+1);
            listCategorias.add(categoria);
        }
        
        public void adicionarFornecedor(Fornecedores fornecedor) {
            fornecedor.setId(listFornecedores.size()+1);
            listFornecedores.add(fornecedor);
        }

        public String listFornecedoresToString() {
                String listagem = "";
                if (listFornecedores.size() == 0) {
			return "Lista de fornecedores vazia.";
		}
                
		for (Fornecedores fo : listFornecedores) {
			listagem = listagem +fo.dadosFornecedores();


		}
		return listagem;

        }
    
        
 
}
