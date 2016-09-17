/*
 * CLASS UNDER CONSTRUCTION
 * This will contain the methods for the
 * seduction game.
 * If you are looking for the main, check idk.java
 */
 
 /**
 //Template for future seduction games
        //Question 1
        System.out.println("");
        printTab("a. ");
        printTab("b. ");
        printTab("c. ");
        printTab("d. ");
        prompt();
        answer('a');
        
        //Question 2
        System.out.println("\n");
        printTab("a. ");
        printTab("b. ");
        printTab("c. ");
        printTab("d. ");
        prompt();
        answer('c');
        
        //Question 3
        System.out.println("\n");
        printTab("a. ");
        printTab("b. ");
        printTab("c. ");
        printTab("d. ");
        prompt();
        answer('a');
        
        //Question 4
        System.out.println("\n");
        printTab("a. ");
        printTab("b. ");
        printTab("c. ");
        printTab("d. ");
        prompt();
        answer('d');
        
        //Question 5
        System.out.println("\n");
        printTab("a. ");
        printTab("b. ");
        printTab("c. ");
        printTab("d. ");
        prompt();
        answer('d');
        
        //Question 6
        System.out.println("\n");
        printTab("a. ");
        printTab("b. ");
        printTab("c. ");
        printTab("d. ");
        prompt();
        answer('b');
        
        //Question 7
        System.out.println("\n");
        printTab("a. ");
        printTab("b. ");
        printTab("c. ");
        printTab("d. ");
        prompt();
        answer('c');
        
        //Question 8
        System.out.println("\n");
        printTab("a. ");
        printTab("b. ");
        printTab("c. ");
        printTab("d. ");
        prompt();
        answer('d');
        
        //Question 9
        System.out.println("\n");
        printTab("a. ");
        printTab("b. ");
        printTab("c. ");
        printTab("d. ");
        prompt();
        answer('d');
        
        //Question 10
        System.out.println("\n");
        printTab("a. ");
        printTab("b. ");
        printTab("c. ");
        printTab("d. ");
        prompt();
        answer('c');
        
        //Question 11
        System.out.println("\n");
        printTab("a. ");
        printTab("b. ");
        printTab("c. ");
        printTab("d. ");
        prompt();
        answer('b');
        
        //Question 12
        System.out.println("\n");
        printTab("a. ");
        printTab("b. ");
        printTab("c. ");
        printTab("d. ");
        prompt();
        answer('d');
        
        //Question 13
        System.out.println("\n");
        printTab("a. ");
        printTab("b. ");
        printTab("c. ");
        printTab("d. ");
        prompt();
        answer('c');
        
        //Question 14
        System.out.println("\n");
        printTab("a. ");
        printTab("b. ");
        printTab("c. ");
        printTab("d. ");
        prompt();
        answer('b');
        
        //Question 15
        System.out.println("\n");
        printTab("a. ");
        printTab("b. ");
        printTab("c. ");
        printTab("d. ");
        prompt();
        answer('b');
        
        System.out.println("\nYou got " + this.points + " points. If you would ask me, that's pretty crappy.\n\n");
 */
 
import java.util.Scanner;

public class seduce
{
    char input; //Atribute to store user input.

    int points = 0; //The more points, the more chance that the seduction will work.

    //Prompt for the game, too lazy to write it every time, not lazy enough to write this comment.
    public seduce()
    {
        System.out.println("\n\nYou were nice enough to play the game, you didn't have to go as far as to do\nTHIS.\n");
    }
    
