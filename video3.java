import java.util.Scanner;

public class video3 {
    /*
     * conditional statments (keywords)
     * if else
     * else if
     * switch
     * break
     * 
     * continue
     * 
     * prog 1 adult and not-adult
     * prog 2 odd and even
     * prog 3 compare 2 numbers (nested)
     * solution of nested is else if 
     * switch case
     */
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the value of A and B");
            int x = sc.nextInt();
            int y = sc.nextInt();
            Boolean play = true;
            while(play){
                System.out.println("Enter Operation:\n1 add\t 2 sub\t 3 mul\t 4 div\t 5 mod");
                int o =sc.nextInt();
                switch(o){
                    case 1: System.out.println("ans:"+(x+y)); break;
                    case 2: System.out.println("ans:"+(x-y)); break;
                    case 3: System.out.println("ans:"+x*y); break;
                    case 4: if(y==0){System.out.println("Invalid division: denominator should not 0");}else{System.out.println("ans:"+x/y);}break;
                    case 5: if(y==0){System.out.println("Invalid division: denominator should not 0");}else{System.out.println("ans:"+x%y);}break;
                    default: System.out.println("Invalid operator");
                }
                System.out.println("press 0 for exit || any key for continue");
                if(sc.nextInt()==0)
                    break;
            }
        }
    }
    //home work 2 print months name by entered integer values - possible by switch cases
}
