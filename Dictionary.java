import java.util.*; 
import java.util.Scanner;

public enum Dictionary{
    ARROWNOUN("Arrow", "noun", "Here is one arrow: <IMG> -=>> </IMG>"),
    BOOKNOUN1("Book", "noun", "A set of pages."),
    BOOKNOUN2("Book", "noun", "A writen work published in printed or electronic form"),
    BOOKVERB1("Book", "verb", "To arrange for someone to have a seat on a plane"),
    BOOKVERB2("Book", "verb", "To arrange something on a particular date."),
    DISTINCTADJ1("Distinct", "adjective", "Familiar. Worked in Java."),
    DISTINCTADJ2("Distinct", "adjective", "Unique. No duplicates. Clearly different or of a different kind."),
    DISTINCTADVERB("Distinct", "adverb", "Uniquely. Written \"distinctly\"."), 
    DISTINCTNOUN1("Distinct", "noun", "A keyword in this assignment"),
    DISTINCTNOUN2("Distinct", "noun", "A keyword in this assignment"),
    DISTINCTNOUN3("Distinct", "noun", "A keyword in this assignment"),
    DISTINCTNOUN4("Distinct", "noun", "An advanced search option"),
    DISTINCTNOUN5("Distinct", "noun", "Distince is a parameter in this assignment"),
    PLACEHOLDERADJ1("Placeholder", "adjective", "To be updated..."),
    PLACEHOLDERADJ2("Placeholder", "adjective", "To be updated..."),
    PLACEHOLDERADVERB("Placeholder", "adverb", "To be updated..."),
    PLACEHOLDERCONJUN("Placeholder", "conjunction", "To be updated..."),
    PLACEHOLDERINTER("Placeholder", "interjunction", "To be updated..."),
    PLACEHOLDERNOUN1("Placeholder", "noun", "To be updated..."),
    PLACEHOLDERNOUN2("Placeholder", "noun", "To be updated..."),
    PLACEHOLDERNOUN3("Placeholder", "noun", "To be updated..."),
    PLACEHOLDERPREP("Placeholder", "prepostion", "To be updated..."),
    PLACEHOLDERPRO("Placeholder", "pronoun", "To be updated..."),
    PLACEHOLDERVERB("Placeholder", "verb", "To be updated..."),
    REVERSEADJ1("Reverse", "adjective", "On back side."),
    REVERSEADJ2("Reverse", "adjective", "Opposite to usual or previous arrangement."),
    REVERSENOUN1("Reverse", "noun", "A dictionary program's paramenter."),
    REVERSENOUN2("Reverse", "noun", "Change to opposite direction."),
    REVERSENOUN3("Reverse", "noun", "The opposite."),
    REVERSENOUN4("Reverse", "noun", "To be updated..."),
    REVERSENOUN5("Reverse", "noun", "To be updated..."),
    REVERSENOUN6("Reverse", "noun", "To be updated..."),
    REVERSENOUN7("Reverse", "noun", "To be updated..."),
    REVERSEVERB1("Reverse", "verb", "Change something to opposite."),
    REVERSEVERB2("Reverse", "verb", "Go back"),
    REVERSEVERB3("Reverse", "verb", "Revoke ruling."),
    REVERSEVERB4("Reverse", "verb", "To be updated..."),
    REVERSEVERB5("Reverse", "verb", "To be updated..."),
    REVERSEVERB6("Reverse", "verb", "Turn something inside out."),
    WILSONNOUN("Wilson", "noun", "A CSC student's name"),
    HEIGHTNOUN1("Height", "noun", "the measurement from base to top of from head to foot."),
    HEIGHTNOUN2("Height", "noun", "the most intense part or period of something"),
    POSEVERB1("Pose", "verb", "present or constitute."),
    POSEVERB2("Pose", "verb", "assume a particular attitude or position in order to be photographed, painted, or drawn"),
    POSENOUN1("Pose", "noun", "a particular way of standing or sitting, usually adopted for effect or in order to be photographed, painted, or drawn."),
    POSENOUN2("Pose", "noun", "a particular way of behaving adopted in order to give others a false impression or to impress others."),
    VIBENOUN1("Vibe", "noun", "To be updated..."),
    VIBENOUN2("Vibe", "noun", "To be updated..."),
    VIBENOUN3("Vibe", "noun", "To be updated..."),
    HORSENOUN1("Horse", "noun", "To be updated..."),
    HORSENOUN2("Horse", "noun", "To be updated..."),
    HORSENOUN3("Horse", "noun", "To be updated..."),
    MINENOUN("Mine", "noun", "To be updated..."),
    CARNOUN("Car", "noun", "To be updated..."),
    CRANENOUN("Crane", "noun", "To be updated..."),
    CANYONNOUN("Canyon", "noun", "To be updated..."),
    MOONNOUN("Moon", "noun", "To be updated..."),
    SNOWNOUN("Snow", "noun", "To be updated..."),
    DRIVERNOUN("Driver", "noun", "To be updated..."),
    RIVERNOUN("River", "noun", "To be updated..."),
    ROOSTERNOUN("Rooster", "noun", "To be updated...");


