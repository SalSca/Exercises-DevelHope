package org.example;

public class Main {
    public static void main(String[] args) {
        Shape emptyShape = new Shape();
        System.out.println(emptyShape.getShapeDetails());
        Shape circle = new Shape(12);
        System.out.println(circle.getShapeDetails());
        Shape square = new Shape(4,15);
        System.out.println(square.getShapeDetails());
        Shape rectangle = new Shape(4, 12.3,8.9);
        System.out.println(rectangle.getShapeDetails());
        Shape triangle = new Shape(3,3.4,6.2,12.1);
        System.out.println(triangle.getShapeDetails());

    }
}
