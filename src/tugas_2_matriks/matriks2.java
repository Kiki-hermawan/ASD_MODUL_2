package tugas_2_matriks;
public class matriks2 {
    public static void main (String[] args) {
        int [][] A = {
            {10, 15, 11},
            {12, 14, 13}
        };
        
        int [][] B = {
            {6, 2, 5},
            {3, 5, 20}
        };
        
        if ((A.length == B.length) && (A[0].length == B[0].length)) {
            int[][] C=new int [A.length][A[0].length];
            for (int i=0; i<A.length; i++){
                for (int j=0; j<A[0].length; j++){
                    C[i][j] = A[i][j] - B[i][j];
                }
            }
            
            for(int[] c: C) {
              for(int q: c) {
                  System.out.print(q+" ");
              }
              System.out.println();
            }
            System.out.println(C[1][2]);
        }
        else {
            System.out.println("Ukuran matrix tidak sama");
        }
    }
}
