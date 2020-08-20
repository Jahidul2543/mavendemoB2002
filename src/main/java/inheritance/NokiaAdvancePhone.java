package inheritance;
// Java does not support multiple inheritance
public class NokiaAdvancePhone extends NokiaPhone {

    public void camera(){
        System.out.println("Can Take Photo....");
    }

    public void camera(String cameraName){
        System.out.println("Can Take Photo....");
    }

    public void phoneBook(){
        System.out.println("Phone book....");
        System.out.println("I am overriding the phoneBook Method");
    }
}
