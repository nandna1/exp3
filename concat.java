import java.util.Scanner;
 
class num_str{
    String s;
     void operate(int i,int j)
     { String s1,s2;
       s1=Integer.toString(i);
       s2=Integer.toString(j);
       s=s1+s2;
     }
    void operate(String s1, String s2)
     {
         s=s1+s2;
     }

}
class concat{
   public static void main(String args[]){
   int n1,n2;
   String s1, s2;    
   Scanner sc= new Scanner(System.in);
   System.out.println("Enter 2 numbers to concatenate:");
   n1=sc.nextInt();
   n2= sc.nextInt();
   num_str o1= new num_str();
   o1.operate(n1,n2);
   System.out.println("Result: "+o1.s);
   System.out.println("Enter the 1st string to concatenate:");
   Scanner sc1= new Scanner(System.in);
   s1=sc1.nextLine();
   System.out.println("Enter the 2nd string: ");
   s2=sc1.nextLine();
   num_str o2= new num_str();
   o2.operate(s1,s2);
   System.out.println("Result: "+o2.s);
}
}
