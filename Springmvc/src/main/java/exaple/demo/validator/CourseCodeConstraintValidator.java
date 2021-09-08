package exaple.demo.validator;



import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator 
	implements ConstraintValidator<CourseCode, String> {

	
//	private String[] coursePrefixes;
	private String coursePrefix;
	
//	Spring will intialize it at start
	
	public void initialize(CourseCode theCourseCode) 
	{
		coursePrefix = theCourseCode.value();
	}

// it will check against validation
	public boolean isValid(String website, ConstraintValidatorContext theconstraint) {
		// TODO Auto-generated method stub
		boolean result;
		if(website!=null)
//			for (String tempPrefix : coursePrefix)
//			{
//				result = website.startsWith(tempPrefix);
//				
//				// if we found a match then break out of the loop
//				if (result) {
//					break;
//				}
//			}
			result=website.startsWith(coursePrefix);
		else
			result=true;
		
		
		return result;
	}

	

	
}
