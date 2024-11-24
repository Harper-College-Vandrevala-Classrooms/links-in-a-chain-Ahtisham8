class ChainLink {
    
    Node start = null;
    Node end = null;
    int size = 0;

    public ChainLink() {
        start = null;
        end = null;
        size = 0;
    }

    public void insertAtEnd(String data) {
        Node nptr = new Node(data, null);
        if (start == null) {
            start = nptr;
            end = nptr;
        } else {
            end.setLink(nptr);
            end = nptr;
        }
        size++;
    }

    public void searchElementByPosition(int position) {
        if (position == 1) {
            System.out.println("Element at " + position + " is : " + start.getData());
            return;
        }

        if (position == size) {
            System.out.println("Element at " + position + " is : " + end.getData());
            return;
        }

        Node ptr = start;
        for (int i = 1; i < size; i++) {
            if (i == position) {
                System.out.println("Element at " + position + " is : " + ptr.getData());
                break;
            }
            ptr = ptr.getLink();
        }
    }

    public static void main(String[] args) 
    {
        ChainLink list = new ChainLink();
        list.insertAtEnd("Red");
        list.insertAtEnd("blue");
        list.insertAtEnd("green");

        list.searchElementByPosition(2);
        list.searchElementByPosition(3);
    }
}