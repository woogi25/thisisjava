package ch03.sec3;

public class OverflowUnderflowExample {

	public static void main(String[] args) {
		byte var1 = 125;
		for(int i=0; i<5; i++) {	//{ }�� 5�� �ݺ� ����
			var1++;					//++ ������ var1�� ���� 1 ������Ų��.
			System.out.println("var1: " + var1);
		}
		
		System.out.println("---------------");
		
		byte var2 = -125;
		for(int i=0; i<5; i++) {	//{ }�� 5�� �ݺ� ����
			var2--;					//-- ������ var2�� ���� 1 ���ҽ�Ų��.
			System.out.println("var2: " + var2);
			
			
		System.out.println("---------------");
		
		long x = 1000000;
		int y = 1000000;
		long z = x * y;	//long z = 1000000000000;
		System.out.println("z: " + z);
		}

	}

}
