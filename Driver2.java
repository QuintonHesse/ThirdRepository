// SNHU IT 145
// Module 5
// Quinton Hesse
import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    private static ArrayList<Dog> dogList = new ArrayList<Dog>(); //initialize array lists
    
    
    private static Scanner scnr = new Scanner(System.in); //initialize scanner
    
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();
    // Instance variables (if needed)
    public static void main(String[] args) {

    	String menuInput = ""; //local variables  
    	String reserveInput = "";
        initializeDogList();
        initializeMonkeyList();
        
        ArrayList<String> menuList = new ArrayList<String>();{ //array list for menu validation, not implemented
        	menuList.add("1");
        	menuList.add("2");
        	menuList.add("3");
        	menuList.add("4");
        	menuList.add("5");
        	menuList.add("6");
        	menuList.add("q");
        	
        }
        // Add a loop that displays the menu, accepts the users input
        // and takes the appropriate action.
	// For the project submission you must also include input validation
        // and appropriate feedback to the user.
        // Hint: create a Scanner and pass it to the necessary
        // methods 
	// Hint: Menu options 4, 5, and 6 should all connect to the printAnimals() method.
        while(!menuInput.equalsIgnoreCase("q")) {
        	displayMenu(); //calling the display menu
        	menuInput = scnr.nextLine(); // user input
			switch(menuInput) { //switch case for menu options
    		case "1":
    			intakeNewDog(scnr);
    			break;
    		case "2":
    			intakeNewMonkey(scnr);
    			break;
    		case "3":
    			reserveAnimal(scnr);
    			break;
    		case "4":
    			printAnimals(4);
    			break;
    		case "5":
    			printAnimals(5);
    			break;
    		case "6":
    			printAnimals(6);
    			break;
            	
        		}
        		
        	}
        	
        }
    

    // This method prints the menu options
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }


    // Adds dogs to a list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "in service", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }


    // Adds monkeys to a list for testing
    //Optional for testing
    public static void initializeMonkeyList() {
    	Monkey monkey1 = new Monkey("Joe", "4", "5", "6", "Capuchin", "Male", "12", "60", "06-04-2023", "United States","in service", false, "United States"); //test monkey
    	
    	monkeyList.add(monkey1);

    }


    // Complete the intakeNewDog method
    // The input validation to check that the dog is not already in the list
    // is done for you
    public static void intakeNewDog(Scanner scanner) {
        System.out.println("What is the dog's name?");
        Dog newDog = new Dog("name", "breed","gender","age", "weight", "acquisitionDate","aquisitioncountry", "trainingStatus",
        		false, "inservicecountry"); //create dog object
        String name = scanner.nextLine();
        for(Dog dog: dogList) {
            if(dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; //returns to menu
            }
            newDog.setName(name);
            
            System.out.print("What is the dogs tail length?"); //get all relevant dog information
            String breed = scnr.nextLine();
            newDog.setBreed(breed);
            
            System.out.print("What is the dogs gender");
            String gender = scnr.nextLine();
            newDog.setGender(gender);
            
            System.out.print("What is the dogs age?");
            String age = scnr.nextLine();
            newDog.setAge(age);
            
            System.out.print("What is the dogs weight?");
            String weight = scnr.nextLine();
            newDog.setWeight(weight);
            
            System.out.print("What is the dogs acquisition date?");
            String date = scnr.nextLine();
            newDog.setAcquisitionDate(date);
            
            System.out.print("What is the dogs acquisition country?");
            String country = scnr.nextLine();
            newDog.setAcquisitionLocation(country);
            
            System.out.print("What is the dogs training status?");
            String status = scnr.nextLine();
            newDog.setTrainingStatus(status);
            
            System.out.print("Is the dog reserved?");
            Boolean reserved = scnr.nextBoolean();
            newDog.setReserved(reserved);
            
            System.out.print("What is the dogs service Country?");
            String serviceCountry = scnr.nextLine();
            newDog.setInServiceCountry(serviceCountry);
            
            dogList.add(newDog);
            return;
        }

        // Add the code to instantiate a new dog and add it to the appropriate list
    }


        // Complete intakeNewMonkey
	//Instantiate and add the new monkey to the appropriate list
        // For the project submission you must also  validate the input
	// to make sure the monkey doesn't already exist and the species type is allowed
    	
        public static void intakeNewMonkey(Scanner scanner) {
        	
        	
        	System.out.println("What is the monkey's name?");
        	Monkey newMonkey = new Monkey("name", "tail", "height", "length", "species", "gender", "age", "weight", "date",
        			"country", "training", false, "inservice country"); //create new monkey object
            String name = scanner.nextLine();
            for(Monkey monkey: monkeyList) { // input validation for name
                if(monkey.getName().equalsIgnoreCase(name)) {
                    System.out.println("\n\nThis monkey is already in our system\n\n");
                    return;   
                }
            
            newMonkey.setName(name);
            	
            System.out.print("What is the monkeys tail length?"); //get all relevant monkey information
            String tailLength = scnr.nextLine();
            newMonkey.setTailLength(tailLength);
            	
            System.out.print("What is the monkeys height?");
            String height = scnr.nextLine();
            newMonkey.setHeight(height);
            	
            System.out.print("What is the monkeys body length?");
            String bodyLength = scnr.nextLine();
            newMonkey.setBodyLength(bodyLength);
            	
            System.out.print("What is the monkeys species?");
            String species = scnr.nextLine();
            newMonkey.setSpecies(species);
            
            System.out.print("What is the monkeys gender?");
            String gender = scnr.nextLine();
            newMonkey.setGender(gender);
            
            System.out.print("What is the monkeys age?");
            String age = scnr.nextLine();
            newMonkey.setAge(age);
            
            System.out.print("What is the monkeys weight?");
            String weight = scnr.nextLine();
            newMonkey.setWeight(weight);
            
            System.out.print("What is the monkeys acquisition date?");
            String date = scnr.nextLine();
            newMonkey.setAcquisitionDate(date);
            
            System.out.print("What is the monkeys training status?");
            String status = scnr.nextLine();
            newMonkey.setTrainingStatus(status);
            
            System.out.print("Is the monkey reserved?");
            boolean reserved = scnr.nextBoolean();
            newMonkey.setReserved(reserved);
            
            System.out.print("What is the monkeys service country?");
            String inServiceCountry = scnr.nextLine();
            newMonkey.setInServiceCountry(inServiceCountry);
            
            	
            monkeyList.add(newMonkey);
            return;
            
            }
                
        }

        // Complete reserveAnimal
        // You will need to find the animal by animal type and in service country
        public static void reserveAnimal(Scanner scanner) {
        	String reserveInputType = "";
        	String reserveInputCountry = ""; //reserve variables
        	String reserveAnimal = "";
            System.out.println("Would you like  to reserve a dog or monkey?");
            reserveInputType = scnr.nextLine(); // start either dog or monkey
            if(reserveInputType.equalsIgnoreCase("dog")){ // start dog reserve process
            	System.out.println("What country would you like to reserve in?");
            	reserveInputCountry = scnr.nextLine(); // get reserve country for dog
            	for(Dog dog: dogList) {
            		if(dog.getTrainingStatus().equalsIgnoreCase("in service") && (dog.getReserved()== false) // find matching dogs
            				&& dog.getInServiceLocation().equalsIgnoreCase(reserveInputCountry)){
            			System.out.println("Matching Dogs: " + " Name: " + dog.getName() + " Status: " + dog.getTrainingStatus() + 
                    			" Acquisition Location: " + dog.getAcquisitionLocation() + " Reserved: " + dog.getReserved()); // output matching dogs to help user
            			System.out.println("Enter name of dog you would like to reserve or type quit to quit."); //prompt user for final input
            			reserveAnimal = scnr.nextLine();
            			if(dog.getName().equalsIgnoreCase(reserveAnimal)){ //reserve dog
            				dog.setReserved(true);
            			}
            			else if(reserveAnimal.equalsIgnoreCase("quit")) { // quit option
            				break;
            			}
            			else {
            				System.out.println("not a valid command");  // error message
            			}
            			
            	}
            		else {
            			System.out.println("There are no dogs in your country available."); //message if input country has no dogs
                		}
            		}
            
        
        }
            if(reserveInputType.equalsIgnoreCase("monkey")){ //monkey reserve process
            	System.out.println("What country would you like to reserve in?");
            	reserveInputCountry = scnr.nextLine();
            	for(Monkey monkey: monkeyList) {
            		if(monkey.getTrainingStatus().equalsIgnoreCase("in service") && (monkey.getReserved()== false) //find valid monkeys
            				&& monkey.getInServiceLocation().equalsIgnoreCase(reserveInputCountry)){
                		System.out.println("Matching Monkeys: " + " Name: " + monkey.getName() + " Status: " + monkey.getTrainingStatus() + 
                				" Acquisition Location: " + monkey.getAcquisitionLocation() + " Reserved: " + monkey.getReserved()); // output valid monkeys
            			System.out.println("Enter name of monkey you would like to reserve or type quit to quit.");
            			reserveAnimal = scnr.nextLine();
            			if(monkey.getName().equalsIgnoreCase(reserveAnimal)){ // to reserve monkey
            				monkey.setReserved(true);
            			}
            			else if(reserveAnimal.equalsIgnoreCase("quit")) { //quit option
            				break;
            			}
            			else {
            				System.out.println("not a valid command"); //error message
            			}
            				
            	}
            		else {
            			System.out.println("There are no monkeys in your country available."); // no animals to be reserved message
            
            		}
            	}
        }
        }

        // Complete printAnimals
        // Include the animal name, status, acquisition country and if the animal is reserved.
	// Remember that this method connects to three different menu items.
        // The printAnimals() method has three different outputs
        // based on the listType parameter
        // dog - prints the list of dogs
        // monkey - prints the list of monkeys
        // available - prints a combined list of all animals that are
        // fully trained ("in service") but not reserved 
	// Remember that you only have to fully implement ONE of these lists. 
	// The other lists can have a print statement saying "This option needs to be implemented".
	// To score "exemplary" you must correctly implement the "available" list.
        public static void printAnimals(int x) {
        if ( x == 4) { //print List of dogs
        	for(Dog dog: dogList) {
        	System.out.println("Dog: " + " Name: " + dog.getName() + " Status: " + dog.getTrainingStatus() + 
        			" Acquisition Location: " + dog.getAcquisitionLocation() + " Reserved: " + dog.getReserved());
        }
        }
        else if (x == 5) { //print list of monkeys
        	for(Monkey monkey: monkeyList) {
        		System.out.println("Monkey: " + " Name: " + monkey.getName() + " Status: " + monkey.getTrainingStatus() + 
        				" Acquisition Location: " + monkey.getAcquisitionLocation() + " Reserved: " + monkey.getReserved());
        	}
        }
        else if (x == 6) {
        	for(Dog dog: dogList) { //available dogs
        		if(dog.getTrainingStatus().equalsIgnoreCase("in service") && (dog.getReserved()== false)) {
                	System.out.println("Dog: " + " Name: " + dog.getName() + " Status: " + dog.getTrainingStatus() + 
                			" Acquisition Location: " + dog.getAcquisitionLocation() + " Reserved: " + dog.getReserved());
        		}
        	}
        	for(Monkey monkey: monkeyList) { //available monkeys
        		if(monkey.getTrainingStatus().equalsIgnoreCase("in service") && (monkey.getReserved()== false)) {
            		System.out.println("Monkey: " + " Name: " + monkey.getName() + " Status: " + monkey.getTrainingStatus() + 
            				" Acquisition Location: " + monkey.getAcquisitionLocation() + " Reserved: " + monkey.getReserved());
        		}
        	}
        }
        }
}

