package �������������������;

public class UnicodeEX {

	public static void main(String[] args) {
		// �����ڵ� ���� '��'���� ���� �ְ� ���
		//
		int TOTAL_LEGS_OF_MAMAL= 4;
		byte aaaa = (byte)TOTAL_LEGS_OF_MAMAL;
		
		//�� ��ȯ�� ���� ���е� ����
		double ui = 3.99999999999999999;
		//floor, ceil, round ���� �ø� �ݿø�
		int u2 = (int) ui;
		System.out.println(ui);
		
		char �� = '��';
		System.out.println(��);
		// �����ڵ� ���ڸ� decode�� ���� �̻��� ���� in
		char what ='\uD55C';
		// ���ڵ� �� �ٲٰ� ���
		what += 1;
		System.out.println(what);
		what += 1;
		System.out.println(what);
		what += 1;
		System.out.println(what);
		
		boolean fff =true;
		fff = false;
		
	}

}
