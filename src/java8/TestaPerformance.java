package java8;

import java.util.ArrayList;
import java.util.Collection;

public class TestaPerformance {

    public static void main(String[] args) {
        System.out.println("Iniciando...");
        Collection<Integer> teste = new ArrayList<Integer>();
        
        long inicio = System.currentTimeMillis();

        int total = 100000;

        long inicioAdicao = System.currentTimeMillis();
        for (int i = 0; i < total; i++) {
            teste.add(i);
        }

        long adcao = System.currentTimeMillis();
        System.out.println("Adcao: " + (adcao-inicioAdicao));

        long inicioProcura = System.currentTimeMillis();
        for (int i = 0; i < total; i++) {
            teste.contains(i);
        }

        long procura = System.currentTimeMillis();
        System.out.println("Procura:" + (procura - inicioProcura));

        
        long fim = System.currentTimeMillis();
        long tempo = fim - inicio;
        System.out.println("Tempo gasto: " + tempo);
    
    }
}