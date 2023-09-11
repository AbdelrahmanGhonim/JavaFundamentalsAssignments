package Assignment1Week1;
import java.util.Scanner;

public class Assignment1Array {
    public static void main(String[]args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter course name: ");
        String programName= scanner.nextLine();

        System.out.println("Enter a number of Students: ");
        int studentsNumber=scanner.nextInt();

        System.out.println();

        String[]studentName=new String[studentsNumber];
        int[]studentGrade=new int[studentsNumber];

        for (int i = 0; i < studentName.length; i++) {
            System.out.println("Enter name of student "+(i+1)+": ");
            studentName[i]=scanner.next();//nextLine will ignore the first student

        }

        for (int i = 0; i < studentGrade.length; i++) {
            System.out.println("Enter grade of "+studentName[i]+": ");
            studentGrade[i]=scanner.nextInt();
        }

        double averageGrades=CalculateAverage(studentGrade);
        System.out.printf("Average grade is : %.2f%n ",averageGrades);

        int IndexOfHigestStudentGrade=HigestGrade(studentGrade);
        System.out.println("Student "+studentName[IndexOfHigestStudentGrade]+" has maximum grade: "+studentGrade[IndexOfHigestStudentGrade]);

        for (int i = 0; i <studentName.length ; i++) {
            System.out.println("Grade of student "+studentName[i]+" (course "+programName+") : "+studentGrade[i]);
        }

        scanner.close(); // Is this the right way.
    }

    public static double CalculateAverage(int[]grades)
    {
        double averageGrade;
        int sum=0;
        for (int i = 0; i < grades.length; i++) {
             sum+= grades[i];
        }
        averageGrade=(double)sum/grades.length;
        return  averageGrade;
    }

    public static int HigestGrade(int[]grades)
    {
        int higestGrade=0;
        int IndexOfHigestStudentGrade=0;
        for (int i = 0; i < grades.length; i++) {

            if(grades[i]>higestGrade)
            {
                higestGrade=grades[i];
                IndexOfHigestStudentGrade=i;
            }
        }
        return IndexOfHigestStudentGrade;
    }
}
