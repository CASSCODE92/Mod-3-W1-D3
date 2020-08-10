// Create a class named Student that can hold the data for a single
// student from the following table:
 
// Student ID         First Name    Last Name            Student Email              Student Phone
// 0001                      Todd                    Hopkins            Thop@gmail.org           123-456-7890
// 0002                      Mario                    Wells              Wario@gmail.org         123-456-7891
 
// Note: make sure you use Encapsulation and include a Constructor



public class Student { 

// variables declared
        int studentId;

        String firstName;

        String lastName;

        String email;

        int phone

// parameters
public Student(int id, String firstName, String lastName, String email, int phone) { 
    // contructor which goes inside of the class

// declared variables set equal to the parameters
studentId= id; 

firstName = firstName;

lastName = lastName;

email = email;

phone = phone;

} 

public static void main(String[] args) {

 Student todd = new Student(0001, "Todd", "Hopkins", "Thop@gmail.org", 1234567890);

 Student mario = new Student(0002, "Mario", "Wells", "Wario@gmail.org", 1234567891); 
   } 
} 

























 