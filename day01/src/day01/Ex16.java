package day01;

import java.util.Scanner;

public class Ex16 {
	public static void main(String[] args) {
//		16. 두 개의 실수형 변수 num1과 num2를 선언하고, 사용자로부터 
//		입력을 받아 두 수를 나눈 결과를 소숫점 두 자리까지 출력하기
		
		double num1 = 0.0, num2 = 0.0;
		
		Scanner sc = new Scanner(System.in);
		
		num1 = sc.nextDouble();
		num2 = sc.nextDouble();
		System.out.println(num2);
		
		System.out.printf("%.2f", num1/num2);
	}
}
