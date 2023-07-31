public class QueueArray<T> {

    private final Object[] arrayQueue;
    private final int arraySize;
    private int nItems;
    private final int front;
    private int rear;

    public QueueArray(int size) {
        this.arraySize = size;
        arrayQueue = new Object[this.arraySize];
        nItems = 0;
        front = 0;
        rear = -1;
    }

    public void enqueue(Object value) {

        if (isFull()) {
            throw new RuntimeException("Queue Array is full.");
        }

        rear++;
        arrayQueue[rear] = value;
        nItems++;
    }

    public void dequeue() {

        if (isEmpty()) {

            throw new RuntimeException("Queue Array is empty.");

        }

        T firstValue = (T) arrayQueue[front];

        for (int i = 1; i < rear + 1; i++) {

            T temp = (T) arrayQueue[i];
            arrayQueue[i - 1] = temp;
        }

        arrayQueue[rear] = null;

        nItems--;
        rear--;

        System.out.println("Dequeued value is: " + firstValue);

    }

    public void display() {

        System.out.println("Values in Queue Array:");

        for (int i = 0; i < arrayQueue.length; i++) {

            System.out.println(String.format("Value [%d] = %d", (i + 1), arrayQueue[i]));

        }

    }

    private boolean isEmpty() {

        return (nItems == 0);

    }

    private boolean isFull() {

        return (nItems == arraySize);

    }

}
