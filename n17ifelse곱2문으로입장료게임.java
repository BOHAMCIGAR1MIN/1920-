package 연습용프로젝트1;

public class n17ifelse곱2문으로입장료게임 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 걍 버스요금 시스템
		int a = 9;
		int b =	3000;
		
		if(a < 8) { 
			b = 1000;
			System.out.println("유아용");
		}
		else if(a < 14) { 
				b=2000;
				System.out.println("꼬맹이");
		}
		else if(b < 20)	{
				b=3000;
				System.out.println("고딩이");
		}
		else {
				b=4000;
				System.out.println("일반인");
		}
		System.out.println("입장료는" + b + "원입니다");	
		}
///else 오타냄
}
