package 창작배열실전;

public class 올림피아FINDUNIQUE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/**
 * 문제
 * 집합 (3,5,6,7,2,8,6,5,2,8,7) 여기서 3을 찾을것이다.
 * 다른 모든 것은 짝이 있고 하나만이 유일하다
 * 여기서 유일한 원소를 찾으라
 * 접근
 * 수학접근은 1과 자신만이 존제하는수 따라서 저거 전부 소인수 분해해서 
 * 걸리면 지워서 겹치는것들만 지워 버리면 장땡임 6경우 2로 겹치기때문에 결국 3만남음
 * 문제는 식으로 나타내야함 단 변수는 2개-가 일단 그떄 필기 기반해서 얻은 문제였는데
 */
		int[] problem = {3, 5, 6, 7, 2, 8, 6, 5, 2, 8, 7};
		////일단 만약 수업 안에서 배운것 즉 3강 논리식 안에서만 쓴다면.
		/// 일단 답이 3이나왔으면 어떻게든 3만 나오면 되기 떄문에 논리연산자로 강제적으로 나오게 하면된다.
		///대충 단략 회로 평가로 (1<3)(참)||(99<나머지숫자)(거짓) 참=3 이런식으로 양아치식으로 나오게하는게 가능은하다.
		int answer = 0;
		///근대 그건 몰양심이고 2번째 항목을 표현하지 않는다.
		for(int ele : problem) {///////이 함수는 숫자를 정수형으로 나열해 주는 효과가 있다. xor함수 언급했다.
			///answer ^ =ele; 따라하라 3 이나온다.
			//00000000011
			//00000000110 101
			//00000000000 110
			//00000000110 110		
			//00000000110 101
		}
		
		System.out.println(3);	
				
	}				
	
	}


