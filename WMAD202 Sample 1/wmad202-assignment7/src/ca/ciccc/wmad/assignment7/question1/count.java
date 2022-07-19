package ca.ciccc.wmad.assignment7.question1;

import java.util.ArrayList;

public class Count<E extends IHasProperty> {
    private ArrayList<E> objects;

    public Count(ArrayList<E> objects){
        this.objects=objects;
    }

    public int countNumberOfElementsWithSpecificProperty() {
        int count = 0;
        for (E object : this.objects)
            if (object.HasProperty()) {
                count++;
            }
        return count;
    }



}