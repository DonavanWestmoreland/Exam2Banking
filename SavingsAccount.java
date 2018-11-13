/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam2banking;



public class SavingsAccount extends Account {

  private static double interestRate = 0.8;
  double interest;

  public SavingsAccount(double balance) {
    super(balance);

  }

  public void calculateInterest() {
    interest = balance * interestRate;

  }

  public void credit() {

  }

  public void debit() {

  }
}