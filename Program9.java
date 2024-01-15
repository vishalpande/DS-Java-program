// print all prime number 1 To N

import java.util.Scanner;

public class Program9 {

    public static void main(String[] args){

Scanner input=new Scanner(System.in);

int num=input.nextInt();


for(int i=2;i<=num;i++){
    
boolean its_prime=true;
for(int j=2;j<i;j++){

if(i%j==0){
    its_prime=false;
    break;
}
}
if(its_prime){
    System.out.println(i);
}


}

    }
}
