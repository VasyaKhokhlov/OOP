package HW4_task4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class DataContainer<T> {
    private List<T> data;

    public DataContainer(){
        data = new ArrayList<>();
    }

    public void add(T element){
        data.add(element);
    }

    public T get(int index){
        return this.data.get(index);
    }

    public void sort(Comparator<T> comparator){
        data.sort(comparator);
    }

    public void print(){
        for (T element : data){
            System.out.println(element);
        }
    }
}