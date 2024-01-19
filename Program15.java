import java.util.Scanner;

public class Program15 {

static void printArray(int arr[],int N){
for(int i=0;i<N;i++){
System.out.print(arr[i]);
}


System.out.println(" ");
}

    public static void main(String args[]){

Scanner sc=new Scanner(System.in);

int arr[]=new int[100];

int N= sc.nextInt();

for(int i=0;i<N;i++){
    arr[i]=sc.nextInt();

}


printArray(arr,N);




        sc.close();
    }


}
