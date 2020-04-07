import java.lang.reflect.Array;
import java.util.*;

public class Main {

    private static void sortDescArrayList(ArrayList<Integer> lst) {
        lst.sort((left, right) -> (right - left));
    }

    private static int sumOfElements(List<Integer> mas) {
        int sum = 0;
        for (Integer elem : mas) {
            sum += elem;
        }
        return sum;
    }

    private static boolean hasValue(Map<String, String> map, String value) {
        for (String elem : map.values()) {
            if (elem.equals(value))
                return true;
        }
        return false;
    }

    private static void addToHeadOfLinkedList(LinkedList<Integer> lst, Integer elem) {
        lst.add(0, elem);
    }

    private static void pushToLinkedList(LinkedList<Integer> lst, Integer elem) {
        lst.add(elem);
    }

    private static int findElementInArrayList(ArrayList<Integer> lst, Integer elem) {
        return lst.indexOf(elem);  // -1 if element not in list or position of element
    }

    public static void main(String[] args) {
	    // test LinkedList functions
        LinkedList<Integer> linkedList = new LinkedList<>();
        pushToLinkedList(linkedList, 5);
        pushToLinkedList(linkedList, 12);
        pushToLinkedList(linkedList, 0);
        addToHeadOfLinkedList(linkedList, -4);
        addToHeadOfLinkedList(linkedList, 9);
        System.out.println("Source LinkedList: " + linkedList);
        System.out.println("Sum of elements: " + sumOfElements(linkedList));

        // test ArrayList functions
        ArrayList<Integer> arrayList = new ArrayList<>(linkedList);
        arrayList.add(-1);
        System.out.println("Source ArrayList: " + arrayList);
        System.out.println("Position of 0: " + findElementInArrayList(arrayList, 0));
        System.out.println("Position of 10: " + findElementInArrayList(arrayList, 10));
        sortDescArrayList(arrayList);
        System.out.println("Sorted DESC ArrayList: " + arrayList);
        System.out.println("Sum of elements: " + sumOfElements(arrayList));

        // test Map function
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        System.out.println("Source Map: " + map);
        System.out.println("Has 'value2': " + hasValue(map, "value2"));
        System.out.println("Has 'value3': " + hasValue(map, "value3"));

        // test PhoneBook
        PhoneBook pb = new PhoneBook();
        pb.add("Sberbank", "88005553535");
        pb.add("Alexeev", "8917*****74");
        pb.add("SSU", "88001112345");
        System.out.println();
        System.out.println(pb);
        pb.remove("Alexeev");
        pb.changeInfo("SSU", "SSU the best");
        pb.changeNumber("Sberbank", "81234567890");
        System.out.println("After changes:");
        System.out.println(pb);
    }
}
