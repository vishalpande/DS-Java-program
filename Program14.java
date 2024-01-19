// remove and delete the element from the first;


import java.util.Scanner;


public class Program14 {


static void printArray(int arr[],int N){

for (int i=0;i<N;i++){

System.out.print(arr[i]);
}

System.out.println("");

}

static int deleteFromTheFirst(int arr[],int N){
if(N==0)
return N;



for(int i=0;i+1<N;i++){
arr[i]=arr[i+1];
}
arr[N-1]=0;
return N-1;

}

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
int arr[]=new int[100];

int N=sc.nextInt();


for(int i=0;i<N;i++){
arr[i]=sc.nextInt();

}

printArray(arr,N);


N=deleteFromTheFirst(arr,N);
printArray(arr,N);



    }


}
