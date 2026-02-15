/**
 * @author Thabang Mamoloko
 */

import java.util.StringTokenizer;

/**
 * This class handles the student's marks
 */
public class StudentDashboard {
	private String name;
	private String[] subjectAndMarks;
	/**
	 * Display Student dashboard
	 * @param name - the name of the Student
	 * @param subjectAndMarks - an array of strings in format "subject-mark"
	 * @throws MarkOutOfRangeException - Handling marks out of range exception
	 * @throws NegativeMarkException  - Handling exception for negative marks
	 */
	public StudentDashboard(String name, String[] subjectAndMarks) throws MarkOutOfRangeException, NegativeMarkException {
		for(int i = 0; i < subjectAndMarks.length; i++) {
			StringTokenizer tokens = new StringTokenizer(subjectAndMarks[i], "-");
			String subject = tokens.nextToken();
			int mark = Integer.parseInt(tokens.nextToken());
			
			if(mark < 0) {
				throw new NegativeMarkException("Marks cannot be less than zero.");
			}
			if(mark > 100) {
				throw new MarkOutOfRangeException("Marks cannot be greater than 100.");
			}
		}
		this.name = name;
		this.subjectAndMarks = subjectAndMarks;
	}
	
	/**
	 * Method to calculate the average mark of the student
	 * @param subjectAndMark - this is an array of Strings of the format "subject-marks"
	 * @return average
	 */
	public int calculateAverage(String[] subjectAndMark) {
		int average = 0;
		for(int i = 0; i < subjectAndMark.length; i++) {
			StringTokenizer tokens = new StringTokenizer(subjectAndMark[i], "-");
			String subject = tokens.nextToken();
			int mark = Integer.parseInt(tokens.nextToken());
			average += mark;
		}
		
		return (average/subjectAndMark.length);
	}
	
	/**
	 * This method assigns grade based on marks for each subject
	 * @param subjectAndMark - an array containing subjects and marks
	 */
	public void assignGrade(String[] subjectAndMark) {
		for(int i = 0; i < subjectAndMark.length; i++) {
			StringTokenizer tokens = new StringTokenizer(subjectAndMark[i], "-");
			String subject = tokens.nextToken();
			int mark = Integer.parseInt(tokens.nextToken());
			if(mark<50) {
				System.out.println("Failed " + subject + ". Mark: " + mark);
			}else if(mark > 50 && mark < 74) {
				System.out.println("Passed " + subject + ". Mark: " + mark);
			}else {
				System.out.println("Disticntion " + subject + ". Mark: " + mark);
			}
		}
	}
	
	
}
