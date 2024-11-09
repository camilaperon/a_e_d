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
        
        public static int filtrarMaiores(int[] vetor, int x){
        //Filtrar valores maiores
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > x) {
                System.out.println(vetor[i]);
            }
        }
        System.out.println(vetor); 
    }
        public static int filtrarMenores(int[] vetor, int x){
        //Filtrar valores menores
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < x) {
                System.out.println(vetor[i]);
            }
        }
        System.out.println(); 
    }

        public static boolean aplicarOuLogico(va, vb){ //*****REVER ESSA QUESTÃO******
        //Ou lógico

        for (int i = 0; i < v.length; i++) {
            resultado[i] = v[i] || w[i];
        }

        for (int i = 0; i < resultado.length; i++) {
            System.out.print(resultado[i] + " ");
        }
        System.out.println(); 
    }


        //E lógico **********REVER ESSA QUESTÃO***********
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



