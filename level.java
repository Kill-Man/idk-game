/*
 * This class holds the prompts, such as dialogue.
 * If you want to see the conditions for what the user wants to do,
 * go to adventure.java
 * For the main, go to idk.java
 */

public class level
{
    private static String lev; // Holds what level the player is on.

    static void beginning()
    {
        uPrompt(); // i'm lazy
        if (player.getCharacter().equalsIgnoreCase("MajicMan")) { // There are different prompts for each character in this case, so if statements are required.
            System.out.println("You, " + player.getCharacter() + ", are living with your grandma, but hear a thud,");
        } else {
            System.out.println("You, " + player.getCharacter() + ", an independant woman,");
            System.out.println("are living with your grandma, but hear a thud.");
        }
        System.out.println("You are suspicious and go check it out, but your sexy girlfriend,");
        System.out.println("the door's door handle, is no longer attatched to the door.");
        System.out.println("It is your job to find Patricia (her name), " + player.getCharacter() + ".");
        System.out.println("You can do one of two things:");
        printTab("1. Go on an adventure"); // Always tab choices.
        printTab("2. Stay at your grandma's");
        jttn(2); // i'm lazy
        lPrompt(); // i'm lazy
    }



    static void goOnAdventure()
    {
        uPrompt();
        System.out.println("You leave your Grandmah's house in search for your butifull door knob");
        System.out.println("girlfirend. As you walk you see a small hole, about the size of a");
        System.out.println("toaster.");

        if (player.getCharacter().equalsIgnoreCase("Toaster")) {
            System.out.println("You can do one of two things:");
            printTab("1. Keep walking");
            printTab("2. Go down toaster hole");
            jttn(2);
        }
        lPrompt();
    }
    


    static void goToTree()
    {
        uPrompt();
        System.out.println("You walk for several more minutes. You see a Tree, you have never been outside");
        System.out.println("before, and are entranced by this beautiful Tree.");
        if (player.getCharacter().equalsIgnoreCase("Toaster")) {
            printTab("1. Burn Tree");
        } else {
            printTab("1. Poof Tree");
        }
        printTab("2. Seduce Tree");
        lPrompt();
    }



    static void goToDuck()
    {
        uPrompt();
        System.out.println("You run away form any possible romantic ties with that tree and come up to a");
        System.out.println("river, there is a Duck sitting 3.0000024601000005467643567325434543545 feet");
        System.out.println("away from where you are at this very moment.");
        printTab("1. Conversate");
        printTab("2. Seduce Duck");
        lPrompt();
    }



    static void goToFence()
    {
        uPrompt();
        System.out.println("Feeling very tired from your unnecessarily long duck ride, you walk for a");
        System.out.println("minute or two and come to a fence. You see a bush to the left, inside the");
        System.out.println("bush you see a fox eating a flaming head of cabbage with a key on the ground");
        System.out.println("next to it.");
        printTab("1. Seduce Fence");
        if (player.getCharacter().equalsIgnoreCase("Toaster")) {
            printTab("2. Crawl Under Fence");
        } else {
            printTab("2. Climb Over Fence");
        }
        lPrompt();
    }



    static void goToBeing()
    {
        uPrompt();
        System.out.println("You start running, but after 5 minutes your superstring senses go off. You");
        System.out.println("look for the source and find a being from a place of 10 Dimensional");
        System.out.println("spacetime. Realizing that the possibility of an unphysical negative ghost");
        System.out.println("gets on your goose, so you decide to do something about it.");
        printTab("1. Seduce 10-D Being");
        printTab("2. Cannot Comprehend the Being");
        lPrompt();
    }



    static void goToJesus()
    {
        uPrompt();
        System.out.println("Woah dude, it's Jesus.");
        printTab("1. HE WANT YO BEANs");
        printTab("2. Realize Jesus is a Hallucination");
        lPrompt();
    }



    static void goToGardener()
    {
        uPrompt();
        System.out.println("A man in a hat that kinda looks a thimble that's squished at the bottom. He");
        System.out.println("also has a hoe that he is dragging along the ground, he screams at the hoe");
        System.out.println("making sure it is doing it's job. Get it? Oh wait, I forgot to tell you");
        System.out.println("that he is a gardener, didn't I? Now the joke is ruined.");
        printTab("1. Seduce Gardener");
        printTab("2. Leave With Beans");
        if (player.getCharacter().equalsIgnoreCase("Toaster")) {
            printTab("3. Roast Beans");
        }
        lPrompt();
    }



