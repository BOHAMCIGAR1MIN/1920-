package �������������������p92_conditionstmt;

public class DAYSPFMONTH {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("�ش���� �Է��ϼ��� : ");
		int month =in.nextint():
		int days =-1;
		switch(month) {
		case 1 :case 3:case	5:case	7:case	8:case	10:case	12:
			days =30;
			break;
		case 2 : case 6: case 9: case11:
			break;
		default:
			System.out.println("���� 1~12 ������ ������ �Է��ϼ���");
		}
		System.out.println("�ش���� ��¥��"+days+"�Դϴ�.");	

	}

}
