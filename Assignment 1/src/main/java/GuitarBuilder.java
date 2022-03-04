import Options.Option;

public class GuitarBuilder {

    //Builder adds an option to the guitar
    public Guitar BuildGuitar(Guitar guitar, Option option){

        guitar.AddOption(option);

        return guitar;
    }
}
