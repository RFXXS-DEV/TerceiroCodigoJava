package br.com.alura.catalogoDeFilmes.modelos.Conteudo;

import br.com.alura.catalogoDeFilmes.modelos.calculos.FiltroRecomendacao;
import br.com.alura.catalogoDeFilmes.modelos.calculos.calculadoraDeTempo;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Filmes favorito = new Filmes("The Matrix");

        favorito.setAnoDeLancamento(1999);
        favorito.setDuracaoEmMinutos(135);
        favorito.setIncluidoNoPlano(true);
        System.out.println("Duração do Filme: " + favorito.getDuracaoEmMinutos());

        favorito.exibeFichaTecnica();
        favorito.avalia(9);
        favorito.avalia(8);
        favorito.avalia(9);

        System.out.println("Total de avaliações: " + favorito.getTotalDeAvaliacoes());

        System.out.println(String.format("Média de avaliações do filme: %.1f",favorito.pegaMedia()));

        Series lost = new Series();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporadas(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos() + " Minutos");

        Filmes outroFilme = new Filmes("Avatar");

        outroFilme.setAnoDeLancamento(2020);
        outroFilme.setDuracaoEmMinutos(200);



        calculadoraDeTempo calculadora = new calculadoraDeTempo();

        calculadora.inclui(favorito);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();

        filtro.filtra(favorito);

        Episodios episodio = new Episodios();

        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVizualizacoes(300);
        filtro.filtra(episodio);

        var filmeDoPaulo = new Filmes("Dogville");
        filmeDoPaulo.setDuracaoEmMinutos(200);
        filmeDoPaulo.setAnoDeLancamento(2003);
        filmeDoPaulo.avalia(10);

        ArrayList<Filmes> listaDeFilmes = new ArrayList<>();

        listaDeFilmes.add(filmeDoPaulo);
        listaDeFilmes.add(favorito);
        listaDeFilmes.add(outroFilme);
        System.out.println("Tamanho da lista " + listaDeFilmes.size());
        System.out.println("Primeiro filme " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
        System.out.println("toString do filme " + listaDeFilmes.get(0).toString());

    }



}
