package ch06.sec8.exam03;

public class Car {
	//�ʵ� ����
	 int gas;
	 
	 //���� ���� ���� �޼ҵ�� �Ű����� �޾Ƽ� gas �ʵ尪�� ����
	 void setGas(int gas) {
		 this.gas = gas;
	 }
	 
	 //���ϰ��� boolean�� �޼ҵ�� gas �ʵ尪�� 0�̸� false��, 0�� �ƴϸ� true�� ����
	 boolean isLeftGas() {
		 if (gas ==0) {
			 System.out.println("gas�� �����ϴ�.");
			 return false;	//false�� �����ϰ� �޼ҵ� ����
		 }
		 System.out.println("gas�� �ֽ��ϴ�.");
		 return true; //true�� �����ϰ� �޼ҵ� ����
	 }
	 
	 //���ϰ��� ���� �޼ҵ�� gas �ʵ尪�� 0�̸� return ������ �޼ҵ带 ����
	 void run() {
		 while (true) {
			 if (gas > 0) {
				 System.out.println("�޸��ϴ�.(gas�ܷ�:" + gas + ")");
				 gas -= 1;
			 }
			 else {
				 System.out.println("����ϴ�.(gas�ܷ�:" + gas + ")");
				 return; //�޼ҵ� ����
			 }
		 }
	 }
}
