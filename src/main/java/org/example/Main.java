package org.example;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");


        Payment P1 = new Payment(100, 69, "Pending");
        Payment P2 = new Payment(200, 79, "Completed");
        Payment P3 = new Payment(300, 89, "Failed");

        System.out.println(P1);
        System.out.println(P2);
        System.out.println(P3);
        List<Payment> payments = new ArrayList<>();
        payments.add(new Payment(1, 100.0, "SUCCESS"));
        payments.add(new Payment(2, 50.0, "PENDING"));
        payments.add(new Payment(3, 200.0, "SUCCESS"));

        List<Payment> successPayments = new ArrayList<>();

// step 1: loop over payments, filter into successPayments
        for (Payment p : payments) {
            if (p.getStatus().equals("SUCCESS")) {
                successPayments.add(p);
            }
        }

// step 2: loop over successPayments to print them
        for (Payment p : successPayments) {
            System.out.println(p);
        }

//  step 3: rewrite the above using streams
        List<Payment> successPaymentsStream = payments.stream()
                .filter(p -> p.getStatus().equals("SUCCESS"))
                .toList();

        successPaymentsStream.forEach(System.out::println);

    }
}