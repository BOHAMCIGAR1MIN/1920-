package ������������Ʈ1;

public class n13�ܶ�ȸ���򰡽ǽ��ϱ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=10;
		int i = 2;
		
		boolean value =((num1=num1+10)<10)&&((i=i+2)<10);
		System.out.println(value);//flese
		System.out.println(num1);//20
		System.out.println(i);//2
	
		value =((num1=num1+10)>10)||((i=i+2)<10);
		System.out.println(value);//ture
		System.out.println(num1);//20
		System.out.println(i);//2
	}

}
