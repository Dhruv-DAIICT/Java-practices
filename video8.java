public class video8 {
    public static int gcd(int a,int b){
        if(b==0){
            return a;
        }
        else{
            return gcd(b, a%b);
        }
    }
    public static void main(String[] args) {
        int n1=5;
        int n2=7;
        int a=n1;
        int b=n2;
        while(n1!= n2){
            if(n1>n2){
                n1=n1-n2;
            }
            else{
                n2 = n2-n1;
            }
        }
        int ans = gcd(a,b);
        System.out.println("gcd: "+n2);
        System.out.println("gcd: "+ans);
        System.out.println("lcm: "+a*b/n2);
    }
}
