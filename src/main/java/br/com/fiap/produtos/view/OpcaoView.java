package br.com.fiap.produtos.view;

import javax.swing.*;

public class OpcaoView {

    public static Opcao select(){

        Opcao ret = (Opcao) JOptionPane.showInputDialog(
                null, //componente pai.como não tem sera null
                "Selecione uma opção",
                "Menu",
                JOptionPane.QUESTION_MESSAGE,
                null, // icone
                Opcao.values(), // número da opção
                Opcao.CADASTRAS_PRODUTO);

        return ret != null ? ret : Opcao.ENCERRAR_SISTEMA;

    }
}
