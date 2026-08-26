package br.com.fiap.produtos;

import br.com.fiap.produtos.model.Categoria;
import br.com.fiap.produtos.model.Produto;
import br.com.fiap.produtos.repository.CategoriaCollectionRepository;
import br.com.fiap.produtos.repository.ProdutoCollectionRepository;
import br.com.fiap.produtos.view.CategoriaView;
import br.com.fiap.produtos.view.Opcao;
import br.com.fiap.produtos.view.OpcaoView;
import br.com.fiap.produtos.view.ProdutoView;

import javax.swing.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Opcao opcao = null;

        do{
            opcao = OpcaoView.select();
            switch (opcao){
                case CADASTRA_CATEGORIA -> cadastraCategoria();
                case CADASTRAS_PRODUTO -> cadastraProdruto();
                case CONSULTAR_PRODUTO_POR_ID -> consultarProdutoPorId();
                case CONSULTAR_PRODUTO_POR_CATEGORIA -> consultarProdutoPorCategoria();
                case ALTERAR_PRODUTO -> alterarProduto();
                case ENCERRAR_SISTEMA -> encerrarOSistema();
            }

        }while (opcao != Opcao.ENCERRAR_SISTEMA);

    }

    private static void consultarProdutoPorCategoria() {

        Categoria categoria = CategoriaView.select(null);

        List<Produto> produtos = ProdutoCollectionRepository.findByCategoria(categoria);

        if(produtos.isEmpty()){
            JOptionPane.showMessageDialog(null, "Não encontramos produtos com a categoria: " + categoria.getNome());
        }else{
            produtos.forEach(ProdutoView::show);
            produtos.forEach(System.out::println);
        }

    }

    private static void consultarProdutoPorId() {

    }

    private static void alterarProduto() {
        Produto produto = ProdutoView.select(null);
        ProdutoView.update(produto);

    }

    private static void encerrarOSistema() {

    }

    private static void cadastraProdruto() {

        Produto produto = ProdutoView.form(new Produto());
        ProdutoCollectionRepository.save(produto);
        ProdutoView.sucesso(produto);

    }

    private static void cadastraCategoria() {

        CategoriaView view = new CategoriaView();
        Categoria categoria = view.form(new Categoria());
        CategoriaCollectionRepository.save(categoria);
        view.sucesso(categoria);

    }
}