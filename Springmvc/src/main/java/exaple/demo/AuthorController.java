package exaple.demo;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/authors")
public class AuthorController {
	
//	add an init binder
//	remove leading and tralig whitespace
//	if string has white space converts ii to null
//	resolve issue of our validation
	
	@InitBinder
	public void initBinder(WebDataBinder webbinder)
	{
		StringTrimmerEditor theeditor=new StringTrimmerEditor(true);
//		register with customeditor
		webbinder.registerCustomEditor(String.class,theeditor);
		
		
	}
	
	 @Value("#{countryOptions}") 
	private Map<String, String> countryOptions;
	    
	@RequestMapping("/homes")
	public String getForm()
	{
		return "homes";
	}
	
	@RequestMapping("/authorForm")
	private String showForm(Model themodel)
	{
		Author author=new Author();
		
//		add author object to model
		
		themodel.addAttribute("author", author);
		
//		add the object to model to access value from properties
		themodel.addAttribute("thecountryOptions", countryOptions);
		
		return "author-form";
	}
	
//	Tell spring to validate our form
	@RequestMapping("/processForm")
	private String confirmForm(@Valid @ModelAttribute("author") Author author,BindingResult thebindingresult)
	{
		
		System.out.println("Binding results"+thebindingresult);
//		if not validate then it returns back to author-form 
//		else goes to author confirm page
//		assert(author.getLast_name()==null):"Type something";
		System.out.println(thebindingresult.hasErrors());
		if(thebindingresult.hasErrors())
		{
			
			return "author-form";
		}
		else
			return "author-confirm";
	}

}

