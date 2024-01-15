import java.util.Scanner;

public class Problem2 {
public static void main (String args[]){
    
Scanner input=new Scanner(System.in);
int count=0;

int a=input.nextInt();

for(int i=a;i>0;i/=10){

count++;

}

System.out.println(count);

    }


}
