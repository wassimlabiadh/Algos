package algos;

public class Algo3 {

    public int solution(int[] a) {
        if (a.length == 0) {
            return 0;
        }
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            final int value = Math.abs(a[i]);
            sum += value;
            if (max < value) {
                max = value;
            }
            a[i] = value;
        }
    
        final int[] counts = new int[max + 1];
        for (int value: a) {
            counts[value]++;
        }
        final int[] r = new int[sum + 1];
        for (int i = 1; i < r.length; i++) {
            r[i] = -1;
        }
       
        for (int i = 1; i < counts.length; i++) {
            for (int j = 0; j < r.length; j++) {
                if (r[j] >= 0) {
                    r[j] = counts[i];
                } else if (j - i >= 0 && r[j - i] > 0) {
                    r[j] = r[j - i] - 1;
                }
            }
        }
        int result = sum;
       
        for (int i = 0; i < r.length / 2 + 1; i++) {
            if (r[i] >= 0 && result > Math.abs(sum - 2 * i)) {
                result = Math.abs(sum - 2 * i);
            }
        }
        return result;
    }


	
	
	public static void main(String[] args){

		int[] A= new int[5] ;

		A[0] = 1;
		A[1] = 5;
		A[2] = 2;
		A[3] = -2;
	
		
		int res;
		
		Algo3 test = new Algo3();
		res=test.solution(A);
			System.out.println(res);
		
	}
}
