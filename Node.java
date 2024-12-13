class Node<T> {

    Node link = null;
    T data;

    public Node() {
        link = null;
    }

    public Node(T data, Node link) {
        this.data = data;
        this.link = null;
    }

    public Node getLink() {
        return link;
    }

    public void setLink(Node link) {
        this.link = link;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}