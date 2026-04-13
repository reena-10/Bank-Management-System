package Arrays;
import java.util.Scanner;

public class Sum_of_all_elements{
  
  public static void main(String [] args){
    Scanner sc  = new Scanner(System.in);
  System.out.println("Enter the Array Size");
  int n = sc.nextInt();
  int arr[] = new int[n];
  
  System.out.println("Enter the elements in an Array");

  for(int i=0;i<n;i++){
     arr[i]= sc.nextInt();
  }
  int sum =0;
  for(int i=0;i<n;i++){
     sum+=arr[i];
  }
System.out.println("Sum of all the Array elements is: "+sum);
  }
}