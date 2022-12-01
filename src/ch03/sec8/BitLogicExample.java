package ch03.sec8;

public class BitLogicExample {
	public static void main(String[] args) {
		System.out.println("45 & 25 = " + (45 & 25));
		System.out.println("45 | 25 = " + (45 | 25));
		System.out.println("45 ^ 25 = " + (45 ^ 25));
		System.out.println("~45 = " + (~45));
		
		byte receiveData = -128;
		
		//���1: ��Ʈ ���� �������� Unsigned ���� ���
		int unsignedInt1 = receiveData & 255;
		System.out.println(unsignedInt1);
		
		//���2: �ڹ� API�� �̿��ؼ� Unsigned ���� ���
		int unsignedInt2 = Byte.toUnsignedInt(receiveData);
		System.out.println(unsignedInt2);
		
		int test = 136;
		byte btest = (byte) test;
		System.out.println(btest);
	}
}
