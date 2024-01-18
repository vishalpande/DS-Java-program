//Insertion and the deletion of the element in the array from the last end;

import java.util.Scanner;

  

public class Program13 {
    

    static void printArray (int arr[],int N){

for(int i=0;i<N;i++)
System.out.print(arr[i]);

System.out.println(" ");

 }

 //deletion from the last
 static int deleteArray(int arr[],int N){
if(N<=0)
return N;

N--;
return N;

 }

  static int insertionLast(int arr[],int N,int val){
if(N>=100)
    return N;

arr[N]=val;
N=N+1;

return N;

  }
 public static void main(String args[]){
    Scanner sc=new Scanner(System.in);

int arr[]=new int[100];
int N=sc.nextInt();

for(int i=0;i<N;i++){
arr[i]=sc.nextInt();
}

printArray(arr,N);


//delete the last element in the array;
N=deleteArray(arr,N);
printArray(arr,N);


System.out.println(N);
//Insertion element in the last int array;

N=insertionLast(arr,N,100);
printArray(arr,N);

    sc.close();
}
    
}
