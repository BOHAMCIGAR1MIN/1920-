package p91contorflow;

import java.util.scanner;

public class Daysofmonth {

	public static void main(String[] args) {
		scanner in = new scanner(system.in);
		
		System.out.print("�ش���� �Է��Ͻÿ�:");
		int month = in.nextint();
		int days; = -1
		switch (month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			days = 31;
			break;
		case 2:
			days =28;
			break;
		default:
			systemm.out.print("���� 1~12������ ������ �Է��ϼ���");
		}
		System.out.print("������� ��¥��+ days +" �Դϴ�);
	}

}