    //Method used when you decide to seduce the tree.
    void seduceTree()
    {
        Scanner scanner = new Scanner(System.in);
        //Question 1
        System.out.println("What is the world's largest inland sea?");
        printTab("a. Atlantic");
        printTab("b. Polar");
        printTab("c. Caspian"); //correct answer
        printTab("d. Fart"); //-__- Josh is an idiot
        prompt();
        answer('c'); //Since it only reads a single char, if the user types "cats are stupid," it will only read the first letter, 'c'.
        
        //Question 2
        System.out.println("\nThis Italian military and political leader of the late 15th century, along with");
        System.out.println("his sister, was known for treachery and cruelty. In fact, he was the model for");
        System.out.println("Machiavelli's \"The Price.\" Can you name him and his sister?");
        printTab("a. JACK and JILL ITALIA");
        printTab("b. CESARE and LUCREZIA BORGIA"); //Correct answer
        printTab("c. MARIO and LUIGI IS A GIRL"); //ask Josh if AS or IS
        printTab("d. BENTIO and SUZY MUSSOLINI");
        prompt();
        answer('b');
        
        //Question 3
        System.out.println("\nThe modern opera, Porgy and Bess, was written by whom, and takes place in");
        System.out.println("which city");
        printTab("a. Shakespeare / London, England");
        printTab("b. Mom / The Moon, Space");
        printTab("c. George and Ira Gerschwin / Charleston, S.C."); //correct answer
        printTab("d. Bob Ross / Charleston, C.S.");
        prompt();
        answer('c');
        
        //Question 4
        System.out.println("\nIn 1582 Pope Gregory XIII sponsored a new solar calendar to replace an older");
        System.out.println("calendar in effect since 46 BC, that had been introduced by what person?");
        printTab("a. Bob Saget");
        printTab("b. Adolf Hitler");
        printTab("c. John Barclay");
        printTab("d. Julius Caesar"); //Correct answer
        prompt();
        answer('d');
        
        //Question 5
        System.out.println("\nIf H. Ross Perot is ever elected President, he will undoubtedly be the richest");
        System.out.println("man ever elected to this office. Who were the two wealthiest people to become");
        System.out.println("President in the 20th Century?");
        printTab("a. John F. Kennedy / Franklin Roosevelt"); //correct answer
        printTab("b. John F. Kennedy / Barack Obama");
        printTab("c. Franklin Roosevelt / Bill Clinton");
        printTab("d. John F. Kendy / Frankln Roosevelt");
        prompt();
        answer('a');
        
        //Question 6
        System.out.println("\nThe British Leaders Robert Walpole, Earl Grey, and Lord Melbourne, and the");
        System.out.println("Americans Henry Clay, Daniel Webster, W.M. Henry Harrison, and Millard Fillmore");
        System.out.println("were all associated with which political party?");
        printTab("a. Republicans");
        printTab("b. Democrats");
        printTab("c. Some british thing, go away");
        printTab("d. Whigs"); //correct answer
        prompt();
        answer('a');
        
        //Question 7
        System.out.println("\nTom Hanks won the Academy Award as Best Actor for his role in what 1993 film, in");
        System.out.println("which he played an attorney with what disease");
        printTab("a. Philadelphia / Autism");
        printTab("b. Philadelphia / AIDS"); //correct answer
        printTab("c. Tennessee / Autism");
        printTab("d. Ace Attorney / AIDS");
        prompt();
        answer('a');
        
        //Question 8
        System.out.println("\nWhen Captain James Cook discovered the Hawiian Islands in 1778, he named them");
        System.out.println("in honor of John Montagu, a British politician, who invented a certain kind of");
        System.out.println("food. What name did Captain Cook give to Hawaii");
        printTab("a. Crepe Islands");
        printTab("b. Parfait Islands");
        printTab("c. Sandwich Islands"); //correct answer
        printTab("d. Brioche Islands");
        prompt();
        answer('c');
        
        //Question 9
        System.out.println("\nEdward Teach, an Englishman who turned to an extremely savage form of piracy,");
        System.out.println("was better known by what colorful name?");
        printTab("a. Davy Jones");
        printTab("b. Blackbeard"); //correct answer
        printTab("c. Captain Hook");
        printTab("d. Dread Pirate Roberts");
        prompt();
        answer('b');
        
        //Question 10
        System.out.println("\nWho was the courageous 10-year-old gymnast at the 1996 Olympics in Atlanta");
        System.out.println("whose vault on a severely sprained ankle helped ensure a U.S. Gold Medal in");
        System.out.println("gymnastics?");
        printTab("a. Kerry Strug"); //Correct answer
        printTab("b. Maria Sharapova");
        printTab("c. Amelia Earhart");
        printTab("d. Quenn Elizabeth");
        prompt();
        answer('a');
        
        //Question 11
        System.out.println("\nAccording to a survey taken by AT&T, the average American changes residence how");
        System.out.println("many times during a lifetime?");
        printTab("a. 20");
        printTab("b. 3");
        printTab("c. 400");
        printTab("d. 11"); //correct answer
        prompt();
        answer('d');
        
        //Question 12
        System.out.println("\nWhat museum is the London treasury of literature, science, and art, and the");
        System.out.println("home of the Magna Carta, Rosetta Stone, and the Elgin Marbles?");
        printTab("a. The Louvre");
        printTab("b. World Museum");
        printTab("c. British Museum");
        printTab("d. Uffizi Gallery");
        prompt();
        answer('d');
        
        //Question 13
        System.out.println("\nWith a wingspan of 3.6 meters, or almost 12 feet, what living bird, found");
        System.out.println("mostly in the southern hemisphere, has the largest wingspan?");
        printTab("a. Bald Eagle");
        printTab("b. Peregrine Falcon");
        printTab("c. Wandering Albatross"); //correct answer
        printTab("d. Jabiru");
        prompt();
        answer('c');
        
        //Question 14
        System.out.println("\nOn November 28, 1995, 50.28% of Irish voters voted in favor of lifting a ban on");
        System.out.println("what?");
        printTab("a. Alcohol");
        printTab("b. Divorce"); //correct answer
        printTab("c. Cocain");
        printTab("d. Insanely Big Mustaches");
        prompt();
        answer('b');
        
        //Question 15
        System.out.println("\nHow is it possible to determine the sex of a parakeet?");
        printTab("a. Same way as anything, genitalia");
        printTab("b. Seriously, just the genitals");
        printTab("c. The genitals");
        printTab("d. Color of the cere"); //correct answer
        prompt();
        answer('d');
        
        //Taunt
        System.out.println("\nYou got " + this.points + " points. If you would ask me, that's pretty crappy.\n\n");
    }
    
