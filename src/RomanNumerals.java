
public class RomanNumerals {

	public String toRoman(int nmber) {
		
		return binaryToRoman(nmber);
	}
	public static String binaryToRoman(int binary) {
		String[] RCODE = {"M", "CM", "D", "CD", "C", "XC", "L","XL", "X", "IX", "V","IV","I"};
		int[]    BVAL  = {1000, 900, 500, 400,  100,   90,  50, 40,   10,    9,   5,   4,  1};
		if (binary <= 0 || binary >= 3000) {
			System.out.println("Value outside roman numeral range.");
		}
		String roman = "";         
		for (int i = 0; i < RCODE.length; i++) {
			while (binary >= BVAL[i]) {
				binary -= BVAL[i];
				roman  += RCODE[i];
			}
		}
		return roman;
	}  

}
