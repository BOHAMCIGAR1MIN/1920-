package 창작배열실전;

public class 올림피아FINDUNIQUE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/**
 * 집합 (3,5,6,7,2,8,6,5,2,8,7)
 * 다른 모든 것은 짝이 있고 하나만이 유일하다
 * 여기서 유일한 원소를 찾으라
 * 
 * 수학접근은 1과 자신만이 존제하는수 따라서 저거 전부 소인수 분해해서 
 * 걸리면 지워서 겹치는것들만 지워 버리면 장땡임 6경우 2로 겹치기때문에 결국 3만남음
 * 문제는 식으로 나타내야함 단 변수는 2개
 */
	for (int a = 0, b=1, c= a+b; c<35; a=b, b=c, c=a+b)
		System.out.println(c);}

}
/**
1,3
1.5
1,2,3,6
1,7
1,2
1,2,4,8
1,2,3,6
1,5
1,2
1,2,4,8
1,5
1,2
1,2,4,8
1,7
수 배열은 짝수 만약 이게 오답이면 짝수로 나온다 따라서 홀수로 떨어진다.
