package ch02.sec13;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("x �� �Է�: ");
		String strX = scanner.nextLine();
		int x = Integer.parseInt(strX);
		
		System.out.print("y �� �Է�: ");
		String strY = scanner.nextLine();
		int y = Integer.parseInt(strY);
		
		int result = $x + y;
		System.out.println("x + y: " + result);
		System.out.println();
		
		while(true) {
			System.out.print("�Է� ���ڿ�: ");
			String data = scanner.nextLine();
			if(data.equals("q")) {//�Էµ� ���ڿ��� q��� �ݺ��� ����
				break;
			}
			System.out.println("��� ���ڿ�: " + data);
			System.out.println();
		}
		
		System.out.println("����");
	}
}
