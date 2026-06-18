package br.com.alura.catalogoDeFilmes.Principal;

import br.com.alura.catalogoDeFilmes.modelos.Conteudo.Filmes;
import br.com.alura.catalogoDeFilmes.modelos.Conteudo.Series;
import br.com.alura.catalogoDeFilmes.modelos.Conteudo.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filmes favorito = new Filmes("The Matrix", 1999);
        favorito.avalia(9);
        Filmes outroFilme = new Filmes("Avatar", 2020);
        outroFilme.avalia(7);
        var filmeDoPaulo = new Filmes("Dogville", 2003);
        filmeDoPaulo.avalia(10);
        Series lost = new Series("Lost", 2000);


        ArrayList<Titulo> listaAssistidos = new ArrayList<>();

        listaAssistidos.add(filmeDoPaulo);
        listaAssistidos.add(favorito);
        listaAssistidos.add(outroFilme);
        listaAssistidos.add(lost);

        Filmes f1 = filmeDoPaulo;

        for (Titulo item: listaAssistidos){
            System.out.println("Filme: " + item);

            if (item instanceof Filmes filmes && filmes.getClassificacao() > 2){
                System.out.println("Classificacao: " + filmes.getClassificacao());
            }

        }




    }
}