    private final String word;
    private final String speech;
    private final String definition;
    
    Dictionary(String word, String speech, String definition){
        this.word = word;
        this.speech = speech;
        this.definition = definition;
    }

    public String getWord(){
        return this.word.toUpperCase();
    }

    public String getSpeech(){
        return this.speech;
    }

    public String getDefinition(){
        return this.definition;
    }

    @Override
    public String toString(){
        return (this.word + " [" + this.speech + "] : " + this.definition);
    }

    public static void main(String args[]){
       HashMap<String, ArrayList<Dictionary>> map = new HashMap<String, ArrayList<Dictionary>>();
       boolean on = true;
       String input;
       int inputCounter = 1;
       Scanner sc = new Scanner(System.in);
       System.out.println("! Loading data... ");
       System.out.println();

       for (Dictionary dictionary: Dictionary.values()){
           String word = dictionary.getWord();
           if (map.containsKey(word)){
               ArrayList<Dictionary> list = map.get(word);
               list.add(dictionary);
               map.put(word, list);
           }
           else{
               ArrayList<Dictionary> list = new ArrayList<Dictionary>();
               list.add(dictionary);
               map.put(word, list);
           }
       } 
       //System.out.println(map);
       System.out.println("! Loading completed... ");
       System.out.println("===== DICTIONARY 340 JAVA =====");
       System.out.println("----- Keywords: " + map.size());
       System.out.println("----- Definitions: " + Dictionary.values().length);

       System.out.println();
 
       while(on){
           System.out.print("Search [" + inputCounter + "]: ");
           input = sc.nextLine();
           String[] splitString = input.split(" ");

           String searchWord = null;
           Boolean isDistinct = false;
           String speech = null;
           Boolean isReverse = false;

           if (splitString.length > 0){
               searchWord = splitString[0];
           }

           String[] speeches = {"noun", "verb", "adjective", "pronoun", "prepostion", "conjuntion", "interjection"};
           if (splitString.length > 1 && splitString[1] != null) {
                if (splitString[1].equalsIgnoreCase("distinct")) {
                    isDistinct = true;
                }
                else if (splitString[1].equalsIgnoreCase("reverse")){
                    isReverse = true;
                }
                else if (Arrays.asList(speeches).contains(splitString[1].toLowerCase())){
                    speech = splitString[1];
                }
                else{
                    System.out.println("   |");
                    System.out.println("   <The entered 2nd parameter '" + splitString[1] + "' is NOT a part of speech.>");
                    System.out.println("   <The entered 2nd parameter '" + splitString[1] + "' is NOT 'distinct'.>");
                    System.out.println("   <The entered 2nd parameter '" + splitString[1] + "' is NOT 'reverse'.>");
                    System.out.println("   <The entered 2nd parameter '" + splitString[1] + "' was disregarded.>");
                    System.out.println("   <The 2nd parameter should be a part of speech or 'distinct' or 'reverse'.>");
                    System.out.println("   |");

                }
            }
            if (splitString.length > 2 && splitString[2] != null) {
                if (splitString[2].equalsIgnoreCase("distinct")) {
                    isDistinct = true;
                }
                else if (splitString[2].equalsIgnoreCase("reverse")){
                    isReverse = true;
                }
                else{
                    System.out.println("   |");
                    System.out.println("   <The entered 3rd parameter '" + splitString[2] + "' is NOT 'distinct'.>");
                    System.out.println("   <The entered 3rd parameter '" + splitString[2] + "' is NOT 'reverse'.>");
                    System.out.println("   <The entered 3rd parameter '" + splitString[2] + "' was disregarded.>");
                    System.out.println("   <The 3rd parameter should be 'distinct' or 'reverse'.>");
                    System.out.println("   |");

                }
            }

            if (splitString.length > 3 && splitString[3] != null) {
                if (splitString[3].equalsIgnoreCase("reverse")){
                    isReverse = true;
                }
                else{
                    System.out.println("   |");
                    System.out.println("   <The entered 4th parameter '" + splitString[3] + "' is NOT 'reverse'.>");
                    System.out.println("   <The entered 4th parameter '" + splitString[3] + "' was disregarded.>");
                    System.out.println("   <The 4th parameter should be 'reverse'.>");
                    System.out.println("   |");

                } 
            }

            if (input.equalsIgnoreCase("!help") || (input == "")){
                help();
                System.out.println("   |");
            }

            if (input.equalsIgnoreCase("!q")){
                System.out.println();
                System.out.println("-----Thank You-----");
                on = false;
            }

            if (!input.equalsIgnoreCase("!q") && (!input.equalsIgnoreCase("!help"))){
                System.out.println("   |");
                ArrayList<Dictionary> result1 = map.get(searchWord.toUpperCase());  //holds all the values associated to key
                ArrayList<Dictionary> result2 = (isDistinct) ? distinctFilter(result1) : result1;  //distinct
                ArrayList<Dictionary> result3 = (speech != null) ? speechFilter(result2, speech) : result2;
                ArrayList<Dictionary> result4 = (isReverse) ? reverseFilter(result3) : result3;
                
                if (result4 != null && result4.size() > 0){
                    for (Dictionary key : result4){
                        System.out.println("    " + key);
                    }
                }
                else {
                    System.out.println("    <Not Found> To be considered for the next release. Thank you.");
                    System.out.println("   |");
                    help();
                }
                System.out.println("   |");
            }
           inputCounter++;
       }
       
   }
   public static void help(){
       System.out.println("   |");
       System.out.println("    PARAMETER HOW-TO, please enter:");
       System.out.println("    1. A search key -then 2. An options part of speech - then");
       System.out.println("    3. An optional 'distinct' -then 4. An optional 'reverse'");
   }
   public static ArrayList<Dictionary> distinctFilter(ArrayList<Dictionary> dict){
       ArrayList<Dictionary> result = new ArrayList<Dictionary>();
       if (dict != null){
            String speech = "adjective";
            ArrayList<String> dummy = new ArrayList<String>();
           for (Dictionary dictionary : dict){
                if (speech != dictionary.getSpeech()){
                    speech = dictionary.getSpeech();
                    dummy.clear();
                }
                if (!dummy.contains(dictionary.getDefinition())){
                    result.add(dictionary);
                    dummy.add(dictionary.getDefinition());
                }
           }
       }
       return result;
   }

   public static ArrayList<Dictionary> speechFilter(ArrayList<Dictionary> dict, String speech) {
        ArrayList<Dictionary> result = new ArrayList<Dictionary>();
        if (dict != null){
           for (Dictionary dictionary : dict){
               if (dictionary.getSpeech().equalsIgnoreCase(speech)){
                   result.add(dictionary);
               }
           }
       }
       return result;
   }

   public static ArrayList<Dictionary> reverseFilter(ArrayList<Dictionary> dict){     
        ArrayList<Dictionary> revArrayList = new ArrayList<Dictionary>();
        for (int i = dict.size() - 1; i >= 0; i--) {
            revArrayList.add(dict.get(i));
        }
        return revArrayList;
   }
}