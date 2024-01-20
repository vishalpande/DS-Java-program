import java.util.Scanner;

public class Program15 {

static void printArray(int arr[],int N){
for(int i=0;i<N;i++){
System.out.print(arr[i]);
}


System.out.println(" ");
}

static int deleteAtIndex(int arr[],int N,int id){
if(N==0)
return N;

if(id<0 || id>N)
return N;

for(int i=id ;i+1<N;i++){
arr[i]=arr[i+1];

}
return N-1;

}

    public static void main(String args[]){

Scanner sc=new Scanner(System.in);

int arr[]=new int[100];

int N= sc.nextInt();

for(int i=0;i<N;i++){
    arr[i]=sc.nextInt();

}


printArray(arr,N);

N=deleteAtIndex(arr,N,2);

printArray(arr,N);

        sc.close();
    }


}
