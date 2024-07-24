package room.model;

public class Pianist extends Musician{
    @Override
    public void play() {
        System.out.println("Playing Piano");
    }

    @Override
    public void readNotes() {
        System.out.println("Read Piano Notes");
    }
}
