package ch04.sec3;

public class SwitchExpressonsExample {

	public static void main(String[] args) {
		char grade = 'B';
		
		switch(grade) {
		case 'A', 'a' -> {
			System.out.println("��� ȸ���Դϴ�.");
		}
		case 'B', 'b' -> {
			System.out.println("�Ϲ� ȸ���Դϴ�.");
		}
		default -> {
			System.out.println("�մ��Դϴ�.");
		}
		}
		
		switch(grade) {	//�߰�ȣ �ȿ� ���๮�� �ϳ��� �߰�ȣ ���� ����
			case 'A', 'a' -> System.out.println("��� ȸ���Դϴ�.");
			case 'B', 'b' -> System.out.println("�Ϲ� ȸ���Դϴ�.");
			default -> System.out.println("�մ��Դϴ�.");
		}
	}

}