    static void goToSentai()
    {
        uPrompt();
        System.out.println("You see a fat man in a power rang. . . super sentai suit. He walks up to you");
        System.out.println("and he screams in your face. \"Idiot, go away. I don't want you around!\" You");
        System.out.println("turn to walk away and he says, \"Wait! It's not like I like you or anything,");
        System.out.println("but uhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        System.out.println("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        printTab("1. Do a Fusion Dance");
        printTab("2. Fight a Robot Kaiju");
        lPrompt();
    }



    static void goToShrimp()
    {
        uPrompt();
        System.out.println("A giant shrimp with an afro is dancing with a floating disco ball, that's");
        System.out.println("pretty weird. He walks over to you and you can hear Oingo Boingo's \"Little");
        System.out.println("Girls\" in the distance.");
        printTab("1. Seduce Funkey Bull Shrimp");
        printTab("2. Run Away to Avoid Awkward Situation");
        lPrompt();
    }



    static void goToHead()
    {
        uPrompt();
        System.out.println("You see just a head sitting under a cherry tree, it looks sad. You ask");
        System.out.println("yourself, \"When did this cherry tree get here? Cherry trees don't grow");
        System.out.println("arround here.\"");
        printTab("1. oh no");
        printTab("2. Leave with a small tear in your eye");
        lPrompt();
    }



    static void goToPinata()
    {
        uPrompt();
        System.out.println("You see a very tiny man riding around on a pinata, and by riding I mean he's");
        System.out.println("bucking around on it's back, but the pinata is not moving. He has a");
        System.out.println("proportionally large hat, but it's no bigger than a thimble, he also has a");
        System.out.println("string which he uses as a lasso. He tells you that his name is Bill.");
        printTab("1. Ask to be Hogtied");
        printTab("2. Seduce Pinata Bill");
        lPrompt();
    }



    static void goToPuppy()
    {
        uPrompt();
        System.out.println("You see a puppy, it's adorable. Visions of different ways the puppy could be");
        System.out.println("killed flash through your mind.");
        printTab("1. Seduce Puppy");
        printTab("2. Pet and Leave");
        lPrompt();
    }



    static void goToSkeleton()
    {
        uPrompt();
        System.out.println("You see a crying skull on the floor, you find that strange. Skulls don't have");
        System.out.println("the necessary bits to cry. You walk over and he brightens up, you ask why he");
        System.out.println("was crying and he tells you he was murdered by a small child. That's pretty");
        System.out.println("lame.");
        printTab("1. Get Spaghetti");
        printTab("2. Seduce Nice Skeleton Head");
        lPrompt();
    }



    static void goToFrog()
    {
        uPrompt();
        System.out.println("You walk and see a frog wearing skinny jeans. He tells you he used to stand in");
        System.out.println("one place in medieval style clothing telling jokes, but he says his real");
        System.out.println("calling is to become a hipster, and standing in one spot here to tell jakes.");
        printTab("1. Listen to Jokes");
        printTab("2. Boil the Frog");
        lPrompt();
    }



    static void goToSeinfeld()
    {
        uPrompt();
        System.out.println("You walk int a room, you see Jerry Seinfeld, he sees you. He says, \"Hey, lets");
        System.out.println("make a TV show about nothing, it'll be a hit.\" A laugh track sound.");
        printTab("1. Watch");
        printTab("2. Seduce Seinfeld");
        lPrompt();
    }



    static void setLev(String current)
    {
        lev = current;
        printLevel();
    }



    static void printLevel()
    {
        if (lev.equalsIgnoreCase("beginning")) {
            beginning();
        } else if (lev.equalsIgnoreCase("goOnAdventure")) {
            goOnAdventure();
        } else if (lev.equalsIgnoreCase("goToTree")) {
            goToTree();
        } else if (lev.equalsIgnoreCase("goToDuck")) {
            goToDuck();
        } else if (lev.equalsIgnoreCase("goToFence")) {
            goToFence();
        } else if (lev.equalsIgnoreCase("goToBeing")) {
            goToBeing();
        } else if (lev.equalsIgnoreCase("goToJesus")) {
            goToJesus();
        } else if (lev.equalsIgnoreCase("goToGardener")) {
            goToGardener();
        } else if (lev.equalsIgnoreCase("goToSentai")) {
            goToSentai();
        } else if (lev.equalsIgnoreCase("goToShrimp")) {
            goToShrimp();
        } else if (lev.equalsIgnoreCase("goToHead")) {
            goToHead();
        } else if (lev.equalsIgnoreCase("goToPinata")) {
            goToPinata();
        } else if (lev.equalsIgnoreCase("goToPuppy")) {
            goToPuppy();
        } else if (lev.equalsIgnoreCase("goToSkeleton")) {
            goToSkeleton();
        } else if (lev.equalsIgnoreCase("goToFrog")) {
            goToFrog();
        } else if (lev.equalsIgnoreCase("goToSeinfeld")) {
            goToSeinfeld();
        } else {
            System.out.println("I don't know what level you are on. Contact the devs.");
        }
    }



    /* Next three methods created out of laziness, really. */
    //Upper prompt. The design above the prompt to signal that there is a new prompt.
    private static void uPrompt()
    {
        System.out.println("\n\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\");
    }
    


    // Lower prompt. The design under the prompt to signal that it is finished.
    private static void lPrompt()
    {
        System.out.println("\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\");
    }
    


    private static void printTab(String x)
    {
        System.out.println("\t" + x);
    }
    


    // j(ust) t(ype) t(he) n(umber). Arg is the ammount of choices the user has.
    private static void jttn(int x)
    {
        System.out.print("Just type the number ");
        System.out.print("(");
        for (int i = 1; i <= x; ++i) { // loop that will print (<NUMBER> or <NUMBER>) until there is one number left.
            if (i < x) {
                System.out.printf("%d or ", i);
            } else if (i == x) {
                System.out.printf("%d in this case).\n", i);
            }
        }
    }
}
