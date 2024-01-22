//Add thh intger value one by one  let try the game lets stert the ga
import java.util.Scanner;

public class Program3 {

    public static void main(String args[]){
Scanner input=new Scanner(System.in);

int sum=0;

int N=input.nextInt();

for(;N>0;N/=10){

    sum+=N%10;

}
System.out.println(sum);

    }
    
}
