// Find the HCF of Given two number

import java.util.Scanner;
public class Program11 {
    public static void main(String args[]){

Scanner input=new Scanner(System.in);
int num1=input.nextInt();
int num2=input.nextInt();
int count =1;
for(int i=2;i<=num1 || i<=num2 ;i++){
   
    if(num1%i==0 && num2%i==0){
        count *=i;
num1 /=i;
num2/=i;
}



}
System.out.println(count);



    }
    
}
