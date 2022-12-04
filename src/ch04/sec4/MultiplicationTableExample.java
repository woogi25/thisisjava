package ch04.sec4;

public class MultiplicationTableExample {

	public static void main(String[] args) {
//		for(int m=2; m<=9; m++) {
//			System.out.println("*** " + m + "단 ***");
//			for (int n=1; n<=9; n++) {
//				System.out.println(m + " x " + n + " = " + (m*n) );
//			}
//		}

		for(int m=1; m<=9; m++) {
			for (int n=2; n<=9; n++) {
				System.out.print(n + " x " + m + " = " + (m*n) + "\t");
			}
			System.out.println();
		}
		System.out.println("구구단");
	}

}
