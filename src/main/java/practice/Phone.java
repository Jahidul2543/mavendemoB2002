package practice;

public class Phone {

    /**
     * 1. Call
     * 2. text
     * 3. takePhoto
     * 4. listenMusic
     * 5. useInternet
     * 6. playVideo
     * 7. useTickTok
     * 8. useGoToMeeting
     *
     * */


     // default constructor, no parameters
    public Phone(){
        System.out.println("I am default constructor");
    }

    // Second constructor, you need to have one or more parameters
    public Phone(String nameOfPhoneColor){
        System.out.println("Build a phone of " + nameOfPhoneColor + "color");
    }

    public Phone(String typePhoneMemory, int memorySize){
        System.out.println("Build a phone with " + typePhoneMemory + "and size " + memorySize + " GB");
    }


    public Phone(int memorySize, String typePhoneMemory){
        System.out.println("Build a phone with " + typePhoneMemory + "and size " + memorySize + " GB");
    }

    public static void main(String[] args) {

        // Declaration of a variable
        String firstName;
        // initialization
        firstName = "Don";

        Phone myPhone = new Phone();
        myPhone.call("John");
        // myPhone.sendText() == Hello!!! How are you?
      // String textMessage = myPhone.sendText();
       // System.out.println(textMessage);

        Phone myBlueColorPhone = new Phone("Blue");
        // call your friend Sadaf using myBlueColorPhone
        myBlueColorPhone.call("Sadaf");

        Phone phoneWithLargeMemory = new Phone("Sand Disk", 256);
        phoneWithLargeMemory.call("Kiran");
        phoneWithLargeMemory.sendText();

    }

    public void call(String name){
        System.out.println("Calling....." + name);
    }

    public String sendText(){
        int numberOfText = 3;
        String textMessage = "Hello!!! How are you?";
        return textMessage;
    }

    public void takePhoto(){
        System.out.println("Taking photo using built in 24MP camera");
    }

    public void listenMusic(){
        System.out.println("Playing music");
    }
}
