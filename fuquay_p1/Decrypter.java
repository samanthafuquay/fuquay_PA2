package fuquay_p1;

public class Decrypter {

	public static int decrypt(int num) {
		int a, b, c, d =0;
		if(num <= 999) {
			a = 0;
			int temp = num;
			d= temp %10;
			temp= temp/10;
			c= temp %10;
			temp = temp/10;
			b = temp %10;
			
		}
		else{
			int temp = num;
			d= temp %10;
			temp= temp/10;
			c= temp %10;
			temp = temp/10;
			b = temp %10;
			temp = temp/10;
			a = temp % 10;

		}
		if(a <=6) {
			a +=10;
			a = a-7;
		}
		if(a > 6) {
			a = a -7;
		}
		if(b <=6) {
			b +=10;
			b = b-7;
		}
		if(b > 6) {
			b =  -7;
		}
		if(c <=6) {
			c +=10;
			c = a-7;
		}
		if(c > 6) {
			c = c -7;
		}
		if(d <=6) {
			d +=10;
			d = d-7;
		}
		if(d > 6) {
			d = d -7;
		}
		int d_num =0;
		d_num *= 10;
		d_num += c;
		d_num *= 10;
		d_num += d;
		d_num *= 10;
		d_num += a;
		d_num *= 10;
		d_num += b;
		
		return d_num;
	}

}
//decrypts by swaping the 2nd and fourth digit 
//swaps the 1st and the third digit 
//if num between 7-9 minus 7
//if num between 0-6 add 10 minus 7 
//reconstruct 4 digit number
//return this number 