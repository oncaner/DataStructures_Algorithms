import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        MyLinkedList<String> linkedList = new MyLinkedList<>();

        linkedList.addFirst("Value-1");
        linkedList.addFirst("Value-2");
        linkedList.addFirst("Value-3");
        linkedList.display();

        System.out.println("\n*********************************");
        linkedList.deleteFirst();
        linkedList.deleteFirst();
        linkedList.display();

        System.out.println("\n*********************************");
        linkedList.addLast("Value-2");
        linkedList.addLast("Value-3");
        linkedList.addLast("Value-4");
        linkedList.display();

    }
}