package Task2;
//Write a generic method search that takes an array and a value of the array's type.
// It should return the index of the first occurrence of the value in the array,
// or -1 if the value is not found.

import java.util.Comparator;

//Write a generic method findMax that takes an array of
// comparable elements and returns the maximum element in the array.
// Test it with arrays of different data types.
public class Main {
    public static void main(String[] args) {
      String[] strings = { " i ", "created", "this", "array", "of", "strings"};
      Integer[] integers = { 1, 4, 6, 8, 11, 30};

        System.out.println(search(strings, "this"));
        System.out.println(search(integers, 8));
        System.out.println(findMax(integers));
        System.out.println(findMax(strings));
    }
    public static<T> int search(T[] array, T values){
        for (int i = 0; i < array.length; i++){
            if(values.equals(array[i])){
                return i;
            }
        }
        return -1;
    }
    public static<T extends Comparable> T findMax(T[]array){
        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            if(max.compareTo(array[i])<0){
                max = array[i];
            }

        }
        return max;

    }
}
