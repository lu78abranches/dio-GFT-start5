package br.com.dio.collection.list;

// Minha interpretação do exercício proposto, eu não entendi que era para usar o Scanner para interação,
// inserir as temperaturas dos meses

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex_Proposto_temp_meses {
    public static void main(String[] args) {
        List<Double> mesesTemperatura = new ArrayList<Double>();

        mesesTemperatura.add(30d);
        mesesTemperatura.add(28d);
        mesesTemperatura.add(27d);
        mesesTemperatura.add(25d);
        mesesTemperatura.add(23d);
        mesesTemperatura.add(18d);

        System.out.println("Temperatura dos seis primeiros meses do ano: ");
        System.out.println(mesesTemperatura.toString());

        Iterator<Double> iterator = mesesTemperatura.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }

        System.out.println(" ");
        System.out.println("Média semestral das temperaturas: " + Math.round(soma/mesesTemperatura.size()));
        System.out.println(" ");

        Iterator<Double> iterator1 = mesesTemperatura.iterator();
        while(iterator1.hasNext()) {
            Double next = iterator1.next();
            if(next <= 25) iterator1.remove();
        }
        System.out.println("Temperaturas acima da média: " + mesesTemperatura);
        System.out.println(" ");
        System.out.println("Meses com temperatura acima da média: ");
        System.out.println("1 Janeiro: " + mesesTemperatura.get(0));
        System.out.println("2 Fevereiro: " + mesesTemperatura.get(1));
        System.out.println("3 Março: " + mesesTemperatura.get(2));

    }
}
