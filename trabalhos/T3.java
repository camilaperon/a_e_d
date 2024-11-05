public class T3 {
    public static void main(String[] args) {

        public static int mostrarInteiros (int[] vetor, int sep) {   //Mostrar Inteiros com separador
            for (int i = 0; i < vetor.length; i++) {
                System.out.print(vetor[i]);
                if (i < vetor.length - 1) {
                    System.out.print(sep);
                }
            }
            System.out.println();
        }
        
        //Filtrar valores maiores
        int[] numeros = {2, 5, 1, 8, 3};
        int valor = 15;

        System.out.println("Números maiores que " + valor + ":");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > valor) {
                System.out.println(numeros[i]);
            }
        }
        System.out.println(); 

        //Filtrar valores menores
        int[] num = {2, 4, 5, 8, 29};
        valor = 6;

        System.out.println("Os valores menores que " + valor + " são: ");
        for (int i = 0; i < num.length; i++) {
            if (num[i] < valor) {
                System.out.println(num[i]);
            }
        }
        System.out.println(); 

        //Ou lógico
        boolean[] v = {true, false, true, false};
        boolean[] w = {false, false, true, true};
        boolean[] resultado = new boolean[v.length];

        for (int i = 0; i < v.length; i++) {
            resultado[i] = v[i] || w[i];
        }

        for (int i = 0; i < resultado.length; i++) {
            System.out.print(resultado[i] + " ");
        }
        System.out.println(); 

        //E lógico
        boolean[] resultadoE = eLogico(v, w);
        for (int i = 0; i < resultadoE.length; i++) {
            System.out.print(resultadoE[i] + " ");
        }
        System.out.println(); 

        //Aplicar máscara
        int[] vMask = {1, 2, 3, 4, 5};
        boolean[] mascara = {true, true, true, false, true};
        int[] resultadoMask = aplicarMascara(vMask, mascara);

        for (int i = 0; i < resultadoMask.length; i++) {
            System.out.print(resultadoMask[i] + " ");
        }
        System.out.println(); 

        // Matrizibvertida
        int[][] A = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] invertida = matrizInvertida(A);

        for (int[] linha : invertida) {
            for (int valorInvertido : linha) {
                System.out.print(valorInvertido + " ");
            }
            System.out.println(); 
        }
        System.out.println();

        //Permutação de linhas
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] matrizAtualizada = matrizPermutacaoLinhas(matriz, 0, 2);

        for (int[] linha : matrizAtualizada) {
            for (int valor : linha) {
                System.out.print(valor + " ");
            }
            System.out.println(); 
        }
    }

    public static boolean[] eLogico(boolean v[], boolean w[]) {
        boolean[] resultado = new boolean[v.length];

        for (int i = 0; i < v.length; i++) {
            resultado[i] = v[i] && w[i];
        }

        return resultado;
    }

    public static int[] aplicarMascara(int[] v, boolean[] mascara) {
        int tamanho = 0;
        for (int i = 0; i < mascara.length; i++) {
            if (mascara[i]) {
                tamanho++;
            }
        }

        int[] resultado = new int[tamanho];
        int index = 0;

        for (int i = 0; i < mascara.length; i++) {
            if (mascara[i]) {
                resultado[index++] = v[i];
            }
        }

        return resultado;
    }

    public static int[][] matrizInvertida(int[][] A) {
        int a = A.length;    
        int b = A[0].length;   
        int[][] invertida = new int[b][a]; 


        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                invertida[j][i] = A[i][j];             }
        }

        return invertida;    }

    public static int[][] matrizPermutacaoLinhas(int[][] matriz, int linha1, int linha2) {
        int[] temp = matriz[linha1];
        // Troca a linhas fa mtriz
        matriz[linha1] = matriz[linha2];
        matriz[linha2] = temp;

        return matriz; 
    }
}



