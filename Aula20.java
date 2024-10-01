package aulas;
import libs.Entrada;
import libs.Matematica;

public class Aula20 {
    public static void aula(){
        System.out.println("oi");
    }

    public static void exLerInteiro(){
    Entrada.abrir();

    int x = Entrada.lerInteiro("Digite um número: ");

    System.out.println("Foi digitado o valor: " + x);
    Entrada.fechar();
    }

    public static void exMenor(){
        Entrada.abrir();
    int a =  Entrada.lerInteiro("Informe: ");
    int b= Entrada.lerInteiro("Informe: ");
    Entrada.fechar();

System.out.println("O menor valor é: " + Matematica.menor(a, b));
}
    
}
