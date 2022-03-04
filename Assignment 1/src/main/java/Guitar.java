import Options.*;
import java.util.ArrayList;
import java.util.List;

public class Guitar {

    //Default guitar colour
    public String colour = "None Selected";

    //Private list of options for guitar
    private List<Option> options = new ArrayList<Option>();

    //Function to add the option to the list of options
    public void AddOption(Option option){
        options.add(option);
    }

    //Sifts through list of options and returns the sum of all option prices
    public int getCost(){
        int cost = 0;

        for (Option option : options){
            cost += option.price();
        }
        return cost;
    }

    //Displays the options to the user
    public void showOptions(){
        System.out.println("Base Price: $2000");
        System.out.println(colour + ": Free");
        for(Option option : options){
            System.out.println(option.name() + ": $" + option.price());
        }
    }
}
