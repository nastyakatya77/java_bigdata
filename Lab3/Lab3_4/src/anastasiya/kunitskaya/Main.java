package anastasiya.kunitskaya;

public class Main {

    public static void main(String[] args)
    {
        Exam exam = new Exam();

        for(int i = 0; i < 50; i++)
            exam.register(Enrollee.getRandEnrollee());

        for(int i = 1; i <= exam.getEnrolleeCount(); i++)
        {
            exam.setScore(i, Enrollee.rand(50, 50));
        }

        exam.printPassed();
    }
}
