class prime100
{
public static void main(String []args)
{
int i,j,count=0;
System.out.println("Theprime numbers are:");

for(i=1;i<=100;i++)
{
count=0;
for(j=1;j<=i;j++)
{
if((i%j)==0)
count=count+1;
}
if(count==2)
{
System.out.println(i);
}
}}}
