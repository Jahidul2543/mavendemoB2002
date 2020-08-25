package inheritance;

public interface Max {
    public void mp3Player();
    public void games();

    default public void newIdea(){
        System.out.println("Hello I am default method in interface Max");
    }
}
