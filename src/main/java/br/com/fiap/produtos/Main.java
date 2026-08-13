package br.com.fiap.produtos;

import br.com.fiap.produtos.model.Categoria;
import br.com.fiap.produtos.model.Produto;
import br.com.fiap.produtos.repository.CategoriaCollectionRepository;
import br.com.fiap.produtos.repository.ProdutoCollectionRepository;
import br.com.fiap.produtos.view.CategoriaView;
import br.com.fiap.produtos.view.Opcao;
import br.com.fiap.produtos.view.OpcaoView;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        Opcao opcao = null;

        do{
            opcao = OpcaoView.select();
            switch (opcao){
                case CADASTRA_CATEGORIA -> cadastraCategoria();
                case CADASTRAS_PRODUTO -> cadatraProdruto();
                case CONSULTAR_PRODUTO_POR_ID -> consultarProdutoPorId();
                case CONSULTAR_PRODUTO_POR_CATEGORIA -> consultarProdutoPorCategoria();
                case ALTERAR_PRODUTO -> alterarProduto();
                case ENCERRAR_SISTEMA -> encerrarOSistema();
            }

        }while (opcao != Opcao.ENCERRAR_SISTEMA);

    }

    private static void consultarProdutoPorCategoria() {
        System.exit(0);
    }

    private static void consultarProdutoPorId() {

    }

    private static void alterarProduto() {

    }

    private static void encerrarOSistema() {

    }

    private static void cadatraProdruto() {

    }

    private static void cadastraCategoria() {

        CategoriaView view = new CategoriaView();
        Categoria categoria = view.form();
        CategoriaCollectionRepository.save(categoria);
        view.sucesso(categoria);

    }
}