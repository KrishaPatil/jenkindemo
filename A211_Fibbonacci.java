/*  11.Write a Java Program  Print the fibonnacci series as follows: -  
    0	1	1	2	3	5	8	13
*/

import java.util.Scanner;
public class A211_Fibbonacci {

	static int n1=0,n2=1,n3=0; 
    public static void main(String args[])
      {     
          int count=10;    
          System.out.print(n1+" "+n2);   
          printFibo(count-2);  
       }  


static void printFibo(int count)
     {    
          if(count>0)
          {    
          n3 = n1 + n2;    
          n1 = n2;    
          n2 = n3;    
          System.out.print(" "+n3);   
          printFibo(count-1);    
          }
      }    
}
