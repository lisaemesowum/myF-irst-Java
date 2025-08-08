package org.example;

public class First {
    public static final double PIE = 3.13;        //this is like const in javascript when you want to get a constant value you cannot change
    int age = 67;
    String name = "lisa";        // 🔁 Use capital 'S' for String
    boolean isAdmin = true;

    public int addTwo(int a, int b) {
        return a + b;
    }
    //f = ma

    public  static double force(int mass, double acceleration){
        return mass * acceleration;
    }

    //area of circle
    public static double areaOfCircle(int radius){
        return Math.pow(radius,2) * PIE;
    }
    //find Area of triangle s =A + B + C/2
//FIND THE AREA
//FORMULAR  area = squareRoot s(s - A) (s - B) (s - C)

    public static double areaOfTriangle(double a, double b, double c){
        double   s = (a + b + c)/2;
        return  Math.sqrt(s *((s - a) * (s - b)* (s - c)));
    }

}
