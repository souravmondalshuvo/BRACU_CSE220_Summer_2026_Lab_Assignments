//YOU NEED TO RUN THIS CLASS TO TEST OUT THE METHODS
package AssignmentTask2;

public class HotPotato{

    public static String hotPotato(String[] players, int k) {
        // TODO: Implement the hot potato logic here

        LinkedListQueue q = new LinkedListQueue();

        for(int i = 0; i < players.length; i++) {
            q.enqueue(players[i]);
        }

        int baaki_players = players.length;

        while(baaki_players > 1) {
            for(int i = 0; i < k; i++) {
                q.enqueue(q.dequeue());
            }

            String baad = (String) q.dequeue();
            System.out.println(baad + " elimminated");
            baaki_players--;
        }

        return (String) q.dequeue();
        // return null;
    }

    public static void main(String[] args) {

        System.out.println(".......Test Case #1.......");
        String[] players1 = {"Ali", "Ben", "Cia", "Dan", "Eli", "Faye"};
        int k1 = 3;
        String winner1 = hotPotato(players1, k1);
        System.out.println("Winner: " + winner1);

        System.out.println(".......Test Case #2.......");
        String[] players2 = {"Ali", "Rafi", "Sara", "Nina"};
        int k2 = 2;
        String winner2 = hotPotato(players2, k2);
        System.out.println("Winner: " + winner2);
    }
}
