import java.util.Scanner;

class W1{
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTer your Name");
        String name=sc.nextLine();
        System.out.println("Hello \n"+name);
    }
    public static void main(String args[]){
        W1 obj=new W1();
        obj.input();

    }
}