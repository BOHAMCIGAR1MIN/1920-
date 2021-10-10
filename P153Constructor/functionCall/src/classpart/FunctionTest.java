package classpart;

public class FunctionTest {

	public static void main(String[] args) {
		int num1 = 10; 
		int num2 = 20;
		
		int sum = add(num1,num2);//두값의 합은 sum 한다.
		
		System.out.println(num1+ "+" +num2 + "=" +sum+ "입니다");
	}
	////가시성, 스테틱,반환형,이름,매개변수,
	private static int add(int n1, int n2) {
		int result = n1 + n2;
		return result;//
	}

}
