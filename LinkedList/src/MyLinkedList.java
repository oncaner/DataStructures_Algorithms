public class MyLinkedList<T> {

    Node<T> headNode;

    public MyLinkedList() {

        this.headNode = null;

    }

    public void addFirst(T value) {

        Node<T> newNode = new Node<>(value, null);

        if (headNode == null) {
            headNode = newNode;
        } else {
            newNode.next = headNode;
            headNode = newNode;
        }
    }

    public void addLast(T value) {
        Node<T> newNode = new Node<>(value, null);

        if (headNode == null) {
            addFirst(newNode.value);
        } else {
            Node<T> currentNode = headNode;

            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }

            currentNode.next = newNode;
        }

    }

    public void deleteFirst() {
        headNode = headNode.next;
    }

    public void display() {

        Node<T> currentNode = headNode;

        while (currentNode != null) {

            System.out.print(currentNode.value + " -> ");
            currentNode = currentNode.next;

        }

        System.out.print("null");

    }

}
