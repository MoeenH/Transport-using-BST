public class Node {
    Node next;
    String Details;

    Node(String details) {
        this.Details = details;
        this.next = null;
    }

}

class linklist{
    Node head;

    linklist() {
        head = null;
    }

    public String fileFormat() {
        Node temp = head;
        StringBuilder str = new StringBuilder(" ");
        while (temp != null) {
            str.append(temp.Details).append(" @ ");
            temp = temp.next;
        }
        return str.toString();
    }

    public void insert(String details) {
        Node newNode = new Node(details);
        Node current = head;

        if(head == null){
            head = newNode;
            return;
        }

        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }

    public Node find(String details){
        Node current = head;
        while(current != null) {
            if( current.Details != null && current.Details.equals(details)){
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void delete(String data){
        if(head.Details != null && head.Details.equals(data)){
            head = head.next;
        }

        Node current = head.next;
        Node prev = head;

        while(current != null){
            if(current.Details != null && current.Details.equals(data)){
                prev.next = current.next;
            }
            prev = current;
            current = current.next;
        }
    }

    public int length() {
        Node temp = head;
        int a = 0;
        while (temp != null) {
            temp = temp.next;
            a++;
        }
        return a;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.Details + " ");
            System.out.println();
            temp = temp.next;
        }
    }
    @Override
    public String toString() {
        String S = "";
        Node temp = this.head;
        while(temp!=null){
            S = S + " " + temp.Details;
            temp = temp.next;
        }
        return S;
    }
}