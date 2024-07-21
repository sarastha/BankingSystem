/**
 * Write a description of class DebitCard here.
 *
 * @author (22067672 Sara Shrestha)
 * @version (1.0.0)
 */
     public class DebitCard extends BankCard
     {
         // attributes
         private int PINnumber;
         private int WithdrawalAmount;
         private String DateOfWithdrawal;
         private boolean hasWithdrawn;
          // constructor
        
        public DebitCard(int BalanceAmount, int CardId, String BankAccount, String IssuerBank, String ClientName, int PINnumber)
        {
        super(BalanceAmount, CardId, BankAccount, IssuerBank);
        this.PINnumber = PINnumber; 
        this.WithdrawalAmount = 0;
        this.DateOfWithdrawal = "";
        this.hasWithdrawn = false;
        super.setClientName(ClientName);
        
    }
    
    // getter
    
    public int getPINnumber()
    {
        return this.PINnumber;
    }
    public int getWithdrawalAmount()
    {
     return this.WithdrawalAmount;
    }
    public String getDateOfWithdrawal()
    {
     return this.DateOfWithdrawal;
    }
    public boolean gethasWithdrawn()
    {
     return this.hasWithdrawn;
    }
    
    // setter for withdrawal amount
 
    public void setWithdrawalAmount(int WithdrawalAmount)
    {
        this.WithdrawalAmount = WithdrawalAmount;
    }
    
    public boolean checkPIN(int enteredPINnumber){
        return enteredPINnumber == this.PINnumber;
    }
    
    //method
    
    public void Withdraw(int WithdrawalAmount, String DateOfWithdrawal, int EnteredPINnumber)
    {
        if(this.PINnumber == EnteredPINnumber)
        {
            if (WithdrawalAmount <= this.getBalanceAmount())
            {
            this.setBalanceAmount(this.getBalanceAmount() - WithdrawalAmount);
            this.WithdrawalAmount = WithdrawalAmount;
            this.DateOfWithdrawal = DateOfWithdrawal;
            this.hasWithdrawn = true;
            System.out.println("Transaction Successful");
            }
            else
            {
                System.out.println("Insufficient Balance");   
            }
        }
        else
        {
        System.out.println("Invalid Pin");
        }
    }
    
    // display
    
    public void display() {
        super.display();
        if (this.hasWithdrawn == true)
        {
            System.out.println("PIN number:" + this.PINnumber);
            System.out.println("Withdrawal Amount:" + this.WithdrawalAmount);
            System.out.println("Date Of Withdrawal:" + this.DateOfWithdrawal);
        }
        else
        {
            System.out.println("Transaction not carried yet.");  
        }
    }
}

