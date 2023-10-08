package util;

import student.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static util.Constants.*;
import static util.Constants.DATE_OF_BIRTH;

public class Util {

   public static List<Student> getStudents(List<Map<String,String>> studentInfo) {
       List<Student> studentList = new ArrayList<>();
       studentInfo.forEach( x-> {
           String first_name = x.get(FIRST_NAME);
           String last_name = x.get(LAST_NAME);
           int student_id = Integer.parseInt(x.get(STUDENT_ID));
           String date_of_birthday = x.get(DATE_OF_BIRTH);
           studentList.add(new Student(first_name,last_name,student_id,date_of_birthday));
       });
        return studentList;
   }


}
