


public class Program16 {
public static void main (String args[]){

    
int arr[]={10,20,30,40,50};

int temp=0;
for(int i=0;i<arr.length-1;i++){
    int j;
for( j=i+1;j<arr.length-1;j++){

if(arr[j]<arr[j+1])
temp=arr[j];
arr[j]=arr[j+1];
arr[j+1]=temp;
}
arr[i]=arr[j];
System.out.println(arr);
}

}
    
}