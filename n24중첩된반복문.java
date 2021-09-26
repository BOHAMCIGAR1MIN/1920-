package 연습용프로젝트1;

public class n24중첩된반복문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dan;
		int times;
		for(dan=3; dan<=7;dan++) {
			for(times =1;times <=9;times++) {
				System.out.println(dan+"x"+times+"="+dan*times);
			}
			System.out.println();
		}
	}

}
