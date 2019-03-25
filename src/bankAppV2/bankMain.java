package bankAppV2;

import java.util.Scanner;

public class bankMain {

    public static void main(String[]args) {

        //Create danAcc
        bankScanner danAcc = new bankScanner(); //Create an Account object
        danAcc.deposit(500);

        //Create deanAcc
        bankScanner deanAcc = new bankScanner(); //Create an Account object
        deanAcc.deposit(250);

        //Dan Print Method
        System.out.print("Dans Account Balance is ");
        System.out.println(danAcc.getBalance());

        //Dean Print Method
        System.out.print("Deans Account Balance is ");
        System.out.println(deanAcc.getBalance());

    }

}
