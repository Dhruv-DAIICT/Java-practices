import java.util.Scanner;

public class video4 {
    /*
     * Loops
     * for loop - for(initialization;condition(terminating condition);updation)
     * while - while(condition)
     * do while - do {}while(condition) : at least work one time
     * infinite loops runs till memory is empty
     * Dry run - anlysis the code
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p=0;
        // do{
        //     System.out.print("Enter Marks: ");
        //     float m = sc.nextFloat();
        //     if(m>=90){
        //         System.out.println("This is good");
        //     }
        //     else if(m>=60 && m<=89){
        //         System.out.println("This is also Good");
        //     }
        //     else{
        //         System.out.println("this is good as well");
        //     }
        //     System.out.println("1 continue\t 0 stop");
        //     p= sc.nextInt();
        // }while(p==1);

        //prime or not
        System.out.print("Enter number: ");
        int n =sc.nextInt();
        Boolean prime = true;
        for(int i=2;i<n;i++){
            if(n%i==0)
                prime = false;
        }
        System.out.println("Number is prime: "+prime);
    }
}
