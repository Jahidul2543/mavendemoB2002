package inheritance;

public /*final*/ class NokiaPhone extends PreNokia {

    public void buildDisplay(){
        System.out.println("Display.....");
    }

    public void takePhoto(){
        System.out.println("Take Photo..");
    }

    public void phoneBook(){
        System.out.println("Phone book....");
    }

    public void mp3Player(){
        System.out.println("Play ringtone");
    }
    public void games(){
        System.out.println("Snake Game...");
    }

    public static void main(String[] args) {
        NokiaPhone nokiaPhone = new NokiaPhone();
        nokiaPhone.call();
        nokiaPhone.sendText();
        nokiaPhone.newIdea();
       int x = nokiaPhone.x;
        System.out.println(x);
    }

}
