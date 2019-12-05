import java.util.*;
import java.lang.*;
class Calculator
{
static double powerInt(int num1,int num2)
{
return(Math.pow(num1,num2));
}

static double  powerDouble(double num1,int num2)
{
return(Math.pow(num1,num2));
}
}
class c2
{
public static void main(String[] args)
{
System.out.println(Calculator.powerInt(12,10));
System.out.println(Calculator.powerDouble(12.8,10));
}}