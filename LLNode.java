//basic node class to implement data structures

public class LLNode<T> {

    public LLNode(){
        this.next = null;
    }

    public LLNode(T data){
        this.data = data;
        this.next = null;
    }

    public void setData(T data){
        this.data = data;
    }

    public T getData(){
        return this.data;
    }

    public void setNext(LLNode<T> next) {
        this.next = next;
    }

    public LLNode getNext(){
        return this.next;
    }

    private T data;
    private LLNode<T> next;

}
