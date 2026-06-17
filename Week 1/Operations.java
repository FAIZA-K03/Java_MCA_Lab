import java.util.Scanner;
public class Operations{
public static void main(String[] args){
int num1,num2,sum,diff,mul,quo,min,max;
System.out.println("Enter two numbers: ");
Scanner sc=new Scanner(System.in);
num1=sc.nextInt();
num2=sc.nextInt();
sum=num1+num2;
System.out.println("Sum: "+sum);
diff=num1-num2;
System.out.println("Difference: "+diff);
mul=num1*num2;
System.out.println("Mulitplication: "+mul);
if(num2!=0){
quo=num1%num2;
System.out.println("Quotient: "+quo);
}
else{
System.out.println("Quotient= error, num divide by zero");
}
if(num1>num2){
System.out.println("Maximum: " +num1);
System.out.println("Minimum: " +num2);
}
else{
System.out.println("Maximum: " +num2);
System.out.println("Minimum: " +num1);
}

}
}