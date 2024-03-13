package day01;

import java.util.Scanner;

public class Ex18 {
	public static void main(String[] args) {
//		18. 사용자로부터 이름과 나이를 입력받아 "안녕하세요, [이름]님. [나이]살이시군요." 
//		형식으로 환영 메시지를 출력하기
		
		String name = "";	int age = 0;
		
		Scanner sc = new Scanner(System.in);
		
		name = sc.next();
		age = sc.nextInt();
		
		System.out.printf("안녕하세요, %s님 %d살이시군요", name, age);
	}
}
