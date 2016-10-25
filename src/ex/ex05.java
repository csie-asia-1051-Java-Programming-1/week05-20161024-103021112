package ex;
/*
 * Topic: 設計一個程式由 0~9 的亂數隨機產生一 10*10 的二維陣列，將行列互換輸出(即輸出轉置矩陣)
 * Date: 2016/10/25
 * Author: 105021112 黃意中
 */

class ex05{
	public static void main(String[] args){       		    		
		int x[][]= new int[10][10];
		for(int a=0;a<10;a++){
			for(int j=0;j<10;j++)
			{
				x[a][j]=(int)(Math.random() * 9) +1 ;
				System.out.print(x[a][j]+" ");
			}
			System.out.println( );
		}
		System.out.println("======================== ");
		for(int a=0;a<10;a++){
			for(int j=0;j<10;j++)
			{
				
				System.out.print(x[j][a]+" ");
			}
			System.out.println( );
		}
	}
}

