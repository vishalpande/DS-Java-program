//give a positive number check its prime or not;

import java.util.Scanner;
public class Program7 {
    
public static void main(String[] args){

Scanner input=new Scanner (System.in);

int N=input.nextInt();

for(int i=2;i<=N-1;i++){

if(N%i==0){
    System.out.println("the number is not prime  number");
break;
}else{
    System.out.println("the number is prime number");
    break;
}


}


}
}
