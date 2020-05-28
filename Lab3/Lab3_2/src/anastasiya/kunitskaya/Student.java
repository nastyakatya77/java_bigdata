package anastasiya.kunitskaya;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Student
{
    private static int lastId = 0;
    private int ID;
    private String firstName;
    private String lastName;
    private String middleName;
    private Date birth;
    private String address;
    private String tel;
    private String faculty;
    private int grade;
    private int group;

    public Student(boolean fillRand)
    {
        if(!fillRand)
            return;

        List<String> firstNames = Arrays.asList("Иван", "Петр", "Александр", "Георгий", "Григорий");
        List<String> lastNames = Arrays.asList("Иванов", "Петров", "Александров", "Георгиев", "Григорьев");
        List<String> middleNames = Arrays.asList("Иванович", "Петрович", "Александрович", "Георгиевич", "Григорьевич");
        List<Date> births = Arrays.asList(new Date(855964800), new Date(863827200), new Date(902880000), new Date(849657600), new Date(868233600));
        List<String> addresses = Arrays.asList("Ивановская, 54", "Петровская, 30", "Александровская, 21с1", "Георгиевсий пер., 2/3", "Григорьевская наб., 1");
        List<String> tels = Arrays.asList("8(800)555-35-35", "8(922)123-23-23", "8(912)915-91-92", "8(999)999-99-99", "8(555)555-55-55");
        List<String> faculties = Arrays.asList("Экономики", "Информатики", "Биотехнический", "Механизмов", "Дорожный");

        int s = 0;
        int e = 4;

        init(firstNames.get(rand(s, e)), lastNames.get(rand(s,e)), middleNames.get(rand(s,e)),
                births.get(rand(s,e)), addresses.get(rand(s,e)), tels.get(rand(s,e)),
                faculties.get(rand(s,e)), rand(s,e)+1, rand(s,e)+1);
    }

    private int rand(int start, int end) { return start + (int) (Math.random() * end); }

    public Student(String firstName, String lastName, String middleName, Date birth, String address,
                       String tel, String faculty, int grade, int group)
    {
        init(firstName, lastName, middleName, birth, address, tel, faculty, grade, group);
    }

    public void init(String firstName, String lastName, String middleName, Date birth, String address,
                String tel, String faculty, int grade, int group)
    {
        this.ID = ++lastId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.birth = birth;
        this.address = address;
        this.tel = tel;
        this.faculty = faculty;
        this.grade = grade;
        this.group = group;
    }

    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setMiddleName(String middleName) { this.middleName = middleName; }
    public void setBirth(Date birth) { this.birth = birth; }
    public void setAddress(String address) { this.address = address; }
    public void setTel(String tel) { this.tel = tel; }
    public void setFaculty(String faculty) { this.faculty = faculty; }
    public void setGrade(int grade) { this.grade = grade; }
    public void setGroup(int group) { this.group = group; }

    public int getID() { return ID; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getMiddleName() { return middleName; }
    public Date getBirth() { return birth; }
    public String getAddress() { return address; }
    public String getTel() { return tel; }
    public String getFaculty() { return faculty; }
    public int getGrade() { return grade; }
    public int getGroup() { return group; }

    public String toString()
    {
        return Integer.toString(ID) + " " + lastName + " " + firstName + " " + middleName + " " +
                birth.toString() + " " + address + " " + tel + " Факультет " + faculty + " " +
                Integer.toString(grade) + "-" + Integer.toString(group);
    }
}
