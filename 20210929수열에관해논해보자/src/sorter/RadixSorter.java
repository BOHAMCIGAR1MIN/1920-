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
	 * � �迭�� ������ �װ��� ���̿� ������ ������(delimeter)�� ���� ���ڿ��� ������
	 * �ݴϴ�
	 */

}
