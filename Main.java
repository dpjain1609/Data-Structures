public class Main {

    public static void main(String[] args) {
        ArrayQueue<Integer> arrayQueue = new ArrayQueue<>();
        arrayQueue.enqueue(5);
        System.out.println(arrayQueue.peek());
        System.out.println("Everything works fine, so far");
    }

}
