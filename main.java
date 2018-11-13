/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam2banking;

/**
 *
 * @author mw0864694
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SavingsAccount saver = new SavingsAccount(5000.00);
        saver.calculateInterest();
        System.out.println(saver.interest);
        saver.credit(saver.interest);
        System.out.println(saver.getBalance());

        CheckingAccount check = new CheckingAccount(5000.00);
        check.debit(200);
        System.out.println(check.getBalance());
        check.credit(400);
        System.out.println(check.getBalance());

        CheckingAccount fail = new CheckingAccount(50.00);
        fail.debit(50.00);
        System.out.println(fail.getBalance());
    }
    
}
