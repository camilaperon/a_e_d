package aulas;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Aula33 {
    public static void aula(){
        System.out.println("LIstas");
        System.out.println("Aula 08/11");

        //ex();
        ex2();

    }

    public static void ex(){
        LinkedList <Integer> lista = new LinkedList<>();

        int x;
        int i;

        lista.add(1);
        lista.add(10);
        lista.add(20);
        lista.add(30);
        lista.add(40);
        lista.add(50);

        for(i=0; i<lista.size(); i++){
            x = lista.get(i);
            System.out.printf("[%d] %d\n", i, x);
        }
        System.out.println("---------");
    

        lista.add(3, 500);
        lista.set(5, 400);

        for(i=0; i<lista.size(); i++){
            x = lista.get(i);
            System.out.printf("[%d] %d\n", i, x);
        }

        System.out.println("---------");
        for(int y : lista){
            System.out.println(y);
        }

    }


    public static void ex2(){
        Set<Integer> conjunto = new HashSet<>();

        conjunto.add(10);
        conjunto.add(20);
        conjunto.add(30);
        conjunto.add(40);
        conjunto.add(20);
        conjunto.add(50);


        for(int y : conjunto){
            System.out.println(y);
        }

        System.out.printf("Elemento 30 está no conjunto? %b\n", conjunto.contains(30));

    }

}
