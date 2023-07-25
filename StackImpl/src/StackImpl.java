public class StackImpl<T> {

    private static int maxSize;
    private Object[] stackArray;
    private static int index;

    public StackImpl(int size) {

        this.maxSize = size;
        this.stackArray = new Object[this.maxSize];
        this.index = -1;
    }

    public void push(Object newItem) {

        if (isFull()) {
            throw new RuntimeException("Stack Array is full !!");
        }

        index += 1;
        stackArray[index] = newItem;

    }

    public T pop() {

        if (isEmpty()) {
            throw new RuntimeException("Stack Array is empty !!");
        }

        T currentItem = (T) stackArray[index];

        index -= 1;

        return currentItem;

    }

    public T peek() {

        if (isEmpty()) {
            throw new RuntimeException("Stack Array is empty !!");
        }

        return (T) stackArray[index];

    }

    public static boolean isEmpty() {

        return index == -1;

    }

    public static boolean isFull() {

        return index == maxSize - 1;

    }

}










