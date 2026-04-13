package Methods;

public class UserDefineFunction {
  public static void sum(int a, int b, int c){
    int result =a+b+c;
    System.out.println("Sum is: "+result);
  }

  public static void max(int a, int b,int c){
    if(a>=b && a>=c){
      System.out.println("Maximum no is: "+a);
    }else if(b>=a && b>=c){
      System.out.println("Maximum no is: "+b);
    }else{
      System.out.println("Maximum no is: "+c);
    }
  }


  public static void main(String [] args){
    sum(2,6,-2);
    max(4,4,4);
  }
}
