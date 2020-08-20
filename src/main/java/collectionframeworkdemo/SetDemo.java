package collectionframeworkdemo;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

    public static void main(String[] args) {

        /**
         * Set does not maintain index
         * */


        /**
         * Use case
         * Store 10 email address in a email.properties files
         * Read 10 email address from email.properties file using Java
         * Sort unique email addresses using Java
         * */

        Set<String> emailId = new HashSet<>();

        emailId.add("john@gmail.com");
        emailId.add("mon@yahoo.com");
        emailId.add("khon@hotmail.com");
        emailId.add("john@gmail.com");

        for (String email : emailId){
            System.out.println(email);
        }
    }
}
