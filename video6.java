import java.util.Scanner;

public class video6 {
    public static void main(String[] args) {
        //cases starts from 10
        Scanner sc = new Scanner(System.in);
        int case_number = sc.nextInt();

        switch(case_number){
            case 10: 
            int n=4;
            for(int i=0;i<=n;i++){
                for(int j=0;j<i;j++){
                    System.out.print("*");
                }
                for(int k=0;k<2*(n-i);k++){
                    System.out.print(" ");
                }
                for(int j=0;j<i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            for(int i=n;i>=1;i--){
                for(int j=0;j<i;j++){
                    System.out.print("*");
                }
                for(int k=0;k<2*(n-i);k++){
                    System.out.print(" ");
                }
                for(int j=0;j<i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            break;

            case 11:
            int no=5;
            for(int i=1;i<=no;i++){
                for(int k=no;k>i;k--){
                    System.out.print(" ");
                }
                for(int j=0;j<no;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            break;

            case 12:
            for(int i=1;i<=5;i++){
                for(int k=1;k<5-i+1;k++){
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++){
                    System.out.print(i+" ");
                }
                System.out.println();
            }
        
            break;

            case 13:
            for(int i=0;i<5;i++){
                for(int k=0;k<5-i;k++){
                    System.out.print(" ");
                }
                int v=i;
                for(int j=1;j<=2*i+1;j++){
                    
                    if(j<=i){
                        System.out.print(v+1);
                        v--;
                    }
                    else{
                        System.out.print(++v);
                    }

                }
                System.out.println();

            }
            break;

            case 14:
            for(int i=0;i<5;i++){
                for(int k=0;k<5-i;k++){
                    System.out.print(" ");
                }
                for(int j=1;j<=2*i+1;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            for(int i=4;i>=0;i--){
                for(int k=0;k<5-i;k++){
                    System.out.print(" ");
                }
                for(int j=1;j<=2*i+1;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            break;
            default : System.out.println("Invalid Number");
        }
    }    
}