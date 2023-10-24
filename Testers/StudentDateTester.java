package Testers;
import Codes.*;
import java.util.*;
public class StudentDateTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student ID , Name , Date Of Birth (in day month and year)");
		Student Ashay = new Student(sc.nextInt(),sc.next(),sc.nextInt(),sc.nextInt(),sc.nextInt());
		System.out.println(Ashay);
	}

}
