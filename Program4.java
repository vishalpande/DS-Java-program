import java.util.Scanner;

public class Program4 {
    
    public static void main(String args[]){


    Scanner input =new Scanner(System.in);

int n=input.nextInt();
int r=input.nextInt();


for(int i=n;i<=r;i++){
int sum=0;
for(int j=i;j>0; j/=10){
sum+=j%10;
}
System.out.println(sum);
}

    }


}
