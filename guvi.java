import java.util.*;
class guvi
{
public static void main(String args[])
{
int i,sum=0;
Scanner s1=new Scanner(System.in);
String a=s1.nextLine();
int n=a.length();
char[] aa=a.toCharArray();
int[] n1=new int[n];
int[] b=new int[n];
for(i=0;i<n;i++)
{
n1[i]=Character.getNumericValue(aa[i]);
}
b[0]=n1[0];
for(i=1;i<n;i++)
{
b[i]=b[i-1]+n1[i];
}
for(i=0;i<n;i++)
{
sum=sum+b[i];
}
System.out.println(sum);
}
}