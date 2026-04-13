import java.util.Scanner;
public class PatternsPrograms {
  public static void main(String []args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the Number");
  int n = sc.nextInt();

  //Print left triangle Pattern
  System.out.println("Left angle triangle.");
  for(int i=1;i<=n;i++){
    for(int j=1;j<=i;j++){
      System.out.print("* ");
    }
    System.out.println();
  }
  System.out.println();

  //print left Angle triangle Number Pattern
  System.out.println("Left angle trinagle number pattern");
  for(int i=1;i<=n;i++){
    for(int j=1;j<=i;j++){
      System.out.print(i+" ");
    }
    System.out.println();
  }
  System.out.println();
  //print alternate Number & alphabet triangle
  System.out.println("Alternate row of number and Alphabet");
  for(int i=1;i<=n;i++ ){
    for(int j=1 ; j<=i; j++){
          if((i%2==0)){
      System.out.print((char)(j+64)+" ");
    }else{
      System.out.print(j+" ");
    }
    }
    System.out.println();
    }
  System.out.println();

  //Print inverse left triangle Pattern
  System.out.println("Inverse Left angle triangle");
  for(int i=1;i<=n;i++){
    for(int j=n;j>=i;j--){
       System.out.print("@ ");
    }
    System.out.println();
  }
  System.out.println();

  //Print inverse Number left triangle Pattern
  System.out.println("Inverse Left angle triangle");
  for(int i=1;i<=n;i++){
    for(int j=1;j<=n+1-i;j++){
       System.out.print(j+" ");
    }
    System.out.println();
  }
  System.out.println();

//Print abcd left angle pattern
for(int i=1; i<=n;i++){
  for(int j=1; j<=i; j++){
    System.out.print((char)(i+96)+" ");
  }
  System.out.println();
}
  //Print Square Pattern
  System.out.println("Square Pattern");
  for(int i=1;i<=n;i++){
    for(int j=1;j<=n;j++){
       System.out.print("& ");
    }
    System.out.println();
  }
  System.out.println();

  //Print Rectangle Pattern
  System.out.println("Rectangle Pattern");
  System.out.println("Enter the column Value");
  int m = sc.nextInt();
  for(int i=1;i<=n;i++){
    for(int j=1;j<=m;j++){
       System.out.print("# ");
    }
    System.out.println();
  }
  System.out.println();

  //Print rectangle Number Pattern
  System.out.println("Rectangle Number 1st Pattern");
  for(int i=1;i<=n;i++){
    for(int j=1;j<=m;j++){
       System.out.print(j+" ");
    }
    System.out.println();
  }
  System.out.println();

  System.out.println("Rectangle Number 2nd Pattern");
  for(int i=1;i<=n;i++){
    for(int j=1;j<=m;j++){
       System.out.print(i+" ");
    }
    System.out.println();
  }
  System.out.println();

  //Print Square Number Pattern
  System.out.println("Square Number 1st Pattern");
  for(int i=1;i<=n;i++){
    for(int j=1;j<=n;j++){
       System.out.print(j+" ");
    }
    System.out.println();
  }
  System.out.println();

  //Print Square number Pattern
  System.out.println("Square Number 2nd Pattern");
  for(int i=1;i<=n;i++){
    for(int j=1;j<=n;j++){
       System.out.print(i+" ");
    }
    System.out.println();
  }
System.out.println();

//Print ABCD sqaure pattern
for(int i=1; i<=n;i++){
  for(int j=1; j<=n; j++){
    System.out.print((char)(j+64)+" ");
  }
  System.out.println();
}
System.out.println();

//Print abcd rectangle pattern
for(int i=1; i<=n;i++){
  for(int j=1; j<=m; j++){
    System.out.print((char)(i+96)+" ");
  }
  System.out.println();
}
System.out.println();
//Print aBcD rectangle pattern
for(int i=1; i<=n;i++){
  for(int j=1; j<=m; j++){
    System.out.print((char)(i+96)+" ");
  }
  System.out.println();
}
//Hollow Rectangle
System.out.println("Hollow Rectangle Pattern");
 for(int i=1;i<=n;i++){
  for (int j=1;j<=m;j++){
    if(i==1||i==n||j==1||j==n){
      System.out.print("*");
    }else{
      System.out.print("  ");
    }
  }
System.out.println();
 }

 //floyd's triangle
 int a=1;
 for(int i=1; i<=n; i++){
  for(int j=1; j<=i;j++){
    System.out.print(a+" ");
    a++;
  }
  System.out.println();
 }
 //Binary Triangles
 
  sc.close();
  }
}
