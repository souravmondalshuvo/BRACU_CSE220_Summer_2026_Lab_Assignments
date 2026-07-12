// LabTask2: Word Decoder
public class LabTask2 {
    
    // No need to submit this task
    public static Node wordDecoder( Node head ){
        
        //You're suppose to create a new Dummy headed Singly Linked List in this method
        //Dummy head is basically a head Node where the elem is null
        // Node dHead = new Node(null, null); here the dHead is a Dummy Head

        //TO DO

        Node dHead = new Node(null, null);

        int length = 0;
        Node counter = head;

        while(counter != null) {
            length++;
            counter = counter.next;
        }

        if(length == 0) {
            return dHead;
        }

        int step = 13 % length;

        if(step == 0) {
            return dHead;
        }

        Node walk = head;
        int pos = 0;

        while(walk != null) {
            if(pos != 0 && pos % step == 0) {
                Node fresh = new Node(walk.elem, dHead.next);
                dHead.next = fresh;
            }

            walk = walk.next;
            pos++;
        }

        //remove the following line when you're ready to return the new head
        // return null;
        return dHead;
    }

    //NOTE: if you find any issue with the driver code please inform AIB
    //DO NOT TOUCH THE DRIVER CODE BELOW
    public static void main(String[] args){
        System.out.println("==============Test Case 1=============");
        Node head = LinkedList.createList(new Character[]{'B', 'M', 'D', 'T', 'N', 'O', 'A', 'P', 'S', 'C'});
        System.out.print("Encoded Word: ");
        LinkedList.printLL(head);
        System.out.println("\nExpected output: null -> C -> A -> T");
        Node result = wordDecoder(head);
        System.out.println( "Your output: ");
        LinkedList.printLL(result); //This should print null -> C -> A -> T
        System.out.println();
        System.out.println("==============Test Case 2=============");
        head = LinkedList.createList(new Character[]{'Z', 'O', 'T', 'N', 'X'});
        System.out.print("Encoded Word: ");
        LinkedList.printLL(head);
        System.out.println("\nExpected output: null -> N");
        result = wordDecoder(head);
        System.out.println( "Your output: ");
        LinkedList.printLL(result); //This should print null -> N
        System.out.println();
    }
}
