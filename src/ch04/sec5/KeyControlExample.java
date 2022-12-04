package ch04.sec5;

import java.util.Scanner;

public class KeyControlExample {

	public static void main(String[] args) throws Exception {	//예외를 여기로 던짐
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int speed = 0;
		
		while(run) {
			System.out.println("-------------------------");
			System.out.println("1. 증속 | 2. 감속 | 3. 중지");
			System.out.println("-------------------------");
			System.out.println("선택: ");
		
			String strNum = scanner.nextLine();
			
			if(strNum.equals("1")) {
				speed++;
				System.out.println("현재 속도 = " + speed);
			}
			else if (strNum.equals("2")) {
				speed--;
				System.out.println("현재 속도 = " + speed);
			}
			else if (strNum.equals("3")) {
				run = false;
			}
		
		}
		
		System.out.println("프로그램 종료");
	}

}
