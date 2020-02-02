package fuquay_p2;

import java.util.Scanner;

public class BMICalculator {
	public  double weight;
	public  double height;
	public  double bmi;
	public  String category;
	public int choice = 0;
	public boolean helper =false;
	public void main(String[] args) {
		readUserData();
		calculateBmi(choice);
		bmichart();
		
	}
		Scanner scan = new Scanner(System.in);

		public void readUserData(){
			while(helper = false) {
				System.out.println("What units would you like to calculate your BMI in today?");
				System.out.println("For pounds and inches press 1");
				System.out.println("For Kilograms and meters press2");
				int choice = scan.nextInt();
				if(choice == 1) {
					helper = true;
					readUnitType(1);
				}
				else if(choice == 2) {
					helper = true;
					readUnitType(2);
				}
			}

		}

		private  void readUnitType(int choice) {
				if(choice == 1) {
					readImperialData();
				}
				if(choice == 2) {
					readMetricData();
				}
		}
		private  void  readImperialData() {
				System.out.println("Please enter your weight");
				double weight = scan.nextDouble();
				setWeight(weight);
				if(weight <0) {
					return;
				}
				System.out.println("Please enter your height");
				double height = scan.nextDouble();
				setHeight(height);
				if(height <0) {
					return;
				}
			}
		private void readMetricData() {
				System.out.println("Please enter your weight");
				float weight = scan.nextFloat();
				setWeight(weight);
				if(weight <0) {
					return;
				}
				System.out.println("Please enter your height");
				float height = scan.nextFloat();
				setHeight(height);
				if(height <0) {
					return;
				}
			}
				
		public  void calculateBmi(int choice) {
			if(choice == 1) {
				double weight = getWeight();
				double height = getHeight();
				bmi = (weight)/(Math.pow(height, 2));
				System.out.printf("Your BMI = %.f", bmi);	
			}
			else {
				double weight = getWeight();
				double height = getHeight();
				bmi= (703* weight)/ ((Math.pow(height, 2)));
				System.out.printf("Your BMI = %.2f", bmi);
			}
			calculateBmiCategory(bmi);
		}
		private  void calculateBmiCategory(double bmi){
				if(bmi <18.5) {
				category = "underweight";
				System.out.println("Your BMI category is underweight");
				return;
				}
				else if(bmi < 25) {
					category = "normal weight";
					System.out.println("Your BMI category is normal weight");
					return;
				}
				else if(bmi < 30) {
					category= "overweight";
					System.out.println("Your BMI category is overweight");
					return;
				}
				else if (bmi >29) {
					category = "Obesity"; 
					System.out.println("Your BMI category is obesity ");
					return;
				}
			}
		public void bmichart() {
			System.out.printf("Underweight = <18.5\r\n" + 
					"Normal weight = 18.5–24.9 \r\n" + 
					"Overweight = 25–29.9 \r\n" + 
					"Obesity = BMI of 30 or greater \n");
		}
	
			
			public void setWeight(double weight) {
				this.weight = weight;
			}
			public double getWeight() {
				return weight;
			}
			public void setHeight(double height) {
				this.height = height;
			}
			public double getHeight() {
				return height;
			}
			public double getBmi() {
				return bmi;
			}
			public String getBmiCategory() {
				return category;
			}

		
		// read the users weight and height
		//let user decide what formula to use kilograms or pounds meters or inches 
		//calculate users body mass index 
		//display the BMI categories and their vaues from the national
		//heart and lung so the user can eval his/her BMI

	}
	

//public instance method called readUserData that uses readUnitType and readMeasurementData methods
//private instance method called readUnitType
//private instance method called readMetricData or readImperialData depending on unit type
//private instance method readMetricData
//private method called readImperialData
//public instance method call calculateBmi the calculates the user's BMI and BMI category
//private instance method called calculateBmiCategory
//public instance method called displayBmi that prints the BMI value and category to standard output

//public instance method called getWeight-
//Private instance method call SetWeight-
//Public instance method calld getHeight-
//privte instance method called setHeight-
//public instance method called getBmi-
//public instance method called getBmiCategory-
//program should exit if user enters negative weight
//the program should exit if the user enters negative height
//the user should be prompted to enter the type of units until they enter a valid value-
