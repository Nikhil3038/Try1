import java.util.Scanner;

class W2{
     int n1,n2;
    W2(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        n1=sc.nextInt();
        System.out.println("Enter a Number");
        n2=sc.nextInt();
    }
    public static void main(String args[]){
        W2 obj=new W2();
        System.out.println("Total :"+(obj.n1+obj.n2));
    }
}