package day01;

import java.util.Scanner;

public class Ex19 {
	public static void main(String[] args) {
//		19. 반지름을 입력받아 원의 넓이를 
//		계산하여 출력하기(원의 넓이 계산 공식: π * 반지름 * 반지름, π 값은 3.14로 가정)
		
		int num = 0;
		Scanner sc = new Scanner(System.in);
		
		num = sc.nextInt();
		
		System.out.println(3.14*num*num);
	}
}
