package ex;
/*
 * Topic: 讓使用者輸入一正整數 n，以字元 '*' 輸出邊長為 n 的正方形 (請利用迴圈，不要直接用 printf 方式直接輸出)。
 * Date: 2016/10/25
 * Author: 105021112 黃意中
 */

import java.util.Scanner;
public class ex04 {
 
    public static void main (String[] args) {
 
    Scanner input = new Scanner(System.in);
    
    int Square;
    
    System.out.printf("請輸入正方形邊長");
    Square = input.nextInt();
    
    for (int j=1;j<=Square;j++)
    {
      if (j==1 || j==Square)
      {
        for ( int i=1;i<=Square;i++ )
        {
          System.out.print("*");  
        }
      }
      else
      {
        for ( int i=1;i<=Square;i++ )
        {
          if (i==1 || i==Square)
          {
            System.out.print("*");
          }
          else
          {
            System.out.print(" ");
          }  
        }
      }
      System.out.println();
    }    
    }
}