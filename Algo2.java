package algos;

public class Algo2 {

    public int[] solution(int[] A, int[] B) {

        
        int L = A.length;
       
        int max = 0;
        for (int i = 0; i < L; i++) {
            max = Math.max(A[i], max);
        }
        
        int[] fibonacci = new int[max+1]; 
        
        
        fibonacci[0] =1;
        fibonacci[1] =1;

        for(int i=2; i<= max; i++){
            fibonacci[i] = (fibonacci[i-1] + fibonacci[i-2]) % (1 << 30);
          
        }
        
        int[] results = new int[L];
        
        for(int i=0; i<L; i++){
            results[i] = fibonacci[A[i]] % (1 << B[i]); 
        }
        
        return results;
    }

	
	
	public static void main(String[] args){

		int[] A= new int[5] ;
		int[] B= new int[5] ;

		A[0] = 4;
		A[1] = 4;
		A[2] = 5;
		A[3] = 5;
		A[4] = 1;
		
		B[0] = 3;
		B[1] = 2;
		B[2] = 4;
		B[3] = 3;
		B[4] = 1;
		int[]res= new int[5];
		
		Algo2 test = new Algo2();
		res=test.solution(A,B);
		for (int i=0; i<5 ;i++) {
			System.out.println(res[i]);
		}
	}
}
