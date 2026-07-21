/*You will have to complete the FruitNode Contrustor first
 then within this class you only have to complete two methods
 hashFunction() and insert()
 the rest of the metods are already written
 DO NOT TOUCH any other methods or codes*/
public class HashTable {

    //ht[] :: is the HashTable array that stores the FruitNode objects
    private FruitNode[] ht;

    //Constructor that initializes the HashTable array
	//DO NOT change this Constructor
    public HashTable(int size){
        this.ht = new FruitNode[size];
    }
    
    //This method basically prints the HashTable
    //DO NOT change this method
    public void show(){
        for(int i=0; i<ht.length; i++){
            System.out.print( i+" " );
            FruitNode n = ht[i];
            while (n!=null){
                System.out.print("('"+n.fruit[0]+"', "+n.fruit[1]+") --> ");
                n = n.next;
            }
            System.out.println();
        }
    }

    //you need to COMPLETE this method
    private int hashFunction( String key ){
        // TO DO 

        int length = key.length();
        int sum = 0;

        if(length % 2 == 0) {
            for(int i = 0; i < length; i += 2) {
                sum += (int) key.charAt(i);
            }
        } else {
            for(int i = 1; i < length; i += 2) {
                sum += (int) key.charAt(i);
            }
        }

        return sum % ht.length;

        // return -1; //remove this line
    }

    //you need to COMPLETE this method
    //The insert() method will create a FruitNode using name(Key) & price(value)
	//then inserts it in the proper hashed index
    //If collision occurs resolve using the steps explained in the question
    public void insert(String key, Integer value){
        // TO DO

        int index = hashFunction(key);

        FruitNode current = ht[index];

        while(current != null) {
            if(current.fruit[0].equals(key)) {
                current.fruit[1] = value;
                return;
            }

            current = current.next;
        }

        FruitNode new_node = new FruitNode(key, value);

        if(ht[index] == null) {
            ht[index] = new_node;
            return;
        }

        if(value > (Integer) ht[index].fruit[1]) {
            new_node.next = ht[index];
            ht[index] = new_node;
            return;
        }

        FruitNode previous = ht[index];

        while(previous.next != null && (Integer) previous.next.fruit[1] >= value) {
            previous = previous.next;
        }

        new_node.next = previous.next;
        previous.next = new_node;
    }

}
