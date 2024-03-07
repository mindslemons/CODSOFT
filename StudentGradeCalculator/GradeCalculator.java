import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        System.out.println("Number of subjects?");
        int noSubjects = enter.nextInt();
        if(noSubjects <= 0){
            System.out.println("No subjects entered, please try again.");
            return;
        }
        int totalMarks = 0;
        int maxMarks = 100;
        for(int m = 1; m<= noSubjects; m++){
            System.out.println("Marks for respective subjects" + m +"/100:" );
            int marks = enter.nextInt();
            if(marks < 0 | marks > maxMarks){
                System.out.println("Invalid input,try again");
                m--;
            }
            else{
                totalMarks += marks;
            }
        }
        double average = (double) totalMarks /(noSubjects * maxMarks)*100;
        System.out.println("Total:" + totalMarks);
        System.out.println("Average:" + average + "%" );
        
        String eval;
        if(average >= 80){
            eval = "A";
        }else if(average >= 70){
            eval = "B";
        }else if(average >= 60){
            eval = "C";
        }else if(average >= 50){
            eval = "D";
        }else{
            eval = "E";
        }
        System.out.println("Grade is:" +eval);
    }
}
