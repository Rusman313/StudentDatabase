import java.util.Scanner;

public class Student{
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = "";
    private int  tuitionBal = 0;
    private static int courseCost = 600;// belongs to the class not the instance of the object. 
    private static int id = 1000;

    //Constructor will prompt user to enter students name and year
    public Student(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter student first name: ");
        this.firstName = scan.nextLine();
        System.out.println("Enter student last name: ");
        this.lastName = scan.nextLine();
        System.out.println("\n1 - for Freshman\n2 - for Sophomore\n3 - for Junior\n4 - for Senior\nEnter student grade level: ");
        this.gradeYear = scan.nextInt();
        setStudentID();
      
        //System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);

    }

    // Generate a student ID
    private void setStudentID(){
        //Grade Level + ID
        id++;
       this.studentID =  gradeYear + "" + id;
    }

    // Enroll in courses
    public void enroll(){
        // get inside a loop user hits 0
         do{   System.out.println("Enter course to enroll (Q to quit): ");
            Scanner scan = new Scanner(System.in);
            String course = scan.nextLine();
            if (!course.toLowerCase().equals("q")){
                courses = courses +"\n" + course;
                tuitionBal = tuitionBal + courseCost;
               
            }
            else{break;}
         } while (1 != 0);
        //System.out.println("ENROLLED IN:" + courses);
       // System.out.println("TUITION BALANCE:" + tuitionBal);

    }

    // view bal
    public void viewBal(){
        System.out.println("Your balance is: $" + tuitionBal);
    }
    // pay tuition
    public void payTuition(){
        viewBal();
       System.out.print("How much would you like to pay today?\n $");
        Scanner scan = new Scanner(System.in);        
        int payment = scan.nextInt();
       
        tuitionBal = tuitionBal - payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBal();
    }

    // show status
    public String showInfo() {
        return "\nName: " + firstName + lastName + "\nGrade Level:" + gradeYear + "\nStudent ID: " + studentID
                + "\nCourses Enrolled: " + courses + "\nTuition Balance:" + tuitionBal;
    }
}