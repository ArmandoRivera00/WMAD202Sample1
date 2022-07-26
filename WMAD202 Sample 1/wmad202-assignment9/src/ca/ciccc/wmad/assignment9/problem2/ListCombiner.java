package ca.ciccc.wmad.assignment9.problem2;

public class ListCombiner {
    @FunctionalInterface
    public interface ListCombiner<T,U>{

        //Combines two list to new list
        T combiner(T firstList,U secondList);
    }
}
