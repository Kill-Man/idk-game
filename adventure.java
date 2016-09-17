/*
 * This class contains the actual adventure for the game.
 * It starts with a constructor, so you only need to create an object to start the actual game.
 * It then goes through methods, each one testing the input.
 * For the story parts, see level.java.
 * For the main, go to idk.java
 */

import java.util.Scanner; // For input, of course

// For music
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class adventure
{

    private boolean quit = false; // Atribute that will be tested at the end of each level method. If it evaluates to false, the game ends.

    private boolean restart; // Boolean to keep track of if the player has to restart.

    private String playerCommand; // Might have to add = ""
    
    music song = new music();

    // Constructor so that no method needs to be called to run the adventure.
    public adventure()
    {
        song.play("music/play_through.wav");

        level.setLev("beginning"); // beginning prompt

        while (true) { // infinite loop until quit or choice.
            restart = false;
            userPrompt(); // Prompts player with "MajicMan: " or "Toaster: " of course depending on who you are.

            if (strChoice(1)) { // 1 is the correct path.
                goOnAdventure(); // Brings you to another method. This will be the process for every adventure method.
            } else if (strChoice(2)) { // Wrong answer, taunts the player then prompts them to either leave or stay.
                death("You idiot, you didn't even try to save her.");
            } else {
                baseCommands(); // baseCommands takes two arguments, the regular input and the suicide input.
            }

            if (this.quit) { // tests if the quit atribute is true, if  so...
                song.stop();
                break; // ... the game ends.
            }
        }
    }



    //  Goes to this method if 1 is chosen on the first level.
    void goOnAdventure()
    {
        level.setLev("goOnAdventure"); // prompt for this level.

        while (true) { // infinite loop until quit or choice.
            if (player.getCharacter().equalsIgnoreCase("Toaster")) {
                userPrompt();
            }

            if (player.getCharacter().equalsIgnoreCase("MajicMan")) {
                goToTree();
            } else if (player.getCharacter().equalsIgnoreCase("Toaster") && strChoice(1)) {
                goToTree();
            } else if (player.getCharacter().equalsIgnoreCase("Toaster") && strChoice(2)) {
                uPrompt();
                System.out.println("You, being the size of a toaster, decide to follow where the hole goes rather");
                System.out.println("than the path.");
                lPrompt();
                goToGardener(); /**Create a gardener level. This should direct to the gardener method in this class that is soon to be created. THIS IS TEMPORARY*/
            } else {
                baseCommands(); // Again, baseCommands takes two arguments, the regular input and the suicide input.
            }
            
            if (this.quit || this.restart) {
                break;
            }
        }
    }



    void goToTree()
    {
        level.setLev("goToTree");

        while (true) {
            userPrompt();

            if (strChoice(1) && player.getCharacter().equalsIgnoreCase("Toaster")) {
                death("You try to burn the Tree with your toaster heat, but you are not plugged in,\n" +
                      "you die of stupidness.");
            } else if (strChoice(1) && player.getCharacter().equalsIgnoreCase("MajicMan")) {
                uPrompt();
                System.out.println("You use your MAJICMAN powers, but realize you don't actually have any powers.");
                System.out.println("So you walk around the Tree, leaving the path.");
                lPrompt();
                goToGardener();
            } else if (strChoice(2)) {
                uPrompt();
                System.out.println("Overtaken by the prettiness of the Tree, you go on a date with the Tree.");
                lPrompt();
                seduce seduce = new seduce();
                seduce.seduceTree();
                uPrompt();
                System.out.println("That was the best date ever, but if you stay you will start a meaningful");
                System.out.println("relationship (FORGET THAT), so you left.");
                lPrompt();
                goToDuck();
            } else {
                baseCommands();
            }

            if (this.quit || this.restart) {
                break;
            }
        }
    }



    void goToDuck()
    {
        level.setLev("goToDuck");

        while (true) {
            userPrompt();

            if (strChoice(1)) {
                death("You walk closer to the Duck to conversate, it then occurs to you that conversate is not a\n" +
                      "word. In response, you turn into a whale, you sit there as a whale until your death because\n" +
                      "you are on land and cannot move.");
            } else if (strChoice(2)) {
                uPrompt();
                System.out.println("You think the duck can probably fly you over the river, but you want to give it");
                System.out.println("a good time first.");
                lPrompt();
                seduce seduce = new seduce();
                seduce.seduceDuck();
                uPrompt();
                System.out.println("You won, and grab the duck. It panics and 15 hours later it lands on the the");
                System.out.println("other side of the river and you continue.");
                lPrompt();
                goToFence();
            } else {
                baseCommands();
            }

            if (this.quit || this.restart) {
                break;
            }
        }
    }



    void goToFence()
    {
        level.setLev("goToFence");

        while (true) {
            userPrompt();

            if (strChoice(1)) {
                uPrompt();
                System.out.println("You notice the absolutely wonderful paint job the fence has and go for it.");
                lPrompt();
                noSeduce();
                uPrompt();
                System.out.println("After you are done with that, you realize the fence is only about 4 feet long");
                System.out.println("and walk around it.");
                lPrompt();
                goToBeing();
            } else if (strChoice(2) && player.getCharacter().equalsIgnoreCase("Toaster")) {
                death("You try to crawl under the fence, but the fox in the bush glares at you and\n" +
                      "you start to feel uncomfortable. The fox continues, you die.");
            } else if (strChoice(2) && player.getCharacter().equalsIgnoreCase("MajicMan")) {
                death("You try to climb over the fence, but the bush fox steals your hands and runs\n" +
                       "away. You die");
            } else {
                baseCommands();
            }

            if (this.quit || this.restart) {
                break;
            }
        }
    }



    void goToBeing()
    {
        song.stop();
        song.play("music/black_hole.wav");

        level.setLev("goToBeing");

        while (true) {
            userPrompt();

            if (strChoice(1)) {
                uPrompt();
                System.out.println("You think that your smooth moves can take care of the 10-Dimensional");
                System.out.println("being, so you go for it.");
                lPrompt();
                noSeduce();
                song.stop();
                death("You win, but the 10-D being sucks you into a dimension you can't quite\n" + 
                      "comprehend with your brain. After being sucked into the 10-Dimensional\n" +
                      "being, you see a hole. . . well, technically it's not actually a hole,\n" +
                      "it's a black hole. You are dead.");
            } else if (strChoice(2)) {
                uPrompt();
                System.out.println("You decide that it is a 10-Dimensional being in 3-Dimensional space,");
                System.out.println("so you let it take care of itself.");
                lPrompt();
                song.stop();
                goToShrimp();
            } else {
                baseCommands();
            }

            if (this.quit || this.restart) {
                break;
            }
        }
    }



    void goToJesus()
    {
        level.setLev("goToJesus");

        while (true) {
            userPrompt();

            if (strChoice(1)) {
                death("You give Jesus your beans, he turns into a hamburger with rainbow wings and a\n" +
                      "scythe with trident prongs on the other end. He flies away leaving your beans\n" +
                      "on the ground. You look at your beans on the ground. They are your beans. or\n" +
                      "are they? You gave them to Jesus. But he left them. Are they yours again?\n" +
                      "Will they ever be yours again? Are they cursed now? If so, why? Why did jesus\n" +
                      "lose reality? I think that's pretty obvious. Because of your beans. Unless\n" +
                      "they aren't yours. You leave the beans on the ground and carry on, but you\n" +
                      "can no longer stand the thought of continuing without the beans. You sit on\n" +
                      "the ground. Time moves around you, but you think it is moving slower than\n" +
                      "normal. It doesn't matter to you, you left the beans. They're still just\n" +
                      "sitting on the ground. Unless something ate them. Did it turn into a\n" +
                      "hamburger too? Why? Who? \"You better have finished that Civics Report young\n" +
                      "man\" your mother says to you. You fire back a smart retort I will not repeat\n" +
                      "at this time. She sighs, groans, and cries into the spaceship. Your head\n" +
                      "suddenly feels lighter, it's a balloon now. Not anymore, it's your head\n" +
                      "again. You die just sitting in the middle of the road, the road is actually\n" +
                      "made of butter. That's pretty weird, huh? Oh wait, you can't answer, you're\n" +
                      "dead. Vultures tear and rip into your corpse. You can't feel it though, you\n" +
                      "are dead. You are the vulture. Why? You see a small cow singing 'YMCA' over\n" +
                      "by the Unbranded Super Market. This cow is much smaller than normal. About\n" +
                      "7/10 the size of the average cow. It starts to dance. It's dancing the\n" +
                      "Macarena. You hear music. It's El Mundo's Chaccaron Maccaron. You cry.");
            } else if (strChoice(2)) {
                uPrompt();
                System.out.println("You walk up to Jesus, and he says \"My Sun, I luv U.\" He flies away screaming.");
                System.out.println("You think that this is very out of character for Jesus, you think it may");
                System.out.println("actually be Bill Cosby dressed as Jesus, but then you realize you haven't had");
                System.out.println("any food or water for in about 3 days. He is a hallucination.");
                lPrompt();
                goToHead();
            } else {
                baseCommands();
            }

            if (this.quit || this.restart) {
                break;
            }
        }
    }



    void goToGardener()
    {
        level.setLev("goToGardener");

        while (true) {
            userPrompt();

            if (strChoice(1)) {
                uPrompt();
                System.out.println("You talk to the Gardener, as it turns out, he is the owner of Sivak Games (Not");
                System.out.println("really, he lied on his profile page).");
                lPrompt();
                seduce seduce = new seduce();
                seduce.seduceGardener();
                uPrompt();
                System.out.println("The Gardener shows you his yards of carrot, radish, and corn. You think that");
                System.out.println("it is strange that he grows all of these at the same time because they have");
                System.out.println("wildly different prime seasons. He hits you on the head with his hoe and you");
                System.out.println("go unconscious. You wake up strapped to a chair in a strange room, it's mostly");
                System.out.println("wood with a lamp in the left corner. The Gardener walks into the room and");
                System.out.println("tells you he sold you to the Government of the United States of America. You");
                System.out.println("live on as a federal slave to the US.");
                lPrompt();
                win();
            } else if (strChoice(2)) {
                uPrompt();
                System.out.println("You take beans from the Gardener.");
                lPrompt();
                goToJesus();
            } else if (strChoice(3) && player.getCharacter().equalsIgnoreCase("Toaster")) {
                uPrompt();
                System.out.println("The Gardener hands you a handful of beans. You, being a toaster, have no hands");
                System.out.println("and the beans fall into you. You turn on and the beans heat up inside of you.");
                System.out.println("You continue on.");
                lPrompt();
                uPrompt();
                System.out.println("It is a sheep with an unnaturally large mouth, what else do you want? \"What?\"");
                System.out.println("Why is this here? How did it get here? How many questions can I ask at one");
                System.out.println("time? Is it a lot? Does it really matter? Do you care? Will I just keep asking");
                System.out.println("questions? Why not? Is it efficient? Is it good? How could it be bad? But does");
                System.out.println("that make it good? Is this just gonna keep going? Why not? How many times have");
                System.out.println("I asked that? Is there a point to any of the Seduction games? No, to all of");
                System.out.println("those questions.");
                lPrompt();
                goToSkeleton();
            } else {
                baseCommands();
            }

            if (this.quit || this.restart) {
                break;
            }
        }
    }



    void goToSentai()
    {
        level.setLev("goToSentai");

        while (true) {
            userPrompt();

            if (strChoice(1)) {
                uPrompt();
                System.out.println("The Super Sentai asks you to fuse with him, but not because he likes you idiot.");
                lPrompt();
                goToGardener();
            } else if (strChoice(2)) {
                death("You and the Super Sentai decide to fight the robot kaiju threatening the\n" +
                       "'CAPITAL CITY OF NONDESCRIPT ASIAN COUNTRY' (Probably Tokyo). The monster eats\n" +
                       "you. You are dead.");
            } else {
                baseCommands();
            }

            if (this.quit || this.restart) {
                break;
            }
        }
    }



    void goToShrimp()
    {
        song.stop();
        song.play("music/funky_bull_shrimp.wav");

        level.setLev("goToShrimp");

        while (true) {
            userPrompt();

            if (strChoice(1)) {
                uPrompt();
                System.out.println("You walk over and start dancing with the Funky Bull Shrimp, his funk");
                System.out.println("mesmerises you and he tells you he will show you somethin real cool.");
                System.out.println("He brings you to his basement, you see Kevin James, Kevin Durant,");
                System.out.println("Kevin Bacon, Kevin Spacey, Kevin Hart, Kevin Costner, Kevin Kline,");
                System.out.println("and Kevin Rudd all chained to the wall. You try to leave but the");
                System.out.println("Funky Bull Shrimp has blocked the door. He asks you if your name is");
                System.out.println("Kevin. You say yes (but it's actually not) and he stares at you for");
                System.out.println("three minutes.");
                lPrompt();
                noSeduce();
                System.out.println("You get chained to the wall and stay there forever listening to Kevin");
                System.out.println("Hart complain about how short he is.");
                System.out.println("!!YOU WIN!!");
                Scanner scanner = new Scanner(System.in);
                System.out.print("Press ENTER key to continue. . .");
                try {
                    System.in.read();
                } catch (Exception e) {
                    System.out.println(". . . or don't. . .");
                }
                command.clear();
                for (int i = 0; i < 60; i++) {
                    try {
                        Thread.sleep(250);
                        System.out.println("         Programmer: Kill Man");
                        Thread.sleep(250);
                        System.out.println("     Story writer:  elbananabunny");
                        Thread.sleep(250);
                        System.out.println("            Music: WEESBAW");
                        Thread.sleep(250);
                        System.out.print("\n");
                    } catch (InterruptedException e) {
                        System.out.println("Problem with the creddits, idk.");
                    }
                }
                System.out.print("Would you like to quit (q) or restart (r)?: ");
                String choice = scanner.nextLine();
                choice = choice.replaceAll("\\s+", " ");
                song.stop();
                song.play("music/play_through.wav");
                if (choice.startsWith("q")) {
                    System.out.println("Quitting.");
                    this.quit = true;
                } else if (choice.equalsIgnoreCase("batman")) {
                    uPrompt();
                    System.out.println("It's Batman. You bring Batman to Grandmah's house, he breaks down the door to");
                    System.out.println("your Grandmother's room. You say thank you, sit down on the couch and watch");
                    System.out.println("the G-Force movie.");
                    lPrompt();
                    this.restart = true;
                    level.setLev("beginning");
                } else {
                    System.out.println("Restarting.");
                    this.restart = true;
                    level.setLev("beginning");
                }
            } else if (strChoice(2)) {
                uPrompt();
                System.out.println("You don't like lettuce, so you run away from the oh so funky shrimp.");
                lPrompt();
                song.stop();
                song.play("music/play_through.wav");
                goToSentai();
            } else {
                baseCommands();
            }

            if (this.quit || this.restart) {
                break;
            }
        }
    }



    void goToHead()
    {
        level.setLev("goToHead");

        while (true) {
            userPrompt();

            if (strChoice(1)) {
                uPrompt();
                System.out.println("You walk past the sad head and he screams at you not to go that way,");
                System.out.println("You do anyway. . . what in the world? Uhh this is really weird. There");
                System.out.println("is a guy who needs clothes standing right in front of you. You don't");
                System.out.println("wanna seduce this guy. Trust me.");
                lPrompt();
                goToSkeleton();
            } else if (strChoice(2)) {
                uPrompt();
                System.out.println("The head looks very sad, you feel unusually sympathetic for the");
                System.out.println("pathetic looking head. You walk away ignoring the head with a small");
                System.out.println("tear forming in the corner of your eye. It disappears and never falls");
                System.out.println("down your face. You don't care enough for that.");
                lPrompt();
                uPrompt();
                System.out.println("It is a sheep with an unnaturally large mouth, what else do you want? \"What?\"");
                System.out.println("Why is this here? How did it get here? How many questions can I ask at one");
                System.out.println("time? Is it a lot? Does it really matter? Do you care? Will I just keep asking");
                System.out.println("questions? Why not? Is it efficient? Is it good? How could it be bad? But does");
                System.out.println("that make it good? Is this just gonna keep going? Why not? How many times have");
                System.out.println("I asked that? Is there a point to any of the Seduction games? No, to all of");
                System.out.println("those questions.");
                lPrompt();
                goToSkeleton();
            } else {
                baseCommands();
            }

            if (this.quit || this.restart) {
                break;
            }
        }
    }



    void goToPinata()
    {
        level.setLev("goToPinata");

        while (true) {
            userPrompt();

            if (strChoice(1)) {
                uPrompt();
                System.out.println("no");
                System.out.println("\t1. Instant Death");
                System.out.println("\t2. Teleport Hole");
                lPrompt();
                while (true) {
                    userPrompt();
                    if (strChoice(1)) {
                        uPrompt();
                        System.out.println("You die instantly, but as a soul, choose not to give up.");
                        lPrompt();
                        goToPuppy();
                    } else if (strChoice(2)) {
                        uPrompt();
                        System.out.println("The boss room is coming up, you can tell, there are potions all over the floor.");
                        System.out.println("You ignore them. You don't need them. You are good at games, you can do this.");
                        System.out.println("There you go CARL, you happy now? My quota of lies is filled now. Why do you");
                        System.out.println("even require us to put two lies in? No you're stupid! What do you mean I should");
                        System.out.println("stop typing all of this? Oh. . . you walk into the boss room.");
                        lPrompt();
                        uPrompt();
                        System.out.println("Being as smooth and cool as you are, you use your super seduce move to seduce");
                        System.out.println("every boss in the boss room at once.");
                        lPrompt();
                        uPrompt();
                        System.out.println("You walk up to a set of doors so large, you can't see the top of them. Oh,");
                        System.out.println("wait. . . no, the tops are just cut off. Why do that to a door? That can't be");
                        System.out.println("helpful. You pass through them pranormal activity style and see him. THE KEVIN.");
                        System.out.println("The seagull who stole your girl. You look at his four eye patches and bowler");
                        System.out.println("hat, you decide he must be defeated.");
                        lPrompt();
                        uPrompt();
                        System.out.println("You seduce the living hell out of him with dance moves he can't even see,");
                        System.out.println("because of the eye patches he is wearing.");
                        lPrompt();
                        uPrompt();
                        System.out.println("You walk past The Kevin, he is wearing four eyepatches, and cannot see you.");
                        System.out.println("You finally pick up Patricia. You walk over to your house, which turns out to");
                        System.out.println("be behind The Kevin's secret hideout, with Patricia. You go inside, sit down");
                        System.out.println("on your couch and watch Food Fight, the movie.");
                        lPrompt();
                        win();
                    } else if (playerCommand.equalsIgnoreCase("fusion cls _/\\_ flavor town") ||
                               playerCommand.equalsIgnoreCase("fusion clear _/\\_ flavor town") ||
                               playerCommand.equalsIgnoreCase("fusion window washer! _/\\_ flavor town")) {
                        command.clear();
                        uPrompt();
                        System.out.println("no");
                        System.out.println("\t1. Instant Death");
                        System.out.println("\t2. Teleport Hole");
                        lPrompt();
                    } else if (playerCommand.equalsIgnoreCase("flavor town")) {
                        uPrompt();
                        System.out.println("no");
                        System.out.println("\t1. Instant Death");
                        System.out.println("\t2. Teleport Hole");
                        lPrompt();
                    } else {
                        baseCommands();
                    }

                    if (this.quit || this.restart) {
                        break;
                    }
                }
            } else if (strChoice(2)) {
                uPrompt();
                System.out.println("He shoots you with a tiny gun, it has no effect as it misses, he is a very bad");
                System.out.println("shot.");
                lPrompt();
                noSeduce();
                death("You lose, you are dead.");
            }

            if (this.quit || this.restart) {
                break;
            }
        }
    }


    
    void goToPuppy()
    {
        level.setLev("goToPuppy");

        while (true) {
            userPrompt();

            if (strChoice(1)) {
                uPrompt();
                System.out.println("You are disgusting.");
                lPrompt();
                noSeduce();
                death("You are dead. . . and gross.");
            } else if (strChoice(2)) {
                uPrompt();
                System.out.println("You pat the head of the puppy and walk away. You have a flea on your hand.");
                System.out.println("Darn it.");
                lPrompt();
                goToSeinfeld();
            } else {
                baseCommands();
            }

            if (this.quit || this.restart) {
                break;
            }
        }
    }



    void goToSkeleton()
    {
        level.setLev("goToSkeleton");

        while (true) {
            userPrompt();

            if (strChoice(1)) {
                uPrompt();
                System.out.println("The skull offers you some spaghetti, you say yes, but he is incapable of");
                System.out.println("giving you any due to his lack of body.");
                lPrompt();
                goToFrog();
            } else if (strChoice(2)) {
                uPrompt();
                System.out.println("He seems pretty cool.");
                lPrompt();
                noSeduce();
                uPrompt();
                System.out.println("You win, and you laugh eternally at the skull's brother's puns.");
                lPrompt();
                win();
            } else {
                baseCommands();
            }

            if (this.quit || this.restart) {
                break;
            }
        }
    }


    
    void goToFrog()
    {
        song.stop();
        song.play("music/frog_in_jeans.wav");

        level.setLev("goToFrog");

        while (true) {
            userPrompt();

            if (strChoice(1)) {
                uPrompt();
                System.out.println("He tells you awful jokes. Don't worry, I'll save you from them. You leave.");
                lPrompt();
                song.stop();
                song.play("music/play_through.wav");
                goToPinata();
            } else if (strChoice(2)) {
                uPrompt();
                System.out.println("The frog is dead now.");
                lPrompt();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Uh oh.");
                }
                song.stop();
                song.play("music/tts.wav");
                while (true) {
                    command.clear();
                    userPrompt();
                    if (strChoice(1)) {
                        uPrompt();
                        System.out.println("You seduce blackness, or whiteness, or whatever colory your command prompt is.");
                        System.out.println("You continue.");
                        lPrompt();
                        uPrompt();
                        System.out.println("The boss room is coming up, you can tell, there are potions all over the floor.");
                        System.out.println("You ignore them. You don't need them. You are good at games, you can do this.");
                        System.out.println("There you go CARL, you happy now? My quota of lies is filled now. Why do you");
                        System.out.println("even require us to put two lies in? No you're stupid! What do you mean I should");
                        System.out.println("stop typing all of this? Oh. . . you walk into the boss room.");
                        lPrompt();
                        uPrompt();
                        System.out.println("Being as smooth and cool as you are, you use your super seduce move to seduce");
                        System.out.println("every boss in the boss room at once.");
                        lPrompt();
                        uPrompt();
                        System.out.println("You walk up to a set of doors so large, you can't see the top of them. Oh,");
                        System.out.println("wait. . . no, the tops are just cut off. Why do that to a door? That can't be");
                        System.out.println("helpful. You pass through them pranormal activity style and see him. THE KEVIN.");
                        System.out.println("The seagull who stole your girl. You look at his four eye patches and bowler");
                        System.out.println("hat, you decide he must be defeated.");
                        lPrompt();
                        uPrompt();
                        System.out.println("You seduce the living hell out of him with dance moves he can't even see,");
                        System.out.println("because of the eye patches he is wearing.");
                        lPrompt();
                        uPrompt();
                        System.out.println("You walk past The Kevin, he is wearing four eyepatches, and cannot see you.");
                        System.out.println("You finally pick up Patricia. You walk over to your house, which turns out to");
                        System.out.println("be behind The Kevin's secret hideout, with Patricia. You go inside, sit down");
                        System.out.println("on your couch and watch Food Fight, the movie.");
                        lPrompt();
                        song.stop();
                        song.play("music/frog_in_jeans.wav");
                        win();
                    } else if (strChoice(2)) {
                        uPrompt();
                        System.out.println("He is still dead. You decide to continue.");
                        lPrompt();
                        song.stop();
                        song.play("music/play_through.wav");
                        goToPinata();
                    } else if (playerCommand.equalsIgnoreCase("fusion cls _/\\_ flavor town") ||
                               playerCommand.equalsIgnoreCase("fusion clear _/\\_ flavor town") ||
                               playerCommand.equalsIgnoreCase("fusion window washer! _/\\_ flavor town")) {
                        command.clear();
                        System.out.print("\n");
                    } else if (playerCommand.equalsIgnoreCase("flavor town")) {
                        System.out.print("\n");
                    } else {
                        baseCommands();
                    }

                    if (this.quit || this.restart) {
                        break;
                    }
                }
            } else {
                baseCommands();
            }

            if (this.quit || this.restart) {
                break;
            }
        }
    }



    void goToSeinfeld()
    {
        level.setLev("goToSeinfeld");

        while (true) {
            userPrompt();

            if (strChoice(1)) {
                uPrompt();
                System.out.println("You watch the pilot episode of Seinfeld, it's horrible, but you love it. You");
                System.out.println("never stop watching. You sit forever looking at Jerry Seinfeld, and his bad");
                System.out.println("show.");
                lPrompt();
                win();
            } else if (strChoice(2)) {
                uPrompt();
                System.out.println("You try to seduce Seinfeld, but he starts doing a standup comedy bit, you run");
                System.out.println("to the closest building.");
                lPrompt();
                uPrompt();
                System.out.println("You walk up to a set of doors so large, you can't see the top of them. Oh,");
                System.out.println("wait. . . no, the tops are just cut off. Why do that to a door? That can't be");
                System.out.println("helpful. You pass through them pranormal activity style and see him. THE KEVIN.");
                System.out.println("The seagull who stole your girl. You look at his four eye patches and bowler");
                System.out.println("hat, you decide he must be defeated.");
                lPrompt();
                uPrompt();
                System.out.println("You seduce the living hell out of him with dance moves he can't even see,");
                System.out.println("because of the eye patches he is wearing.");
                lPrompt();
                uPrompt();
                System.out.println("You walk past The Kevin, he is wearing four eyepatches, and cannot see you.");
                System.out.println("You finally pick up Patricia. You walk over to your house, which turns out to");
                System.out.println("be behind The Kevin's secret hideout, with Patricia. You go inside, sit down");
                System.out.println("on your couch and watch Food Fight, the movie.");
                lPrompt();
                win();
            } else {
                baseCommands();
            }

            if (this.quit || this.restart) {
                break;
            }
        }
    }



    void win()
    {
        System.out.println("!!YOU WIN!!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Press ENTER key to continue. . .");
        try {
            System.in.read();
        } catch (Exception e) {
            System.out.println(". . . or don't. . .");
        }
        command.clear();
        for (int i = 0; i < 60; i++) {
            try {
                Thread.sleep(250);
                System.out.println("         Programmer: Kill Man");
                Thread.sleep(250);
                System.out.println("     Story writer:  elbananabunny");
                Thread.sleep(250);
                System.out.println("            Music: WEESBAW");
                Thread.sleep(250);
                System.out.print("\n");
            } catch (InterruptedException e) {
                System.out.println("Problem with the creddits, idk.");
            }
        }
        
        System.out.print("Would you like to quit (q) or restart (r)?: ");
        char choice = scanner.next().charAt(0);
        song.stop();
        song.play("music/play_through.wav");
        if (choice == 'q') {
            System.out.println("Quitting.");
            this.quit = true;
        } else {
            System.out.println("Restarting.");
            this.restart = true;
            level.setLev("beginning");
        }
    }
    


    // Method that takes the argument, asks for user input, stores it in that variable, then quits the game depending on the result of var x.
    void death(String reason)
    {
        song.stop();
        uPrompt();
        System.out.println(reason);
        lPrompt();

        player.die(); // tells the user that he/she died.

        Scanner scanner = new Scanner(System.in);
        playerCommand = scanner.nextLine(); // gets input of user, either yes or no, or some abriviation.

        if (playerCommand.equalsIgnoreCase("Y") || playerCommand.equalsIgnoreCase("Yes")) { // Yes means that you DO want to continue with the game.
            this.quit = false;
        } else if (playerCommand.equalsIgnoreCase("N") ||
                   playerCommand.equalsIgnoreCase("No")) { // No means that you DON'T want to continue with the game.
            this.quit = true;
        } else {
            this.quit = false; // Defaults to Yes.
        }
        restart = true;

        level.setLev("beginning");
        song.play("music/play_through.wav");
    }
    


    /*********************************************************
     * THIS METHOD MUST ALWAYS GO AT THE BOTTOM OF THE LOOP. *
     *********************************************************/
    // Takes two arguments, the regular input that takes commands, and the suicide input.
    void baseCommands()
    {
        if (playerCommand.equalsIgnoreCase("about")) { // Runs about command
            command.about();
        } else if (playerCommand.equalsIgnoreCase("help") || playerCommand.equals("?")) { // Gives user help with commands.
            command.help();
        } else if (playerCommand.equalsIgnoreCase("exit") ||
                   playerCommand.equalsIgnoreCase("quit") ||
                   playerCommand.equalsIgnoreCase("leave") ||
                   playerCommand.equalsIgnoreCase("league of legends")) {
            this.quit = true; // Changes quit to true, so methods go back to constructor method, which then tests if quit is true.
        } else if (playerCommand.equalsIgnoreCase("window washer!") ||
                   playerCommand.equalsIgnoreCase("cls") ||
                   playerCommand.equalsIgnoreCase("clear")) { // Clears screen.
            command.clear();
        } else if (playerCommand.equalsIgnoreCase("suicide")) { // Kills player (I wouldn't blame him tbh).
            death("Realizing that you left the master key to any door under the doormat, you go to\nyour bathroom to drop a hairdryer into the bath tub because you are too dumb\nfor planet Earth.");
        } else if (playerCommand.equalsIgnoreCase("fusion cls _/\\_ help") ||
                   playerCommand.equalsIgnoreCase("fusion cls _/\\_ ?") ||
                   playerCommand.equalsIgnoreCase("fusion clear _/\\_ help") ||
                   playerCommand.equalsIgnoreCase("fusion clear _/\\_ ?") ||
                   playerCommand.equalsIgnoreCase("fusion window washer! _/\\_ help") ||
                   playerCommand.equalsIgnoreCase("fusion window washer! _/\\_ ?")) {
            command.clear();
            command.help();
        } else if (playerCommand.equalsIgnoreCase("fusion cls _/\\_ about") ||
                   playerCommand.equalsIgnoreCase("fusion clear _/\\_ about") ||
                   playerCommand.equalsIgnoreCase("fusion window washer! _/\\_ about")) {
            command.clear();
            command.about();
        } else if (playerCommand.equalsIgnoreCase("fusion cls _/\\_ flavor town") ||
                   playerCommand.equalsIgnoreCase("fusion clear _/\\_ flavor town") ||
                   playerCommand.equalsIgnoreCase("fusion window washer! _/\\_ flavor town")) {
            command.clear();
            level.printLevel();
        } else if (playerCommand.equalsIgnoreCase("flavor town")) {
            level.printLevel();
        } else { // If the command is not found, print this and restart the loop.
            System.out.println("You idiot, that isn't a command. Hitmen are headed your way, idiot.");
        }
    }



    // Used to test if the user chose a path rather than entered a command.
    boolean strChoice(int choice)
    {
        if (playerCommand.startsWith(Integer.toString(choice))) {
            return true;
        } else {
            return false;
        }
    }
    


    // Prompts player with "MajicMan: " or "Toaster: " of course depending on who you are.
    void userPrompt()
    {
        System.out.print("\n" + player.getCharacter() + ": "); // Prompt
        Scanner scanner = new Scanner(System.in);
        playerCommand = scanner.nextLine();
        playerCommand = playerCommand.replaceAll("\\s+", " ");
    }



    void uPrompt()
    {
        System.out.println("\n\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\");
    }
    


    void lPrompt()
    {
        System.out.println("\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\");
    }



    void noSeduce()
    {
        System.out.println("\nOk, the writer didn't give me many seduction game variants, so, lets just say");
        System.out.println("that you did good.\n");
    }
}
