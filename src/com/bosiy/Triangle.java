package com.bosiy;
public class Triangle {
    private final int sideA;
    private final int sideB;
    private final int sideC;

    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    public String triangle() {
        return "side a = " + sideA + "; " + " side b = " + sideB + "; " +
                " side c = " + sideC + "; ";
    }
    public String variation() {
        if (sideA == sideB && sideB == sideC) {
            System.out.println("Этот треугольник равносторонний.");
        }
        if (sideA == sideB && sideA != sideC) {
            System.out.println("Этот треугольник равнобедренный.");
        }
        if (sideA != sideB && sideB != sideC && sideA != sideC) {
            System.out.println("Этот треугольник разносторонний");
        }
        return triangle();
    }
}
