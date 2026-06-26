package TemplateMethod.first.abstracts;

import TemplateMethod.first.models.Produto;

import java.util.List;

public abstract class Importador {
    public final void importar(String caminho) {
        System.out.println("Validando arquivo " + caminho);          // igual nos 3
        List<String> linhas = lerArquivo(caminho);                    // igual nos 3
        List<Produto> produtos = parsearCsv(linhas);                  // DIFERENTE
        System.out.println("Salvando " + produtos.size() + " itens"); // igual nos 3
        System.out.println("Log: importação concluída");              // igual nos 3
    }

    public final List<String> lerArquivo(String caminho){
        return List.of(caminho.split("/"));
    }

    public abstract List<Produto> parsearCsv(List<String> linhas);
}
