import java.util.Scanner;

//boiler plate code
public class video2 { 
    public static void main(String[] args) {
        System.out.println("hello world"); //; define termination of line
        System.out.print("hello world     \n"); //; define termination of line

        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");
        System.out.println();
        //optimixed
        System.out.println("*\n**\n***\n****");


        //variables
        String name = "Dhruv";
        int age = 22;
        double weight = 65.5;
        System.out.println(name);

        double mul = age * weight;

        //java => typed langauge
        /*
         * primitiv (64 bit ) 
         * byte 1 byte (1 byte = 8 bits)
         * sort
         * char 2 byte
         * boolean 1 byte
         * int 4 byte
         * long 8 byte
         * float 4 byte
         * double 8 byte
         * 
         * non primitiv
         * graph, tree, link list
         * no need to write in javaScript 
         */

         //input in java 
         Scanner sc = new Scanner(System.in);
        //  String fname = sc.next();
        //  String lanme = sc.nextLine();
         /*
          * nextFloat()
          nextInt()
          */
          System.out.println("Enter a:");
          int a = sc.nextInt();
          System.out.println("Enter b:");
          int b = sc.nextInt();
          int sum = a+b;
          System.out.println(sum);

    }
}
