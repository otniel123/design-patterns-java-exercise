package TemplateMethod.first.models;

import TemplateMethod.first.abstracts.Importador;

import java.util.ArrayList;
import java.util.List;

public class ImportadorJson extends Importador {

    @Override
    public List<Produto> parsearCsv(List<String> linhas){
        Produto produto = new Produto(linhas.getFirst(), linhas.getLast(), 100L);
        List<Produto> list = new ArrayList<>();
        list.add(produto);
        return list;
    }

}
