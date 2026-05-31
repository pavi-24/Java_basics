import java.util.Scanner;
class Q004{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String name=scan.nextLine();
        float score=scan.nextFloat();
        scan.nextLine();
        String dept=scan.nextLine();
        System.out.println("My name is "+name);
        System.out.println("my score is "+score/10+"/10");
        System.out.print("my department is "+dept);
    }
}