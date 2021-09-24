package 연습용프로젝트1;

public class n15비트이동연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =0B00000101;
		
		System.out.println(num<<2);
		System.out.println(num>>2);
		System.out.println(num>>>2);
		
		num =num<<2;
		System.out.println(num);
	}

}
