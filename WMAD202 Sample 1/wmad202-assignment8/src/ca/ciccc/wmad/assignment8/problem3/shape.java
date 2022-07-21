package ca.ciccc.wmad.assignment8.problem3;

import ca.ciccc.wmad.assignment8.problem3.applicationdriver
public abstract class shape {
    public applicationdriver.ShapeType shapes;
    int[] sides;

    public Shape(applicationdriver.ShapeType shapes, int[] sides) {
        this.shapes = shapes;
        this.sides = sides;
    }

    public abstract float perimeter();
    public abstract float area();

}
