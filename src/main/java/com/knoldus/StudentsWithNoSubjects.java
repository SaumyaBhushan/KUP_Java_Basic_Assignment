package com.knoldus;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentsWithNoSubjects {
    public List<String> studentswith0Subjects ()
    {
        List<Student> s = Data.StudentList().stream().filter(obj -> obj.getSubject().isEmpty())
                .collect(Collectors.toList());

        List<String> names= new ArrayList<String>();

        for (Student t : s) {

            names.add(t.getName());

        }

       // System.out.println(" The students associated with a room that have no subjects ="+names);

        return names;

    };
}
