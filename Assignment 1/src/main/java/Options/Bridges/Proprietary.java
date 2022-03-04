package Options.Bridges;

import Options.Option;

public class Proprietary implements Option {

    @Override
    public String name() {
        return "Proprietary Bridge";
    }

    @Override
    public int price() {
        return 0;
    }
}
