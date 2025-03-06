/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author Hp
 */
public class BankAccount {
    public String noRek;
    public String namaPemilik;
    public double saldo;
    
    public BankAccount (String noRek, String namaPemilik, double saldo) {
        this.noRek = noRek;
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
    }
    
    public BankAccount (String noRek, String namaPemilik) {
        this.noRek = noRek;
        this.namaPemilik = namaPemilik;
        saldo = 0.0;
    }
    
    public void displayInfo() {
        System.out.println("Nomor Rekening        = " + noRek);
        System.out.println("Nama Pemilik Rekening = " + namaPemilik);
        System.out.println("Jumlah Saldo Saat Ini = " + saldo);
    }
    
    public BankAccount deposit (double nominal) {
        Scanner deposit = new Scanner(System.in);
        System.out.println("Masukkan nominal yang ingin dideposit :");
        double dpst = deposit.nextDouble();
        if (dpst <= 0) {
            System.out.println("Nominal deposit harus lebih dari 0!");
        } else {
            saldo += dpst;
            System.out.println("Jumlah saldo yang berhasil dideposit = " + dpst);
            System.out.println("Jumlah Saldo Terbaru = " + saldo);
        }
        return this;
    }    
    
    public BankAccount withdraw (double nominal) {
        Scanner withdraw = new Scanner(System.in);
        System.out.println("Masukkan nominal yang ingin ditarik :");
        double wtdrw = withdraw.nextDouble();
        if (wtdrw <= 0) {
            System.out.println("Nominal penarikan harus lebih dari 0!");
        } else if (wtdrw > saldo) {
            System.out.println("Saldo tidak mencukupi!");
        } else {
            saldo -= wtdrw;
            System.out.println("Jumlah saldo yang berhasil ditarik = " + wtdrw);
            System.out.println("Jumlah Saldo Terbaru = " + saldo);
        }
        return this;
    }    
   
}
