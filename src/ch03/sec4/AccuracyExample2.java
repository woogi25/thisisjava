package ch03.sec4;

public class AccuracyExample2 {

	public static void main(String[] args) {
		int apple = 1;
		int totalPieces = apple * 10;
		int number = 7;
		
		int result = totalPieces - number;
		System.out.println("10�������� ���� ����: " + result);
		System.out.println("��� 1������ ���� ��: " + result/10.0);

	}

}
