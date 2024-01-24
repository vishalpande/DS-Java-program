
/**
 * program17
 */

import java.util.Scanner;

public class program17 {
public static void main(String[] args) {
    
Scanner sc=new Scanner(System.in);


boolean value=true;
String str=sc.nextLine();
char[] ch=str.toCharArray();

for(int i=0;i<ch.length;i++){
    for(int j=ch.length-1;j>=0;j--){
if(ch[i]!=ch[j]){
    value=false;
    break;
}


    }
}
if(value==true){
    System.out.println("its palidrome");
}else{
    System.out.println("its not palidrome");
}

}

}
    
