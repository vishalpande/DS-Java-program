
/**
 * program17
 */

import java.util.Scanner;

public class program17 {
public static void main(String[] args) {
    
Scanner sc=new Scanner(System.in);

boolean value=true;
String str=sc.nextLine();

for(int i=0;i<=str.length();i++){
    for(int j=str.length();j>=0;j--){

if(str.charAt(i)!=str.charAt(j))
    value=false;

    }
}

if(value==true){
    System.out.println("string is palidrome");
}else{
    System.out.println("String is not palidrome");
}

}
    
}