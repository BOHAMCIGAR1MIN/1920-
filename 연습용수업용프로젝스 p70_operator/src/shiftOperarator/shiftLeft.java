package shiftOperarator;

public class shiftLeft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int val = 3;
		//0B00000000000000000000000000000011
		val <<= 10;
		val *= 1024;
		//0B00000000000000000000000000001100
		System.out.println(val);
		
		val = -3;
		//0B11111111111111111111111111111101
		val <<= 2;
		//0B11111111111111111111111111110100
		System.out.println(val);
		
		val = -8;
		val >>>=3;
		System.out.println(val);
		
		int val1=0B00000001000000010000000100000001;
		final int MALE_MASK = 0B0000000000000000000000000000011111;
		int male = val & MALE_MASK;
		System.out.println(male);
		
		int aaa = 5 < 3 ? 33 :7==(6>3?7:8)?22:44;
		System.out.println(aaa);
	}

}
