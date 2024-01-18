package br.com.arthur.testes;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<Serie> minhasSeries = new HashSet<>(){{
            add(new Serie("Dark","drama",50));
            add(new Serie("The office","comedia",30));
            add(new Serie("The originals","romance",50));
        }};

        System.out.println("--- Ordem aleatoria---");
        for (Serie serie: minhasSeries) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - "+ serie.getTempoEp()+ '.');
        }

        System.out.println("\n------------------------");

        System.out.println("--- Ordem de Inserção---");
        Set<Serie> minhasSeries1 = new LinkedHashSet<>(){{
            add(new Serie("Dark","drama",50));
            add(new Serie("The office","comedia",30));
            add(new Serie("The originals","romance",50));
        }};

        for (Serie serie: minhasSeries1) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - "+ serie.getTempoEp()+ '.');
        }

        System.out.println("\n------------------------");
        System.out.println("--- Ordem Natural---");

        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
        for (Serie serie: minhasSeries2) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - "+ serie.getTempoEp()+ '.');
        }

        System.out.println("\n------------------------");
        System.out.println("--- Ordem Nome/genero/tempo ---");

        Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempo());
        minhasSeries3.addAll(minhasSeries);

        for (Serie serie: minhasSeries3) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - "+ serie.getTempoEp()+ '.');
        }

    }

}