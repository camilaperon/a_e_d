package aulas;
import java.io.FileWriter;
import java.io.File;
import java.util.Scanner;

public class Aula30 {
    public static void aula(){
        System.out.println("++Aula 30: Arquivos ++");
        //ex01(); //abertura de arquivo
        ex02();

    }
    public static void ex01(){

        String nome_arquivo = "teste.txt";
        int i;

        try{
            FileWriter arquivo = new FileWriter(nome_arquivo);
            //arquivo.write(16 + "\n");
            //arquivo.write("Algoritmos.\n");

            for(i=0; i<=50; i++){
                //arquivo.write(i + " Elefante incomoda muita gente " + (i+1) + " Elefantes incomodam muito mais" + "\n");
                arquivo.write(i + "\n");
            }

            arquivo.close();

        }catch(Exception e){
            System.err.println("Erro");
            System.err.println(e);
        }
        }


        public static void ex02(){
            String nome_arquivo = "numeros.txt";
            int i;
            String nome;
            int valor;

            try{

                File arquivo = new File(nome_arquivo);
                Scanner entrada = new Scanner(arquivo);

                for(i=0; i<2; i++){
                nome = entrada.nextLine();
                System.out.println(nome);

                valor = entrada.nextInt();
                System.out.println(valor);
                }
                entrada.close();
            }catch(Exception e){
                System.err.println("Erro");
                System.err.println(e);
            }
        }
}
