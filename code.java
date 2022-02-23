import java.util.Scanner;
class Calculator
{
public double x,y;
public Calculator()
{
x=0;
y=0;
}
public double add(double x, double y)
{
return x+y;
}
public double sub(double x, double y)
{
return x-y;
}
public double mult(double x, double y)
{
return x*y;
}
public double div(double x, double y)
{
return (float)x/y;
}
public Double fact(Double x)
{
if(x<=1)
{
return 1.0;
}
else{
return(x*fact(x-1));
}
}
public void calculate(int ch)
{
switch(ch)
{
case 1 :
System.out.println("Addition of "+x+" and "+y+" is "+add(x,y));
break;
case 2 :
System.out.println("Subtraction of "+x+" and "+y+" is "+sub(x,y));
break;
case 3 :
System.out.println("Multiplication of "+x+" and "+y+" is "+mult(x,y));
break;
case 4 :
System.out.println("Division of "+x+" and "+y+" is "+div(x,y));
break;
case 5 :System.out.println("Factorial of "+x+" is "+fact(x));
break;
default :
System.out.println("Entered option is invalid, exiting the program ");
System.exit(0);
break;
}
}
}
public class Main
{
public static void main(String[] args) {
int ch =0;
int Max_limit = 10;
do{
System.out.println("\nCalculator\n1.Add\n2.Subtract\n3.Multiply\n4.Divide\n5.Factorial\n");
System.out.println("Enter your choice : ");
Scanner sc = new Scanner(System.in);
ch = sc.nextInt();
Calculator cal = new Calculator();
if(ch>0 && ch <5)
{
System.out.println("Enter first operand : ");
cal.x = sc.nextDouble();
System.out.println("Enter second operand : ");
cal.y = sc.nextDouble();
cal.calculate(ch);
}
else if(ch ==5)
{
System.out.println("Enter the only operand less than "+Max_limit);
cal.x = sc.nextDouble();
if(cal.x>Max_limit)
{
System.out.println("Exceeding the allowed max limit allowed. Exiting the program ");
System.exit(0);
}
cal.calculate(ch);
}
else{
cal.calculate(ch);
}
}while(ch<=5);
}
}
