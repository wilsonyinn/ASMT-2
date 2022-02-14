import java.util.Scanner;

public enum Dictionary{
    ARROWNOUN1("Arrow", "noun", "Here is one arrow: <IMG> -=>> </IMG>");

    private final String word;
    private final String speech;
    private final String definition;
    
    Dictionary(String word, String speech, String definition){
        this.word = word;
        this.speech = speech;
        this.definition = definition;
    }

   public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("! Loading data... ");
       // !LOAD IN DATA THOUGH FILE
       System.out.println("! Loading completed... ");
       System.out.println("===== DICTIONARY 340 JAVA =====");
       // !PRINT NUM WORDS AND DEFINITIONS
       System.out.println();
       Word word = new Word("blast");
 
       //while(on){
           //System.out.print("Search [" + input_counter + "]: ");
           //input = sc.nextLine();
           // !LOWERCASE INPUT
           // !PRINT RESPONSE
           //input_counter++;
       }
   }
   // !CREATE DATA FILE
 
   // LOAD IN DATA THROUGH FILE
 
   // TAKE INPUT AND RETURN APPROPRIATE RESPONSE
 
   // INSTRUCTIONS FOR !HELP AND EXIT PROGRAM
 
}

