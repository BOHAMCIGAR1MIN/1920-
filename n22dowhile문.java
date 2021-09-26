package 연습용프로젝트1;

public class n22dowhile문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1;
		int sum = 0;
		do {
			sum += num;
			num++;
		}while(num<=10);
		System.out.println("1부터 10까지의 합은"+sum+"입니다");
	}

}
