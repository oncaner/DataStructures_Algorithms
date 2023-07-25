public class Main {
    public static void main(String[] args) {

        StackImpl<Integer> stack = new StackImpl<>(5);

        //stack.pop(); // Runtime Error: Stack is empty !!
        //stack.peek(); // Runtime Error: Stack is empty !!

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        //stack.push(6); // Runtime Error: Stack Array is full !!

        System.out.println(stack.peek()); // Returns: 5
        System.out.println(stack.pop()); // 5 is deleted and returns 5
        System.out.println(stack.peek()); // Returns: 4

        stack.push(5);

        System.out.println("---------    LIFO -> LAST IN FIRST OUT    ---------");

        while(!StackImpl.isEmpty()){

            Integer value = stack.pop();
            System.out.println(value); // LIFO -> Last In First Out
        }

    }
}