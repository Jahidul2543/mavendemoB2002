package controlflow;

public class WhileDemo {

    public void useWhileStatement(){
        int age = 1;
        while (age> 5 && age <7){
            System.out.println("Admit the baby in the school");
            break;
        }

        while (age<5){
            System.out.println("Study at home as your age is " + age);
            age++;
        }
    }
}
