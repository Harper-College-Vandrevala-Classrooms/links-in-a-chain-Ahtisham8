class Node {

    Node link = null;
    String data = "";

    public Node() {
        link = null;
        data = "";
    }

    public Node(String data, Node link) {
        this.data = data;
        this.link = null;
    }

    public Node getLink() {
        return link;
    }

    public void setLink(Node link) {
        this.link = link;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

}