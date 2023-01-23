package design_patterns_theory.Structural.adapter;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// ** An Adapter Pattern says that just "converts the interface
// of a class into another interface that a client wants".
// In other words, to provide the interface according to client
// requirement while using the services of a class with
// a different interface.
//
// ** The Adapter Pattern is also known as Wrapper.
// ** Advantages:
// 1. It allows two or more previously incompatible objects to
// interact.
// 2. It allows reusability of existing functionality.
//
// ** Usage
// 1. When an object needs to utilize an existing class
// with an incompatible interface.
// 2. When you want to create a reusable class that cooperates
// with classes which don't have compatible interfaces.

// ** There are the following specifications for the adapter pattern:
//  1. Target Interface: This is the desired interface class
//  which will be used by the clients.
//  2. Adapter class: This class is a wrapper class which implements
//  the desired target interface and modifies the specific
//  request available from the Adaptee class.
//  3. Adaptee class: This is the class which is used by the Adapter
//  class to reuse the existing functionality and modify them for desired use.
//  4. Client: This class will interact with the Adapter class.


// this is an adapter class
public class BankCustomer extends BankDetails implements CreditCard {
    public void giveBankDetails() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter the account holder name :");
            String customername = br.readLine();
            System.out.print("\n");

            System.out.print("Enter the account number:");
            long accno = Long.parseLong(br.readLine());
            System.out.print("\n");

            System.out.print("Enter the bank name :");
            String bankname = br.readLine();

            setAccHolderName(customername);
            setAccNumber(accno);
            setBankName(bankname);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getCreditCard() {
        long accno = getAccNumber();
        String accholdername = getAccHolderName();
        String bname = getBankName();

        return ("The Account number " + accno + " of " + accholdername + " in " + bname +
                "bank is valid and authenticated for issuing the credit card. ");
    }
}