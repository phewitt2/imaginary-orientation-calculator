package studentOrientation.driver;


import studentOrientation.util.Money;
import studentOrientation.util.USMoney;


public class Driver {
	public static void main(String[] args) {
		Money testMoney = new USMoney(24, 56);
		System.out.println(testMoney);
		
		/*Here is the template for the driver code of the builder pattern.
		  I believe the orientationSchedule should be a data member in student.
		  We will need to work on the class hierarchy.
		  I think driver is a good place to start because it should be independent
		  of the implementation of each class.
		
		Student myStudent = new Student();
		
		BookstoreChoice myBookstoreChoice = new MandosBookstore();
		DormChoice myDormChoice = new OnlineDorm();
		CourseRegChoice myCourseRegChoice = new RegistrarOfficeCourseReg();
		TourChoice myTourChoice = new FootTour();
		
		**Note: instantiation of these concrete objects is what makes this builder pattern**
		** Pieces are assembled in any order by the client, then given to the builder to  **
		** construct the complex object.						  **
		
		AbstractBuilder orientationSchedule = new OrientationScheduleBuilder();
		orientationSchedule.construct(myBookstoreChoice, myDormChoice, 
						myCourseRegChoice, myTourChoice);
						
		myStudent.setOrientationSchedule(orientationSchedule.getSchedule());
		myStudent.displayResults(); //display results will call methods to obtain cost, effort, time and print
		*/
	}
}
