import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args) {
        //Student s1 = new Student();
       // s1.enroll();
       // s1.payTuition();
       //System.out.println(s1.showInfo());
        // ask how many new students we want to add
        System.out.println("Enter number of new students to enroll: ");
        Scanner scan = new Scanner(System.in);
        int numOfStudents = scan.nextInt();
        Student[] students = new Student[numOfStudents];

        // create n number of new students
        for (int n = 0; n < numOfStudents; n++) {
            students[n] = new Student();
            students[n].enroll();
            students[n].payTuition();
           // System.out.println(students[n].showInfo());
        }
        for(int n = 0; n< numOfStudents; n++){
            System.out.println(students[n].showInfo());
        }

        scan.close();
        
    }
}