package com.knoldus;


import java.util.*;


import java.util.stream.Collectors;



public class MainClass {

    public static void main(String[] args) {

        StudentsWithNoSubjects res1 = new StudentsWithNoSubjects();
        List<String> res_new = res1.studentswith0Subjects();



        System.out.println(" The students associated with a room that have no subjects ="+res_new);

        UniqueSubjectList res2 = new UniqueSubjectList();
        Set<String> resQ2 = res2.uniqueSubjects();

        System.out.println("List of unique subjects of the students that has  roomID  \"XYZ\". "+resQ2);

        HelloStudent res3 = new HelloStudent();
        res3.printHello();




    }

}


