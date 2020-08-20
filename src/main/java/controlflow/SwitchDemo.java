package controlflow;

public class SwitchDemo {

    public void moodDetector(){
        /**
         * Type of the case
         * byte, short, char,      int, String, ENUM Type
         * Byte, Short, Character, Integer
         *
         * */
        String activity = "";

        switch (activity){

            case "Eating":
                thingsToDoWhenMoodIsGood();
                //
                //
                //
                break;

            case "PoorSleep":
                System.out.println("Mood is bad because I am " + activity);
                break;

            case "LossingSomething":
                System.out.println("Mood is sad because I am " + activity);
                break;

            case "PoorSleep&LossingSomething":
                System.out.println("I am in sad and bad mood");
                break;

            default:
                System.out.println("I am ok, nothing happening in my mind");

        }
    }

    public void thingsToDoWhenMoodIsGood(){
        System.out.println("I make call to my friends");
        System.out.println("I go outside");
        System.out.println("I talk to much, even with strangers");
    }

}
