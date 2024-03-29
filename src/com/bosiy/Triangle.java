package com.bosiy;

public class Triangle {
    private final int sideA;
    private final int sideB;
    private final int sideC;

    public Triangle(int sideA, int sideB, int sideC) {
        if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
            System.out.println("Side hasn't been negative value!" +
                    "\nDefault value is assigned.");
            this.sideA = 1;
            this.sideB = 1;
            this.sideC = 1;
            return;
        }

        if (isNotValidTriangle(sideA, sideB, sideC)) {
            System.out.println("It's impossible!");
            this.sideA = 1;
            this.sideB = 1;
            this.sideC = 1;
            return;
        }

        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public String toString() {
        return "side a = " + sideA + "; " + " side b = " + sideB + "; " + " side c = " + sideC + "; ";
    }

    public boolean isNotValidTriangle(int sideA, int sideB, int sideC) {
        return sideA > sideB + sideC
                || sideB > sideA + sideC
                || sideC > sideA + sideB;
    }

    public String getTriangleType() {
        if (sideA == sideB && sideB == sideC) {
            return "Этот треугольник равносторонний.";
        } else if (sideA == sideB || sideA == sideC || sideB == sideC) {
            return "Этот треугольник равнобедренный.";
        } else {
            return "Этот треугольник разносторонний";
        }
    }
}
