package ch03.sec11;

public class ConditionalOperationExample {

	public static void main(String[] args) {
		int score = 85;
		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
		System.out.println(score + "점은 " + grade + "등급입니다.");

		int x = 10;
		int y = 20;
		int z = ++x + y--;
		System.out.println(z);
		
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
//		double area = (lengthTop + lengthBottom) * height / 2.0;
//		double area = (lengthTop + lengthBottom) * height * 1.0 / 2.0;
//		double area = (double) (lengthTop + lengthBottom) * height / 2;
		double area = (double) ((lengthTop + lengthBottom) * height / 2);
		System.out.println(area);
	}

}
