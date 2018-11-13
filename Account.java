/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam2banking;
import java.util.*;

public class Account {
  protected double balance;
  protected boolean overdraw = false;
  Scanner sc = new Scanner(System.in);

  public double getBalance() {
    return balance;
  }

  public Account(double balance) {
    if (balance > 0.0) {
      this.balance = balance;
    } else {
      System.out.println("initial balance cannot equal zero please enter a valid balance");
      this.balance = sc.nextDouble();
    }
  }

  public void credit(double num) {
    balance = balance + num;
  }

  public void debit(double num2) {
    if (this.balance - num2 <= 0 ) {
      System.out.println("Debit amount exceeded account balance");
      overdraw = false;
    } 
    else {
      balance = balance - num2;
      overdraw = true;
    }
  }

}