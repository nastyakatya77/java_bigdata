package anastasiya.kunitskaya;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args)
    {
        List<Student> students = new ArrayList<>();
        for(int i = 0; i < 10; i++)
            students.add(new Student(true));

        System.out.println("Студенты:");
        for (Student student: students)
        {
            System.out.println(student.toString());
        }

        System.out.println("Факультет Экономики");
        for (Student student: students)
        {
            if(student.getFaculty().equals("Экономики"))
            System.out.println(student.toString());
        }

        List<String> faculties = Arrays.asList("Экономики", "Информатики", "Биотехнический", "Механизмов", "Дорожный");
        for(String faculty : faculties)
        {
            System.out.println("Факультет " + faculty + ":");
            for (Student student: students)
            {
                if(student.getFaculty().equals(faculty))
                    System.out.println(student.toString());
            }
        }

        for(int i = 1; i < 6; i++)
        {
            System.out.println("Курс " + Integer.toString(i) + ":");
            for (Student student: students)
            {
                if(student.getGrade() == i)
                    System.out.println(student.toString());
            }
        }

        Date date = new Date(854755200);
        System.out.println("После: " + date.toString());
        for (Student student: students)
        {
            if(student.getBirth().after(date))
                System.out.println(student.toString());
        }

        System.out.println("Группа: 3");
        for (Student student: students)
        {
            if(student.getGroup() == 3)
                System.out.println(student.toString());
        }
    }
}
