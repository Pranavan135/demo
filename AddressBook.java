import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class AddressBook {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name: ");
		String name = sc.nextLine();
		System.out.println("Enter email: ");
		String email = sc.nextLine();
		
		try {
			FileWriter fileWriter = new FileWriter("book.txt");
			PrintWriter printWriter = new PrintWriter(fileWriter);
			printWriter.println("Name : "+name);
			printWriter.println("Email: "+email);
			printWriter.println("----------");
		} catch (IOException e) {
			System.out.println("Writing to File failed");
		}
	}

}

// Pranavan
