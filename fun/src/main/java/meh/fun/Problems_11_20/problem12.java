/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meh.fun.Problems_11_20;

/**
 *
 * @author n439081
 */
public class problem12 {

  /**
   * The sequence of triangle numbers is generated by adding the natural numbers. So the 7th triangle number would be 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28. The first ten terms would be:

1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...

Let us list the factors of the first seven triangle numbers:

 1: 1
 3: 1,3
 6: 1,2,3,6
10: 1,2,5,10
15: 1,3,5,15
21: 1,3,7,21
28: 1,2,4,7,14,28
We can see that 28 is the first triangle number to have over five divisors.

What is the value of the first triangle number to have over five hundred divisors?
   */
  public static void main(String[] args) {
    
    int num = 1;
    int divisorNum = 1;
    
    while(true){
      int divisorCount = divisorCount(divisorNum);
      System.out.println(divisorNum + " " + divisorCount);
      if(divisorCount > 500){
        System.out.println(divisorNum);
        break;
      }
      num++;
      divisorNum += num;
    }
    
  }
  
  private static int divisorCount(int num){
    if(num==1) return 1;
    
    int count = 2;
    for(int n = 2; n <= Math.sqrt(num); n++){
      if(num%n==0)count+=2;
    } 
    return count;
  }
  
}
