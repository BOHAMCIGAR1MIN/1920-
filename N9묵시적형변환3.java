package 연습용프로젝트1;

public class N9묵시적형변환3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
byte bnum =10;
int inum=bnum;

System.out.println(bnum);
System.out.println(inum);

int inum2 =20;
float fnum= inum2;

System.out.println(inum2);
System.out.println(fnum);

double dNum;
dNum= fnum + inum;
System.out.println(dNum);
	}

}
