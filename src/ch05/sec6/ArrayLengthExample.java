package ch05.sec6;

public class ArrayLengthExample {

	public static void main(String[] args) {
		//�迭 ���� ����� �迭 ����
		int[] scores = {84, 90, 96};
		
		//�迭 �׸��� ���� ���ϱ�
		int sum = 0;
		for(int i=0; i<scores.length; i++) {
			sum +=scores[i];
		}
		System.out.println("���� : " + sum);
			
		//�迭 �׸��� ��� ���ϱ�
		double avg = (double) sum / scores.length;
		System.out.println("��� : " + avg);
	}

}
