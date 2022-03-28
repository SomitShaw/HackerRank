import java.util.*;
public class Scan{

public static void main(String ...args){
Scanner scan = new Scanner(System.in);
double p,i;
int n;
p = scan.nextDouble();
i = scan.nextDouble();
n = scan.nextInt();

System.out.println(calculateAmount(p,i,n));

}

public static double calculateAmount(double p, double i, int n){
if(n==0){
return p;
}
else{
return calculateAmount(p*(1+i/100),i,n-1);
}
}
}
