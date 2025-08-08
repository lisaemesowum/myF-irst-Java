package org.example;

import javax.crypto.spec.PSource;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        First ft = new First();  // 🔁 Fixed: typo `=-` to `=`, and name to lowercase
//        System.out.println(ft.addTwo(56, 98));  // 🔁 Fixed: removed `a:`, `b:`, and capitalized `System
//        System.out.println(First.force(2,9.8));
        Scanner scan = new Scanner(System.in);

 //for areaOfCircle
//
//        System.out.println("Enter radius");
//        int r = scan.nextInt();
//        System.out.println(First.areaOfCircle(r));


//        //for the area of triangle
        System.out.println("Enter three sides of the triangle");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        System.out.println(First.areaOfTriangle(a , b, c));

    }

}