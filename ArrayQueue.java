import java.lang.reflect.Array;

public class ArrayQueue<T> {

    public ArrayQueue(){
    }

    public ArrayQueue(ArrayQueue<T> queue){
        this.array = queue.array;
        this.size = queue.size;
    }

    public void enqueue(T element){
        @SuppressWarnings("unchecked")
        T[] newArray = (T[])Array.newInstance(element.getClass(), size + 1);
        for(int i=0; i < this.size; i++){
            newArray[i] = array[i];
        }

        newArray[this.size] = element;
        size++;

        this.array = newArray;
    }

    public T dequeue(){
        T element = this.array[0];

        @SuppressWarnings("unchecked")
        T[] newArray = (T[])Array.newInstance(element.getClass(), size - 1);
        for(int i=0; i < this.size - 1; i++){
            newArray[i] = array[i + 1];
        }

        size--;

        this.array = newArray;

        return element;
    }

    public int size(){
        return this.size;
    }

    public T peek(){
        return this.array[0];
    }

    public boolean isEmpty(){
        if(size == 0){
            return true;
        }
        return false;
    }

    private T[] array;
    private int size;

}
