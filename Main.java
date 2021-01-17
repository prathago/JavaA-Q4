import java.util.Scanner;
class Main {
  public static void main(String[] args) {
      double income_tax = 0.0;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter you age: ");
      int age = sc.nextInt();
      System.out.println("Enter you gender (m or f): ");
      char gender = sc.next().charAt(0);
      if(age > 65 && gender == 'f')
      {
          System.out.println("Wrong category");
          System.exit(0);
      }
      System.out.println("Enter you Taxable Income(TI): ");
      long ti = sc.nextLong();

      if(age <= 65 && gender == 'm')
      {
          if (ti < 160000)
          {
            income_tax = 0.0;
            System.out.println("No income tax needed to pay");
          }
          else if(ti > 160000 && ti <= 500000)
          {
            income_tax = (ti - 160000) * 0.1;
            System.out.println("Income tax payable = " + income_tax);
          }
          else if(ti > 500000 && ti <= 800000)
          {
            income_tax = ((ti - 500000) * 0.2) + 34000;
            System.out.println("Income tax payable = " + income_tax);
          }
          else if(ti > 800000 && ti <= 800000)
          {
            income_tax = ((ti - 500000) * 0.3) + 94000;
            System.out.println("Income tax payable = " + income_tax);
          }
      }
  }
}