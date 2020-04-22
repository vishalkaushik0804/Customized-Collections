package customcollections;

public class CustomCollectionApp {

    public static void main(String[] args) {

        // CustomArrayList Class Implementation
        // Creation of CustomArrayList Object using Default Constructor
        CustomArrayList<String> customArray_list = new CustomArrayList<>();

        // CustomArrayList addMethod() Method
        customArray_list.addMethod("Introduction");
        customArray_list.addMethod("To");
        customArray_list.addMethod("CustomCollections");

        // Display Created CustomArrayList
        System.out.println("Created CustomArrayList Is: " + customArray_list);

        // CustomArrayList size() Method
        System.out.println("Size of CustomArrayList Is: " + customArray_list.size());

        // CustomArrayList isEmpty() Method
        System.out.println("Is CustomArrayList Empty: " + customArray_list.isEmpty());

        // CustomArrayList add(int index, Object element) Method
        customArray_list.addMethod(2, "CustomArrayList");
        customArray_list.addMethod(3, "And");
        System.out.println("CustomArrayList After add(int index, Object element) Method: " + customArray_list);

        //CustomArraylist remove(int index) Method
        int in1 = 4;
        customArray_list.remove(in1);
        System.out.println("CustomArrayList after removing element at index " + in1 + " is: " + customArray_list);

        //CustomArraylist remove(Object obj) Method
        customArray_list.remove("And");
        System.out.println("CustomArrayList after removing element \"And\" is: " + customArray_list);

        // CustomArrayList get() Method
        int index1 = 3;
        System.out.println("Element at index " + index1 + " in CustomArrayList is: " + customArray_list.get(index1 - 1));

        // CustomArrayList contains() Method
        System.out.println("CustomArrayList contains \"Custom\": " + customArray_list.contains("Custom"));

        // CustomLinkedList Class Implementation
        System.out.println("\n");
        CustomLinkedList<Integer> customLinked_list = new CustomLinkedList<>();

        // CustomArrayList addMethod() Method
        customLinked_list.addMethod(12);
        customLinked_list.addMethod(14);
        customLinked_list.addMethod(16);
        customLinked_list.addMethod(18);
        customLinked_list.addMethod(20);

        // Display Created CustomLinkedList
        System.out.println("Created CustomLinkedList Is: " + customLinked_list);

        // CustomLinkedList size() Method
        System.out.println("Size of CustomLinkedList Is: " + customLinked_list.size());

        // CustomLinkedList isEmpty() Method
        System.out.println("Is CustomLinkedList Empty: " + customLinked_list.isEmpty());

        // CustomLinkedList add(int index, Object element) Method
        customLinked_list.addmethod(1, 13);
        customLinked_list.addmethod(3, 15);
        System.out.println("CustomLinkedList After add(int index, Object element) Method: " + customLinked_list);

        //CustomLinkedList remove(int index) Method
        int in2 = 4;
        customLinked_list.remove(in1);
        System.out.println("CustomLinkedList after removing element at index " + in2 + " is: " + customLinked_list);

        // CustomLinkedList get() Method
        int index2 = 3;
        System.out.println("Element at index " + index2 + " in CustomLinkedList is: " + customLinked_list.get(index2 - 1));

        // CustomLinkedList getFirst() Method
        System.out.println("First Element of the CustomLinkedList Is: " + customLinked_list.getFirst());

        // CustomLinkedList removeLast() Method
        customLinked_list.removeLast();
        System.out.println("CustomLinkedList after removeLast operation: " + customLinked_list);

        // CustomLinkedList peek() Method
        int peek_value = customLinked_list.peek();
        System.out.println("Peek Value of the CustomLinkedList Is: " + peek_value);

        // CustomLinkedList peekLast() Method
        int peek_value_last = customLinked_list.peekLast();
        System.out.println("Peek Value from the end of the CustomLinkedList Is: " + peek_value_last);

        // CustomLinkedList peekFirst() Method
        int peek_value_first = customLinked_list.peekFirst();
        System.out.println("Peek Value of the CustomLinkedList Is: " + peek_value_first);

        // CustomLinkedList getFirst() Method
        System.out.println("First Element of the CustomLinkedList Is: " + customLinked_list.getFirst());

        // CustomLinkedList getLast() Method
        System.out.println("Last Element of the CustomLinkedList Is: " + customLinked_list.getLast());
        
        // CustomLinkedList contains() Method
        System.out.println("CustomLinkedList contains 18: " + customLinked_list.contains(18));

    }
}
