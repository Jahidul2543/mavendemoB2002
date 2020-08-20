package javaio;

import java.io.FileReader;
import java.io.IOException;

public class FileReadingDemo {

    public void readFile() throws IOException {

        String filePath = "/Users/jahidul/IdeaProjects/JavaBasicBatch2002/data/demo.txt";

        FileReader fileReader = new FileReader(filePath);

        //fileReader.read()

        int i;
        while ((i= fileReader.read())!=-1){
            System.out.print((char) i);
        }

    }

}
