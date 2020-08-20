package controlflow.enumdemo;

public class EnumTest {
    Day day;

    public EnumTest(Day day){
        this.day = day;
    }

    public void useEnum() {

        switch (day){
            case SATURDAY:
                System.out.println("Enjoy!!!");
                break;
            case SUNDAY:
                System.out.println("Enjoy but prepare for Monday");
                break;
            case MONDAY:
                System.out.println("Oh no.. this is Monday");
                break;
            case TUESDAY:
                System.out.println("This is " + day.TUESDAY);
                break;
            case WEDNESDAY:
                System.out.println("This is half way to the week " + day.WEDNESDAY);
                break;
            case THURSDAY:
                System.out.println("Happy day is coming " + day.THURSDAY);
                break;
            case FRIDAY:
                System.out.println("Very happy day....End of week...");
                break;


        }

    }
}
