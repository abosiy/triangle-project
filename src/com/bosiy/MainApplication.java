package com.bosiy;

public class MainApplication {
    public static void main(String[] args) {

        Triangle[] array = new Triangle[3];

        array[0] = new Triangle(12, 12, 12);
        array[1] = new Triangle(10, 10, 8);
        array[2] = new Triangle(8, 10, 7);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            System.out.println(array[i].variation());
        }
    }
}