    void seduceDuck()
    {
        //Question 1
        System.out.println("Which Frenchman designed the skeleton of the Statue of Liberty");
        printTab("a. Kestrel Fri");
        printTab("b. Kevin Swampe");
        printTab("c. Mariah Mann");
        printTab("d. Gustave Eiffel"); //correct answer
        prompt();
        answer('d');
        
        //Question 2
        System.out.println("\nAfter Los Angeles, what is the most populated California city whose name does");
        System.out.println("not begin with the letter \"S\"?");
        printTab("a. Albania");
        printTab("b. Bee City");
        printTab("c. Hollywood");
        printTab("d. Long Beach"); //correct answer
        prompt();
        answer('d');
        
        //Question 3
        System.out.println("\nWhich letter begins more words in the English language than any other letter?");
        printTab("a. S"); //correct answer
        printTab("b. L");
        printTab("c. E");
        printTab("d. M");
        prompt();
        answer('a');
        
        //Question 4
        System.out.println("\nIf you draw one card from a normal deck of cards, what is the mathematical");
        System.out.println("probability of drawing a jack, queen, king, or diamond");
        printTab("a. 12%");
        printTab("b. 43%");
        printTab("c. 15%");
        printTab("d. 42%"); //correct answer
        prompt();
        answer('d');
        
        //Question 5
        System.out.println("\nHis radio show is one of the most popular in America, his book was number 1 on");
        System.out.println("the New York Times best-seller list for 10 weeks, and some of his supporters");
        System.out.println("have stated that he should ren for President in 1996 on the Republican ticket.");
        System.out.println("Who is he?");
        printTab("a. Tom Cruise");
        printTab("b. Kevin Kevinson");
        printTab("c. Jordan Daniel");
        printTab("d. Rush Limbaugh"); //correct answer
        prompt();
        answer('d');
        
        //Question 6
        System.out.println("\nWhat 10th century Catholic saint is know as the patron saint of skiing,");
        System.out.println("snowboarding, hiking and mountaineering?");
        printTab("a. St. Bernard"); //correct answer
        printTab("b. St. Levian");
        printTab("c. St. Deonta");
        printTab("d. St. Blacke");
        prompt();
        answer('a');
        
        //Question 7
        System.out.println("\nCan you identify two California mountains with six-letter names?");
        printTab("a. Pazazz / Zizzle");
        printTab("b. Quartz / Izzard");
        printTab("c. Quippy / Jockey");
        printTab("d. Shasta / Diablo"); //correct answer
        prompt();
        answer('d');
        
        //Question 8
        System.out.println("\nIn China these noodle-dough dumplings are filled with meat and boiled in soup,");
        System.out.println("and are called what?");
        printTab("a. Won Ton"); //correct answer
        printTab("b. Hello stupid");
        printTab("c. Eat your hat");
        printTab("d. Noodle dough dumplings filled with meat and cook soup");
        prompt();
        answer('a');
        
        //Question 9
        System.out.println("\nThe Inuit Indian tribe can be found in Canada, Greenland, and Siberia, but are");
        System.out.println("known to us by a more common name. What is it?");
        printTab("a. AI Tribe");
        printTab("b. The hairs of Kevin James chest");
        printTab("c. Eskimo"); //correct answer
        printTab("d. Haida");
        prompt();
        answer('c');
        
        //Question 10
        System.out.println("\nIf you looked at a clock in the mirror and the time on the clock face appeared");
        System.out.println("to read 8:20, what time would it be in reality?");
        printTab("a. 8:20");
        printTab("b. 3:40"); //correct answer
        printTab("c. 12:49");
        printTab("d. 2:14");
        prompt();
        answer('b');
        
        //Question 11
        System.out.println("\nIf you flip a coin three times, what's the probability of getting at least one");
        System.out.println("\"tail\"?");
        printTab("a. 1/2");
        printTab("b. 9/12");
        printTab("c. 3/8");
        printTab("d. 7/8"); //correct answer
        prompt();
        answer('d');
        
        //Question 12
        System.out.println("\nCan you name the person whose face appeared on the cover of Time Magazine more");
        System.out.println("than any other person, about 64 times, during his lifetime?");
        printTab("a. Johnny Depp");
        printTab("b. Bill Nye");
        printTab("c. Richard Nixon"); //correct answer
        printTab("d. Deep Roy");
        prompt();
        answer('c');
        
        //Question 13
        System.out.println("\nAccording to 1991 population estimates, which city of the word has the largest");
        System.out.println("population, 27 million in its metro area?");
        printTab("a. Los Angeles");
        printTab("b. New York");
        printTab("c. Tokyo"); //correct answer
        printTab("d. Buford");
        prompt();
        answer('c');
        
        //Question 14
        System.out.println("\nIf a rubber band weighs 40 milligrams, how many of them will weigh one");
        System.out.println("kilogram?");
        printTab("a. 800");
        printTab("b. -20,000,000");
        printTab("c. 10,000,000");
        printTab("d. -25,000"); //correct answer
        prompt();
        answer('d');
        
        //Question 15
        System.out.println("\nThe breed of horse that excels at sprinting short distances, in races of a");
        System.out.println("quarter mile or less, are aptly called what?");
        printTab("a. Shetland");
        printTab("b. Austin's");
        printTab("c. Quarter"); //correct answer
        printTab("d. PP");
        prompt();
        answer('c');
        
        System.out.println("\nYou got " + this.points + " points. If you would ask me, that's pretty crappy.\n\n");
    }
    
