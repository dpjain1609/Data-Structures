

public class LinkedList<T>{

    private LLNode<T> head;
    private int length;

    public LinkedList(){
        this.head = null;
        this.length = -1;
    }

    public LinkedList(LLNode head){
        this.head = head;
        this.length = 0;
    }

    public void addNode(LLNode<T> node){

    }

    public void addNode(LLNode<T> LLNode, int index){

        //if index is greater than or equal to the length of the argument, we go out of bounds
        if(index >= this.length){
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        //run a loop till you reach the end of the linked list
        //for each loop, change the head pointer to the next node
        //once you reach the required index, link the node to the current head and the node after
        for(int i=0; i<index; i++){

            if(i == (index - 1)) {
                LLNode.setNext(head.getNext());
                head.setNext(LLNode);
            }

            head = head.getNext();
        }
    }

    public boolean deleteNode(int index){
        //if index is larger than the length of the linked list, throw an index out of bounds exception
        if(index >= this.length)
            throw new IndexOutOfBoundsException("Index out of bounds");

        //if index is negative, throw an illegal state exception
        if(index < 0)
            throw new IllegalStateException("Index can't be less than 0");

        //if the index is valid, find the node first
        //once
        for(int i=0; i<index; i++){

            if(i == (index-2)){

            }
            head = head.getNext();
        }

        return false;
    }

    public boolean deleteNode(LLNode<T> LLNode){

        //if(this.)

        return false;
    }

    public int findNode(LLNode<T> LLNode){

        for(int i=0; i<length; i++){
            //if(LLNode.getData() == )
        }

        return -1;
    }

    public LLNode getHead(){
        return this.head;
    }

    public void setHead(LLNode<T> head) {
        this.head = head;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
