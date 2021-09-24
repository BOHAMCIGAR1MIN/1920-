package 연습용프로젝트1;

public class n15비트이동연산자2 {
////그러니까 서술쓰는거 연습하라는거네 선생말은 그냥깡으로 외워서 쓰는거에 추가하라
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//>>,<<,>>>를 비트에 적용해 설명할것이다.
		int num = 0B00000101;//8비트 2진법 5
		
		System.out.println(num >>2);//10100
		System.out.println(num <<2);//101->001
		System.out.println(num >>>2);//101->001(01)
		
		System.out.println(num);//그냥 0101
		
		System.out.println(num >>2);//
	}

}
////이정도면 올림피드 문제 생각해봐도 되지 않을까?