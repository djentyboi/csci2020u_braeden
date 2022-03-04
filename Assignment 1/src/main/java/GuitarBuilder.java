import Options.Option;

public class GuitarBuilder {

    public Guitar BuildGuitar(Guitar guitar, Option option){

        guitar.AddOption(option);

        return guitar;
    }
}
