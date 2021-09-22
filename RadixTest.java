package 연습용수업용프로젝스;

public class RadixTest {

	public static void main(String[] args) {
		binarytest();
		octaltest();
		byteTest();
		//2^31=10^3^3
		//2^63=8*10^3^6
	}

	private static void octaltest() {
		int oNum = 022;
		int oMaxNum = 017777777777;
		System.out.println(oMaxNum);
	}

	private static void binarytest() {
		int Num = 10; //10 Literall - 문자적으로, 적힌대로
		int bNum = 0B00000000000000000000000000000000;
		int b5Num = 0B00000000000000000000000000000101;
		int b11Num = 0B00000000000000000000000000001011;
		int bMinusnum = 0B11111111111111111111111111111111;
		int bMinus2num = 0B11111111111111111111111111111110;
		int bMinus3num = 0B11111111111111111111111111111101;
		int bMinus4num = 0B11111111111111111111111111111100;
		int bMinus11num = 0B11111111111111111111111111110101;
		int bMaxNum = 0B01111111111111111111111111111111;
		int bMinnum = 0B10000000000000000000000000000000;
		//INT,LONG 타입(보편용어) INT 개별용어리라
		
		
		System.out.println(Num);
		System.out.println(bNum);
		System.out.println(b11Num);
		System.out.println(bMinusnum);
		System.out.println(bMinus2num);
		System.out.println(bMinus3num);
		System.out.println(bMinus4num);
		System.out.println(bMinus11num);
		System.out.println(bMaxNum);
		System.out.println(bMinnum);
	}
	private static void byteTest( ) {
		byte aNum = 127;
		System.out.println(aNum);
	}
	private static int calcNextyear(int year) {
		return year +2;
	}
	private static void charManipulate() {
		int myChar = 'A';
		myChar = myChar + 2;
		System.out.println((char)myChar);
	}
}

