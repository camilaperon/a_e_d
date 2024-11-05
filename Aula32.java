package aulas;

import libs.Tempo;
import libs.Vetores;


public class Aula32 {
    
public static void aula(){

    System.out.println("xx Busca Sequencial xx");



    ex02();



}

public static void ex01(){

int[] v = {15, 19, 4, 7, 0, 100};
int x = 19932;

int pos = Vetores.buscaSequencial(v, x);

if (pos != -1) {
    System.out.println("Valor encontrado na posição " + pos);
}else{
    System.out.println("Valor não encontrado");
}


}

public static void ex02(){




int v[] = Vetores.gerarValoresAleatorios(1000000000, -14000400, 1000000000);

int x = 500000;

long tempo_inicio = Tempo.medirTempoIniciar();
int pos = Vetores.buscaSequencial(v, x);
double temp_segundos = Tempo.medirTempoFinalizarSegundos(tempo_inicio);

if (pos != -1) {
    System.out.printf("Valor %d encontrado na posição %d ", x, pos);
}else{
    System.out.printf("Valor %d não encontrado", x);
}

System.out.printf("Tempo de busca sequencial com " + v.length + " elementos: " + temp_segundos + " segundos ");

}

public static void ex03(){

int i;

int v[] = Vetores.gerarValoresAleatorios(1000000000, -14000400, 1000000000);
int x = 500000;
double soma = 0;

    for(i = 0; i <= 10; i++){

        long tempo_inicio = Tempo.medirTempoIniciar();
        int pos = Vetores.buscaSequencial(v, x);
        double temp_segundos = Tempo.medirTempoFinalizarSegundos(tempo_inicio);

        if (pos != -1) {
            System.out.printf("Valor %d encontrado na posição %d ", x, pos);
        }else{
            System.out.printf("Valor %d não encontrado", x);
        }
        
        System.out.printf("Tempo de busca sequencial com " + v.length + " elementos: " + temp_segundos + " segundos ");
        

         soma+= temp_segundos;

    }

        System.out.println(soma/10);


}

public static void ex04(){


    int v[] = Vetores.gerarValoresAleatorios(1000000000, -14000400, 1000000000);
    int x = 500000;
    int soma = 0;


    long tempo_inicio = Tempo.medirTempoIniciar();
    int pos = Vetores.buscaBinaria(v, x);
    double temp_segundos = Tempo.medirTempoFinalizarSegundos(tempo_inicio);

    if (pos != -1) {
        System.out.printf("Valor %d encontrado na posição %d ", x, pos);
    }else{
        System.out.printf("Valor %d não encontrado", x);
    }
    
    System.out.printf("Tempo de busca sequencial com " + v.length + " elementos: " + temp_segundos + " segundos ");
    

     soma+= temp_segundos;

     System.out.println(soma/10);

}

 

}


