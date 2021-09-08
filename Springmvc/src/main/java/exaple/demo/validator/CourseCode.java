package exaple.demo.validator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;	
import javax.validation.Payload;

@Constraint(validatedBy= CourseCodeConstraintValidator.class)
@Target({ElementType.METHOD,ElementType.FIELD})
//reteain this annotaion into bytecode and use this at runtime
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode 
{
	
//	we can also add mulitle value 
//	public String[] value() default {"LUV"};
//	Validate with multiple string
	public String value() default "www";
	
	public String message() default "must start with www";
	
//	define default group
	
	public Class<?>[] groups() default {};
	
	Class<? extends Payload>[] payload() default {};
	
	
}
