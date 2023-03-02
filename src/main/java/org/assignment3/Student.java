package org.assignment3;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Student
{
    String studentname;
    private static final  Logger LOGGER=Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    String gradelevel;
    int gpa;
    int newgpa;
    Scanner sc= new Scanner (System.in);
    private Student( String studentname,String gradelevel,int gpa)
    {
        this.studentname=studentname;
        this.gradelevel=gradelevel;
        this.gpa=gpa;
    }
    private int update()
    {
        LOGGER.log(Level.INFO,"Enter the new gpa");
        newgpa=sc.nextInt();
        gpa=newgpa;

        return gpa;
    }

    private void display()
    {
        LOGGER.log(Level.INFO,Double.toString((gpa)),"the gpa is:"+(gpa));
    }

    public static void execute() {
        Scanner sc = new Scanner(System.in);
        try {
            String studentname;
            String gradelevel;
            int gpa;
            int choice;
            LOGGER.log(Level.INFO, "Enter the Studentname:");
            studentname = sc.next();
            LOGGER.log(Level.INFO, "Enter the gradelevel");
            gradelevel = sc.next();
            LOGGER.log(Level.INFO, "Enter the gpa:");
            gpa = sc.nextInt();
            Student s = new Student(studentname, gradelevel, gpa);
            LOGGER.log(Level.INFO, "Enter the choice:");
            LOGGER.log(Level.INFO, "1.update 2.display");
            choice = sc.nextInt();
            if (choice == 1) {
                gpa = s.update();
                LOGGER.log(Level.INFO, Double.toString((gpa)), "The updated student gpa is:" + (gpa));
            } else if (choice == 2) {
                s.display();
            }
        }catch (Exception e)
        {
            String ec = ""+e;
            LOGGER.info(ec);
            sc.nextLine();
        }
    }
}