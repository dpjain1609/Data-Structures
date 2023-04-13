public class ArrayStack<T> {

    //default constructor
    public ArrayStack(){
        this.length = 0;
        this.array = (T[]) new Object[length];
    }

    //copy constructor
    public ArrayStack(ArrayStack<T> stack){
        this.length = stack.length;
        this.array = stack.array;
    }

    //insert an element to the top of the stack
    public void push(T element){
        T newArray[] = (T[]) new Object[length+1];

        for(int i=0; i<(this.length); i++){
            newArray[i] = this.array[i];
        }

        newArray[length] = element;

        length++;
        this.array = newArray;
    }

    //remove the element on the top of the stack
    public T pop(){

        if(length == 0){
            throw new IndexOutOfBoundsException("Stack is empty");
        }
        length--;
        return this.array[length];
    }

    //return the element on the top of the stack
    public T peek(){
        if(length == 0){
            throw new IndexOutOfBoundsException("Stack is empty");
        }

        return this.array[length - 1];
    }

    //clear the stack
    public void clear(){
        this.length = 0;
        this.array = (T[]) new Object[length];
    }

    //check to see if the stack is empty
    public boolean isEmpty(){
        if(this.length == 0)
            return true;

        return false;
    }

    private T array[];
    private int length;

}
