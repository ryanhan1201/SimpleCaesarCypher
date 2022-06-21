import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class CaesarCypher {
/*
 * In: line 1 is E/D 
 * 	E for encrypt the message
 *  D for decrypt the message
 * 	   line 2 is the message for which the program should encrypt or decrypt 
 * Encrypt/decrpyt for rotation of -2
 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(new FileReader("in.txt"));
		String choice = in.nextLine();
		String message = in.nextLine();
		if(choice.equals("E")) {//encrypt the message
			String encrypted = "";
			for(char c : message.toCharArray()) {
				if(c - 'a' <= 'z' - 'a' && c - 'a' >= 0) { //filter out any non alphabet
					//encryption happens
					char t = (char) (((c - 2) % 26) + 'a');
					//System.out.println(c + " : " + t);
					encrypted += t;
				}
				else {
					encrypted += c;
				}
			}
			System.out.println(encrypted);
		}
		else if(choice.equals("D")) {//decrypt the message
			String decrypted = "";
			for(char c : message.toCharArray()) {
				if(c - 'a' <= 'z' - 'a' && c - 'a' >= 0) { //filter out any non alphabet
					//decryption happens
					char t = (char) (((c + 16) % 26) + 'a');
//					System.out.println(c + " : " + t);
					decrypted += t;
				}
				else {
					decrypted += c;
				}
			}
			System.out.println(decrypted);
		}
		
	}

}
