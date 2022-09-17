import java.util.Scanner;

public class video5 {
    public static void main(String[] args) {
        System.out.print("enter case: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        switch(n){
            case 1:
            for(int i=0; i<5; i++){
                for(int j=0; j<5; j++){  //nested loop
                    System.out.print("*");
                }
                System.out.println();
            }
            break;
            case 2:
            int x =4;
            int y=5;
            for(int i=1; i<=x; i++)
            {
                for(int j=1; j<=y; j++){
                    if(j==1 || j==y || i==1 || i==x)
                        System.out.print("*");
                    else
                        System.out.print("x");
                }
                System.out.println();
            }
            break;

            case 3:
            for(int i=1; i<=4; i++)
            {
                for(int j=1; j<=i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            break;

            case 4:
            for(int i=4; i>=1; i--)
            {
                for(int j=1; j<=i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            break;

            case 5:
            for(int i=1; i<=4; i++)
            {
                for(int j=1; j<=4-i; j++){
                        System.out.print(" ");
                }
                for(int j=1; j<=i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            break;

            case 6:
            for(int i=1; i<=5; i++)
            {
                for(int j=1; j<=i; j++){
                    System.out.print(j+" ");
                }
                System.out.println();
            }
            break;

            case 7:
            for(int i=5; i>=1; i--)
            {
                for(int j=1; j<=i; j++){
                    System.out.print(j+" ");
                }
                System.out.println();
            }
            break;

            case 8:
            int number=1;
            for(int i=1; i<=6; i++){
                for(int j=1; j<i; j++){
                    System.out.print(number++  + " ");
                }
                System.out.println();
            }
            break;

            case 9:
            int code=0;
            for(int i=1; i<=6; i++){
                for(int j=1; j<i; j++){
                    // code ^= 1;
                    // System.out.print(code  + " ");
                    System.out.print((i+j)%2+" ");
                }
                System.out.println();
            }
            break;
            default:System.out.println("bye");
        }
    }
}
