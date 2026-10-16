package com.puralsight;

public class Matchapp {
}

class MathProblems {
    public static void main(String[] args) {

        // 1. Create two variables for Bob and Gary's salaries
        double bobSalary = 55000;
        double garySalary = 62000;

        System.out.println("Bob's Salary: $" + bobSalary);
        System.out.println("Gary's Salary: $" + garySalary);

        // 2. Find and display the smallest of CarPrice and TruckPrice
        double carPrice = 25000;
        double truckPrice = 35000;

        double smallestPrice = Math.min(carPrice, truckPrice);
        System.out.println("Smallest Price: $" + smallestPrice);

        // 3. Find and display the area of a circle with radius 7.25
        double radius = 7.25;
        double area = Math.PI * Math.pow(radius, 2);

        System.out.println("Area of Circle: " + area);

        // 4. Find and display the square root of a variable set to 5.0
        double number = 5.0;
        double squareRoot = Math.sqrt(number);

        System.out.println("Square Root of 5.0: " + squareRoot);
    }
}
