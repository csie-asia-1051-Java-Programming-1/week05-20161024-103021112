package ex;
/*
 * Topic: 讓使用者輸入一正整數 n，並輸出 2^1+2^2+2^3+...+2^n 的值。
 * Date: 2016/10/25
 * Author: 105021112 黃意中
 */

import java.util.Scanner;
public class ex03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scn=new Scanner(System.in);
		int i,a=1,sum=0;
		System.out.println("請輸入整數");
		i=scn.nextInt();
		while(a<=i){
			a*=2;
			i++;
			sum=sum+a;
			
		}
		System.out.println(sum);
	}
}
