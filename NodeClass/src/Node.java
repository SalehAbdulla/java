public class Node {
    private Node nextNode;
    private int data;

    // 0 arg constructor, 1 arg constructor and 2 arg constructor
    private Node(){}

    private Node(int val) {
        this.data = val;
    }

    private Node(int val, Node next){
        this.data = val;
        this.nextNode = next;
    }

    public Node getNextNode(){
        return nextNode;
    }

    public int getData(){
        return data;
    }

    public void setNextNode(Node nextNode){
        this.nextNode = nextNode;
    }

    public void setData(int data){
        this.data = data;
    }




}
