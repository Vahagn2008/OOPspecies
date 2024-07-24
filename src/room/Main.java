package room;

import room.model.BassGuitarist;
import room.model.ClassicalGuitarist;
import room.model.Musician;
import room.model.Pianist;

public class Main {

    public static void main(String[] args) {

//        Pianist pianist = new Pianist();
//        pianist.play();
//
//        BassGuitarist bg = new BassGuitarist();
//        bg.play();
//
//        ClassicalGuitarist cg = new ClassicalGuitarist();
//        cg.play();


        Musician musician = new BassGuitarist();
        musician.play();

        musician = new ClassicalGuitarist();
        musician.play();

        musician = new Pianist();
        musician.play();

        ClassicalGuitarist cg = new ClassicalGuitarist();
        BassGuitarist bg = new BassGuitarist();

        function(cg);
        function(bg);

    }

    public static void function(Musician musician) {
        musician.play();
        if (musician instanceof ClassicalGuitarist) {
            ClassicalGuitarist cg = (ClassicalGuitarist) musician;
            cg.playMozart();
        }
    }
}
