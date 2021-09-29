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
	 * 어떤 배열을 받으면 그 값을 사이에 지정한 구분자(delimeter)를 넣은 문자열을 생성해
	 */
	public static String cancateWithDeli(int[] arrVal, char deli) {
		StringBuilder sb = new StringBuilder();
		boolean isFirst = true;
		for(int val : arrVal) {
			if (isFirst) {
				isFirst = false;//양식(form)을 가져오는
				sb.append(val);//처음에는 스티링값 가져올거야
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
		////구글링 했는데 없으니 스스로 만드는 능력도 필요하다
		///그래서 빡시게 하는겨 틀없이 만드는 능력 이게 핵심
		


	
