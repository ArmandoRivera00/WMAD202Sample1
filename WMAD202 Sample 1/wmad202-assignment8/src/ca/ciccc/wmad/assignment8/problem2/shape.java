package ca.ciccc.wmad.assignment8.problem2;

public abstract class Shape {
    public ApplicationDriver.ShapeType shapes;
    int[] sides;

    public Shape(ApplicationDriver.ShapeType shapes, int[] sides) {
        this.shapes = shapes;
        this.sides = sides;

    }

    public abstract float perimeter();

    public abstract float area();


}