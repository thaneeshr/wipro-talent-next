import java.util.*;
class a2
{
public static void main(String[] args)
{
int[] a= new int []{1,2,9,5};
int min=a[0],max=a[0];
for(int i=1;i<a.length;i++)
{if(a[i]<min)
min=a[i];
if(a[i]>max)
max=a[i];
 }
System.out.println("min ="+min +"  max ="+max);
}}
