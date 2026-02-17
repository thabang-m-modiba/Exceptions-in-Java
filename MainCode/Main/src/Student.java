/**
 * @author Thabang Mamoloko
 */
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;
/**
 * Class for student
 */
public class Student {

	/**
	 * @param args - N/A
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        String[] subjectsAndMarks = new String[7];
        StudentDashboard dashboard = null;
        
        try {
        	System.out.print("Enter name: ");
        	String name = scanner.nextLine();
        	
        	for(int i = 0; i < subjectsAndMarks.length; i++) {
        		String regex = "^[A-Za-z ]+-\\\\d{2}$";
        		Pattern pattern = Pattern.compile(regex);
        		
        		while(true) {
        			System.out.println("Enter subject " + (i+1) + " and marks (E.g: physics-78): ");
        			String subjectAndMark = scanner.nextLine();
        			
        			if(pattern.matcher(subjectAndMark).matches()) {
        				subjectsAndMarks[i] = subjectAndMark;
        				break;
        			}else {
        				System.out.println("Invalid Input!: ");
        			}
        		}
        		
        	}
        	dashboard = new StudentDashboard(name, subjectsAndMarks);
        }catch(InputMismatchException e) {
        	System.out.println("Invalid input! Please enter numeric values.");
        }catch(NegativeMarkException | MarkOutOfRangeException e) {
        	System.out.println("Error: " + e.getMessage());
        }
        
        int choice = 0;
        
        while(choice != 3) {
        	try {
        		System.out.println("\n1. Calculate Average");
        		System.out.println("2. Grade subjects");
        		System.out.println("3. Exit");
        		System.out.print("Select: ");
        		choice = scanner.nextInt();
        		
        		switch(choice) {
        		case 1:
        			System.out.println("Average : " + dashboard.calculateAverage(subjectsAndMarks));
        			break;
        		case 2:
        			dashboard.assignGrade(subjectsAndMarks);
        			break;
        		case 3:
        			System.out.println("Exiting...");
        			break;
        		default:
        			System.out.println("Ivalid input");
        		}
        	}catch(InputMismatchException e) {
        		System.out.println("Invalid input! Please enter a numeric input.");
        	}finally {
        		System.out.println("Services complete...");
        	}
        }
        
        scanner.close();
	}

}
