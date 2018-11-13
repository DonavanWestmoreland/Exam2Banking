/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam2banking;


public class CheckingAccount extends Account{

  private static double transactionFee = 15.00;
  

  public CheckingAccount(double balance){
    super(balance);
    
    
  }

  @Override
  public void credit(double num){
    double thing = num-transactionFee;
    super.credit(thing);
  }

  @Override
  public void debit(double num2){
    super.debit(num2);
    if (overdraw == true){
      super.debit(transactionFee);
    }
    else{
      System.out.println("Sorry overdraws are not allowed no transaction fee was incurred");
    }
  }
}