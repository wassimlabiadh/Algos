package algos;

public class Algo1 {

	boolean maxCalled;

	public int[] solution(int N, int[] A) {

	int max =0;
	int [] counters = new int [N];
	    int temp=0;
	    int currentVal = 0;
	    for(int i=0;i<A.length;i++){
	    currentVal = A[i];
	    if(currentVal <=N){
	        temp = increase(counters,currentVal);
	        if(temp > max){
	        max = temp;
	        }
	    }else{
	        if(!maxCalled)
	        maxCounter(counters,max);
	    }

	    }

	    return counters;

	}


	int increase (int [] A, int x){  
	 maxCalled = false;
	 return ++A[x-1];  
	 //return t;
	}

	void maxCounter (int [] A, int x){
	 maxCalled = true;
	  for (int i = 0; i < A.length; i++) {
	 A[i] = x;
	  }

	}
	
	public static void main(String[] args){

		int[] A= new int[7] ;
		A[0] = 3;
		A[1] = 4;
		A[2] = 4;
		A[3] = 6;
		A[4] = 1;
		A[5] = 4;
		A[6] = 4;
		int[]res= new int[7];
		
		Algo1 test = new Algo1();
		res=test.solution(5,A);
		for (int i=0; i<5;i++) {
			System.out.println(res[i]);
		}
	}
}
