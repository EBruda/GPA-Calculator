import java.util.ArrayList;

public class Calculator
{
    private ArrayList<Double> grades;


    public Calculator(ArrayList grades)
    {
        this.grades = grades;
    }

    public double calcGPA()
    {
        double sum =  0.0;

        {
            for (int i = 0; i < grades.size(); i++)
            {
                double num = grades.get(i);
                if (num >= 90.0)
                {
                    sum += 4.0;
                }

                else if (num >= 80.0)
                {
                    sum += 3.0;
                }

                else if (num >= 74)
                {
                    sum += 2.0;
                }

                else if (num >= 70)
                {
                    sum += 1;
                }

                else
                    {
                    sum += 0;
                }
            }
        }
        return (sum / grades.size());
    }

    public String message(double gpa)
    {
        String msg = " ";
        if (gpa == 4)
        {
            msg="Wow!! That's awesome. Great job and continue working hard!!";
        }

        else if (gpa>=3)
        {
            msg="Congrats your gpa is awesome!! Keep up the good work!!!";
        }

        else if (gpa>=2)
        {
            msg = "Not bad. Your GPA is good, but it could be better. If you have trouble in some subjects try getting tutoring or meeting up and having a study session with some friends. Don't ever give up!!!!!";
        }

        else if (gpa>=1)
        {
            msg="Your gpa is a little low, but that's okay! If you have trouble in some subjects try getting tutoring or meeting up and having a study session with some friends. Don't ever give up!!!!!";
        }

        else
        {
            msg="DO NOT GIVE UP!!!!!! It will get better. No matter how hard it may seem now things will get better. Friends and teachers are here to help and you can count on them whenever you have trouble.";
        }

        String reminder="This is high school. Things can be hard. Projects, tests, quizzes, lots of homework, etc. You may think that you want to give up and everything is hopeless sometimes. No matter what never give up. Remember: try to find something positive each day, even if some days you have to look a little harder!!!";

        return msg + "\n" + reminder;
    }
}