package Options.Finishes;

import Options.Option;

public class Gloss implements Option {

    @Override
    public String name() {
        return "Gloss";
    }

    @Override
    public int price() {
        return 50;
    }
}
