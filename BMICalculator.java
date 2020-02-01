package fuquay_p2;

import java.util.Scanner;

public class BMICalculator {
	public float weight;
	public float height;
	public float bmi;
	public String category;
	int choice = 0;
	public static void main(String[] args) {
		
	}
		Scanner scan = new Scanner(System.in);

		public void readUserData(){
			private void readUnitType() {
				boolean helper = false;
				while(helper = false) {
				System.out.println("What units would you like to calculate your BMI in today?");
				System.out.println("For pounds and inches press 1");
				System.out.println("For Kilograms and meters press2");
				int choice = scan.nextInt();
				}
				if(choice = 1){
					helper = true;
					private  readImperialData() {
						System.out.println("Please enter your weight");
						setWeight = scan.nextInt();
						if(weight <0) {
							return;
						}
						System.out.println("Please enter your height");
						setHeight = scan.nextInt();
						if(height <0) {
							return;
						}
					}
				}
				if(choice = 2) {
					helper = true;
					private readMetricData() {
						System.out.println("Please enter your weight");
						setWeight = scan.nextInt();
						System.out.println("Please enter your height");
						setHeight = scan.nextInt();
					}
				
				}
			}
		}
		public void calculateBmi() {
			if(choice =1) {
				Bmi = getWeight/ (getHeight);//the height needs to be squared
				System.out.printf("Your BMI = %.2f", Bmi)
				
			}
			else {
				bmi= (703* getWeight )/ (getHeight);//need to square this
				System.out.printf("Your BMI = %.2f", Bmi)
			}
			private void calculateBmiCategory{
				if(bmi <18.5) {
				category =underweight;
				}
				if(bmi > 18.5 && <25) {
					category =normal weight;
				}
				if(bmi >24 && < 30) {
					category= overweight;
				}
				if(bmi >29) {
					category =Obesity; 
				}
				System.out.printf("Your BMI category is %s", category);
			}
		}
		public void bmichart() {
			System.out.printf("Underweight = <18.5\r\n" + 
					"Normal weight = 18.5–24.9 \r\n" + 
					"Overweight = 25–29.9 \r\n" + 
					"Obesity = BMI of 30 or greater \n");
		}
	
			
			public void setWeight(float weight) {
				this.weight = weight;
			}
			public float getWeight() {
				return weight;
			}
			public void setheight(float height) {
				this.height = height;
			}
			public float getheight() {
				return height;
			}
			public float getBmi() {
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
