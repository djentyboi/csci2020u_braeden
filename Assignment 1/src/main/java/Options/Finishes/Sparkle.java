package Options.Finishes;

import Options.Option;

public class Sparkle implements Option {

    @Override
    public String name() {
        return "Sparkle";
    }

    @Override
    public int price() {
        return 300;
    }
}
