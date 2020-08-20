package variable_according_to_scope;

public class Courses {

    public static void main(String[] args) {
        Courses courses = new Courses();
        courses.getQAAEStudentList();
    }

    public void getQAAEStudentList(){
        Students students = new Students();
        String student1 = students.student1;
        System.out.println(student1);

       String student2 = Students.student2;
        System.out.println(student2);
    }
}