    void seduceGardener()
    {
        //Question 1
        System.out.println("In the final of 1992, the first McDonald's restaurant in Africa opened in an");
        System.out.println("exotic city bordering the Atlantic Ocean - the largest city in its country.");
        System.out.println("What city was it?");
        printTab("a. Casablanca"); //correct answer
        printTab("b. Weast Niger");
        printTab("c. AustinisaPoopyHead");
        printTab("d. Lagos");
        prompt();
        answer('a');
        
        //Question 2
        System.out.println("\nSeawater contains about what percent salt?");
        printTab("a. 38%");
        printTab("b. 87%");
        printTab("c. 4%"); //correct answer
        printTab("d. -72%");
        prompt();
        answer('c');
        
        //Question 3
        System.out.println("\nWith an estimated fortune at over $1 billion, she's one of the richest women in");
        System.out.println("Britain, and in 2006 was the second-richest female entertainer in the world.");
        System.out.println("Who is this?");
        printTab("a. J. K. Rowling"); //correct answer
        printTab("b. Erin Hunter");
        printTab("c. Emma Watson");
        printTab("d. Emily Blunt");
        prompt();
        answer('a');
        
        //Question 4
        System.out.println("\nPatty Hearst was kidnapped on February 4, in what year?");
        printTab("a. 1973");
        printTab("b. 1982");
        printTab("c. 2014");
        printTab("d. 1974"); //correct answer
        prompt();
        answer('d');
        
        //Question 5
        System.out.println("\nWhat do these well known people have in common? Dan Aykrod, Neil Young, Michael");
        System.out.println("J. Fox, and Peter Jennings?");
        printTab("a. Make Movies");
        printTab("b. Somewhat weird names");
        printTab("c. Humans");
        printTab("d. Born in Canada"); //correct answer
        prompt();
        answer('d');
        
        //Question 6
        System.out.println("\nIf there are 16 telephone poles in a straight line, each pole 80 meters apart,");
        System.out.println("how far is it from the first pole to the last?");
        printTab("a. Do you have math? I HATE math!");
        printTab("b. 1200 Meters"); //correct answer
        printTab("c. 300 Meters");
        printTab("d. 4 Days");
        prompt();
        answer('b');
        
        //Question 7
        System.out.println("\nWhat is the name of the delightful 1980 South African film about an African");
        System.out.println("bushman sent by his tribe to get rid of the evil thing that droped out of the");
        System.out.println("sky: a Coke bottle");
        printTab("a. Africa be Cray-Cray");
        printTab("b. The Gods Must be Cray-Cray");
        printTab("c. The Gods Must be Crazy"); //correct answer
        printTab("d. WOW");
        prompt();
        answer('c');
        
        //Question 8
        System.out.println("\nThis word refers to a type of sofa, a type of overcoat, a brand of cigarettes,");
        System.out.println("and a city in England. What is it?");
        printTab("a. Thatington");
        printTab("b. Thatch");
        printTab("c. Hooch");
        printTab("d. Chesterfield"); //correct answer
        prompt();
        answer('d');
        
        //Question 9
        System.out.println("\nWhich television personality, who retired in May, 1992, announced in a");
        System.out.println("television interview that he was comfortable in front of an audience but");
        System.out.println("awkward with people off camera?");
        printTab("a. May Haruka");
        printTab("b. Johnny Cash");
        printTab("c. A-Ha");
        printTab("d. Johnny Carson"); //correct answer
        prompt();
        answer('d');
        
        //Question 10
        System.out.println("\nWhat is Desi Arnaz's catchphrase?");
        printTab("a. Hey");
        printTab("b. Babaloo");
        printTab("c. LUCY I'M HOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOME"); //correct answer
        printTab("d. Thank You So Much");
        prompt();
        answer('c');
        
        //Question 11
        System.out.println("\nWhich range of hills runs in a north-south direction through the central part");
        System.out.println("of England?");
        printTab("a. Killaway");
        printTab("b. Pennies"); //correct answer
        printTab("c. Karl");
        printTab("d. Martisx");
        prompt();
        answer('b');
        
        //Question 12
        System.out.println("\nWhat is the product name of the Skull Shaver Electric Razor");
        printTab("a. Harkian");
        printTab("b. J-Marks");
        printTab("c. Danger-J");
        printTab("d. Bald Eagle"); //correct answer
        prompt();
        answer('d');
        
        //Question 13
        System.out.println("\nWhat professional boxer retired from the sport in 1976, later un-retired, and");
        System.out.println("in 1994 became the oldest fighter to ever win a major heavyweight title?");
        printTab("a. Mike Tyson");
        printTab("b. 'Little Mac'");
        printTab("c. George Foreman"); //correct answer
        printTab("d. Kevin James");
        prompt();
        answer('c');
        
        //Question 14
        System.out.println("\nBy what name do we identify those certain kinds of weasels whose coats change");
        System.out.println("color in the winter?");
        printTab("a. Winter Weasels");
        printTab("b. Ermine"); //correct answer
        printTab("c. Weir");
        printTab("d. Drupe");
        prompt();
        answer('b');
        
        //Question 15
        System.out.println("\nA city is in the shape of a rectangle, three times as long as it is wide. If a");
        System.out.println("diagonal distance through the city is one kilometer, what's the area of this");
        System.out.println("city, to the nearest square meter?");
        printTab("a. Do you have math? I HATE math");
        printTab("b. 333,333 Square Meters"); //correct answer
        printTab("c. 333,323 Square Meters");
        printTab("d. 400 Square Meters");
        prompt();
        answer('b');
        
        System.out.println("\nYou got " + this.points + " points. If you would ask me, that's pretty crappy.\n\n");
    }
    
