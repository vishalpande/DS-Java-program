// print first N numbers that have their sum of digit is k;
import java.util.Scanner;

public class program6 {

    public static void main(String args[]){

Scanner input=new Scanner (System.in);

int N=input.nextInt();
int K=input.nextInt(); 

int cur_ele=1;
int count=0;
while(count<N){
int sum =0;
for(int i=cur_ele;i>0;i/=10){
sum+=(i%10);

}
if(sum==K){
    System.out.println(cur_ele + " :" + sum);
    count++;
}

cur_ele++;

}


        input.close();
    }
}