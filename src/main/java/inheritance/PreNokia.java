package inheritance;

public abstract class PreNokia implements SymbianPhone, Max {

    int x = 4;

    public void call(){
        System.out.println("Calling....");
    }
    public void sendText(){
        System.out.println("Sending....");
    }

    public abstract void buildDisplay();

}
