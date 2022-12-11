package ch06.sec8.exam02;

public class ComputerExample {

	public static void main(String[] args) {
		//Computer ��ü ����
		Computer myCom = new Computer();
		
		//sum() �޼ҵ� ȣ�� �� �Ű��� 1, 2, 3�� �����ϰ�
		//�ջ� ����� ���� �޾� result1 ������ ����
		int result1 = myCom.sum(1, 2, 3);
		System.out.println("result1: " + result1);

		//sum() �޼ҵ� ȣ�� �� �Ű��� 1, 2, 3, 4, 5�� �����ϰ�
		//�ջ� ����� ���� �޾� result2 ������ ����
		int result2 = myCom.sum(1, 2, 3, 4, 5);
		System.out.println("result2: " + result2);
		
		//sum() �޼ҵ� ȣ�� �� �迭�� �����ϰ�
		//�ջ� ����� ���� �޾� result3 ������ ����
		int[] values = {1, 2, 3, 4, 5};
		int result3 = myCom.sum(values);
		System.out.println("result3: " + result3);
		
		//sum() �޼ҵ� ȣ�� �� �迭�� �����ϰ�
		//�ջ� ����� ���� �޾� result4 ������ ����
		int result4 = myCom.sum(new int[] {1, 2, 3, 4, 5});
		System.out.println("result4: " + result4);
	}

}
