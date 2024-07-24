package room.model;

public class ClassicalGuitarist extends Guitarist {
    @Override
    public void play() {
        System.out.println("Playing Classical Guitar");
    }

    public void playMozart() {
        System.out.println("Playing Mozart");
    }
}
