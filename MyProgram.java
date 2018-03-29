public class MyProgram extends ConsoleProgram
{
    //start of the code\\
    public void run()
    {
    inst();
    println("Well then lets begin!");
    println("");
    String name = readLine("Name your player: ");
    println("");
    boolean confirm = readBoolean(name +". Are you sure? Type True or False. ");
    println("");
    if (confirm == true){
        cave();
    }
    if (confirm == false){
        run();
    }
    }
    //what the player starts\\
void cave(){
    println("You awake in a dark cave, it reaks of Ork.");
    println("");
    println("There is a small opening ahead of you.");
    println("");
    println("Do you push on?");
    println("");
    println("1: Push on.");
    println("");
    println("2: Turn back.");
    println("");
    int movement = readInt("1 or 2: ");
    println("");
    if (movement > 2 ){
        toBad();
    }
    if (movement == 1){
        pushOn();
    }
    if (movement == 2){
        println("you are crushed and killed...");
        gameOver();
    }
}
//if the player does not choose 1 or 2\\
void toBad() {
    println("Do you push on?");
    println("");
    println("1: Push on.");
    println("");
    println("2: Turn back.");
    println("");
    int movement = readInt("1 or 2: ");
    println("");
    if (movement > 2 ){
       toBad(); 
    }
    if (movement == 1){
        pushOn();
    }
    if (movement == 2){
        println("you are crushed by a bolder and killed...");
        println("");
        gameOver();
    }
}
//Push on\\
void pushOn(){
println("You go through the small opening and come to a big illuminated opening.");
println("");
println("The flames of torches dance on the stone walls.");
println("");
println("Orks lay sleeping on the dirty floor.");
println("");
println("You ponder what you should do.");
println("");
firstChoise();
}
//game over\\
void gameOver(){
    println("Game Over... Try again?");
boolean over = readBoolean("Try again?: ");
    if (over == true){
        println("");
        run();
        }
    if (over == false){
        falseStart();
    }
    }
    //Start of the game\\
void inst(){
    println("=-<>-= Welcome to my Game! =-<>-=");
    println("=-=-= How to play =-=-=");
    println("");
    println("Most of these questions are True/False");
    println("");
    println("The question will state if you are to use 1 or 2.");
    println("");
    println("=-=-= Terms and Conditions =-=-=");
    println("© 2018 Noah Peters");
    println("");
    println("Do not copy this game's code or story without my written consent.");
    println("");
    println("This game is in very early access, and is in no way in it's final form.");
    println("");
    println("Please leave Bug reports and suggestions here");
    println("Bug/Suggestions Form: http://bit.ly/2tJfBMF");
    
    boolean start = readBoolean("Ready to play? Type True or False: ");
    if (start == false){
    falseStart();
    }
    if (start == true){
        println("");
        println("Begining Loading Now!");
        println("");
        for (int i = 0; i <= 100; i++)
{
    System.out.println("Now loading... " + i + "%");
    println("");
}
    }
}
//Code for what to do if the player does not want to start\\
void falseStart(){
    println("");
    println("Oh, ok then. Well be sure to vist my site");
    println("");
    println("noahpeters.codehs.me");
    println("");
    println("Hope to see you again!");
    System.exit(1);
}
//first player choise\\
void firstChoise(){
    println("1: Sneak past.");
    println("");
    println("2: Try and loot them.");
    println("");
    println("3: Try and attack them.");
    println("");
    int choise = readInt("1, 2, or 3: ");
    if (choise == 1){
        sneakPast();
    }
    if (choise == 2){
      lootThem();  
    }
    if (choise == 3){
        println("");
        println("You are killed by the Orks.");
        println("");
        gameOver();
    }
}
//sneakPast\\
void sneakPast(){
    println("");
    println("You are able to sneak past the sleeping orks");
    println("");
    println("This is the end of the game so far, I hope you enjoyed it!");
    println("");
    println("Visit my website for updates.");
    println("");
    println("noahpeters.codehs.me");
}
//looted the orks\\
void lootThem(){
    println("");
    println("You loot the first ork hoping not to wake it.");
    println("");
    lootRan();
}
//randomizer of the loot\\
void lootRan(){
    String loot = ("a Stone sword.");
    //int low = 1;
    //int high = 3;
    //int roll = Randomizer.nextInt(low, high);
    //if (roll == 1){
        //loot = ("a Stone sword.");
    //}
    //if (roll == 2){
      //  loot = ("some gold.");
    //}
    //if (roll == 3){
      //  loot = ("a long bow.");
    //}
    println("You find " + loot);
    println("");
    println("End of game. Please wait for more code to be added to continue. I hope you enjoyed it!");
    println("");
    println("Visit my website for updates.");
    println("");
    println("noahpeters.codehs.me");
}
}
