/*
 * This file just contains what is printed when certain
 * commands are called, nothing much to see here.
 * For the main, go to idk.java
 */

public class command
{
    static void help()
    {
        System.out.println("\nThis is the help command. We don't want to help you,");
        System.out.println("but I guess we have to :C\n");
        System.out.println("\nAll commands are case insensitive.\n");
        System.out.println("help\t\t\tPrints this help message");
        System.out.println("?\t\t\tPrints this help message");
        System.out.println("exit\t\t\tLeaves the game");
        System.out.println("leave\t\t\tLeaves the game");
        System.out.println("league of legends\tLeaves the game");
        System.out.println("quit\t\t\tLeaves the game");
        System.out.println("about\t\t\tGives information about the game and its creators");
        System.out.println("window washer!\t\tClears screen");
        System.out.println("cls\t\t\tClears screen");
        System.out.println("clear\t\t\tClears screen");
        System.out.println("flavor town\t\tReprints prompt");
        System.out.println("suicide\t\t\tKills yourself");
        System.out.println("fusion\t\t\tLets you fuse a clear command and a print command.");
        System.out.println("Syntax for fusion:");
        System.out.println("\tfusion clear/cls/window washer! _/\\_ <PRINT_COMMAND>");
        System.out.println("\tExample: fusion clear _/\\_ flavor town\twould clear then reprint prompt");
        System.out.println("Available print commands:");
        System.out.println("\thelp");
        System.out.println("\t?");
        System.out.println("\tabout");
        System.out.println("\tflavor town");
    }



    static void about()
    {
        System.out.println("\nProgrammer: Austin Hawkins (Kill Man)");
        System.out.println("Story: Joshua Green (elbananabunny)");
        System.out.println("Music: Cody Wesner (WEESBAW)");
        System.out.println("\nThis started out as a project for me to practice");
        System.out.println("Java (the language this is in), but two other people");
        System.out.println("got involved, and it turned into this. Thank us later.");
    }


    //This method just prints a bunch of newlines. Not that complicated, yet very effective.
    static void clear()
    {
        for (int i = 0; i < 50; i++) {
            System.out.println("\n");
        }
    }
}
