package ch06.sec11.exam02;

public class Earth {
	//��� ���� �� �ʱ�ȭ
	static final double EARTH_RADIUS = 6400;
	
	//��� ����
	static final double EARTH_SUPFACE_AREA;
	
	//���� ��Ͽ��� ��� �ʱ�ȭ
	static {
		EARTH_SUPFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	}
}
