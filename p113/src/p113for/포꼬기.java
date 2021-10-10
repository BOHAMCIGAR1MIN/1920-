package p113for;

public class Æ÷²¿±â {
	private static char[][] data = { { 'a', 'b', 'c', 'd', 'e', 'f', 'g' }, { 'h', 'i', 'j', 'k', 'l', 'm', 'n' },
			{ 'o', 'p', 'q', 'r', 's', 't', 'u' }, { 'v', 'w', 'x', 'y', 'z', 'A', 'B' },
			{ 'C', 'D', 'E', 'F', 'G', 'H', 'I' }, { 'J', 'K', 'L', 'M', 'N', 'O', 'P' } };

	public static void main(String[] args) {
		drawRect();
	}

	private static void howAccessData() {
		System.out.println(data[0][0]);
		System.out.println(data[0][6]);
		System.out.println(data[5][3]);
	}

	private static void drawRect() {
		for(int row = 0; row< data.length; row++) {
			for(int col = 0; col < data[row].length; col++) { 
				System.out.print(data[row][col]);
			}
			System.out.println();
		}
	}

	private static void drawTriangle() {
		for(int row = 0; row< data.length; row++) {
			for(int col = 0; col < data[row].length; col++) { 
				System.out.print(data[row][col]);
	}
		System.out.println();
	}