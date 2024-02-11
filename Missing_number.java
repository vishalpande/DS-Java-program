
import java.util.*;

public class Missing_number {
     
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

int n=sc.nextInt();
int arr[]=new int[n];

for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
}
for(int num:arr)
System.out.println(num);

for(int i=0;i<n;i++){
    boolean value=false;
    for(int num2:arr){
        if(num2==i){
         value=true;
         break;
        }
    }
    if(value==false){
    System.out.println(i);
    }
}





}

}
