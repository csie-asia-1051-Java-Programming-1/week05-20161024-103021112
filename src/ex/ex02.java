package ex;
/*
 * Topic: 讓使用者輸入一正整數n，用while迴圈計算n!後輸出。
 * Date: 2016/10/25
 * Author: 105021112 黃意中
 */

import java.util.Scanner;
public class ex02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scn=new Scanner(System.in);
		int i,n=1,a=1;
		System.out.println("請輸入整數");
		i=scn.nextInt();
		while(i>a){
			a++;
			n=n*a;
			
		}
		System.out.println(n);
	}
}