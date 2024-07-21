
/**
 * Write a description of class BankGUI here.
 *
 * @author (22067672 Sara Shrestha)
 * @version (1.0.0)
 */
// --------------------------------Step 0: Importing all required packages for the class----------------------------------------------
import javax.swing.*;

import java.awt.event.*;

import java.awt.*;

import java.util.ArrayList;

// -------------------------------Step 1: Implementing the Action Listener Interface--------------------------------------------------
public class BankGUI implements ActionListener
{
    // --------------------------------------------------declaring a frame------------------------------------------------------------
    private JFrame frame;
    
    // -------------------------------------declaring panels for debit and credit card-------------------------------------------------
    private JPanel panel1, panel2;
    
    // --------------------------------------------declaring a tabbed pane-------------------------------------------------------------
    private JTabbedPane tab;
    
    // -------------------------------------declaring components for debit card--------------------------------------------------------
    private JLabel DebitCard;
    
    private JLabel CardId_1, ClientName_1, BalanceAmount_1, IssuerBank_1, BankAccount_1, PIN_1;
    private JTextField CardIdText_1, ClientNameText_1, BalanceAmountText_1, IssuerBankText_1, BankAccountText_1, PINText_1;
    private JButton add_debit;
    
    private JLabel CardId_2, PIN_2, Withdrawal, DateOfWithdrawal;
    private JTextField CardIdText_2, PINText_2, WithdrawalText;
    private JButton change_credit, clear_1, display_1, withdraw;
    private JComboBox dateCombo, monthCombo, yearCombo;
    
    // -------------------------------------declaring components for credit card--------------------------------------------------------
    
    private JLabel CreditCard;
    private JLabel CardId_3, ClientName_3, BalanceAmount_3, BankAccount_3, IssuerBank_3, CVC, Interest, Expiration;
    private JTextField CardIdText_3, ClientNameText_3, BalanceAmountText_3, BankAccountText_3, IssuerBankText_3, CVCText, InterestText; 
    private JButton add_credit;
    private JComboBox DateCombo, MonthCombo, YearCombo;
    
    private JLabel CardId_4, CreditLimit, GracePeriod;
    private JTextField CardIdText_4, CreditLimitText, GracePeriodText;
    private JButton change_debit, display_2, clear_2, CreditLimitation, Cancel;
    
    //------------------------------- creating ArrayList for debit and credit card--------------------------------------------------------
    ArrayList <BankCard> Cards = new ArrayList <BankCard> ();
    
