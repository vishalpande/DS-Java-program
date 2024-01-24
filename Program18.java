 public class Program18 {
    public static void main(String[] args) {
        
String str="hi";
String str2="heloooo";


if((int)str.compareToIgnoreCase(str2)==0){
    System.out.println("0");
}else if(str2.compareTo(str)==-1){
    System.out.println("-1");

}else if(str.compareTo(str2)==1){
    System.out.println("1");
}




    }
}