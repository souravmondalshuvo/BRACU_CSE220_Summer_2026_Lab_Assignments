class LinkedList{
    Node head;
    public void append(Integer val){
        // TODO: Insert node at the end

        Node newNode = new Node(val);
        if (head == null) {          // empty list -> new node becomes head
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) { // walk to the last node
            current = current.next;
        }
        current.next = newNode;
    }
    public void printList(){
        // TODO: Print all elements from head

         Node current = head;
        while (current != null) {
            System.out.print(current.elem);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }
    public void prepend(Integer val){
        // TODO: Insert node at the beginning

        head = new Node(val, head);
    }
    public Node nodeAt(int indx){
        // TODO: Return node at given index (0-based)

        if (indx < 0) return null;
        Node current = head;
        int count = 0;
        while (current != null) {
            if (count == indx) return current;
            current = current.next;
            count++;
        }
        return null;
    }
    public void removeFirst(){
        // TODO: Remove the first node

        if (head == null){
            return;
        }
        
        head = head.next;
    }
    public void removeLast(){
        // TODO: Remove the last node

        if(head == null) {
            return;
        }

        if(head.next == null) {
            head = null;
            return;
        }

        Node current = head;

        while (current.next.next != null) {
            current = current.next;
        }
        
        current.next = null;
    }
}