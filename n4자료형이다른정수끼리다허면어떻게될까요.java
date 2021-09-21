package 연습용프로젝트;

public class n4자료형이다른정수끼리다허면어떻게될까요{
	public static void main(String[] args) {
		int num1 = 123456789;
		long num2 = 12345678900L;
	/* INT로 계산하니까 달라도 계산된다. 문제는 Int로 해결범주가 넘을때 오류가 뜬다
	 * 그렇기떄문에 1번 문장은 범위가 넘었기때문에 오류 났고 2번 문장은 정수값을 기본적으로 ㅑㅜㅅ형으로 처리하기 떄문입니다.*/
		System.out.println(num1+num2);
		/*하지만 long형이라도 int 범위 안이면 전자처럼 처리됨*/
}
}
	 
	