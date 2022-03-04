package Options.Bridges;

import Options.Option;

public class HipshotHardtail implements Option {

    @Override
    public String name() {
        return "Hipshot Hardtail";
    }

    @Override
    public int price() {
        return 200;
    }
}
