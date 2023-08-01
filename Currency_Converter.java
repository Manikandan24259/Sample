import java.util.*;
import java.text.DecimalFormat;
import java.util.Scanner;
class Currency_Converter
{
    public static void main(String args[])
    {
       double rupee,dollar,pound,code,euro,KWD;
       DecimalFormat f = new DecimalFormat("##.###");
       Scanner sc = new Scanner(System.in);
       System.out.println("Currency converter\nEnter the currency code \n1:Rupee\n2:Dollar\n3:Pound\n4Euro\n5:Kuwaiti dinar");
       code = sc.nextInt();

       if(code == 1)
       {
           System.out.println("Enter amount in rupees;");
           rupee = sc.nextInt();
           dollar = rupee / 0.012;
           System.out.println("Dollar : $"+f.format(dollar));
           pound = rupee / 0.0095;
           System.out.println("Pound : £"+f.format(pound));
           euro = rupee / 0.011;
           System.out.println("Euro : €"+f.format(euro));
           KWD = rupee / 0.0037;
           System.out.println("Kuwaiti dinar : KD"+f.format(KWD));
       }

       if(code == 2)
       {
          System.out.println("Enter amount in dollar;");
           dollar = sc.nextInt();
           rupee = dollar / 82.32;
           System.out.println("Rupee: ₹"+f.format(rupee));
           pound =  dollar / 0.78;
           System.out.println("Pound : £"+f.format(pound));
           euro =  dollar / 0.91;
           System.out.println("Euro : €"+f.format(euro));
           KWD =  dollar / 0.31;
           System.out.println("Kuwaiti dinar : KD"+f.format(KWD));
       }
       if(code == 3)
       {
          System.out.println("Enter amount in Euro;");
           euro = sc.nextInt();
           rupee = euro / 90.27;
           System.out.println("Rupee: ₹"+f.format(rupee));
           pound =  euro / 0.86;
           System.out.println("Pound : £"+f.format(pound));
           dollar =  euro / 1.10;
           System.out.println("Dollar : $"+f.format(dollar));
           KWD =  euro / 0.34;
           System.out.println("Kuwaiti dinar : KD"+f.format(KWD));
       }
       if(code == 4)
       {
          System.out.println("Enter amount in Kuwaiti dinar;");
           KWD = sc.nextInt();
           rupee = KWD / 267.56;
           System.out.println("Rupee: ₹"+f.format(rupee));
           pound =  KWD / 2.55;
           System.out.println("Pound : £"+f.format(pound));
           dollar =  KWD / 3.25;
           System.out.println("Dollar : $"+f.format(dollar));
           euro = KWD / 2.96;
           System.out.println("Euro : €"+f.format(euro));  
       }
       else
           System.out.println("Invalid code!");
    }
}