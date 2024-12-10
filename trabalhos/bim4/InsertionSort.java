package trabalhos.bim4;

public class InsertionSort {
    public static void insertionSort(int[] vetor) {
        for (int i = 1; i < vetor.length; i++) {
            int nv_vetor = vetor[i]; 
            int j = i - 1;
            while (j >= 0 && vetor[j] > nv_vetor) {  
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = nv_vetor; //vai coolocar os numeros na posicao certa
        }
    }

    public static void main(String[] args) {
        int[] vetor = {5, 3, 8, 6, 2};
        insertionSort(vetor);
        System.out.println("Insertion Sort: " + java.util.Arrays.toString(vetor));
    }
    public static void insertionSort(int[] v){
        int i,j;
        for(j=1;j<v.length;j++){
            i=j;
            while(i>0 && v[i] < v[i-1]){
                troca(v, i, i-1);
                i--;
            }
        }
        }
        
        public static void insertionSortRec(int[] v){
        insertionSortRec_(v, 1);
        }
        
        public static void insertionSortRec_(int[] v, int fim){
        int i = fim;
        if(fim < v.length){
            while(i>0 && v[i]<v[i-1]){
                troca(v,i,i-1);
                i--;
            }
            insertionSortRec_(v, fim +1);
        }
        }
}




