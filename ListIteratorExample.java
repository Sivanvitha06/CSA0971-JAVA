import java.util.ArrayList;
import java.util.ListIterator;

class ListIteratorExample {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("C");
        list.add("A");
        list.add("E");
        list.add("B");
        list.add("D");
        list.add("F");

        // Append "+" to each element
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            iterator.set(element + "+");
        }

        // Print in reverse order
        System.out.println("List in reverse order:");
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }
}