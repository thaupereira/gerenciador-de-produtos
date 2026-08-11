package br.com.fiap.produtos;

import br.com.fiap.produtos.model.Categoria;
import br.com.fiap.produtos.model.Produto;
import br.com.fiap.produtos.repository.CategoriaCollectionRepository;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        Categoria categoria = new Categoria();

        categoria.setNome("Informatica");

        Categoria categoriaSalva = CategoriaCollectionRepository.save(categoria);

        System.out.println("Categoria: " + categoriaSalva);

    }
}