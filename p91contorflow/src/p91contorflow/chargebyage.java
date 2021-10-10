package p91contorflow;

class chargebyage {

	public static void main(String[] args) {
		int age = 13;
		int charge = 0;
		if(age <8) {
			System.out.println("취학전 아동");
			charge = 1000;
			//취학전 아동(7세 이하)는 1000원 입장료를 받습니다
		}else if (age <14) {
			System.out.println("초등학생");
			charge = 2000;
			//초등학생(8~13세)은 2000월 입장료를 받습니다
		}else if	 (age <20) {
			System.out.println("중고등학생");
			charge = 2500;
			//중고등학생은(8~19세)은 2500원 입장료 받습니다
		}else {
			System.out.println("일반인");
			charge = 3000;
			//일반인은 3000원 입잘료 받습니다
		}
		System.out.println("요금은"+ charge +"입니다");
	}

}
