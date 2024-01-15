//given a number check if its's a power of 2 or not;

import java.util.Scanner;
public class Program10 {
    public static void main(String args[]){
Scanner input=new Scanner(System.in);
int num=input.nextInt();

boolean power=false;
int i=1;
while(i<=num){
i*=2;
if(i==num || num== 1 ){
    System.out.println(true);
    power=true;
    break;
}
}
if(power==false){
    System.out.println(power);
}

    }
}
