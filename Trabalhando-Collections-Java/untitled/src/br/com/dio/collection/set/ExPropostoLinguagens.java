package br.com.dio.collection.set;

import java.util.*;

public class ExPropostoLinguagens {
    public static void main(String[] args) {

        Set<LinguagemFavorita> linguagens = new HashSet<>() {{

            add(new LinguagemFavorita("Java", 1995, "Eclipse"));
            add(new LinguagemFavorita("JavaScript", 1995, "Visual Studio Code"));
            add(new LinguagemFavorita("HTML", 1991, "SublimeText3"));

        }};


        System.out.println("Ordem de Insersão");
        Set<LinguagemFavorita> linguagens1 = new LinkedHashSet<>() {{

            add(new LinguagemFavorita("Java", 1995, "Eclipse"));
            add(new LinguagemFavorita("JavaScript", 1995, "Visual Studio Code"));
            add(new LinguagemFavorita("HTML", 1991, "SublimeText3"));


        }};
        for (LinguagemFavorita lingua: linguagens1) System.out.println(lingua.getNome() + " - "
                + lingua.getAnoDeCriacao() + " - " + lingua.getIde());

        System.out.println("Ordem Natural");
        Set<LinguagemFavorita> linguagens2 = new TreeSet<>(linguagens1);
            for (LinguagemFavorita lingua: linguagens2) System.out.println(lingua.getNome() + " - "
                    + lingua.getAnoDeCriacao() + " - " + lingua.getIde());

        System.out.println("Ordem IDE/Nome/Ano");
        Set<LinguagemFavorita> minhasSeries3 = new TreeSet<>(new ComparatorNomeAnoIde());
        linguagens2.addAll(linguagens);
        for (LinguagemFavorita lingua: linguagens2) System.out.println(lingua.getIde() + " - "
                + lingua.getNome() + " - " + lingua.getAnoDeCriacao());


    }

    static class LinguagemFavorita implements Comparable<LinguagemFavorita> {
        private String nome;
        private Integer anoDeCriacao;
        private String ide;

        public LinguagemFavorita(String nome, Integer anoDeCriacao, String ide) {
            this.nome = nome;
            this.anoDeCriacao = anoDeCriacao;
            this.ide = ide;
        }

        public String getNome() {
            return nome;
        }

        public Integer getAnoDeCriacao() {
            return anoDeCriacao;
        }

        public String getIde() {
            return ide;
        }

        @Override
        public String toString() {
            return "{" +
                    "nome='" + nome + '\'' +
                    ", anoDeCriacao=" + anoDeCriacao +
                    ", ide='" + ide + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            LinguagemFavorita that = (LinguagemFavorita) o;
            return anoDeCriacao == that.anoDeCriacao && Objects.equals(nome, that.nome) && Objects.equals(ide, that.ide);
        }

        @Override
        public int hashCode() {
            return Objects.hash(nome, anoDeCriacao, ide);

        }

        @Override
        public int compareTo(LinguagemFavorita lingua) {
            int nome = CharSequence.compare(this.getNome(), lingua.getNome());
            if (nome != 0) return nome;

            return this.getIde().compareTo(lingua.getIde());
        }
    }

      static class ComparatorNomeAnoIde implements Comparator<LinguagemFavorita>{

        @Override
        public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
            int nome = l1.getNome().compareTo(l2.getNome());
            if (nome != 0) return nome;

            int ide = l1.getIde().compareTo(l2.getIde());
            if (ide != 0) return ide;

            return Integer.compare(l1.getAnoDeCriacao(), l2.getAnoDeCriacao());
        }
    }
}

