package ch05.sec9;

public class ArrayCopyExample {

	public static void main(String[] args) {
		//���� 3�� �迭
		String[] oldStrarray = { "java", "array", "copy" };
		//���� 5�� �迭�� ���� ����
		String[] newStrArray = new String[5];
		//�迭 �׸� ����
		System.arraycopy(oldStrarray, 0, newStrArray, 0, oldStrarray.length);
		//�迭 �׸� ���
		for(int i=0; i <newStrArray.length; i++) {
			System.out.print(newStrArray[i] + ", ");
		}
	}

}
