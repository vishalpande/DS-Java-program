
/**
 * Program12
 */
public class Program12 {

    public static void main(String args[]){



int arr[]={10,20,630,40,50};

int max=0;
int min=arr[0];

for (int i=0;i<5;i++){
    if(max<arr[i]){
              
        max=arr[i]; 
         
     }
     
     if(arr[0]<min){
         min=arr[0];
         
     }
    
}

System.out.println(min);
System.out.println(max);

    }
}
