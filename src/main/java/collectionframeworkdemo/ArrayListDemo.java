package collectionframeworkdemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

    public void studentList(){

        int[] myArray = new int[5];
        myArray[0] = 12;

        List<Integer> studentsIdList = new ArrayList<Integer>();
        String name = new String("John");
        System.out.println(name);

        //ArrayList studentsIdList = new ArrayList<Integer>();


        studentsIdList.add(11);//0
        studentsIdList.add(12);//1
        studentsIdList.add(13);//2
        studentsIdList.add(14);//3
        studentsIdList.add(null);// 4
        studentsIdList.add(11);

        /*
        * List canhold null value
        * List allows duplicate values
        * */

        System.out.println("Element in index 0:" + studentsIdList.get(0));
        System.out.println("Length of the studentIdList: " + studentsIdList.size());

        for (int i= 0; i<=studentsIdList.size() - 1; i++){
            System.out.println("Element in index " + i + ' ' + studentsIdList.get(i));
        }

       /*for (Integer x: studentsIdList){

           System.out.println(x);
       }*/

        studentsIdList.forEach(x ->  System.out.println(x));

    }
}
