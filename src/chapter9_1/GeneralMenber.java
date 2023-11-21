package chapter9_1;

import javax.sound.midi.MetaMessage;

public class GeneralMenber extends Menber {

    public GeneralMenber(long id, String neme) {
        super(id, neme);
    }

    @Override
    public int fee() {
        return 0;
    }
}
