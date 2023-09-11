package Week01Assignment02;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please write the size of your group and press [Enter]: ");
        int groupSize= scanner.nextInt();
        System.out.println("Group size: "+groupSize);
        char[]studentPresent=new char[groupSize];
        String[]studentName=new String[groupSize];

        for (int i = 0; i < studentName.length; i++) {
            System.out.println("Please enter the name of the student #"+(i+1)+" and press [Enter]: ");
            studentName[i]= scanner.next();
        }

        System.out.println();

        for (int i = 0; i < studentName.length; i++) {
            System.out.println("student #"+(i+1)+": "+studentName[i]);
        }

        System.out.println();

        for (int i = 0; i <studentName.length ; i++) {
            System.out.println("Is student #"+(i+1)+"("+studentName[i]+") present? [Y/N] + [Enter]: ");
            String presentOrAbsent=scanner.next().toLowerCase();
            studentPresent[i]=presentOrAbsent.charAt(0);

        }
        for (int i = 0; i <groupSize ; i++) {
            Student student=new Student(studentName[i],studentPresent[i]);// is that "6. Store every student as a new object in the collection"
            if(student.presentOrAbsent=='y') {
                System.out.println("student #" + (i + 1) + ": " + student.name + "           | Present: true");
            }
            else
            {
                System.out.println("student #" + (i + 1) + ": " + student.name + "           | Present: false");

            }
        }

    }
}