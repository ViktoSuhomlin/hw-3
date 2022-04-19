public class ATM{
  
 public int countBanknotes(int sum)
  {
   int count =0;
    count+=(sum/500);
    sum=sum%500;
    count+=(sum/200);
    sum=sum%200;
    count+=(sum/100);
    sum=sum%100;
    count+=(sum/50);
    sum=sum%50;
    count+=(sum/20);
    sum=sum%20;
    count+=(sum/10);
    sum=sum%10;
    count+=(sum/5);
    sum=sum%5;
    count+=(sum/2);
    sum=sum%2;
    count+=(sum/1);
   return count;
  }
  
public static void main (String [] args)
{
  System.out.println(new ATM().countBanknotes(578));
}

}
