package com.shekhar.inheritance;

public class FuzzBizz {

	public static void fizzBuzz(int n) {
        for(int i = 1; i <= n; i++){
            if( i % 3 == 0 && 1 % 5 != 0){
                System.out.println("Fizz");
            }else if (i % 5 ==0 && i % 3 != 0){
                System.out.println("Buzz");
            }else if (i % 5 ==0 && i % 3 == 0){
                System.out.println("FizzBuzz");
            }else{
                System.out.println(i);
            }
        }

    }
	
	public static void main(String[] args) {
		
		int mask = 0x000F;
		int value = 0x2222;
		
		System.out.println(value & mask);
		
//		fizzBuzz(15);

	}

}
