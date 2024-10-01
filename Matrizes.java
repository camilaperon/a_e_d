package libs;

public class Matrizes {
    public static int[][] novaIdentidade(int n){
        int[][]m;
        int i;
        m= new int[n][n];

        for(i=0; i< n; i++){
            m[i][i]= 1;

        }
        return m;
    }

    public static boolean comparar(int[][ ]mA, int[][] mB){
        int i, j;
        if(mA[0].length != mB[0].length){

            return false;
        }
        for(i=0; i< mA.length; i++){
            for(j=0; j< mA[0].length; j++){
                if(mA[i][j] != mB[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
    public static int [][] multiplicar(int[][] mA, int[][]mB){// que
        return null;
    }

    public static int[][] alocarInt(int n_linhas, int n_colunas){
//ex11
        int[][] m;
        m = new int[n_linhas][n_colunas];
        return null;
    }

    /*public static void mostrar(int[][]m){
        //ex 12
        return null;
    }*/

    public static int[][] preencherInt(int[][] m, int n){
    //ex 13
    return null;
    }

    public static int[][] lerInt(int[][] m){
        //ex 14
        return null;

    }
    public static int[] obterLinha(int[][] m, int linha){
        //ex17
        return null;

    }

   // public static int obterLinhaColuna(int[][] m, int coluna){
        //ex ??

       // return null;
   // }

    }

