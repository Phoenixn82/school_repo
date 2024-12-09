return result.toString();  // The statement is used to convert the contents of a StringBuilder object (result) into a String and then return it from the method.

StringBuilder result = new StringBuilder(); // builds a new string

if (Character.isLetter(currentChar)) { // .isLetter() is neat
    result.append(currentChar); // Append alphabetic characters
 }

 public class Person { // basic class with set/get functionality
    private String firstName;
 
    public void setFirstName(String firstNameToSet) { // person1.setFirstName
       firstName = firstNameToSet; 
    }
    
    public String getFirstName() { // person1.getFirstName
       return firstName;
    }
 }


 
// Wrapper class conversions 

Integer num1 = 14;
Double num2 = 6.7643;
Double num3 = 5.6e12;

// intValue()
// Returns the value of the wrapper class object as a primitive int value, type casting if necessary.

num2.intValue() // Returns 6
// doubleValue()
// Returns the value of the wrapper class object as a primitive double value, type casting if necessary.

num1.doubleValue() // Returns 14.0
// longValue()
// Returns the value of the wrapper class object as a primitive long value, type casting if necessary.

num3.longValue() // Returns 5600000000000

// Converting to and from Strings


Integer num1 = 10;
Double num2 = 3.14;
String str1 = "32";
int regularInt = 20;

// toString()	Returns a String containing the decimal representation of the value contained by the wrapper class object.

num1.toString() // Returns "10"
num2.toString() // Returns "3.14"

// Integer.toString(someInteger)	Returns a String containing the decimal representation of the value of someInteger. someInteger may be an Integer object, a int variable, or an integer literal. 
// This static method is also available for the other wrapper classes (e.g.,  Double.toString(someDouble)).

Integer.toString(num1)       // Returns "10"
Integer.toString(regularInt) // Returns "20"
Integer.toString(3)          // Returns "3"

// Integer.parseInt(someString)	Parses someString and returns an int representing the value encoded by someString. 
// This static method is also available for the other wrapper classes (e.g., Double.parseDouble(someString)), returning the corresponding primitive type.

Integer.parseInt(str1)    // Returns int value 32
Integer.parseInt("2001") // Returns int value 2001

// Integer.valueOf(someString)	Parses someString and returns a new Integer object with the value encoded by someString. 
// This static method is also available for the other wrapper classes (e.g., Double.valueOf(someString)), returning a new object of the corresponding type.

Integer.valueOf(str1)    // Returns Integer object with value 32
Integer.valueOf("2001") // Returns Integer object with value 2001

// Integer.toBinaryString(someInteger)	Returns a String containing the binary representation of someInteger. 
// someInteger may be an Integer object, a int variable, or an integer literal. This static method is also available for the Long classes (e.g.,  Long.toBinaryString(someLong)).

Integer.toBinaryString(num1)       // Returns "1010"
Integer.toBinaryString(regularInt) // Returns "10100"
Integer.toBinaryString(7)          // Return "111"


   
// CASTING 
   public double getWinPercentage() {
      if (wins + losses == 0) {
         return 0.0;
      }
      return (double) wins / (wins + losses); // the (double) is a casting thing, 
   }


   
   // Complete the code to generate a random integer between 4 and 22 (inclusive).
Expected: randGen.nextInt(19) + 4;

// The passed number is the range size, so 22 - 4 + 1 = 19, which yields 0 to 18. That range is shifted by 4 to yield 4 to 22.
