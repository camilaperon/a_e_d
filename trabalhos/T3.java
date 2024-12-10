package trabalhos;
public class T3 {

    // Questão 1 - Mostrar inteiros com separador
    public static void mostrarInteiros(int[] v, char sep) {
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i]);
            if (i < v.length - 1) {
                System.out.print(sep);
            }
        }
        System.out.println();
    }

    // Questão 2 - Filtrar maiores que x
    public static int[] filtrarMaiores(int[] v, int x) {
        int count = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] > x) {
                count++;
            }
        }

        int[] resultado = new int[count];
        int index = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] > x) {
                resultado[index++] = v[i];
            }
        }

        return resultado;
    }

    // Questão 3 - Filtrar menores que x
    public static int[] filtrarMenores(int[] v, int x) {
        int count = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] < x) {
                count++;
            }
        }

        int[] resultado = new int[count];
        int index = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] < x) {
                resultado[index++] = v[i];
            }
        }

        return resultado;
    }

    // Questão 4 - Aplicar operação E lógico
    public static boolean[] aplicarELogico(boolean[] va, boolean[] vb) {
        int length = Math.min(va.length, vb.length);
        boolean[] resultado = new boolean[length];
        for (int i = 0; i < length; i++) {
            resultado[i] = va[i] && vb[i];
        }
        return resultado;
    }

    // Questão 5 - Aplicar operação OU lógico
    public static boolean[] aplicarOuLogico(boolean[] va, boolean[] vb) {
        int length = Math.min(va.length, vb.length);
        boolean[] resultado = new boolean[length];
        for (int i = 0; i < length; i++) {
            resultado[i] = va[i] || vb[i];
        }
        return resultado;
    }

    // Questão 6 - Aplicar máscara
    public static int[] aplicarMascara(int[] v, boolean[] mascara) {
        int count = 0;
        for (int i = 0; i < v.length; i++) {
            if (mascara[i]) {
                count++;
            }
        }

        int[] resultado = new int[count];
        int index = 0;
        for (int i = 0; i < v.length; i++) {
            if (mascara[i]) {
                resultado[index++] = v[i];
            }
        }

        return resultado;
    }

    // Questão 7 - União de dois vetores
    public static int[] uniao(int[] va, int[] vb) {
        int[] temp = new int[va.length + vb.length];
        int index = 0;
        
        // Adicionar todos os elementos de va
        for (int i = 0; i < va.length; i++) {
            temp[index++] = va[i];
        }

        // Adicionar todos os elementos de vb
        for (int i = 0; i < vb.length; i++) {
            temp[index++] = vb[i];
        }

        return temp;
    }

    // Questão 8 - Interseção de dois vetores
    public static int[] intersecao(int[] va, int[] vb) {
        int[] temp = new int[Math.min(va.length, vb.length)];
        int index = 0;

        for (int i = 0; i < va.length; i++) {
            for (int j = 0; j < vb.length; j++) {
                if (va[i] == vb[j]) {
                    temp[index++] = va[i];
                    break;
                }
            }
        }

        // Ajuste no tamanho do vetor
        int[] resultado = new int[index];
        System.arraycopy(temp, 0, resultado, 0, index);
        return resultado;
    }

    // Questão 9 - Diferença de dois vetores
    public static int[] diferenca(int[] va, int[] vb) {
        int[] temp = new int[va.length];
        int index = 0;

        for (int i = 0; i < va.length; i++) {
            boolean encontrado = false;
            for (int j = 0; j < vb.length; j++) {
                if (va[i] == vb[j]) {
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                temp[index++] = va[i];
            }
        }

        // Ajuste no tamanho do vetor
        int[] resultado = new int[index];
        System.arraycopy(temp, 0, resultado, 0, index);
        return resultado;
    }

    // Questão 10 - Triângulo de Pascal
    public static int[][] trianguloDePascal(int n) {
        int[][] pascal = new int[n][];
        for (int i = 0; i < n; i++) {
            pascal[i] = new int[i + 1];
            pascal[i][0] = 1;
            pascal[i][i] = 1;
            for (int j = 1; j < i; j++) {
                pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
            }
        }
        return pascal;
    }

    // Questão 11 - Matriz transposta
    public static int[][] matrizTranspor(int[][] m) {
        int linhas = m.length;
        int colunas = m[0].length;
        int[][] resultado = new int[colunas][linhas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                resultado[j][i] = m[i][j];
            }
        }

        return resultado;
    }

    // Questão 12 - Permutação de linhas
    public static int[][] matrizPermutacaoLinhas(int[][] m, int linha1, int linha2) {
        int[] temp = m[linha1];
        m[linha1] = m[linha2];
        m[linha2] = temp;
        return m;
    }

    // Questão 13 - Multiplicação de matrizes
    public static int[][] matrizMultInt(int[][] m1, int[][] m2) {
        int linhasM1 = m1.length;
        int colunasM1 = m1[0].length;
        int linhasM2 = m2.length;
        int colunasM2 = m2[0].length;

        if (colunasM1 != linhasM2) {
            throw new IllegalArgumentException("Número de colunas de m1 deve ser igual ao número de linhas de m2.");
        }

        int[][] resultado = new int[linhasM1][colunasM2];

        for (int i = 0; i < linhasM1; i++) {
            for (int j = 0; j < colunasM2; j++) {
                for (int k = 0; k < colunasM1; k++) {
                    resultado[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }

        return resultado;
    }

    // Método auxiliar para mostrar um vetor de inteiros
    public static void mostrarVetor(int v[]) {
        for (int i = 0; i < v.length; i++) {
            System.out.printf("%d ", v[i]);
        }
        System.out.println();
    }

    // Método auxiliar para mostrar uma matriz de inteiros
    public static void mostrarMatriz(int m[][]) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.printf("%d ", m[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    // Método auxiliar para mostrar um vetor de booleanos
    public static void mostrarVetor(boolean v[]) {
        for (int i = 0; i < v.length; i++) {
            System.out.printf("%b ", v[i]);
        }
        System.out.println();
    }
}
