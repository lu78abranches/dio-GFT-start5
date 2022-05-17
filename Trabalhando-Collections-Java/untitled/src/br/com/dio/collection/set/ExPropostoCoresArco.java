package br.com.dio.collection.set;



import java.util.*;

public class ExPropostoCoresArco {
    public static void main(String[] args) {
        Set<String> cores = new HashSet<>(Arrays.asList("vermelho", "laranja", "amarelo", "verde", "azul", "anil", "violeta" ));

        Iterator iterator = cores.iterator();
        System.out.println("Cores do Arco-�ris:");
        System.out.println(" ");
        while (iterator.hasNext()){
            System.out.println( iterator.next());
        }

        System.out.println(" ");
        System.out.println("Quantidade de cores do arco-�ris: " + cores.size());

        Set<String> cores1 = new TreeSet<>(Arrays.asList("vermelho", "laranja", "amarelo", "verde", "azul", "anil", "violeta" ));

        System.out.println(" ");
        System.out.println("Cores em ordem alfab�tica: " + cores1);

        TreeSet<String> cores2 = new TreeSet<>(Collections.reverseOrder());
        cores2.addAll(cores);

        System.out.println(" ");
        System.out.println("Cores na ordem inversa: " + cores2);

        System.out.println("Exiba todas as cores que come�am com a letra ?v?: ");
        for (String cor: cores) {
            if(cor.startsWith("v")) System.out.println(cor);
        }

        System.out.println("Remova todas as cores que n�o come�am com a letra ?v?: ");
        Iterator<String> iterator2 = cores.iterator();
        while (iterator2.hasNext()) {
            if (!iterator2.next().startsWith("v")) iterator2.remove();
        }
        System.out.println(cores);

        System.out.println("Apague o conjunto");
        cores.clear();
        System.out.println("Confira se est� vazio: " + cores.isEmpty());



    }

}
