 import java.util.Scanner;
class AmstrongAr
{
public static void main(String[] args)
{
	int count=0;
       Scanner sc=new Scanner(System.in);
   System.out.println("enter the size of an array:");
  int size=sc.nextInt();
   System.out.print("enter "+size+" of elements"+"\n");
  int Arr[]=new int[size];
     for(int i=0;i<Arr.length;i++)
{
Arr[i]=sc.nextInt();
    }

  for(int j=0;j<Arr.length;j++)
{
 int num=Arr[j];
 int num1=num;
 int sum=0;
 int numberOfdigits=String.valueOf(num).length();
 while(num>0)
{
 int digit=num%10;
 sum+=Math.pow(digit,numberOfdigits);
 num=num/10;
   }
if(sum==num1)
{
	count++;
	System.out.print(" "+num1+",");
}
 
}
System.out.print("\n Total Amstrong numbers input arrays is "+count+"\n");
}
}
