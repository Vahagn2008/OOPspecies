package room.model;

public abstract class Guitarist extends Musician{


    @Override
    public void readNotes() {
        System.out.println("Read Guitar Notes");
    }
}
