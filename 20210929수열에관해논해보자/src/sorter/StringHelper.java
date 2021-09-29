package sorter;

public class StringHelper {

	public static String builder(int[] intArr) {
		StringBuilder sb =	new StringBuilder();
		for (int val : intArr) {
			sb.append(val);
		}
		return sb.toString();
	}
	
	/**
	 * � �迭�� ������ �� ���� ���̿� ������ ������(delimeter)�� ���� ���ڿ��� ������
	 */
	public static String cancateWithDeli(int[] arrVal, char deli) {
		StringBuilder sb = new StringBuilder();
		boolean isFirst = true;
		for(int val : arrVal) {
			if (isFirst) {
				isFirst = false;//���(form)�� ��������
				sb.append(val);//ó������ ��Ƽ���� �����ðž�
			} else {
				sb.append(deli);//deli
				sb.append(' ');//
				sb.append(val);
			}
		}
			return sb.toString();
	}
	public static void main(String[] args){			
			int[] sss = {3, 5, 2, 6};
			System.out.println(cancateWithDeli(sss, '.'));
			}
}
		////���۸� �ߴµ� ������ ������ ����� �ɷµ� �ʿ��ϴ�
		///�׷��� ���ð� �ϴ°� Ʋ���� ����� �ɷ� �̰� �ٽ�
		


	
