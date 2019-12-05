import java.util.*;
class a3
{
public static void main(String[] args)
{int i;
int[] a= new int []{1,2,9,5};
int min=a[0],max=a[0];
for(i=1;i<a.length;i++)
{if(a[i]==2)
{
System.out.println(i);
break;
}


 }
if(i==a.length)

System.out.println(-1);
}}
