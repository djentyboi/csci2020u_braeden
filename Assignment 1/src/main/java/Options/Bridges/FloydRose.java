package Options.Bridges;

import Options.Option;

public class FloydRose implements Option {

    @Override
    public String name() {
        return "Floyd-Rose";
    }

    @Override
    public int price() {
        return 300;
    }
}
