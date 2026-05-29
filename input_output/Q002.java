import java.util.Scanner;
class Q002{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String name=scan.nextLine();
        int age=scan.nextInt();
        scan.nextLine();
        String addr=scan.nextLine();
        System.out.println("My name is "+name+"\nMy age is "+age+"\nMy address is "+addr);
    }
}