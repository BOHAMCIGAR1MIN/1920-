package 연습용수업용프로젝스;

public class UnicodeEX {

	public static void main(String[] args) {
		// 유니코드 문자 '한'으로 값을 넣고 출력
		//
		int TOTAL_LEGS_OF_MAMAL= 4;
		byte aaaa = (byte)TOTAL_LEGS_OF_MAMAL;
		
		//형 변환에 따른 정밀도 문제
		double ui = 3.99999999999999999;
		//floor, ceil, round 내림 올림 반올림
		int u2 = (int) ui;
		System.out.println(ui);
		
		char 한 = '한';
		System.out.println(한);
		// 유니코드 문자를 decode값 같은 이상한 것을 in
		char what ='\uD55C';
		// 디코드 값 바꾸고 놀기
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
