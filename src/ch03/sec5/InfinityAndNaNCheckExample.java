package ch03.sec5;

public class InfinityAndNaNCheckExample {
	public static void main(String[] args) {
		int x = 5;
		double y = 0.0;
		double z = x / y;
//		double z = x % y;
		
		//�߸��� �ڵ�
		System.out.println(z + 2);
		
		//�˸��� �ڵ�
		if(Double.isInfinite(z) || Double.isNaN(z)) {
			System.out.println("�� ���� �Ұ�");
		}
		else {
			System.out.println(z + 2);
		}
	}
}