    void printTab(String s)
    {
        System.out.print("\t" + s + "\n");
    }
    
    //Method make input taking less tedious. Prompts the user then stores it in the atribute "input"
    void prompt()
    {
        Scanner quiz = new Scanner(System.in);
        System.out.print("Answer here (just the letter): ");
        this.input = quiz.next().charAt(0); //Stores their character in atribute input.
    }
    
    //Method for one answer that gives points.
    void answer(char let)
    {
        char o1, o2, o3; //Where o = other possibility
        char oC0, oC1, oC2, oC3; //Where oC is other possibility capitalized. oC0 is the answer capitalized
        /* Next if else set is for setting the above characters. */
        if (let == 'a') { //If single answer letter is 'a'
            o1 = 'b';
            o2 = 'c';
            o3 = 'd';

            oC0 = 'A';
            oC1 = 'B';
            oC2 = 'C';
            oC3 = 'D';
        } else if (let == 'b') { //If single answer letter is 'b'
            o1 = 'a';
            o2 = 'c';
            o3 = 'd';

            oC0 = 'B';
            oC1 = 'A';
            oC2 = 'C';
            oC3 = 'D';
        } else if (let == 'c') { //If single answer letter is 'c'
            o1 = 'a';
            o2 = 'b';
            o3 = 'd';

            oC0 = 'C';
            oC1 = 'A';
            oC2 = 'B';
            oC3 = 'D';
        } else { //If single letter answer is 'd'
            o1 = 'a';
            o2 = 'b';
            o3 = 'c';

            oC0 = 'D';
            oC1 = 'A';
            oC2 = 'B';
            oC3 = 'C';
        }
        
        if(input == let || input == oC0)
            ++points;
        else if(!(input == o1 || input == o2 || input == o3 || input == oC1 || input == oC2 || input == oC3))
            System.out.println("\nYou are the idiotest, not even typing the letter right. What are you, stupid?\n"); //"Notifies" (insults) the player that (s)he didn't type a, b, c, or d.
    }
}
