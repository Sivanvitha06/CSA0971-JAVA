import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
class GenericSorter<T extends Comparable<T>> {

    private T[] array;

    public GenericSorter(T[] array) {
        this.array = array;
    }

    public void sort() {
        Arrays.sort(array);
    }

    public void printArray() {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {4, 2, 9, 1, 5};
        GenericSorter<Integer> intSorter = new GenericSorter<>(intArray);
        intSorter.sort();
        intSorter.printArray();

        String[] strArray = {"Banana", "Apple", "Cherry"};
        GenericSorter<String> strSorter = new GenericSorter<>(strArray);
        strSorter.sort();
        strSorter.printArray();
    }
}