package sorter;

public class RadixSorter {

	public static void main(String[] args) {
		int[] problem = {2,-222,325,-51,52};
		int[] answer = sort(problem);
		
		boolean isFirst = true;
		for (int val : answer) {
			if (isFirst) {
				isFirst = false;
				System.out.println(val);
			} else {
				System.out.println("," + val);
			}
		}
	}
	/**
	 * 어떤 배열을 받으면 그값들 사이에 지정한 구분자(delimeter)를 넣은 문자열을 생성해
	 * 줍니다
	 */

}
