import java.util.ArrayList;

// SNHU IT 145
// Module 5
// Quinton Hesse
public class Monkey extends RescueAnimal { //monkey subclass
	private String tailLength; //monkey specific variables
	private String height;
	private String bodyLength;
	private String species;
	public Monkey(String name, String tailLength, String height, String bodyLength, String species, String gender,
			String age, String weight, String acquisitionDate, String acquisitionCountry, String trainingStatus, boolean reserved, 
			String inServiceCountry) { //monkey constructor
		setName(name); //from parent class
		setTailLength(tailLength); // new child class variables
		setHeight(height);
		setBodyLength(bodyLength);
		setSpecies(species);
	    setGender(gender);
	    setAge(age);
	    setWeight(weight);
	    setAcquisitionDate(acquisitionDate);
	    setAcquisitionLocation(acquisitionCountry);
	    setTrainingStatus(trainingStatus);
	    setReserved(reserved);
	    setInServiceCountry(inServiceCountry);

	}
	
	public String getTailLength() { //monkey accessor
		return tailLength;
	}
	public void setTailLength(String tailLength) { //monkey mutator
		this.tailLength = tailLength;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getBodyLength() {
		return bodyLength;
	}
	public void setBodyLength(String bodyLength) {
		this.bodyLength = bodyLength;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	
}
