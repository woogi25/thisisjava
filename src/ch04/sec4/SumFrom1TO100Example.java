package ch04.sec4;

public class SumFrom1TO100Example {

	public static void main(String[] args) {
		int sum = 0;
		int i;
		
		for(i=1; i<=100; i++) {
			sum += i;
		}
		
		System.out.println(i);
		System.out.println("1~" + (i-1) + " �� : " + sum);
	}

}
