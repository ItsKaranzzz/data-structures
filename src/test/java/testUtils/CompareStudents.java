package testUtils;

import students.Student;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class CompareStudents {

    public static void main(String[] args) {

        List<Student> students = new LinkedList<>();
        students.add(new Student("Karan", 99));
        students.add(new Student("Abiraka", 33));
        students.add(new Student("Vikash", 25));
        students.add(new Student("abhishek", 55));
        students.add(new Student("Rajdeep", 44));
        students.add(new Student("shikhar", 65));
        students.add(new Student("abhishek", 31));

       /* 1.
       Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getMarks() > o2.getMarks())
                    return 1;
                else if (o1.getMarks() < o2.getMarks())
                    return -1;
                else
                    return 0;
            }
        });*/

       /* 2.
        Collections.sort(students, (o1, o2) -> {
            if (o1.getName().equals(o2.getName()))
                return o1.getMarks() - o2.getMarks();
            else
                return o1.getName().compareTo(o2.getName());
        });
*/

       // 3.  Collections.sort(students, Comparator.comparing(Student::getName).thenComparing(Student::getMarks).reversed());

       //4.  Collections.sort(students, new testUtils.CompareStudent());

        Collections.sort(students);
        students.forEach(System.out::println); //Overridden 'toString()' method is required for this
    }
}

class CompareStudent implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getName().equals(o2.getName()))
            return o1.getMarks() - o2.getMarks();
        else
            o1.getName().compareTo(o2.getName());
        return 0;
    }
}
