class Node {
    int data;
    Node link;
    public Node(){
        link = null;
        data = 0;
    }
    public Node(Node n, int d){
        link = n;
        data = d;
    }
    public void setLink(Node n){
        link = n;
    }
    public void setData(int d){
        data = d;
    }
    public Node next(){
        return (link);
    }
    public int getData(){
        return (data);
    }
}
