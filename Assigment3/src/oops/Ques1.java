package oops;
    @FunctionalInterface  
interface AddInterface{  
   void add(int a, int b);  
}  

public class Ques1  implements AddInterface {
public void add(int a, int b){  
       System.out.println(a+b);  
   }
public static void main(String args[]){
Ques1 fie = new Ques1();  
       fie.add(10, 20);  
}
}
