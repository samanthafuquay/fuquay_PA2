package fuquay_p1;

public class Encrypter {
	public static int encrypt(int num) {
		int a =0, b=0, c=0, d =0;
		int m=10;
		if(num <= 999) {
			a = 0;
			a +=7;
			a = a % 10;
			int temp = num;
			d= temp %10;
			d += 7;
			d = d % 10;
			temp= temp/10;
			c= temp %10;
			c +=7;
			c= c %10;
			temp = temp/10;
			b = temp %10;
			b+=7;
			b = b %10;
			
			
		}
		else{
			int temp = num;
			d = temp %10;
			d += 7;
			d = d % 10;
			temp= temp/10;
			c= temp %10;
			c +=7;
			c= c %10;
			temp = temp/10;
			b =temp %10;
			b+=7;
			b = b %10;
			temp = temp/10;
			a =temp % 10;
			a +=7;
			a = a %10;
		}
		int e_num =0;
		e_num += c;
		e_num *= 10;
		e_num += d;
		e_num *= 10;
		e_num += a;
		e_num *= 10;
		e_num += b;

		return e_num;
		
	}
}
	
//add 7 to each interger
//mod by 10 to each interger
//swap the 1st and third digit 
//swap the 2nd and fourth digit 
//convert new numbers back to a four digit number
//return new number

