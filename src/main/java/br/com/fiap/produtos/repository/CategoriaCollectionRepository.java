package br.com.fiap.produtos.repository;

import br.com.fiap.produtos.model.Categoria;

import java.util.List;

public class CategoriaCollectionRepository {

    private static List<Categoria> categorias;

    static{

        categorias = new vector<>();

        Categoria eletronicos = new categoria("Eletronicos");
        Categoria celulares = new categoria ("celulares");
        Categoria livros = new categoria ("livros");

        categorias.add(eletronicos);
        categorias.add(celulares);
        categorias.add(livros);

    }

    public static List<Categoria> findAll(){
        return categorias;
    }

    public static Categoria findById(Long id){
        return categorias.stream().filter(c->c.getId().equals(id)).findFirst().orElse(null);
    }

    public static List<Categoria> findByNome(String nome){

        return categoria.stream().filter(c->c.getNome().equalsIgnoreCase(nome)).toList();

    }
}
