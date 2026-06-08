package br.com.alura.catalogoDeFilmes.modelos.calculos;

import br.com.alura.catalogoDeFilmes.modelos.Conteudo.Filmes;
import br.com.alura.catalogoDeFilmes.modelos.Conteudo.Series;
import br.com.alura.catalogoDeFilmes.modelos.Conteudo.Titulo;

public class calculadoraDeTempo {
    private int tempoTotal = 0;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

//     public void incui(Filmes f){
//         this.tempoTotal += f.getDuracaoEmMinutos();
//     }
//
//     public void incui(Series s){
//         this.tempoTotal += s.getDuracaoEmMinutos();
//    }

    public void inclui(Titulo titulo){

        this.tempoTotal += titulo.getDuracaoEmMinutos();

    }
}
