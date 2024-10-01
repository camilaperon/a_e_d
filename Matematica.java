package libs;

public class Matematica {
    public static int menor(int a, int b){
        int numMenor;

        numMenor = a;
        if (b<a) {
            numMenor = b;            
        }
        return numMenor;
    }


}
