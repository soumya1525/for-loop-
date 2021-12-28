class SumOfPrevious
{
public static void main(String[]args)
{
int input=8;
int sum=0;
for(int i=1;i<=input;i++)
{
sum=sum+i;
System.out.println("Sum after adding"+i+"is:"+sum);
}
System.out.println();
System.out.println("Sum of Previous number till"+input+"is"+sum);
}
}