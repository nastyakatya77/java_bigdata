package anastasiya.kunitskaya;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Enrollee
{
    private static int lastId = 0;
    private int ID;
    private String firstName;
    private String lastName;
    private String middleName;
    private Date birth;
    private String address;
    private String tel;
    private Exam.Faculty faculty;

    private boolean checked;
    private int score;

    public Enrollee(String firstName, String lastName, String middleName, Date birth, String address,
                String tel, Exam.Faculty faculty)
    {
        this.ID = ++lastId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.birth = birth;
        this.address = address;
        this.tel = tel;
        this.faculty = faculty;

        this.checked = false;
        this.score = 0;
    }

    public static Enrollee getRandEnrollee()
    {
        List<String> firstNames = Arrays.asList("Иван", "Петр", "Александр", "Георгий", "Григорий", "Анатолий");
        List<String> lastNames = Arrays.asList("Иванов", "Петров", "Александров", "Георгиев", "Григорьев", "Анатольев");
        List<String> middleNames = Arrays.asList("Иванович", "Петрович", "Александрович", "Георгиевич", "Григорьевич", "Анатольевич");
        List<Date> births = Arrays.asList(new Date(855964800), new Date(863827200), new Date(902880000), new Date(849657600), new Date(868233600), new Date(899657600));
        List<String> addresses = Arrays.asList("Ивановская, 54", "Петровская, 30", "Александровская, 21с1", "Георгиевсий пер., 2/3", "Григорьевская наб., 1", "ул. Анатольева");
        List<String> tels = Arrays.asList("8(800)555-35-35", "8(922)123-23-23", "8(912)915-91-92", "8(999)999-99-99", "8(555)555-55-55", "8(888)888-88-88");
        List<Exam.Faculty> faculties = Arrays.asList(Exam.Faculty.values());

        int s = 0;
        int e = Arrays.asList(Exam.Faculty.values()).size();

        return new Enrollee(firstNames.get(rand(s, e)), lastNames.get(rand(s,e)), middleNames.get(rand(s,e)),
                births.get(rand(s,e)), addresses.get(rand(s,e)), tels.get(rand(s,e)),
                faculties.get(rand(s,e)));

    }

    public static int rand(int start, int count) { return start + (int) (Math.random() * count); }

    public int getID() { return ID; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getMiddleName() { return middleName; }
    public Date getBirth() { return birth; }
    public String getAddress() { return address; }
    public String getTel() { return tel; }
    public Exam.Faculty getFaculty() { return faculty; }

    public String toString()
    {
        return Integer.toString(ID) + " " + Integer.toString(score) + " " + lastName + " " + firstName + " " + middleName + " " +
                birth.toString() + " " + address + " " + tel + " Факультет " + faculty;
    }

    public int getScore() { return score; }
    public void setScore(int score)
    {
        this.checked = true;
        this.score = score;
    }
    public boolean isChecked() { return checked; }
}
