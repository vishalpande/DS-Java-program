//Given a positive number check its prime or not; 
import java.util.Scanner;
public class Program8 {

    public static void main (String args[]){

Scanner input=new Scanner(System.in);

int num=input.nextInt();
boolean not_prime=false;
boolean its_prime=true;

for(int i=2;i<num;i++){
if(num%i==0){
System.out.println(not_prime);
break;
}
System.out.println(its_prime);
break;
}

    }
    
}
