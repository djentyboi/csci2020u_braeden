import Options.Option;
import Options.Woods.Fretboard.*;
import Options.Woods.Neck.*;
import Options.Woods.Body.*;
import Options.Finishes.*;
import Options.Bridges.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Input from the user
        int input;

        //Initializing the guitar builder and the guitar
        GuitarBuilder builder = new GuitarBuilder();
        Guitar guitar = new Guitar();

        //This is what passes to the guitar builder to add to the guitar. Initialized to prevent an error.
        Option option = new Proprietary();

        /* The following do-while loops are to ask the user to input an option.
        * if the user inputs an invalid option, an error message is shown to them, and they are asked to try again.
        * Once they have inputted a correct option, they guitar builder adds the option to the guitar.
        */
        do {
            System.out.println("Select A Body Colour (All free): \n1. Racing Green\n2. Dark Blue\n3. Shell Pink\n4. Seafoam Green\n5. White\n6. Black\n ... ");
            input = scanner.nextInt();
            if(input < 1 || input > 6){
                System.out.println("Invalid Input, Please Try Again.");
            }
        } while (input < 1 || input > 6);
        if(input == 1){
            guitar.colour = "Racing Green";
        }
        if(input == 2){
            guitar.colour = "Dark Blue";
        }
        if(input == 3){
            guitar.colour = "Shell Pink";
        }
        if(input == 4){
            guitar.colour = "Seafoam Green";
        }
        if(input == 5){
            guitar.colour = "White";
        }
        if(input == 6){
            guitar.colour = "Black";
        }

        do {
            System.out.println("Select A Finish: \n1. Satin(Free)\n2. Gloss($50)\n3. Rawtone($150)\n4. Sparkle($300)\n ... ");
            input = scanner.nextInt();
            if(input < 1 || input > 4){
                System.out.println("Invalid Input, Please Try Again.");
            }
        } while (input < 1 || input > 4);
        if(input == 1){
            option = new Satin();
        }
        if(input == 2){
            option = new Gloss();
        }
        if(input == 3){
            option = new Rawtone();
        }
        if(input == 4){
            option = new Sparkle();
        }
        guitar = builder.BuildGuitar(guitar, option);

        do {
            System.out.println("Select A Body Wood: \n1. Alder(Free)\n2. Basswood(Free)\n3. Maple($100)\n4. Koa($700)\n ... ");
            input = scanner.nextInt();
            if(input < 1 || input > 4){
                System.out.println("Invalid Input, Please Try Again.");
            }
        } while (input < 1 || input > 4);
        if (input == 1){
            option = new AlderBody();
        }
        if (input == 2){
            option = new BasswoodBody();
        }
        if (input == 3){
            option = new MapleBody();
        }
        if (input == 4){
            option = new KoaBody();
        }
        guitar = builder.BuildGuitar(guitar, option);

        do {
            System.out.println("Select A Neck Wood: \n1. Maple(Free)\n2. Ebony($100)\n3. Wenge($200)\n4. Roasted Maple($400)\n ... ");
            input = scanner.nextInt();
            if(input < 1 || input > 4){
                System.out.println("Invalid Input, Please Try Again.");
            }
        } while (input < 1 || input > 4);
        if (input == 1){
            option = new MapleNeck();
        }
        if (input == 2){
            option = new EbonyNeck();
        }
        if (input == 3){
            option = new WengeNeck();
        }
        if (input == 4){
            option = new RoastedMapleNeck();
        }
        guitar = builder.BuildGuitar(guitar, option);

        do {
            System.out.println("Select A Fretboard Wood: \n1. Maple(Free)\n2. Rosewood(Free)\n3. Ebony($75)\n4. Roasted Maple($200)\n ... ");
            input = scanner.nextInt();
            if(input < 1 || input > 4){
                System.out.println("Invalid Input, Please Try Again.");
            }
        } while (input < 1 || input > 4);
        if (input == 1){
            option = new MapleFretboard();
        }
        if (input == 2){
            option = new RosewoodFretboard();
        }
        if (input == 3){
            option = new EbonyFretboard();
        }
        if (input == 4){
            option = new RoastedMapleFretboard();
        }
        guitar = builder.BuildGuitar(guitar, option);

        do {
            System.out.println("Select A Bridge: \n1. Proprietary(Free)\n2. Gotoh 510($200)\n3. Hipshot Hardtail($200)\n4. Floyd-Rose($300)\n ... ");
            input = scanner.nextInt();
            if(input < 1 || input > 4){
                System.out.println("Invalid Input, Please Try Again.");
            }
        } while (input < 1 || input > 4);
        if (input == 1){
            option = new Proprietary();
        }
        if (input == 2){
            option = new Gotoh510();
        }
        if (input == 3){
            option = new HipshotHardtail();
        }
        if (input == 4){
            option = new FloydRose();
        }
        guitar = builder.BuildGuitar(guitar, option);

        //Display the finished product to the user
        System.out.println("$" + (2000 + guitar.getCost()));
        guitar.showOptions();
    }
}

