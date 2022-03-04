import Options.*;
import java.util.ArrayList;
import java.util.List;

public class Guitar {

    public String colour = "None Selected";

    private List<Option> options = new ArrayList<Option>();

    public void AddOption(Option option){
        options.add(option);
    }

    public int getCost(){
        int cost = 0;

        for (Option option : options){
            cost += option.price();
        }
        return cost;
    }

    public void showOptions(){
        System.out.println("Base Price: $2000");
        System.out.println(colour + ": Free");
        for(Option option : options){
            System.out.println(option.name() + ": $" + option.price());
        }
    }
}
