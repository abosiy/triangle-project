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

    @Override
    public String toString() {
        return "side a = " + sideA + "; " + " side b = " + sideB + "; " +
                " side c = " + sideC + "; ";
    }

    public String variation() {
        if (sideA == sideB && sideB == sideC) {
            return "Этот треугольник равносторонний.";
        } else if (sideA == sideB && sideA != sideC
                || sideA == sideC && sideB != sideA
                || sideB == sideC && sideB != sideA) {
            return "Этот треугольник равнобедренный.";
        } else {
            return "Этот треугольник разносторонний";
        }
    }
}
