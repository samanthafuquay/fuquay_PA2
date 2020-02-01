package fuquay_p1;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		System.out.println("Please enter a 4 digit number to be encrypted.");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int newnum = Encrypter.encrypt(num);
		if(newnum <= 999) {
			System.out.printf("0");
			System.out.printf("%d\n", newnum);
		}
		else {
		System.out.println(newnum);
		}
		System.out.println("Please enter a 4 digit number to be decrypted");
		num = scan.nextInt();
		newnum = Decrypter.decrypt(num);
		if(newnum <=999) {
			System.out.printf("0");
			System.out.printf("d\n", newnum);
		}
		else {
		System.out.println(newnum);
		}
		scan.close();
	}

}
//scan in 4 digit number from user -
//call the encrypter-
//print out the encrypted value-
//scan in 4 digit number from user
//print the decrypted value  
//close the scanner 
