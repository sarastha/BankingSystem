
/**
 * Write a description of class CreditCard here.
 *
 * @author (22067672 Sara Shrestha)
 * @version (1.0.0)
 */
public class CreditCard extends BankCard
{
   // attributes
   
   private int CVCnumber;
   private double CreditLimit;
   private double InterestRate;
   private String ExpirationDate;
   private int GracePeriod;
   private boolean isGranted;
    
   //constructor
   
   public CreditCard(int CardId, String ClientName, String IssuerBank, String BankAccount, int BalanceAmount, int CVCnumber, double InterestRate, String ExpirationDate)
   {
     super(BalanceAmount, CardId, BankAccount, IssuerBank);
     this.CVCnumber = CVCnumber;
     this.CreditLimit = CreditLimit;
     this.InterestRate = InterestRate;
     this.ExpirationDate = ExpirationDate;
     this.GracePeriod = 0;
     this.isGranted = false;
     super.setClientName(ClientName);
    }
    
    // getter
    
   public int getCVCnumber()
    {
      return this.CVCnumber;  
    }
   public double getCreditLimit()
   {
       return this.CreditLimit;
   }
   public double getInterestRate()
   {
       return this.InterestRate;
   }
   public String getExpirationDate()
   {
       return this.ExpirationDate;
   }
   public int getGracePeriod()
   {
       return this.GracePeriod;
   }
   public boolean getisGranted()
   {
       return this.isGranted;
   }
   
   public boolean checkLimit(double enteredLimit) {
    return enteredLimit <= 2.5 * this.getBalanceAmount();
    }

   //setter
   
   public void setCreditLimit(double CreditLimit, int GracePeriod)
   {
       if (this.CreditLimit <= 2.5 * this.getBalanceAmount())
       {
           this.CreditLimit = CreditLimit;
           this.GracePeriod = GracePeriod;
           this.isGranted = true;
        
       }
       else
       {
           System.out.println("The Credit cannot be issued");           
       }
   }
   
   // method 
   
    public void cancelCreditCard()
    {
           this.CVCnumber = 0;
           this.CreditLimit = 0;
           this.GracePeriod = 0;
           this.isGranted = false;
    }
       
    // display
       
    public void display()
    {
           super.display();
           if (this.isGranted)
           {
               System.out.println("CVCnumber:" + this.CVCnumber);
               System.out.println("CreditLimit:" + this.CreditLimit);
               System.out.println("InterestRate:" + this.InterestRate);
               System.out.println("ExpirationDate:" + this.ExpirationDate);
               System.out.println("GracePeriod:" + this.GracePeriod);
               System.out.println("Credit has been granted");
           }
           else
           {
               System.out.println("Credit has not been granted for this card.");
           }
    }
}
