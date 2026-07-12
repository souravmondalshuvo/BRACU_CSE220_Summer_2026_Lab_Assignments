// NO NEED THIS SUBMIT THIS CLASS
public class WRM {
    Patient dh;

    //The constructor is already created for you
    public WRM() {
        dh = new Patient(null, null, null, null, null, null);
        dh.next = dh;
        dh.prev = dh;
    }

    public void registerPatient(int id, String name, int age, String bloodgroup) {
        // To Do

        Patient back = dh.prev;
        Patient joined = new Patient(id, name, age, bloodgroup, dh, back);

        back.next = joined;
        dh.prev = joined;
    }

    public void servePatient() {
        // To do

        if(dh.next == dh) {
            System.out.println("No patient is waiting to be served.");
            return;
        }

        Patient front = dh.next;
        System.out.println("Serving patient: " + front.id);

        dh.next = front.next;
        front.next.prev = dh;
    }

    public void showAllPatient() {
        // To Do

        if(dh.next == dh) {
            System.out.println("The waiting room is empty.");
            return;
        }

        Patient walk = dh.next;

        while(walk != dh) {
            System.out.println(walk.id);
            walk = walk.next;
        }
    }

    public Boolean canDoctorGoHome() {
        // To Do
        return null; // Delete this line once you're ready
    }

    public void cancelAll() {
        // To Do
    }


    public void reverseTheLine() {
        // To Do
    }

}
