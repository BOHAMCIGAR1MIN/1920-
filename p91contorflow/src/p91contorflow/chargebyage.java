package p91contorflow;

class chargebyage {

	public static void main(String[] args) {
		int age = 13;
		int charge = 0;
		if(age <8) {
			System.out.println("������ �Ƶ�");
			charge = 1000;
			//������ �Ƶ�(7�� ����)�� 1000�� ����Ḧ �޽��ϴ�
		}else if (age <14) {
			System.out.println("�ʵ��л�");
			charge = 2000;
			//�ʵ��л�(8~13��)�� 2000�� ����Ḧ �޽��ϴ�
		}else if	 (age <20) {
			System.out.println("�߰���л�");
			charge = 2500;
			//�߰���л���(8~19��)�� 2500�� ����� �޽��ϴ�
		}else {
			System.out.println("�Ϲ���");
			charge = 3000;
			//�Ϲ����� 3000�� ���߷� �޽��ϴ�
		}
		System.out.println("�����"+ charge +"�Դϴ�");
	}

}
