package aulas;
import java.io.FileWriter;
import java.io.File;
import java.util.Scanner;

public class Aula31{
    public static void aula(){
        System.out.println("++ Aula 31: Mais arquivos ++");

        //ex01();//abre arquivo e calcula  amedia dos valores
        ex02();//

    }

    public static void ex01(){
        String nome_arquivo= "arquivos/valores.txt";
        int i;
        int soma=0, valor_lido;
        double media;

            try{
                File arquivo = new File (nome_arquivo);//para leitura
                Scanner entrada = new Scanner(arquivo);

                for(i=0; i<10; i++){
                    valor_lido = entrada.nextInt();
                    soma= soma + valor_lido;
                    System.out.println("Soma: " + soma);
                }

                media = soma/ (double) 10;
                System.out.println("média: " + media);
                entrada.close();


            }catch(Exception e){
            System.err.println("Erro");
            System.err.println(e);
}
    }

    public static void ex02(){//valores_n.txt
        String nome_arquivo = "arquivos/valores_n.txt";
        int i;
        int soma=0, valor_lido;
        double media;

        try {
            File arquivo = new File (nome_arquivo);//para leitura
            Scanner entrada = new Scanner(arquivo);

            

        } catch (Exception e) {
            System.err.println("Erro");
            System.err.println(e);
        }
    }
}