    public void BankGUI(){
        // --------------------------initialization of JFrame and setting bounds for JPanel----------------------------------------------
        frame = new JFrame("BankGUI");
        
        panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(0, 0, 900, 600);
        
        panel2 = new JPanel();
        panel2.setLayout(null);
        panel2.setBounds(0, 0, 900, 600);
        
        
        // ------------------------------declaring different font size for the GUI---------------------------------------------------------
        
        Font font_1 = new Font("Arial",Font.BOLD, 25);
        Font font_2 = new Font("Arial",Font.PLAIN, 17);
        Font font_3 = new Font("Arial",Font.BOLD, 13);
        
        // -----------------------------------------addition of JTabbedPane-----------------------------------------------------------------
        tab = new JTabbedPane();
        tab.add("Debit Card",panel1);
        tab.add("Credit Card",panel2);
        
        // -----------------------initialization , setting bounds to all components of debit card and adding them to panel-------------------
        DebitCard = new JLabel("Debit Card");
        DebitCard.setBounds(459, 27, 130, 49);
        DebitCard.setFont(font_1);
        panel1.add(DebitCard);
        
        CardId_1 = new JLabel("Card Id:");
        CardId_1.setBounds(128, 119, 98, 25);
        CardId_1.setFont(font_2);
        panel1.add(CardId_1);
        
        CardIdText_1 = new JTextField();
        CardIdText_1.setBounds(297, 119, 155, 32);
        panel1.add(CardIdText_1);
        
        ClientName_1 = new JLabel("Client Name:");
        ClientName_1.setBounds(129, 179, 108, 25);
        ClientName_1.setFont(font_2);
        panel1.add(ClientName_1);
        
        ClientNameText_1 = new JTextField();
        ClientNameText_1.setBounds(298, 171, 155, 32);
        panel1.add(ClientNameText_1);
        
        BalanceAmount_1 = new JLabel("Balance Amount:");
        BalanceAmount_1.setBounds(129, 232, 130, 16);
        BalanceAmount_1.setFont(font_2);
        panel1.add(BalanceAmount_1);
        
        BalanceAmountText_1 = new JTextField();
        BalanceAmountText_1.setBounds(298, 224, 155, 32);
        panel1.add(BalanceAmountText_1);
        
        IssuerBank_1 = new JLabel("Issuer Bank:");
        IssuerBank_1.setBounds(522, 119, 120, 25);
        IssuerBank_1.setFont(font_2);
        panel1.add(IssuerBank_1);
        
        IssuerBankText_1 = new JTextField();
        IssuerBankText_1.setBounds(663, 119, 155, 32);
        panel1.add(IssuerBankText_1);
        
        BankAccount_1 = new JLabel("Bank Account:");
        BankAccount_1.setBounds(522, 171, 120, 25);
        BankAccount_1.setFont(font_2);
        panel1.add(BankAccount_1);
        
        BankAccountText_1 = new JTextField();
        BankAccountText_1.setBounds(663, 171, 155, 32);
        panel1.add(BankAccountText_1);
        
        PIN_1 = new JLabel("PIN number:");
        PIN_1.setBounds(522, 224, 120, 25);
        PIN_1.setFont(font_2);
        panel1.add(PIN_1);
        
        PINText_1 = new JTextField();
        PINText_1.setBounds(663, 224, 155, 32);
        panel1.add(PINText_1);
        
        add_debit = new JButton("Add a Debit Card");
        add_debit.setBounds(670, 305, 150, 30);
        add_debit.setFont(font_3);
        panel1.add(add_debit);
        
        CardId_2 = new JLabel("Card Id:");
        CardId_2.setBounds(128, 374, 100, 25);
        CardId_2.setFont(font_2);
        panel1.add(CardId_2);
        
        CardIdText_2 = new JTextField();
        CardIdText_2.setBounds(298, 374, 155, 32);
        panel1.add(CardIdText_2);
        
        PIN_2 = new JLabel("PIN number:");
        PIN_2.setBounds(128, 429, 150, 25);
        PIN_2.setFont(font_2);
        panel1.add(PIN_2);
        
        PINText_2 = new JTextField();
        PINText_2.setBounds(298, 429, 155, 32);
        panel1.add(PINText_2);
        
        DateOfWithdrawal = new JLabel("Date of Withdrawal:");
        DateOfWithdrawal.setBounds(500, 428, 180, 28);
        DateOfWithdrawal.setFont(font_2);
        panel1.add(DateOfWithdrawal);
        
        String[] date = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        String[] month = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        String[] year = {"2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010"};
        
        dateCombo = new JComboBox(date);
        monthCombo = new JComboBox(month);
        yearCombo = new JComboBox(year);
        
        panel1.add(dateCombo);
        panel1.add(monthCombo);
        panel1.add(yearCombo);
        
        dateCombo.setBounds(672, 426, 72, 29);
        monthCombo.setBounds(754, 426, 72, 29);
        yearCombo.setBounds(836, 426, 72, 29); 
        
        Withdrawal = new JLabel("Withdrawal Amount:");
        Withdrawal.setBounds(500, 368, 180, 25);
        Withdrawal.setFont(font_2);
        panel1.add(Withdrawal);
        
        WithdrawalText = new JTextField();
        WithdrawalText.setBounds(672, 368, 155, 32);
        panel1.add(WithdrawalText);
        
        change_credit = new JButton("Change to Credit Card");
        change_credit.setBounds(270, 498, 180, 30);
        change_credit.setFont(font_3);
        panel1.add(change_credit);
        
        display_1 = new JButton("Display");
        display_1.setBounds(673, 540, 153, 30);
        display_1.setFont(font_3);
        panel1.add(display_1);
        
        withdraw = new JButton("Withdraw");
        withdraw.setBounds(673, 492, 153, 30);
        withdraw.setFont(font_3);
        panel1.add(withdraw);
        
        clear_1 = new JButton("Clear");
        clear_1.setBounds(500, 600, 153, 30);
        clear_1.setFont(font_3);
        panel1.add(clear_1);
        
        // ----------------------------------initialization , setting bounds to all the components of Credit Card-------------------------------
        
        CreditCard = new JLabel("Credit Card");
        CreditCard.setBounds(459, 27, 190, 49);
        CreditCard.setFont(font_1);
        panel2.add(CreditCard);
        
        CardId_3 = new JLabel("Card Id:");
        CardId_3.setBounds(128, 119, 98, 25);
        CardId_3.setFont(font_2);
        panel2.add(CardId_3);
        
        CardIdText_3 = new JTextField();
        CardIdText_3.setBounds(297, 119, 155, 32);
        panel2.add(CardIdText_3);
        
        ClientName_3 = new JLabel("Client Name:");
        ClientName_3.setBounds(129, 179, 108, 16);
        ClientName_3.setFont(font_2);
        panel2.add(ClientName_3);
        
        ClientNameText_3 = new JTextField();
        ClientNameText_3.setBounds(298, 171, 155, 32);
        panel2.add(ClientNameText_3);
        
        BalanceAmount_3 = new JLabel("Balance Amount:");
        BalanceAmount_3.setBounds(129, 232, 130, 16);
        BalanceAmount_3.setFont(font_2);
        panel2.add(BalanceAmount_3);
        
        BalanceAmountText_3 = new JTextField();
        BalanceAmountText_3.setBounds(298, 224, 155, 32);
        panel2.add(BalanceAmountText_3);
        
        IssuerBank_3 = new JLabel("Issuer Bank:");
        IssuerBank_3.setBounds(522, 119, 120, 25);
        IssuerBank_3.setFont(font_2);
        panel2.add(IssuerBank_3);
        
        IssuerBankText_3 = new JTextField();
        IssuerBankText_3.setBounds(663, 119, 155, 32);
        panel2.add(IssuerBankText_3);
        
        BankAccount_3 = new JLabel("Bank Account:");
        BankAccount_3.setBounds(522, 171, 120, 25);
        BankAccount_3.setFont(font_2);
        panel2.add(BankAccount_3);
        
        BankAccountText_3 = new JTextField();
        BankAccountText_3.setBounds(663, 171, 155, 32);
        panel2.add(BankAccountText_3);
        
        CVC = new JLabel("CVC Number:");
        CVC.setBounds(129, 285, 120, 23);
        CVC.setFont(font_2);
        panel2.add(CVC);
        
        CVCText = new JTextField();
        CVCText.setBounds(295, 280, 158, 32);
        panel2.add(CVCText);
        
        Interest = new JLabel("Interest Rate:");
        Interest.setBounds(522, 224, 120, 25);
        Interest.setFont(font_2);
        panel2.add(Interest);
        
        InterestText = new JTextField();
        InterestText.setBounds(663, 224, 155, 32);
        panel2.add(InterestText);
        
        Expiration = new JLabel("Expiration Date:");
        Expiration.setBounds(522, 280, 150, 23);
        Expiration.setFont(font_2);
        panel2.add(Expiration);
        
        String[] Date = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        String[] Month = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        String[] Year = {"2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010"};
        
        DateCombo = new JComboBox(Date);
        MonthCombo = new JComboBox(Month);
        YearCombo = new JComboBox(Year);
        
        panel2.add(DateCombo);
        panel2.add(MonthCombo);
        panel2.add(YearCombo);
        
        DateCombo.setBounds(665, 280, 65, 29);
        MonthCombo.setBounds(743, 280, 72, 29);
        YearCombo.setBounds(826, 280, 72, 29);
        
        CardId_4 = new JLabel("Card Id:");
        CardId_4.setBounds(128, 387, 98, 25);
        CardId_4.setFont(font_2);
        panel2.add(CardId_4);
        
        CardIdText_4 = new JTextField();
        CardIdText_4.setBounds(297, 387, 155, 32);
        panel2.add(CardIdText_4);
        
        CreditLimit = new JLabel("Credit Limit:");
        CreditLimit.setBounds(128, 427, 120, 25);
        CreditLimit.setFont(font_2);
        panel2.add(CreditLimit);
        
        CreditLimitText = new JTextField();
        CreditLimitText.setBounds(297, 427, 155, 32);
        panel2.add(CreditLimitText);
        
        GracePeriod = new JLabel("Grace Period:");
        GracePeriod.setBounds(520, 387, 120, 25);
        GracePeriod.setFont(font_2);
        panel2.add(GracePeriod);
        
        GracePeriodText = new JTextField();
        GracePeriodText.setBounds(661, 387, 155, 32);
        panel2.add(GracePeriodText);
        
        add_credit = new JButton("Add a Credit Card");
        add_credit.setBounds(660, 334, 180, 32);
        add_credit.setFont(font_3);
        panel2.add(add_credit);
        
        CreditLimitation = new JButton("Set the Credit Limit");
        CreditLimitation.setBounds(830, 453, 180, 32);
        CreditLimitation.setFont(font_3);
        panel2.add(CreditLimitation);
        
        clear_2 = new JButton("Clear");
        clear_2.setBounds(661, 453, 150, 32);
        clear_2.setFont(font_3);
        panel2.add(clear_2);
        
        display_2 = new JButton("Display");
        display_2.setBounds(740, 516, 150, 32);
        display_2.setFont(font_3);
        panel2.add(display_2);
        
        change_debit = new JButton("Change to Debit Card");
        change_debit.setBounds(297, 493, 190, 32);
        change_debit.setFont(font_3);
        panel2.add(change_debit);
        
        Cancel = new JButton("Cancel");
        Cancel.setBounds(740, 558, 150, 32);
        Cancel.setFont(font_3);
        panel2.add(Cancel);
        
        // ---------------------------------------Addition of colours in frame and panels and buttons---------------------------------------
        
        frame.getContentPane().setBackground(new Color(223, 237, 214));
        
        panel1.setBackground(new Color(223, 237, 214));
        panel2.setBackground(new Color(223, 237, 214));
        
        add_debit.setBackground(new Color(254, 250, 192));
        change_credit.setBackground(new Color(254, 250, 192));
        clear_1.setBackground(new Color(255, 180, 176));
        display_1.setBackground(new Color(190, 241, 246));
        withdraw.setBackground(new Color(254, 250, 192));
        
        add_credit.setBackground(new Color(254, 250, 192));
        change_debit.setBackground(new Color(254, 250, 192));
        display_2.setBackground(new Color(190, 241, 246));
        clear_2.setBackground(new Color(254, 250, 192));
        Cancel.setBackground(new Color(255, 180, 176));
        CreditLimitation.setBackground(new Color(254, 250, 192));
        
        
        // ---------------------------------------------addition of tabbed pane on frame-------------------------------------------------------
        frame.add(tab);
        
        // ---------------------------------------adding addActionListener to all the buttons--------------------------------------------------
        add_debit.addActionListener(this);
        change_credit.addActionListener(this);
        withdraw.addActionListener(this);
        display_1.addActionListener(this);
        clear_1.addActionListener(this);
        
        add_credit.addActionListener(this);
        change_debit.addActionListener(this);
        CreditLimitation.addActionListener(this);
        clear_2.addActionListener(this);
        display_2.addActionListener(this);
        Cancel.addActionListener(this);
        
        frame.setBounds(0, 0, 1920, 1080);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    // ---------------------------------------------event handling and exception handling-------------------------------------------------------
    public void actionPerformed(ActionEvent e)
    {
        // --------------------------------------for clearing the text fields of Debit Card-------------------------------------------------------
        if(e.getSource() == clear_1)
        {
            CardIdText_1.setText("");
            ClientNameText_1.setText("");
            BalanceAmountText_1.setText("");
            IssuerBankText_1.setText("");
            BankAccountText_1.setText("");
            PINText_1.setText("");
            CardIdText_2.setText("");
            PINText_2.setText("");
            WithdrawalText.setText("");
        }
        // --------------------------------------for clearing the text fields of credit card---------------------------------------------------------
        if(e.getSource() == clear_2)
        {
            CardIdText_3.setText("");
            ClientNameText_3.setText("");
            BalanceAmountText_3.setText("");
            BankAccountText_3.setText("");
            IssuerBankText_3.setText("");
            CVCText.setText("");
            InterestText.setText("");
            CardIdText_4.setText("");
            CreditLimitText.setText("");
            GracePeriodText.setText("");
        }
        // -------------------------------------------------------for addition of debit card-----------------------------------------------------
        if(e.getSource() == add_debit)
        {
             try{
                // --------------------------------------extracting the texts from the text fields------------------------------------------------
                String CardId_1 = CardIdText_1.getText();
                String ClientName_1 = ClientNameText_1.getText();
                String BalanceAmount_1 = BalanceAmountText_1.getText();
                String IssuerBank_1 = IssuerBankText_1.getText();
                String BankAccount_1 = BankAccountText_1.getText();
                String PIN_1 = PINText_1.getText();
                
                // ----------------------------------declaring boolean value for duplicate addition-------------------------------------------------
                boolean isAdded = false;
                
                // --------------------------------------checking for an empty field----------------------------------------------------------------
                // ------------------use of || OR operation: true if and only if one operands is true-----------------------------------------------
                if(CardId_1.isEmpty() || ClientName_1.isEmpty() || BalanceAmount_1.isEmpty() || IssuerBank_1.isEmpty() || BankAccount_1.isEmpty() || PIN_1.isEmpty())
                {
                    throw new Exception();
                    
                }
                else
                {
                    //-------------------------------------- parsing of String to Integer---------------------------------------------------------
                    int CardId_1_num = Integer.parseInt(CardId_1);
                    int PIN_1_num = Integer.parseInt(PIN_1);
                    int BalanceAmount_1_num = Integer.parseInt(BalanceAmount_1);
            
                    // -----------downcasting of BankCard Class to Debit Card object by iteration through all items on loop------------------------
                    // -----------downcasting of the Arraylist of Bankcard class so that each object of the arraylist is examined-----------------
                    for(BankCard bankcard_class: Cards)
                    {
                        if(bankcard_class instanceof DebitCard){
                            DebitCard debit_card = (DebitCard) bankcard_class;
                            if((debit_card.getCardId()) == (CardId_1_num))
                            {
                            isAdded = true;
                            }
                        }
                    }
                    
                    // ------------------for a card id which is already added with display of error message----------------------------------------
                    if(isAdded == true)
                    {
                        JOptionPane.showMessageDialog(frame,"The Card ID " + CardId_1_num + " has already been added.", "ERROR",JOptionPane.ERROR_MESSAGE);
                    }
                    // ---------------------------------------for Card id not added yet,------------------------------------------------------------
                    else if(isAdded == false)
                    {
                       // --------------------------------creation of object of Debit Card----------------------------------------------------------
                       DebitCard card_debit = new DebitCard(BalanceAmount_1_num, CardId_1_num, BankAccount_1, IssuerBank_1, ClientName_1, PIN_1_num);
                       // ----------------------------------Addition of object to arraylist of debit card-------------------------------------------
                       Cards.add(card_debit);
                       JOptionPane.showMessageDialog(frame,"Debit Card has been added" + "\n" + "Card Id:" + CardId_1 + "\n" + "Client Name:" + ClientName_1 + "\n" + "Balance Amount:" + BalanceAmount_1_num + "\n" + "Issuer Bank:" + IssuerBank_1 + "\n" + "Bank Account" + BankAccount_1 + "\n" + "PIN number:" + PIN_1_num ,"Debit Card is Successfully added" ,JOptionPane.INFORMATION_MESSAGE);
                       
                    }
                }
            }
            // ----------------------------------------------catching of NumberFormatException-----------------------------------------------------
            catch(NumberFormatException num_ex)
            {
                JOptionPane.showMessageDialog(frame,"Card Id, PIN number, Balance Amount must contain numeric values.","Warning Message", JOptionPane.ERROR_MESSAGE);
            }
            catch(Exception ex)
            {
                JOptionPane.showMessageDialog(frame,"Please do not leave the field empty.","Warning Message", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        // --------------------------------------------------------for withdraw button---------------------------------------------------------------
        
        if(e.getSource() == withdraw)
        {
            try{
                //------------------------------------ extracting the texts from the text fields------------------------------------------------------
                String CardId_2 = CardIdText_2.getText();
                String Withdrawal = WithdrawalText.getText();
                String PIN_2 = PINText_2.getText();
                String BalanceAmount_1 = BalanceAmountText_1.getText();
                String date = (String)dateCombo.getSelectedItem();
                String month = (String)monthCombo.getSelectedItem();
                String year = (String)yearCombo.getSelectedItem();
                String DateOfWithdrawal = date + "" + month + "" + year;
                
                // ----------------------------------------checking for an empty field----------------------------------------------------------------
                if(CardId_2.isEmpty() || Withdrawal.isEmpty() || PIN_2.isEmpty())
                {
                    throw new Exception();
                }
                else
                {
                    // ----------------------------------------------parsing of String to Integer-----------------------------------------------
                    int CardId_2_num = Integer.parseInt(CardId_2);
                    int PIN_2_num = Integer.parseInt(PIN_2);
                    int Withdrawal_num = Integer.parseInt(Withdrawal);
                    int BalanceAmount_1_num = Integer.parseInt(BalanceAmount_1);
                    boolean cardFound = false;
                    
                    // -----------iterating through all the DebitCard objects in the ArrayList to find the one with the matching Card ID------------
                    for(BankCard bankcard_class: Cards)
                    {
                        if(bankcard_class instanceof DebitCard){
                            DebitCard debit_card = (DebitCard) bankcard_class;
                            if((debit_card.getCardId()) == (CardId_2_num))
                            {
                                cardFound = true;
                                // ------------------------------------check if the PIN is correct-------------------------------------------------
                                if(debit_card.checkPIN(PIN_2_num))
                                {
                                debit_card.Withdraw(Withdrawal_num, DateOfWithdrawal, PIN_2_num);
                                if(Withdrawal_num <= BalanceAmount_1_num){
                                    
                                    JOptionPane.showMessageDialog(frame, Withdrawal_num + " can be withdrawn from Card ID " + CardId_2_num + "\n" + 
                                    "Date Of Withdrawal:" + DateOfWithdrawal ,"Successfully withdrawn.", JOptionPane.INFORMATION_MESSAGE);
                                    
                                }
                                else{
                                    JOptionPane.showMessageDialog(frame, Withdrawal_num + " cannot be withdrawn from Card ID " + CardId_2_num  ,"Withdraw Unsuccessfull.", JOptionPane.INFORMATION_MESSAGE);
                                    
                                    }    
                                }
                            else{
                                JOptionPane.showMessageDialog(frame,"Invalid PIN.", "ERROR",JOptionPane.ERROR_MESSAGE);
                            }
                            break; // ---------------------------exit the loop if card is found--------------------------------------------------
                            }
                        }
                    }

                    // -------------------------------------------if Card ID not found-----------------------------------------------------------------
                    if(!cardFound){
                        JOptionPane.showMessageDialog(frame,"The Card Id " + CardId_2_num + " is not found in the system.", "ERROR",JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
                // -----------------------------------------catching of NumberFormatException------------------------------------------------------
                catch(NumberFormatException num_ex)
                {
                    JOptionPane.showMessageDialog(frame,"Card Id, PIN number, Withdrawal Amount must contain numeric values.","Warning Message", JOptionPane.ERROR_MESSAGE);
                }
                catch(Exception ex)
                {
                    JOptionPane.showMessageDialog(frame,"Please do not leave the field empty.","Warning Message", JOptionPane.ERROR_MESSAGE);
            }
        }
       
        
        // ---------------------------------------------for display button of debit card------------------------------------------------------
        if(e.getSource() == display_1){
            try{
                if(Cards.size() == 0){
                    throw new Exception();
                }
                else{
                    for (BankCard bank_card : Cards){
                        // -----downcasting of bank card class to debit card object type by iteration, and calling display method----------------
                        if(bank_card instanceof DebitCard){
                            DebitCard card_debit = (DebitCard) bank_card;
                            System.out.println("The details of Debit Card are as follows:");
                            card_debit.display();
                            System.out.println("------------------------------------------");
                        }
                    }
                }
            }
            catch(Exception emp_exc){
                JOptionPane.showMessageDialog(frame,"The Debit Card is empty.","Warning Message",JOptionPane.ERROR_MESSAGE);
            }
        }
        
        
        // ------------------------------------------------addition of credit card----------------------------------------------------------
        if(e.getSource() == add_credit){
            try{
                // --------------------------extracting of all the required texts from their respective fields-------------------------------
                String CardId_3 = CardIdText_3.getText();
                String ClientName_3 = ClientNameText_3.getText();
                String BalanceAmount_3 = BalanceAmountText_3.getText();
                String IssuerBank_3 = IssuerBankText_3.getText();
                String BankAccount_3 = BankAccountText_3.getText();
                String CVC = CVCText.getText();
                String Interest = InterestText.getText();
                String Date = (String)DateCombo.getSelectedItem();
                String Month = (String)MonthCombo.getSelectedItem();
                String Year = (String)YearCombo.getSelectedItem();
                String Expiration = Date + "" + Month + "" + Year;
                
                // -------------------------------declaring a boolean value for duplicate addition-----------------------------------------
                boolean isAdded = false;
                
                // --------------------------------------checking for an empty text field---------------------------------------------------
            if(CardId_3.isEmpty() || ClientName_3.isEmpty() || BalanceAmount_3.isEmpty() || IssuerBank_3.isEmpty() || BankAccount_3.isEmpty() || CVC.isEmpty()
            || Interest.isEmpty() || Expiration.isEmpty()){
                throw new Exception();
            }
            else{
                // ----------------------------------parsing of string to integer and double-----------------------------------------------
                int CardId_3_num = Integer.parseInt(CardId_3);
                int BalanceAmount_3_num = Integer.parseInt(BalanceAmount_3);
                int CVC_num = Integer.parseInt(CVC);
                double Interest_num = Double.parseDouble(Interest);
                
                // -----------------------downcasting of bank card class to credit card by iteration through loops----------------------------
                for (BankCard bankcard_class: Cards){
                    if(bankcard_class instanceof CreditCard){
                        CreditCard Cards = (CreditCard) bankcard_class;
                        if ((Cards.getCardId()) == (CardId_3_num)){
                            isAdded = true;
                        }
                    }
                }
                // ---------------------------------------for a card id which is already added, -------------------------------------------------
                if(isAdded == true){
                    JOptionPane.showMessageDialog(frame,"The Card Id " + CardId_3_num + " has already been added.", "ERROR", JOptionPane.ERROR_MESSAGE);
                    
                }
                // --------------------------------------for card id not added yet,---------------------------------------------------------------
                else if(isAdded == false){
                    // -------------------------------creation of object of Credit Card------------------------------------------------------------
                     CreditCard card_credit = new CreditCard(CardId_3_num, ClientName_3, IssuerBank_3, BankAccount_3, BalanceAmount_3_num, CVC_num, Interest_num, Expiration);
                    
                     // --------------------------addition of object to arraylist of credit card---------------------------------------------------
                    Cards.add(card_credit);
                    JOptionPane.showMessageDialog(frame, "Credit card has been added" + "\n" + "Card Id:" + CardId_3_num + "\n" + "Client Name:" + ClientName_3 + 
                    "\n" + "Balance Amount:" + BalanceAmount_3_num + "\n" + "CVC Number:" + CVC_num + "\n" + "Issuer Bank:" + IssuerBank_3 + "\n" + "Bank Account:" +   
                    BankAccount_3 + "\n" + "Interest rate:" + Interest_num + "\n" + "Expiration Date:" + Expiration ,"Successfully added", JOptionPane.INFORMATION_MESSAGE);
                
                }
            } 
        }
    
        catch (NumberFormatException num_exc){
            JOptionPane.showMessageDialog(frame, "Card Id, CVC Number, Interest Rate and Balance Amount must contain numeric values.","Warning Message",JOptionPane.ERROR_MESSAGE);
        }
        catch(Exception emp_exc){
            JOptionPane.showMessageDialog(frame,"Please do not leave the text fields empty.","Warning Message",JOptionPane.ERROR_MESSAGE);
            }
        }
        // ------------------------------------------------------setting the credit limit------------------------------------------------------------
        if(e.getSource() == CreditLimitation)
        {
            try{
                // -----------------------------------------extracting the texts from the text fields-----------------------------------------------
                String CardId_4 = CardIdText_4.getText();
                String CreditLimit = CreditLimitText.getText();
                String GracePeriod = GracePeriodText.getText();

                
                // ----------------------------------------------checking for an empty field----------------------------------------------------
                if(CardId_4.isEmpty() || CreditLimit.isEmpty() || GracePeriod.isEmpty())
                {
                    throw new Exception();
                }
                else
                {
                    // -----------------------------------------parsing of String to Integer----------------------------------------------------
                    int CardId_4_num = Integer.parseInt(CardId_4);
                    double CreditLimit_num = Double.parseDouble(CreditLimit);
                    int GracePeriod_num = Integer.parseInt(GracePeriod);
                    boolean cardFound = false;
                    
                    // iterating through all the DebitCard objects in the ArrayList to find the one with the matching Card ID
                    for(BankCard bankcard_class: Cards)
                    {
                        if(bankcard_class instanceof CreditCard){
                            CreditCard credit_card = (CreditCard) bankcard_class;
                            if((credit_card.getCardId()) == (CardId_4_num))
                            {
                                cardFound = true;
                            
                                if(credit_card.checkLimit(CreditLimit_num))
                                {
                                
                                    credit_card.setCreditLimit(CreditLimit_num, GracePeriod_num);
                                    JOptionPane.showMessageDialog(frame, CreditLimit_num + " has been set to Card ID " + CardId_4_num, "Credit Limit is successfully set", JOptionPane.INFORMATION_MESSAGE);
                                }
                            else{
                                JOptionPane.showMessageDialog(frame,"Credit cannot be issued.", "ERROR",JOptionPane.ERROR_MESSAGE);
                                }
                            break; // ---------------------------exit the loop if card is found------------------------------------------
                            }
                        }
                    }

                    // --------------------------------------------if Card Id not found----------------------------------------------------
                    if(!cardFound){
                        JOptionPane.showMessageDialog(frame,"The Card ID " + CardId_4_num + " is not found in the system.", "ERROR",JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
                // ---------------------------------------------catching of NumberFormatException--------------------------------------------
                catch(NumberFormatException num_ex)
                {
                    JOptionPane.showMessageDialog(frame,"Card Id, Credit Limit, Grace Period must contain numeric values.","Warning Message", JOptionPane.ERROR_MESSAGE);
                }
                catch(Exception ex)
                {
                    JOptionPane.showMessageDialog(frame,"Please do not leave the field empty.","Warning Message", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        // -------------------------------------------------addition of display credit card--------------------------------------------------
        if(e.getSource() == display_2){
            try{
                if(Cards.size() == 0){
                    throw new Exception();
                }
                else{
                    for (BankCard bank_card : Cards){
                        // downcasting of bank card class to credit card object type by iteration, and calling display method
                        if(bank_card instanceof CreditCard){
                            CreditCard card_credit = (CreditCard) bank_card;
                            System.out.println("The details of Credit Card are as follows:");
                            card_credit.display();
                            System.out.println("------------------------------------------");
                        }
                    }
                }
            }
            catch(Exception emp_exc){
                JOptionPane.showMessageDialog(frame,"The Credit Card is empty.","Warning Message",JOptionPane.ERROR_MESSAGE);
            }
        }
        // ------------------------------------------------------------cancel credit card---------------------------------------------------------
        if(e.getSource() == Cancel){
            try{
                // ------------------------------------------extracting the texts from the text fields----------------------------------------------
                String CardId_4 = CardIdText_4.getText();
                
                // --------------------------------------------------checking for an empty field----------------------------------------------------
                if(CardId_4.isEmpty())
                {
                    throw new Exception();
                }
                else
                {
                    // ---------------------------------------------parsing of String to Integer--------------------------------------------------
                    int CardId_4_num = Integer.parseInt(CardId_4);
                    boolean cardFound = false;
                    
                    // iterating through all the DebitCard objects in the ArrayList to find the one with the matching Card ID
                    for(BankCard bankcard_class: Cards)
                    {
                        if(bankcard_class instanceof CreditCard){
                            CreditCard credit_card = (CreditCard) bankcard_class;
                            if((credit_card.getCardId()) == (CardId_4_num))
                            {
                                cardFound = true;
                                
                                    credit_card.cancelCreditCard();
                                    JOptionPane.showMessageDialog(frame, "The credit card with credit card ID: " + CardId_4_num + " has been cancelled ", "Action Successful", JOptionPane.INFORMATION_MESSAGE);
                            break; // ----------------------exit the loop if card is found--------------------------------------------------
                            }
                        }
                    }

                    // ----------------------------------------if Card ID not found---------------------------------------------------------
                    if(!cardFound){
                        JOptionPane.showMessageDialog(frame,"The Card ID " + CardId_4_num + " is not found in the system.", "ERROR",JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
                // ---------------------------------------catching of NumberFormatException-----------------------------------------------
                catch(NumberFormatException num_ex)
                {
                    JOptionPane.showMessageDialog(frame,"Card Id must contain numeric values.","Warning Message", JOptionPane.ERROR_MESSAGE);
                }
                catch(Exception ex)
                {
                    JOptionPane.showMessageDialog(frame,"Please do not leave the field empty.","Warning Message", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        // -------------------------------------------switching from debit card to credit card------------------------------------------
        if(e.getSource() == change_credit){
            int currentTab = tab.getSelectedIndex();
            int nextTab= (currentTab + 1) % tab.getTabCount();
            tab.setSelectedIndex(nextTab);
        }
        
        // --------------------------------------------switching from credit card to debit card--------------------------------------------
        if(e.getSource() == change_debit){
            int currentTab = tab.getSelectedIndex();
            int nextTab = (currentTab - 1) % tab.getTabCount();
            tab.setSelectedIndex(nextTab);
        }
    } 
    
    public static void main(String[] args)
    {
        // -------------------------------------------------create obj of bankGUI---------------------------------------------------------------------
        new BankGUI().BankGUI();
    }
}
