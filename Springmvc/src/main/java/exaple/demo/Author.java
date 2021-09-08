package exaple.demo;


import java.util.LinkedHashMap;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import exaple.demo.validator.CourseCode;

public class Author 
{
	
	
	private String first_name;
	
	@NotNull(message="is required")
	@Size(min=1, message="is required")
	private String last_name;
	
	private String audio;
	public String getPostalcode() {
		return postalcode;
	}
	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}
	private String country;
	private String gender;
	
	@NotNull(message="is required")
	@Min(value=13,message="age must be greater than 18")
	@Max(value=13,message="age must be greater than 18")
	private Integer age;
//	private int age;
	
	
	@Pattern(regexp="^[a-zA-Z0-9]{6}",message="Code must be 6 digits")
	private String postalcode;
	

	//	private LinkedHashMap<String, String> countryOptions;
	private LinkedHashMap<String, String> genders;
	
	private String[] genre;
	
	@CourseCode(value="www", message="must start with www")
	private String website;
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public Author()
	{
		genders=new LinkedHashMap();
		genders.put("MALE", "Male");
		genders.put("FeMALE", "FeMale");
		genders.put("PreferNottosay", "Not Disclosed");
//		countryOptions=new LinkedHashMap();
//		countryOptions.put("IND", "INDIA");
//		countryOptions.put("USA", "USA");
//		countryOptions.put("ITA", "ITALY");
//		countryOptions.put("FRAN", "FRANCE");
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getAudio() {
		return audio;
	}
	public void setAudio(String audio) {
		this.audio = audio;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
//	public LinkedHashMap<String, String> getCountries() {
//		return countryOptions;
//	}
//	
	public String getGender() {
		return gender;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public LinkedHashMap<String, String> getGenders() {
		return genders;
	}
	public String[] getGenre() {
		return genre;
	}
	public void setGenre(String[] genre) {
		this.genre = genre;
	}
}
