/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author Hp
 */
public class Run {
    public static void main(String[]args) {
        BankAccount ba1 = new BankAccount("123456789", "Jeonghan", 2500000);
        
        BankAccount ba2 = new BankAccount("987654321", "Wonwoo", 2800000);
        
        ba1.displayInfo();
        ba2.displayInfo();
        
        ba1.deposit(0);
        ba2.deposit(50000);
        
        ba1.withdraw(3000000);
        ba2.withdraw(300000);
    }
}
