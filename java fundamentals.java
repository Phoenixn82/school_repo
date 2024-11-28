// Characters

// A variable of char type, as in char myChar;, can store a single character like the letter m. 
// A character literal is surrounded with single quotes, as in myChar = 'm';.


public class CharArrow {
    public static void main(String[] args) {
       char arrowBody;
       char arrowHead;
 
       arrowBody = '-';
       arrowHead = '>';
 
       System.out.println(arrowHead);
       System.out.println("" + arrowBody + arrowBody + arrowBody + arrowHead);
 
       arrowBody = 'o';
 
       System.out.println("" + arrowBody + arrowBody + arrowBody + arrowHead);
    }
 }

 // Java does not have a method for getting one character from input. Instead, the following sequence can be used: myChar = scnr.next().charAt(0); 
// Briefly, next() gets the next sequence of non-whitespace characters (as a string), and charAt(0) gets the first character in that string.

import java.util.Scanner;

public class ArrowChars {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      char bodyChar;
      char headChar;

      System.out.print("Enter two characters: ");
      bodyChar = scnr.next().charAt(0);
      headChar = scnr.next().charAt(0);

      // Output arrow body then head
      System.out.print(bodyChar);
      System.out.print(bodyChar);
      System.out.print(bodyChar);
      System.out.println(headChar);
   }
}


// A programmer can output multiple character variables with one statement as follows: System.out.print("" + c1 + c2);. 
// The initial "" tells the compiler to output a string of characters, and the +'s combine the subsequent characters into such a string. 
// Without the "", the compiler will simply add the numerical values of c1 and c2, and output the resulting sum.

// A common error is to use double quotes rather than single quotes around a character literal, as in myChar = "x", yielding a compiler error.

// Similarly, a common error is to forget the quotes around a character literal, as in myChar = x, usually yielding a compiler error 
// (unless x is also a declared variable, then perhaps yielding a logic error).







// STRINGS 

public class SentenceFromStrings {
    public static void main(String[] args) {
       String sentenceSubject;
       String sentenceVerb;
       String sentenceObject = "an apple";
 
       sentenceSubject = "boy";
       sentenceVerb = "ate";
 
       System.out.print("A ");
       System.out.print(sentenceSubject + " ");
       System.out.print(sentenceVerb + " ");
       System.out.println(sentenceObject + ".");
    }
 }

 // Declare a string variable userName.
String userName;

// int 

int usernameId;

// double

double usernameIdDouble;








import java.util.Scanner;

/* A game inspired by "Mad Libs" where user enters nouns,
   verbs, etc., and then a story using those words is output.
*/

public class StoryGame {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String wordRelative;
      String wordFood;
      String wordAdjective;
      String wordTimePeriod;

      // Get user's words
      System.out.println("Provide input without spaces.");

      System.out.println("Enter a kind of relative: ");
      wordRelative = scnr.next();

      System.out.println("Enter a kind of food: ");
      wordFood = scnr.next();

      System.out.println("Enter an adjective: ");
      wordAdjective = scnr.next();

      System.out.println("Enter a time period: ");
      wordTimePeriod = scnr.next();

      // Tell the story
      System.out.println();
      System.out.print  ("My " + wordRelative);
      System.out.println(" says eating " + wordFood);
      System.out.println("will make me more " + wordAdjective + ",");
      System.out.println("so now I eat it every " + wordTimePeriod + ".");
   }
}

//Sometimes a programmer wishes to get whitespace characters into a string, 
//such as getting a user's input of the name "Franklin D. Roosevelt" into a string variable presidentName.

//For such cases, the language supports getting an entire line into a string. 
//The method scnr.nextLine() gets all remaining text on the current input line, up to the next newline character 
//(which is removed from input but not put in stringVar).

firstString = scnr.nextLine();
secondString = scnr.nextLine();



import java.util.Scanner;

public class NameWelcome {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String firstName;
      String lastName;

      System.out.println("Enter first name: ");
      firstName = scnr.nextLine(); // Gets entire line up to ENTER

      System.out.println("Enter last name: ");
      lastName = scnr.nextLine(); // Gets entire line up to ENTER

      System.out.println();
      System.out.println("Welcome " + firstName + " " + lastName + "!");
      System.out.println("May I call you " + firstName + "?");
   }

   
// Enter first name: 
// Betty Sue
// Enter last name: 
// McKay

// Welcome Betty Sue McKay!
// May I call you Betty Sue?
+

//When following next() with nextLine(), an extra nextLine() is needed to get past the newline left in the input by next(). 






// Random Numbers


import java.util.Random;

public class ThreeRandomValues {
   public static void main(String[] args) {
      Random randGen = new Random();  // New random number generator

      System.out.println(randGen.nextInt());
      System.out.println(randGen.nextInt());
      System.out.println(randGen.nextInt());
   }
}


//STRING EQUALITY

//A programmer can compare two strings using the notation str1.equals(str2). The equals method returns true if the two strings are equal. 
//A common error is to use == to compare two strings, which behaves differently than expected.

import java.util.Scanner;

public class StringEquality {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String userWord;

      System.out.print("Enter a word: ");
      userWord = scnr.next();

      if (userWord.equals("USA")) {
         System.out.println("United States of America");
      } 
      else {
         System.out.println(userWord);
      }
   }
}
str1.equals(str2)


// a programmer compares strings relationally using the notation str1.compareTo(str2). compareTo() returns values as follows.

str1.compareTo(str2)












// STRING ACCESS OPERATIONS 

import java.util.Scanner;

public class WordScramble {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String userWord;

      System.out.print("Enter a word with 5 letters: ");
      userWord = scnr.next();

      System.out.print("Scrambled: ");
      System.out.print(userWord.charAt(3));
      System.out.print(userWord.charAt(1));
      System.out.print(userWord.charAt(4));
      System.out.print(userWord.charAt(0));
      System.out.print(userWord.charAt(2));
      System.out.println();
   }
}

// userText is "Monday".
userText.charAt(userText.length()-1) //yields 'y'.







      if(inputText.charAt(2) == 'i') {
         System.out.println("Found match");  
      }
      else {
         System.out.println("No match");
      }
  +++


// Character operations

      Scanner scnr = new Scanner(System.in);
      String userInput;
      char let0;
      char let1;

      System.out.print("Enter a two-letter state abbreviation: ");
      userInput = scnr.next();
      let0 = userInput.charAt(0);
      let1 = userInput.charAt(1);

      if ( ! (Character.isLetter(let0) && Character.isLetter(let1)) ) {
         System.out.println("Error: Both are not letters.");
      }
      else {
         let0 = Character.toUpperCase(let0);
         let1 = Character.toUpperCase(let1);
         System.out.println("Capitalized: " + let0 + let1);
      }

  
      Scanner scnr = new Scanner(System.in);
      String passCode;

      passCode = scnr.next();

      if(Character.isLetter(passCode.charAt(0)){
         System.out.print("Alphabetic at 0");
      }
      if(Character.isLetter(passCode.charAt(1)){
         System.out.print("Alphabetic at 1");
      }

        


 
// userText is "http://google.com"
userText.substring(7)      // Returns "google.com"
userText.substring(13)     // Returns ".com"
userText.substring(0, 7)   // Returns "http://"
userText.substring(13, 17) // Returns ".com"

// Returns last 4: ".com"
userText.substring(userText.length() - 4, userText.length())

// userText is "Help me!"
userText.indexOf('p')     // Returns 3 
userText.indexOf('e')     // Returns 1 (first occurrence) 
userText.indexOf('z')     // Returns -1 
userText.indexOf("me")    // Returns 5
userText.indexOf('e', 2)  // Returns 6 (starts at index 2)
userText.lastIndexOf('e') // Returns 6 (last occurrence)

// userText is "My name is "
userText += "Tom"; // Now "My name is Tom"

// userText is "A B"
myString = userText + " C D";
// myString is "A B C D"
myString = myString + '!';
// myString now "A B C D!"
myString = myString + userText;
// myString now "A B C D!A B"

// userText is "Hello"
userText = userText.replace('H', 'j'); // Now "jello" 
// userText is "You have many gifts"
userText = userText.replace("many", "a plethora of"); 
// Now "You have a plethora of gifts" 
// userText is "Goodbye"
newText = userText.replace("bye"," evening"); 
// newText is "Good evening"

// userText is "Hi"
userText = userText.concat(" friend"); // Now "Hi friend" 
newText = userText.concat(" there");   
// newText is "Hi friend there"



public class NameGame {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String userName;
        String songVerse;

        // Read user input for the name
        userName = scnr.nextLine();
        // Remove the first character from the name
        String nameWithoutFirstChar = userName.substring(1);

        // Read user input for the song verse
        songVerse = scnr.nextLine();

        // Replace "(Name)" with the name without the first character
        songVerse = songVerse.replace("(Name)", nameWithoutFirstChar);

        // Output the modified song verse
        System.out.println(songVerse);
    }
}

import java.util.Scanner;

public class GreetingMaker {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      String userName;
      String greetingText;
      
      System.out.print("Enter name: ");
      userName = scnr.nextLine();

      // Combine strings using +
      greetingText = "Hello " + userName;
      
      // Append a period (could have used +)
      greetingText = greetingText.concat(".");
      System.out.println(greetingText);
      
      // Insert Mr/Ms before user's name
      greetingText = "Hello Mr/Ms ";
      greetingText = greetingText.concat(userName);
      greetingText = greetingText.concat(".");
      System.out.println(greetingText);
      
      // Replace occurrence of "Darn" by "@$#"
      greetingText = greetingText.replace("Darn", "@$#");
      System.out.println(greetingText);
   }

   

public class CensoredWords {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String userInput;

        // Read the input from the user
        userInput = scnr.nextLine();

        // Check if the userInput contains the word "darn"
        if (userInput.contains("darn")) {
            System.out.println("Censored");
        } else {
            // Print the original input if "darn" is not present
            System.out.println(userInput);
        }
    }
}

// Using if-else
if (x > 3) {
   System.out.println("Greater");
} else {
   System.out.println("Smaller");
}

// The same thing using ternary
System.out.println(x > 3 ? "Greater" : "Smaller");

// WHILE LOOPS

import java.util.Scanner;

public class ConvertCtoF {
   public static void main(String [] args) {
      Scanner scnr = new Scanner(System.in);
      double celsiusValue;
      double fahrenheitValue;
      char userChar;

      celsiusValue = 0.0;
      userChar = 'y';

      while (userChar == 'y') {
         fahrenheitValue = (celsiusValue * 9.0 / 5.0) + 32.0;

         System.out.print(celsiusValue + " C is ");
         System.out.println(fahrenheitValue + " F"); 

         System.out.print("Type y to continue, any other to quit: ");
         userChar = scnr.next().charAt(0); // IMPORTANTE

         celsiusValue = celsiusValue + 5;
         System.out.println("");
      }
   
      System.out.println("Goodbye.");
   }
}






// Output GCD of user-input numA and numB

public class GCDCalc {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int numA;  // User input
      int numB;  // User input

      System.out.print("Enter first positive integer: ");
      numA = scnr.nextInt();

      System.out.print("Enter second positive integer: ");
      numB = scnr.nextInt();

      while (numA != numB) { // Euclid's algorithm
         if (numB > numA) {
            numB = numB - numA;
         }
         else {
            numA = numA - numB;
         }
      }

      System.out.println("GCD is: " + numA);
   }
}

// A sentinel value is a special value indicating the end of a list, such as a list of positive integers ending with 0, as in 10 1 6 3 0. 
// The example below computes the average of an input list of positive integers, ending with 0. The 0 is not included in the average.


// Outputs average of list of positive integers
// List ends with 0 (sentinel)
// Ex: 10 1 6 3 0  yields (10 + 1 + 6 + 3) / 4, or 5

public class ListAverage {
   public static void main(String [] args) {
      Scanner scnr = new Scanner(System.in);
      int currValue;
      int valuesSum;
      int numValues;
      
      valuesSum = 0;
      numValues = 0;
      
      currValue = scnr.nextInt();
      
      while (currValue > 0) { // Get values until 0 (or less)
         valuesSum = valuesSum + currValue;
         numValues = numValues + 1;
         currValue = scnr.nextInt();
      }

      System.out.println("Average: " + (valuesSum / numValues));
   }
}

//FOR LOOPS

for (initialExpression; conditionExpression; updateExpression) {
   // Loop body
 }
 // Statements after the loop


 // The statement i = i + 1 is so common that the language supports the shorthand ++i, with ++ known as the increment operator. 
 // (Likewise, -- is the decrement operator, --i means i = i - 1). 
 // As such, a standard way to loop N times is shown below.

 int i;
...
for (i = 0; i < N; ++i) {
   ...
}

// Note: Actually two increment operators exist: ++i (pre-increment) and i++ (post-increment).
// ++i increments before evaluating to a value, while i++ increments after. 
// Ex: If i is 5, outputting ++i outputs 6, while outputting i++ outputs 5 (and then i becomes 6). 
// This material primarily uses ++i for simplicity and safety, although many programmers use i++, especially in for loops.



//Consider the example above, with input 4 10 1 6 3. Note: The first input indicates the number of values in the subsequent list.


import java.util.Scanner;

public class ListAverage {
   public static void main(String [] args) {
      Scanner scnr = new Scanner(System.in);
      int currValue;
      int valuesSum;
      int numValues;
      int i;
      
      numValues = scnr.nextInt(); // Gets number of values in list
      
      valuesSum = 0;
      
      for (i = 0; i < numValues; ++i) {
         currValue = scnr.nextInt(); // Gets next value in list
         valuesSum += currValue;
      }
      
      System.out.println("Average: " + (valuesSum / numValues));
   }
}

// For the following input, how many times will the for loop iterate?
// 7 -1 -3 -5 -14 -15 -20 -40

// answer is 7, since the first digit is 7


//for	Number of iterations is computable before the loop, like iterating N times.
//while	Number of iterations is not (easily) computable before the loop, like iterating until the input is 'q'.









//Analyzing data is a common programming task. A common data analysis task is to find the maximum value in a list of values. 
//A loop can achieve that task by updating a max-seen-so-far variable on each iteration.

// Outputs max of list of integers
// First value indicates list size
// Ex: 4 -1 9 0 3  yields 9

public class ListMax {
   public static void main(String [] args) {
      Scanner scnr = new Scanner(System.in);
      int maxSoFar = 0;
      int currValue;
      int numValues;
      int i;

      numValues = scnr.nextInt();

      for (i = 0; i < numValues; ++i) {
         currValue = scnr.nextInt();

         if (i == 0) { // First iteration
            maxSoFar = currValue;
         }
         else if (currValue > maxSoFar) {
            maxSoFar = currValue;
         }
      }

      if (numValues > 0) {
         System.out.println("Max: " + maxSoFar);
      }
   }
}


// Loop variable updated twice per iteration  NOT GOOD
for (i = 0; i < 5; ++i) {
   // Loop body
   ++i; // Oops
}





//LOOPS AND STRINGS


import java.util.Scanner;

public class CountLetters {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String inputWord;
      int numLetters;
      int i;

      System.out.print("Enter a word: ");
      inputWord = scnr.next();

      numLetters = 0;
      for (i = 0; i < inputWord.length(); ++i) {
         if (Character.isLetter(inputWord.charAt(i))) {
            numLetters += 1;
         }
      }

      System.out.println("Number of letters: " + numLetters);
   }
}



//NESTED LOOPS 

// For example, the following program generates all two-letter .com Internet domain names.
import java.util.Scanner;

public class DomainNamePrinter {

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      char letter1;
      char letter2;

      System.out.println("Two-letter domain names:");

      letter1 = 'a';
      while (letter1 <= 'z') {
         letter2 = 'a';
         while (letter2 <= 'z') {
            System.out.println("" + letter1 + "" + letter2 + ".com");
            ++letter2;
         }
         ++letter1;
      }
   }
}



import java.util.Scanner;

public class IntHistogram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int numAsterisk;  // Number of asterisks to print
      int i;            // Loop counter

      numAsterisk = 0;

      while (numAsterisk >= 0) {
         System.out.print("Enter an integer (negative to quit): ");
         numAsterisk = scnr.nextInt();

         if (numAsterisk >= 0) {
            System.out.println("Depicted graphically:");
            for (i = 1; i <= numAsterisk; ++i) {
               System.out.print("*");
            }
            System.out.println("\n");
         }
      }

      System.out.println("Goodbye.");
   }
}


import java.util.Scanner;
public class NestedLoop {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      int userNum;
      int i;
      int j;

      userNum = scnr.nextInt();


      
      
      for (i = 0; i <= userNum; i++){
         
         for(j = 1; j <= i; j++){
            
            System.out.print(" ");
         }
         
         System.out.println(i);
      
      }

   }
}



import java.util.Scanner;

public class DomainNamePrinter {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      char letter1;
      char letter2;

      System.out.println("Two-letter domain names:");

      letter1 = 'a';
      while (letter1 <= 'z') {
         letter2 = 'a';
         while (letter2 <= 'z') {
            System.out.println("" + letter1 + 
                               "" + letter2 + ".com");
            ++letter2;
         }
         int number = 0;
         while (number <= 9) {
            System.out.println("" + letter1 + 
                               "" + number + ".com");
            ++number;
         }
         ++letter1;
      }
   }
}

import java.util.Scanner;

public class NestedLoops {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int numRows;
        int numColumns;
        int currentRow;
        int currentColumn;
        char currentColumnLetter;

        // Read number of rows and columns
        numRows = scnr.nextInt();
        numColumns = scnr.nextInt();

        // Loop through each row
        for (currentRow = 1; currentRow <= numRows; currentRow++) {
            // Loop through each column
            for (currentColumn = 1; currentColumn <= numColumns; currentColumn++) {
                currentColumnLetter = (char) ('A' + currentColumn - 1); // Convert column number to letter
                System.out.print(currentRow + "" + currentColumnLetter + " ");
            }
        }

        System.out.println(); // Move to a new line at the end
    }
}



//DEVELOPING PROGRAMS INCREMENTALLY


import java.util.Scanner;

public class PhoneNumberDecoder {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String phoneStr;   // User input: Phone number string
      int i;             // Current index in phone number string

      System.out.print("Enter number: ");
      phoneStr = scnr.next();

      for (i = 0; i < phoneStr.length(); ++i) { // For each element
         System.out.println("Element " + i + " is: " + phoneStr.charAt(i));
      }
   }
}

//The second program version outputs any number elements, outputing '?' for non-number elements. 
//A FIXME comment is commonly used to indicate program parts to be fixed or added, as below. 
//Some editor tools automatically highlight the FIXME comment to attract the programmer's attention.


import java.util.Scanner;

public class PhoneNumberDecoder {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String phoneStr;   // User input: Phone number string
      int i;             // Current index in phone number string
      char currChar;     // Current char in phone number string

      System.out.print("Enter phone number: ");
      phoneStr = scnr.next();

      System.out.print("Numbers only: ");

      for (i = 0; i < phoneStr.length(); ++i) { // For each element
         currChar = phoneStr.charAt(i);
         if ((currChar >= '0') && (currChar <= '9')) {
            System.out.print(currChar); // Print character as is
         }
         // FIXME: Add else-if branches for letters and hyphen
         else {
            System.out.print('?');
         }
      }
      
      System.out.println("");
   }
}

//The third version completes the else-if branch for the letters A-C (lowercase and uppercase), per a standard phone keypad. 
//The program also modifies the if branch to echo a hyphen in addition to numbers.



import java.util.Scanner;

public class PhoneNumberDecoder {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String phoneStr;   // User input: Phone number string
      int i;             // Current index in phone number string
      char currChar;     // Current char in phone number string

      System.out.print("Enter phone number: ");
      phoneStr = scnr.next();

      System.out.print("Numbers only: ");

      for (i = 0; i < phoneStr.length(); ++i) { // For each element
         currChar = phoneStr.charAt(i);
         if (((currChar >= '0') && (currChar <= '9')) || (currChar == '-')) {
            System.out.print(currChar); // Print character as is
         }
         else if (((currChar >= 'a') && (currChar <= 'c'))
                 || ((currChar >= 'A') && (currChar <= 'C'))) {
            System.out.print('2');
         }
         // FIXME: Add remaining else-if branches
         else {
            System.out.print('?');
         }
      }

      System.out.println("");
   }
}

//The fourth version can be created by filling in the if-else branches similarly for other letters. 
//We added more instructions too. Code is not shown below, but sample input/output is provided.



//BREAK AND CONTINUE

//A break statement in a loop causes an immediate exit of the loop. A break statement can sometimes yield a loop that is easier to understand.

import java.util.Scanner;

public class MealSolver {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      final int EMPANADA_COST = 3;
      final int TACO_COST     = 4;

      int userMoney;
      int numTacos;
      int numEmpanadas;
      int mealCost;
      int maxEmpanadas;
      int maxTacos;

      numTacos = 0;
      numEmpanadas = 0;
      mealCost = 0;

      System.out.print("Enter money for meal: ");
      userMoney = scnr.nextInt();

      maxEmpanadas = userMoney / EMPANADA_COST;
      maxTacos = userMoney / TACO_COST;

      for (numTacos = 0; numTacos <= maxTacos; ++numTacos) {
         for (numEmpanadas = 0; numEmpanadas <= maxEmpanadas; ++numEmpanadas) {

            mealCost = (numEmpanadas * EMPANADA_COST) + (numTacos * TACO_COST);

            // Find first meal option that exactly matches user money
            if (mealCost == userMoney) {
               break;
            }
         }

         // If meal option exactly matching user money is found, 
         // break from outer loop as well
         if (mealCost == userMoney) {
            break;
         }
      }

      if (mealCost == userMoney) {
         System.out.println("$" + mealCost + " buys " + numEmpanadas
                 + " empanadas and " + numTacos
                 + " tacos without change.");
      }
      else {
         System.out.println("You cannot buy a meal without having "
                 + "change left over.");
      }
   }
}





import java.util.Scanner;

public class LabProgram {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scnr = new Scanner(System.in);
        String userInput;

        // Loop until the user enters "Done", "done", or "d"
        while (true) {
            // Read the user input
            userInput = scnr.nextLine();

            // Check for termination condition
            if (userInput.equalsIgnoreCase("Done") || 
                userInput.equalsIgnoreCase("done") || 
                userInput.equalsIgnoreCase("d")) {
                break;
            }

            // Reverse the input string
            String reversedString = new StringBuilder(userInput).reverse().toString();

            // Output the reversed string
            System.out.println(reversedString);
        }

        // Close the scanner object
        scnr.close();
    }
}






// ARRAYS


import java.util.Scanner;

public class ArrayPrinter {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      final int NUM_ELEMENTS = 8;             // Number of elements in array
      int[] userVals = new int[NUM_ELEMENTS]; // User numbers
      int i;                                  // Loop index

      System.out.println("Enter " + NUM_ELEMENTS + " integer values...");
      for (i = 0; i < userVals.length; ++i) {
         userVals[i] = scnr.nextInt();
         System.out.println("Value: " + userVals[i]);
      }
      
      System.out.print("You entered: ");
      for (i = 0; i < userVals.length; ++i) {
         System.out.print(userVals[i] + " ");
      }
      System.out.println();
   }
}

// A programmer may initialize an array's elements with non-default values by specifying the initial values in braces {} separated by commas. 
// Ex: int[] myArray = {5, 7, 11}; creates an array of three integer elements with values 5, 7, and 11. 
// Such array initialization does not require the use of the new keyword, 
// because the array's size is automatically set to the number of elements within the braces. 
// For larger arrays, initialization may be done by first defining the array, and then using a loop to assign array elements.

import java.util.Scanner;

public class CourseGradePrinter {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      final int NUM_VALS = 4;
      int [] courseGrades = new int[NUM_VALS];
      int i;
  
        for (i = 0; i < courseGrades.length; i++) {
            System.out.print(courseGrades[i] + " ");
        }
       
        System.out.println();

        
        for ( i = courseGrades.length - 1; i >= 0; i--) {
            System.out.print(courseGrades[i] + " ");
        }
        // Print a newline after the backward loop
        System.out.println();
      
   }
}

// Iterating through myArray
for (i = 0; i < myArray.length; ++i) {
   // Loop body accessing myArray[i]
}



import java.util.Scanner;

public class ArraySum {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      final int NUM_ELEMENTS = 8;             // Number of elements
      int[] userVals = new int[NUM_ELEMENTS]; // User numbers
      int i;                                  // Loop index
      int sumVal;                             // For computing sum

      // Prompt user to populate array
      System.out.println("Enter " + NUM_ELEMENTS + " integer values...");
      
      for (i = 0; i < userVals.length; ++i) {
         userVals[i] = scnr.nextInt();
         System.out.println("Value: " + userVals[i]);
      }

      // Determine sum
      sumVal = 0;
      for (i = 0; i < userVals.length; ++i) {
         sumVal = sumVal + userVals[i];
      }
      System.out.println("Sum: " + sumVal);
   }
}



import java.util.Scanner;

public class ArrayMax {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      final int NUM_ELEMENTS = 8;             // Number of elements
      int[] userVals = new int[NUM_ELEMENTS]; // Array of user numbers
      int i;                                  // Loop index
      int maxVal;                             // Computed max

      // Prompt user to populate array
      System.out.println("Enter " + NUM_ELEMENTS + " integer values...");
      
      for (i = 0; i < userVals.length; ++i) {
         userVals[i] = scnr.nextInt();
         System.out.println("Value: " + userVals[i]);
      }

      // Determine largest (max) number
      maxVal = userVals[0];                   // Largest so far
      
      for (i = 0; i < userVals.length; ++i) {
         if (userVals[i] > maxVal) {
            maxVal = userVals[i];
         }
      }
      System.out.println("Max: " + maxVal);
   }
}.


import java.util.Scanner;
 
public class PostageCalc {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      // Weights in ounces
      double[] letterWeights = {1.0, 2.0, 3.0, 3.5, 4.0, 5.0, 6.0,
                                7.0, 8.0, 9.0, 10.0, 11.0, 12.0, 13.0};
      // Costs in cents (usps.com 2017)
      int[] postageCosts = {49, 70, 91, 112, 161, 182, 203,
                            224, 245, 266, 287, 308, 329, 350};
      double userLetterWeight;
      boolean foundWeight;
      int i;
 
      // Prompt user to enter letter weight
      System.out.print("Enter letter weight (in ounces): ");
      userLetterWeight = scnr.nextDouble();
 
      // Postage costs is based on smallest letter weight greater than
      // or equal to mailing letter weight
      foundWeight = false;
 
      for (i = 0; (i < letterWeights.length) && (!foundWeight); ++i) {
         if( userLetterWeight <= letterWeights[i] ) {
            foundWeight = true;
            System.out.print("Postage for USPS first class mail is ");
            System.out.print(postageCosts[i]);
            System.out.println(" cents");
            
            System.out.print("The next higher weight is " + letterWeights[i + 1] + " with a cost of " + postageCosts[i + 1] + " cents.");
         }
      }
 
      if( !foundWeight ) {
         System.out.println("Letter is too heavy for USPS " +
                            "first class mail.");
      }
   }
}




// SWA
int X = 33;
int Y = 55;
int tempVal = 0;

tempVal = X;
X = Y;
Y = tempVal;

// Print X and Y







// Modifying an array during iteration example: Converting negatives to 0 program.
import java.util.Scanner;

public class NegativeToZero {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      final int NUM_ELEMENTS = 8;             // Number of elements
      int[] userVals = new int[NUM_ELEMENTS]; // User numbers
      int i;                                  // Loop index

      // Prompt user to input values
      System.out.println("Enter " + NUM_ELEMENTS + " integer values...");
      for (i = 0; i < userVals.length; ++i) {
         System.out.print("Value: ");
         userVals[i] = scnr.nextInt();
      }

      // Convert negatives to 0
      for (i = 0; i < userVals.length; ++i) {
         if (userVals[i] < 0) {
            userVals[i] = 0;
         }
      }

      // Print numbers
      System.out.print("New numbers: ");
      for (i = 0; i < userVals.length; ++i) {
         System.out.print(userVals[i] + " ");
      }
   }


   
import java.util.Scanner;

public class NegativeToZeroCopy {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      final int NUM_ELEMENTS = 8;               // Number of elements
      int[] userVals = new int[NUM_ELEMENTS];   // User numbers
      int[] copiedVals = new int[NUM_ELEMENTS]; // New numbers
      int i;                                    // Loop index

      // Prompt user for input values
      System.out.println("Enter " + NUM_ELEMENTS + " integer values...");
      for (i = 0; i < userVals.length; ++i) {
         System.out.print("Value: ");
         userVals[i] = scnr.nextInt();
      }

      // Convert nums to newNums
      for (i = 0; i < userVals.length; ++i) {
         copiedVals[i] = userVals[i]; ///IMPROTANT PART
      }

      // Convert negatives to 0
      for (i = 0; i < copiedVals.length; ++i) {
         if (copiedVals[i] < 0) {
            copiedVals[i] = 0;
         }
      }

      // Print numbers
      System.out.println("\nOriginal and new values: ");
      for (i = 0; i < userVals.length; ++i) {
         System.out.println(userVals[i] + " became " + copiedVals[i]);
      }
      System.out.println();














      //DEBUGGING EXAMPLE: REVERSING ARRAY

      

      import java.util.Scanner;

      public class ArrayReverseElem {
         public static void main(String[] args) {
            Scanner scnr = new Scanner(System.in);
            final int NUM_ELEMENTS = 8;             // Number of elements
            int[] userVals = new int[NUM_ELEMENTS]; // User numbers
            int i;                                  // Loop index
            int tempVal;                            // Temp variable for swapping
      
            // Prompt user to input values
            System.out.println("Enter " + NUM_ELEMENTS
                    + " integer values...");
            for (i = 0; i < userVals.length; ++i) {
               System.out.print("Value: ");
               userVals[i] = scnr.nextInt();
            }
      
            // Reverse array's elements
            for (i = 0; i < (userVals.length / 2); ++i) {
               tempVal = userVals[i];                           // Temp for swap
               userVals[i] = userVals[userVals.length - 1 - i]; // First part of swap
               userVals[userVals.length - 1 - i] = tempVal;     // Swap complete
            }
      
            // Print numbers
            System.out.print("\nNew values: ");
            for (i = 0; i < userVals.length; ++i) {
               System.out.print(userVals[i] + " ");
            }
         }
      }




// An array can be declared with two dimensions. 
int[][] myArray = new int[R][C] 
//represents a table of int variables with R rows and C columns, so R*C elements total. For example, 
int[][] myArray = new int[2][3]
//creates a table with 2 rows and 3 columns, for 6 int variables total. Example accesses are 
myArray[0][0] = 33; 
//or 
num = myArray[1][2].






/* Direct driving distances between cities, in miles */
/* 0: Boston  1: Chicago  2: Los Angeles */
public class CityDist {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int cityA;                                 // Starting city
      int cityB;                                 // Destination city
      int [][] drivingDistances = new int[3][3]; // Driving distances

      // Initialize distances array
      drivingDistances[0][0] = 0;
      drivingDistances[0][1] = 960;  // Boston-Chicago
      drivingDistances[0][2] = 2960; // Boston-Los Angeles
      drivingDistances[1][0] = 960;  // Chicago-Boston
      drivingDistances[1][1] = 0;
      drivingDistances[1][2] = 2011; // Chicago-Los Angeles
      drivingDistances[2][0] = 2960; // Los Angeles-Boston
      drivingDistances[2][1] = 2011; // Los Angeles-Chicago
      drivingDistances[2][2] = 0;

      System.out.println("0: Boston 1: Chicago  2: Los Angeles");

      System.out.print("Enter city pair (Ex: 1 2) -- ");
      cityA = scnr.nextInt();
      cityB = scnr.nextInt();

      if ((cityA >= 0) && (cityA <= 2) && (cityB >= 0) && (cityB <= 2)) {
         System.out.print("Distance: " + drivingDistances[cityA][cityB]);
         System.out.println(" miles.");
      }
   }
}



//Initializing a two-dimensional array during declaration.

// Initializing a 2D array
int[][] numVals = { {22, 44, 66}, {97, 98, 99} };

// Use multiple lines to make rows more visible
int[][] numVals = {
      {22, 44, 66}, // Row 0
      {97, 98, 99}  // Row 1
};





import java.util.Scanner;

public class LabProgram {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        // Read three characters from input
        char char1 = scnr.next().charAt(0);
        char char2 = scnr.next().charAt(0);
        char char3 = scnr.next().charAt(0);

        char temp; // Temporary variable for swapping

        // Sorting the characters
        if (char1 > char2) {
            temp = char1;
            char1 = char2;
            char2 = temp;
        }
        
        if (char1 > char3) {
            temp = char1;
            char1 = char3;
            char3 = temp;
        }
        
        if (char2 > char3) {
            temp = char2;
            char2 = char3;
            char3 = temp;
        }

        // Output the sorted characters
        System.out.println(char1 + " " + char2 + " " + char3);

        scnr.close(); // Close the scanner
    }
}


// METHODS AND CLASSES

public class PizzaArea { 
   public static double calcPizzaArea() {
      double pizzaDiameter;
      double pizzaRadius;
      double pizzaArea;
      double piVal = 3.14159265;

      pizzaDiameter = 12.0;
      pizzaRadius = pizzaDiameter / 2.0;
      pizzaArea = piVal * pizzaRadius * pizzaRadius;
      return pizzaArea;
   }

   public static void main(String[] args) {  
      System.out.println("12 inch pizza is " +   
       calcPizzaArea() + " inches squared"); 
   }
}

static void hello() {
   System.out.print();
}

hello();






// A method call evaluates to the returned value. Thus, a method call often appears within an expression. 
//Ex: 5 + computeSquare(4) evaluates to 5 + 16, or 21.
// A method with a void return type cannot be used within an expression, instead being used in a statement like: outputData(x, y);


import java.util.Scanner;

public class Demo {
   public static double calcCircularBaseArea(double radius) {
      return Math.PI * radius * radius;
   }

   public static double calcCylinderVolume(double baseRadius, double height) {
      return calcCircularBaseArea(baseRadius) * height;
   }

   public static double calcCylinderSurfaceArea(double baseRadius, double height) {
      return (2 * Math.PI * baseRadius * height) + (2 * calcCircularBaseArea(baseRadius));
   }

   public static void main(String[] args) {
      double radius;  // User defined feet
      double height;  // User defined height
      Scanner scnr = new Scanner(System.in);

      // Prompt user for radius
      System.out.println("Enter base radius: ");
      radius = scnr.nextDouble();
      
      // Prompt user for height
      System.out.println("Enter height: ");
      height = scnr.nextDouble();

      // Output the cylinder volume result
      System.out.print("Cylinder volume: ");
      System.out.printf("%.1f\n", calcCylinderVolume(radius, height));

      // Output the cylinder surface area result
      System.out.print("Cylinder surface area: ");
      System.out.printf("%.3f\n", calcCylinderSurfaceArea(radius, height));
   }



   
import java.util.Scanner;

public class ShippingCost {
   // Determine shipping tax on cost
   public static double calcTax(double cost) {
     return cost * 0.15;
   }

   // Determine shipping cost based on weight
   public static double calcShippingCost(double weight) {
      double cost;

      if (weight < 1) {
         cost = 7.88;
      }
      else if (weight < 6) {
         cost = 14.32;   
      }
      else if (weight < 10) {
         cost = 21.11;
      }
      else{
         cost = 25.5;
      }
      cost = cost + calcTax(cost);

      return cost;
   }

   public static void main(String[] args) {   
      Scanner scnr = new Scanner(System.in);
      double weightOfPackage;        // User defined package weight

      System.out.print("Enter package weight: ");
      weightOfPackage = scnr.nextDouble();
      System.out.print("Shipping cost: $");
      System.out.printf("%.2f", calcShippingCost(weightOfPackage));
      System.out.println("");
   }
}


import java.util.Scanner;

/* Returns fee charged by ebay.com given the selling
   price of fixed-price books, movies, music, or video-games.
   Fee is $0.50 to list plus a % of the selling price:
   13% for $50.00 or less
    plus 5% for $50.01 to $1000.00
    plus 2% for $1000.01 or more
   Source: http://pages.ebay.com/help/sell/fees.html, 2012.
 
 Note: double variables are not normally used for dollars/cents
 due to the internal representation's precision, but are used
 here for simplicity.
 */

public class EbayFeeCalc {
   // Method determines the eBay price given item selling price
   public static double calcEbayFee(double sellPrice) {
      final double BASE_LIST_FEE = 0.50;     // Listing Fee
      final double PERC_50_OR_LESS = 0.13;   // % $50 or less
      final double PERC_50_TO_1000 = 0.05;   // % $50.01..$1000.00
      final double PERC_1000_OR_MORE = 0.02; // % $1000.01 or more
      double feeTot;                         // Resulting eBay fee

      feeTot = BASE_LIST_FEE;

      // Determine additional fee based on selling price
      if (sellPrice <= 50.00) { // $50.00 or lower
         feeTot = feeTot + (sellPrice * PERC_50_OR_LESS);
      }
      else if (sellPrice <= 1000.00) { // $50.01..$1000.00
         feeTot = feeTot + (50 * PERC_50_OR_LESS)
                 + ((sellPrice - 50) * PERC_50_TO_1000);
      }
      else { // $1000.01 and higher
         feeTot = feeTot + (50 * PERC_50_OR_LESS)
                 + ((1000 - 50) * PERC_50_TO_1000)
                 + ((sellPrice - 1000) * PERC_1000_OR_MORE);
      }

      return feeTot;
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double sellingPrice;        // User defined selling price

      // Prompt user for selling price, call eBay fee method
      System.out.print("Enter item selling price (e.g., 65.00): ");
      sellingPrice = scnr.nextDouble();
      System.out.println("eBay fee: $" + calcEbayFee(sellingPrice));
   }
}


//METHODS WITH LOOPS

import java.util.Scanner;

public class ListAverage {
   // Method prompts to enter a list of values
   public static double computeAverage(Scanner scnr, int numCount) {
      double valuesSum = 0;
      int currValue = 0;

      for (int i = 0; i < numCount; ++i) {
         System.out.print("Enter number: ");
         currValue = scnr.nextInt(); 
         valuesSum += currValue;
      }

      return valuesSum / numCount;
   }
   
   public static void main(String [] args) {
      Scanner scnr = new Scanner(System.in);
      int numValues;
      double averageVal;
      
      System.out.println("Enter number of values: ");
      numValues = scnr.nextInt(); 
      averageVal = computeAverage(scnr, numValues);
      
      System.out.print("Average: ");
      System.out.printf("%.3f", averageVal);
      System.out.println("");
   }
}
.
import java.util.Scanner;

public class LeastCommonMultiple {

   // Method prompts user to enter positive non-zero number
   public static int promptForPositiveNumber(Scanner scnr) {
      int userNum;

      userNum = 0;

      while (userNum <= 0) {
         System.out.println("Enter a positive number (>0): ");
         userNum = scnr.nextInt();

         if (userNum <= 0) {
            System.out.println("Invalid number.");
         }
      }

      return userNum;
   }

   // Method returns greatest common divisor of two inputs
   public static int findGCD(int aVal, int bVal) {
      int numA;
      int numB;

      numA = aVal;
      numB = bVal;

      while (numA != numB) { // Euclid's algorithm
         if (numB > numA) {
            numB = numB - numA;
         } else {
            numA = numA - numB;
         }
      }

      return numA;
   }

   // Method returns least common multiple of two inputs
   public static int findLCM(int aVal, int bVal) {
      int lcmVal;

      lcmVal = Math.abs(aVal * bVal) / findGCD(aVal, bVal);

      return lcmVal;
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int usrNumA;
      int usrNumB;
      int lcmResult;

      System.out.println("Enter value for first input");
      usrNumA = promptForPositiveNumber(scnr);

      System.out.println("\nEnter value for second input");
      usrNumB = promptForPositiveNumber(scnr);

      lcmResult = findLCM(usrNumA, usrNumB);

      System.out.println("\nLeast common multiple of " + usrNumA
              + " and " + usrNumB + " is " + lcmResult);
   }
}

//ASSERTION TESTING

public class HrMinToMinTestHarness {
   public static double hrMinToMin(int origHours, int origMinutes) {
      int totMinutes;      // Resulting minutes

      totMinutes = (origHours * 60) + origMinutes;

      return origMinutes;
   }

   public static void main(String[] args) {
      System.out.println("Testing started");

      assert (hrMinToMin(0, 0) == 0) : "Assertion (hrMinToMin(0, 0) == 0) failed";
      assert (hrMinToMin(0, 1) == 1) : "Assertion (hrMinToMin(0, 1) == 1) failed";
      assert (hrMinToMin(0, 99) == 99) : "Assertion (hrMinToMin(0, 99) == 99) failed";
      assert (hrMinToMin(1, 0) == 60) : "Assertion (hrMinToMin(1, 0) == 60) failed";
      assert (hrMinToMin(5, 0) == 300) : "Assertion (hrMinToMin(5, 0) == 300) failed";
      assert (hrMinToMin(2, 30) == 150) : "Assertion (hrMinToMin(2, 30) == 150) failed";
      // Many more test vectors would be typical...

      System.out.println("Testing completed");
   }
}

// Testing started
// Exception in thread "main" java.lang.AssertionError: Assertion (hrMinToMin(1, 0) == 60) failed
//         at HrMinToMinTestHarness.main(HrMinToMinTestHarness.java:16)




// If you have studied branches, you may recognize that each assert statement in main() could be replaced by an if statement like:
if ( hrMinToMin(0, 0) != 0 ) {
   System.out.println("0:0, expecting 0, got: " + hrMinToMin(0, 0));
}
// But the assert is more compact.

// Note that assertions are not enabled by default. A programmer must execute Java programs with additional command-line options in order to enable assertions. 
// Specifically, the command-line option -ea is necessary at run-time. Ex: java -ea HrMinToMinTestHarness



import java.util.Scanner;

public class QuizMarker {

   public static void passFail(int[] scoreVals, int quizThres) {
      int i;

      for (i = 0; i < scoreVals.length; ++i) {
          System.out.print(scoreVals[i]);
          System.out.print(" ");
          if (scoreVals[i] >= quizThres) {
            System.out.println("p");
          }
          else {
            System.out.println("f");
          }
      }
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      final int NUM_SCORES = 4;
      int[] quizScores = new int[NUM_SCORES];
      int threshold = 7;
      int i;

      for (i = 0; i < quizScores.length; ++i) {
          quizScores[i] = scnr.nextInt();
      }

      passFail(quizScores, threshold);
   }
}


import java.util.Scanner;

public class ScoreAdjuster {

   public static void updateScoreVals(int[] scoreVals, int updateVal) {
      int i;

      for (i = 0; i < scoreVals.length; ++i) {
          scoreVals[i] = scoreVals[i] + updateVal;
      }
   }
   public static void printScoreVals(int[] scoreVals) {
       int i;

       for (i = 0; i < scoreVals.length; ++i) {
           System.out.println(scoreVals[i]);
       }
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      final int NUM_SCORES = 3;
      int[] quizScores = new int[NUM_SCORES];
      int scoreUpdate = 5;
      int i;

      for (i = 0; i < quizScores.length; ++i) {
          quizScores[i] = scnr.nextInt();
      }

      updateScoreVals(quizScores, scoreUpdate);
      printScoreVals(quizScores);
   }
}

// Passing Array References: When you pass an array (like quizScores) to a method, you are passing a reference to the array, not a copy of the array. 
// This means any changes to the array's contents in the method affect the original array.
// Modifying Elements Directly: In the corrected updateScoreVals method, we modify the elements of the array directly:





//Method Scope
import java.util.Scanner;

public class HeightConverter {
   final static double CM_PER_IN = 2.54; // ACCESSIBLE ANYWHERE IN THE PROGRAM, regardless of where in the class they are declared. this is known as a class member field. 
   final static int IN_PER_FT = 12; // its not inside a method, its freely floating in the class object

   /* Converts a height in feet/inches to centimeters */
   public static double heightFtInToCm(int heightFt, int heightIn) {
      int totIn;
      double cmVal;

      totIn = (heightFt * IN_PER_FT) + heightIn; // Total inches. this is a local variable. only accesible in the method it was created in.
      cmVal = totIn * CM_PER_IN;                 // Conv inch to cm
      return cmVal;
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int userFt;      // User defined feet
      int userIn;      // User defined inches

      // Prompt user for feet/inches
      System.out.print("Enter feet: ");
      userFt = scnr.nextInt();

      System.out.print("Enter inches: ");
      userIn = scnr.nextInt();

      // Output the conversion result
      System.out.print("Centimeters: ");
      System.out.println(heightFtInToCm(userFt, userIn));
   }
}

// Avoid global variables (or overusing fields) to reduce complexity and side effects.
// Use parameters and return values to transfer data between methods rather than relying on shared fields.
// Avoid naming collisions between fields and local variables to prevent confusion.

// The main() method can access heightFtInToCm() even if the programmer defines heightFtInToCm() below main(), provided that both methods are defined in the same class.





//  Method name overloading

public class DatePrinter {
   public static void printDate(int currDay, int currMonth, int currYear) {    // int int int 
      System.out.print(currMonth + "/" + currDay + "/" + currYear);
   }

   public static void printDate(int currDay, String currMonth, int currYear) { // int string int
      System.out.print(currMonth + " " + currDay + ", " + currYear);
   }

   public static void main(String[] args) {
      
      printDate(30, 7, 2012); // grabs the first printDate 
      System.out.println();
      
      printDate(30, "July", 2012); // grabs the second printDate
      System.out.println();
   }
}

// Its okay for two methods to have the same name as long as they have differing paremeter types. the compiler will understand which is which.
// it will yeild an error if the two same name methods have the same perameter types. its okay to do more than two methods with the same name as long as all the parameter types are different.




//PARAMETER ERROR CHECKING

public class DatePrinterWithCheck {
   public static void printDate(int currDay, int currMonth, int currYear) {

      // Parameter error checking
      if ((currDay < 1) || (currDay > 31)) {
         System.out.println("Invalid day (" + currDay + "). Using 1.");
         currDay = 1;
      }

      if ((currMonth < 1) || (currMonth > 12)) {
         System.out.println("Invalid month (" + currMonth + "). Using 1.");
         currMonth = 1;
      }

      // Begin method's normal behavior
      System.out.print(currMonth + "/" + currDay + "/" + currYear);
   }

   
   public static void main(String[] args) {
      printDate(30, 7, 2012);
      System.out.print("\n\n");

      printDate(40, 7, 2012);
      System.out.print("\n\n");

      printDate(30, 13, 2012);
      System.out.print("\n\n");
   }
}

// Its good to have safety measures in your code so people cant go out of bounds in regard to the input. 
// The code to output the print statement is simple but can easily be broken by using too high or too low of a number to tell the date. putting is safe guards prevents this.



//USING SCANNER IN METHODS

import java.util.Scanner;

public class CalculatePizzaCalories {

   public static double calcCircleArea(double circleDiameter) {
      double circleRadius;
      double circleArea;
      double piVal = 3.14159265;

      circleRadius = circleDiameter / 2.0;
      circleArea = piVal * circleRadius * circleRadius;

      return circleArea;
   }

   public static double getPizzaCalories(Scanner scnr) { // passes the scanner to this method for use.
      double pizzaDiameter;
      double totalCalories;
      double caloriesPerSquareInch = 16.7;    // Regular crust pepperoni pizza.

      System.out.print("Enter pizza's diameter (inches): ");
      pizzaDiameter = scnr.nextDouble(); // using it here.

      totalCalories = calcCircleArea(pizzaDiameter) * caloriesPerSquareInch;

      return totalCalories;
   }

   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in); // only one scanner object.

      System.out.println("Pizza has " + getPizzaCalories(scnr) + " calories.");
      System.out.println("Pizza has " + getPizzaCalories(scnr) + " calories.");
   }
}

// If a method needs to read user input, a good practice is to create a single Scanner object in main() and pass that Scanner object to the method. 
// The program above creates a Scanner object in main() and passes the Scanner to the getPizzaCalories() method.


//
//
//

public static void readWord() {
   Scanner scnr = new Scanner(System.in);

   String word = scnr.next();
   // Do something with the word
}

public static void main(String [] args) {
   readWord(); // creates a Scanner scnr = new Scanner(System.in);
   readWord(); // creates a second Scanner scnr = new Scanner(System.in);
}

// heres an example above of using the scanner object twice. Its only made one time in the readWord method but every time you call it in main it creates a new scanner object.

 //
 //
 //

public static void readWord(Scanner scnr) {
   String word = scnr.next();
   // Do something with the word
}

public static void main(String [] args) {
   Scanner scnr = new Scanner(System.in);
    
   readWord(scnr);
   readWord(scnr);
   
}

// this program above does the same thing as the previous program but now only one scanner object is created. you pass the scanner into the readWord method for less future problems.

   ///
   /// 
   /// 

// Input: 8 9

public static int readInt() {
   Scanner scnr = new Scanner(System.in);
    
   return scnr.nextInt();
}

public static void main(String [] args) {
   int sum = readInt() + readInt();
}

// The first call to readInt() will return 8. The second call may not always return 9 because the first Scanner may have read more input than needed.


public static int readInt(Scanner scnr) {
   return scnr.nextInt();
}

public static void main(String [] args) {
   Scanner scnr = new Scanner(System.in);

   int sum = readInt(scnr) + readInt(scnr);
}

   ///  
   /// 
   /// 

   // Input: 1 2

   public static int readInt(Scanner scnr) {
      return scnr.nextInt();
   }
   
   public static void main(String [] args) {
      Scanner scnr = new Scanner(System.in);
   
      int sum = readInt(scnr) + readInt(scnr);
   }

   //The program uses one Scanner to read from the System.in to avoid multiple Scanners from interfering with each other. this means that the asnwer will always be 3


   //PERFECT SIZED ARRAYS

   import java.util.Arrays;

public class JoinArrays {

   public static void main(String[] args) {
      double[] mondayTemperatures = {85.3, 95.8, 72.9}; // perfect sized array
      double[] tuesdayTemperatures = {68.3, 81.4, 74.8}; // perfect sized array

      // The toString() method in the Arrays class returns a String containing
      // the contents of the array, comma separated, in square brackets.
      // Alternatively, a for loop could be used to print the array contents.
      System.out.println("The temperatures on Monday were: " +    
         Arrays.toString(mondayTemperatures));
      System.out.println("The temperatures on Tuesday were: " + 
         Arrays.toString(tuesdayTemperatures));
              
      double[] earlyWeekTemperatures = joinArrays(mondayTemperatures, 
         tuesdayTemperatures);
              
      System.out.println("The temperatures on Monday and Tuesday were: " + 
         Arrays.toString(earlyWeekTemperatures));
   }
         
   /** Take two arrays and construct a new array that contains the contents of first, 
    *  followed by second.
    *
    *  @param first A perfect size array whose contents will be transferred 
    *  to the lower indices of the new array.
    *  @param second A perfect size array whose contents will be transferred 
    *  to the higher indices of the new array.
    *  @return A new array containing the contents of first followed by the 
    *  contents of second.
    */
   public static double[] joinArrays (double[] firstArray, double[] secondArray) {
      // The array to be returned will need to hold elements from both arrays
      double[] resultArray = new double[firstArray.length + secondArray.length];
      int index;

      // Move in the elements from first
      for (index = 0; index < firstArray.length; ++index) {
         resultArray[index] = firstArray[index];
      }
              
      // Move in the elements from second--remember to put them in result after 
      // the elements from first
      for (index = 0; index < secondArray.length; ++index) {
         resultArray[index + firstArray.length] = secondArray[index];
      }
              
      // Return the perfect sized result array
      return resultArray;
   }
}


//OVERSIZE ARRAYS

// An oversize array is an array where the number of elements used is less than or equal to the memory allocated. 
// Since the number of elements used in an oversize array is usually less than the array's length,
//  a separate integer variable is used to keep track of how many array elements are currently used. 

// The code below shows an array declaration and associated variable declaration that create an oversize array with 1000 elements allocated but zero elements used (yet).

int[] salesTransactions = new int[1000];
int salesTransactionsSize = 0;

// Oversize arrays are useful when the number of elements stored in the array is not known in advance, or when the number of elements stored in an array varies over time.
// Ex: An oversize array would be used for a shopping list since the number of elements in the list increases when items are added to list and decreases when items are removed or purchased.

// Construct an empty list with 5 elements
String[] shoppingList = new String[5];
int shoppingListSize = 0;

// Add first element to shopping list
shoppingList[shoppingListSize] = "Milk";
++shoppingListSize;   

// Add second element to shopping list
shoppingList[shoppingListSize] = "Oranges";
++shoppingListSize;           

// Add third element to shopping list
shoppingList[shoppingListSize] = "Apples";
++shoppingListSize;

//
//
//

// In practice, oversize arrays typically use three variables including: the array reference, the current size, and a constant for the array capacity. 
// These three variables can be given similar identifiers to indicate that they belong together. The array capacity is stored as a constant to clarify the meaning of the number. 
// Ex: If a program needs to store the answers to a true/false quiz, three variables could be declared for the array capacity, the array itself, and current size, as shown below.

final int QUIZ_ANSWER_CAPACITY = 200;
boolean[] quizAnswers = new boolean[QUIZ_ANSWER_CAPACITY];
int quizAnswerSize = 0;




//METHODS WITH OVERSIZED ARRAYS

public static void printOversizeArray(String[] arrayRef, int arraySize) {
   int index;

   System.out.print("[");
   for (index = 0; index < arraySize; ++index) {
      System.out.print(arrayRef[index]);
      if (index != arraySize - 1) {  // Don't print trailing , for last element
         System.out.print(", ");
      }
   }
   System.out.println("]");
}

// When oversize arrays are passed to a method, two parameters are needed for both the array reference and the current size. 
// Ex: The printOversizeArray() method above needs to use arraySize in the for loop instead of arrayRef.length, because using arrayRef.length would print unused array elements.





//METHODS WITH OVERSIZED ARRAYS: ADDING ELELMENTS

final int LIST_SIZE = 4;
String[] toDoList = new String[LIST_SIZE];
int toDoListSize = 0;
                
toDoListSize = addElement(toDoList, toDoListSize, "Study");

...

public static int addElement(String[] arrayRef,int currentSize,String addMe) {
   // Check that array has space 
   if (currentSize == arrayRef.length) {    
      return currentSize;  
   }

   // If array has space, add the element to the array 
   arrayRef[currentSize] = addMe; 
   ++currentSize; 
   return currentSize;
}

// The oversize array toDoList is created with a capacity for four elements and a current size of 0.
// When the addElement() method is called, the array reference, current size, and element to add are copied to the method's parameters.
// "Study" is added to toDoList at index 0, and the parameter currentSize is incremented to 1.
// currentSize is returned by the method and assigned to toDoListSize.

final int PAGES_CAPACITY = 3;
int[] pagesRead = new int[PAGES_CAPACITY];
int pagesReadSize = 0;
pagesReadSize = addElement(pagesRead, pagesReadSize, 3);
pagesReadSize = addElement(pagesRead, pagesReadSize, 8);
pagesReadSize = addElement(pagesRead, pagesReadSize, 7);

// ^^^ 3 was added first at index 0. 8 was added second at index 1. 7 was added last at index 2. 

//
//
//

final int PAGES_CAPACITY = 3;
int[] pagesRead = new int[PAGES_CAPACITY];
int pagesReadSize = 0;
/* pagesReadSize = */addElement(pagesRead, pagesReadSize, 3); 
addElement(pagesRead, pagesReadSize, 8);
addElement(pagesRead, pagesReadSize, 7);

// ^^^ pagesReadSize is not assigned the return value from addElement(), so pagesReadSize is not updated.

//
//
//

final int PAGES_CAPACITY = 2; // only has 2 spaces, cannot add elements past this
int[] pagesRead = new int[PAGES_CAPACITY];
int pagesReadSize = 0;
pagesReadSize = addElement(pagesRead, pagesReadSize, 3);
pagesReadSize = addElement(pagesRead, pagesReadSize, 8);
pagesReadSize = addElement(pagesRead, pagesReadSize, 7);

// ^^^ 3 and 8 are added to the array at index 0 and 1, after which the array's capacity is reached. So, 7 is not added to the array because the array is already full.


//METHODS WITH OVERSIZED ARRAYS: REMOVING ELELMENTS

public static int removeFirst(int[] arrayRef, int arraySize, int targetVal) {
   boolean targetFound;
   int index;

   targetFound = false;

   // Step through the array one element at a time
   for (index = 0; index < arraySize; ++index) {
      // If matching element found, move each element to the previous index
      if (targetFound) {
         arrayRef[index-1] = arrayRef[index];
      }

      // Check if matching element found
      if (arrayRef[index] == targetVal) {
         targetFound = true;
      }
   }

   // If matching element found, array size is one element smaller
   // otherwise array size hasn't changed 
   if (targetFound) {
      return arraySize - 1;
   }
   else {
      return arraySize;
   }
}

// The removeFirst() method above removes the first element from an oversize array whose value is equal to targetVal. 
// removeFirst() steps through the array one index at a time until the matching element is found. When the matching element is found, the boolean targetFound is set to true. 
// Subsequent loop iterations assign each element to the previous index. At the end of the method, targetFound is used to determine if an element was removed and the array size has decreased.

int[] onlineSales = {4, 3, 1, 4, 3, 9}; // Perfect size array
int onlineSalesSize = 6; // By storing the size, a method designed for oversize arrays can be used

removeFirst(onlineSales, onlineSalesSize, 4)

// this method call would return 5 becuase the onlineSalesSize = 6 and since index[0] = 4, the 4 is removed and the array is shifted down by 1. 6 - 1 = 5

removeFirst(onlineSales, onlineSalesSize, 8)

// No elements have the value 8, so the original array size of 6 will be returned.

onlineSalesSize = removeFirst(onlineSales, onlineSalesSize, 4);
onlineSalesSize = removeFirst(onlineSales, onlineSalesSize, 4);
System.out.println(Arrays.toString(onlineSales));

// When array elements after the matching element are shifted to the left, the original value is not removed. 
// The value 9 remains in elements at indices 4 and 5. Since Arrays.toString() prints the entire array contents, the value 9 is printed three times.









//BUBBLE SORTED ARRAY: USE OF A DO WHILE LOOP

import java.util.Scanner;

public class LabProgram {
   
   public static void sortArray(int[] myArr, int arraySize){
      int temp;
      boolean swapped;
      
      do { // do while loop useage
         swapped = false; // boolean action
         for(int i = 0; i < arraySize -1; i++){           
           if(myArr[i] < myArr[i + 1]){
              
              temp = myArr[i]; // swapping method
              myArr[i] = myArr[i + 1];
              myArr[i + 1] = temp;
              swapped = true;
              
           }
         }
      } while (swapped); // more do while goodness
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int arraySize = scnr.nextInt();
      int[] myArr = new int[arraySize];
      
      for(int i = 0; i < arraySize; i++){
         myArr[i] = scnr.nextInt();
      }
      
      sortArray(myArr,arraySize);
      
      for(int i = 0; i < arraySize; i++){
         System.out.print(myArr[i] + ",");
      }
      System.out.println();
   }
}



// WORD FREQUENCIES

import java.util.Scanner;

public class LabProgram {

   public static int getWordFrequency(String[] wordsList, int listSize, String searchWord){
      int count = 0;
      for(int i = 0; i < listSize; i++){        
         
         if(wordsList[i].equalsIgnoreCase(searchWord)){ // comparing case insensitivity
            count++;
         }
      }
      return count; // because it says int before the method call, you must return something. in this case its the count of matching words
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int listSize = scnr.nextInt();
      String[] wordsList = new String[listSize];
      String searchWord;
      
      
      
      for(int i = 0; i < listSize; i++){
         wordsList[i] = scnr.next();
         
      }
      for(int i = 0; i < listSize; i++){
         int frequency = getWordFrequency(wordsList, listSize, wordsList[i]); // putting the method in a for loop and making one of the parameters the index value in the array and giving it the value of 'frequency'
         System.out.println(wordsList[i] + " " + frequency);
         
      }
      
      
   }
}


// LAB: Step counter

import java.util.Scanner;

public class LabProgram {
   
   public static int feetToSteps(double userFeet){
      int userSteps = (int)(userFeet / 2.5); // This is how you do double to int conversion using floating point arithmetic.
      return userSteps;
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double userFeet = scnr.nextDouble();
      System.out.println(feetToSteps(userFeet));
      
   }
}

//  LAB: Count characters - methods

import java.util.Scanner;

public class LabProgram {
   
   public static int calcNumCharacters(String userString, char userChar){      
      int count = 0;
      
      for(int i = 0; i < userString.length(); i++){
         if(userString.charAt(i) == userChar){ // i originally thought you had to do .equals() to compare but this is not the case for chars 
            count++;
         }
      }
      return count;
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      char userChar = scnr.next().charAt(0);
      String userString = scnr.next();
      int count = calcNumCharacters(userString, userChar);
      
      if(count == 1){
         System.out.println(count + " " + userChar);
      }
      else{
         System.out.println(count + " " + userChar + "'s");
      }
   }
}

//LAB: REMOVE NON ALPHABETIC CHARACTERS FROM STRING

import java.util.Scanner;

public class LabProgram {
   
   // Method to remove non-alphabetic characters from a string
   public static String removeNonAlpha(String userString) {
      StringBuilder result = new StringBuilder(); // LEARN STRING BUILDER

      // Loop through each character in the string
      for (int i = 0; i < userString.length(); i++) {
         char currentChar = userString.charAt(i); // making userString.charAt(i) its own variable that updates everytime the loop executes

         // Check if the character is alphabetic
         if (Character.isLetter(currentChar)) {
            result.append(currentChar); // Append alphabetic characters
         }
      }

      // Return the modified string
      return result.toString();  // STUDY THIS .toString() thing
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      // Read the input string
      String userString = scnr.nextLine();
      
      // Call the method to remove non-alphabetic characters
      String modifiedString = removeNonAlpha(userString); // making the method call its own variable
      
      // Print the result
      System.out.println(modifiedString); // printing the method call variable
   }
}




// CLASSES AND OBJECTS

class classname { // initialized the class. you want things in the class to relate to eachother. You can either have instance variables or methods in a class
   int var1; // instance variables
   String var2;

   public static String removeNonAlpha(String userString) { // methods 

   }

}

class person {

   int age = 21;
   String name = "phoenix";
   char sex = 'M';
   String weatherToday = "Sunny"; // This wouldnt make sense inside of the person class.

}





// Classes: Pokemon Example

public class Main{
   public static void main(String []args) {

      // className nameOfObject = new className();
      Pokemon p1 = new Pokemon();
      p1.name = "Pikachu";
      p1.level = 10;
      System.out.print(p1.name + " " + p1.level);  // Would print out "Pikachu 10"

      p2.name = "Evee";
      p2.level = 34;
      p2.attack();  // Would print out "Evee attack!"

      System.out.print(p3.level); // if there wasnt a constructor the default would be 0, but now it will be set to 1.

   }

   public class Pokemon{ // this will be the blueprint for creating objects 

      
      String name;
      int level;

      Pokemon(){ // This is a constructor. What it does is sets the values and parameters of the classes objects to a default of whatever you would like it to. Its done as soon as you create a new object
         level = 1; // When a pokemon is created, it will automatically have the level set to 1.
         // Constructors dont have a return type and are the same name as the class.
      }


      void attack(){ // attack method

         System.out.print(name + " attack!");
      }
   }

}









// What if we wanted the user to give us a name or a level? We would add another constructor that has parameters.

Pokemon(String pName, int pLevel){
   name = pName;
   level = pLevel;

}


public class Main{
   public static void main(String []args) {
      Pokemon p1 = new Pokemon(pName: "Eevee", pLevel: 25); // passing in arguments that the constructor has set 
      System.out.println(p1.level); // Prints "25"
      p1.attack(); // Prints "Evee attack!"

   }
}


// CLASSES: 'this' keyword
// imagine since this constructor has the variable "name", it can get pretty confusing with the interpretor which name you want to call when using the constructor
// multiple different methods in the class could also be using the variable "name" and the program will not know what to pick.
// using this.name will localize the variable to search inside the constructor for the name, not elsewhere.
// can do with methods aswell
Pokemon(String name, int level){
   this.name = name;
   this.level = level;

}





// DEFINING A CLASS

public class Restaurant {                        // Keeps a user's review of a restaurant
   private String name;
   private int rating;
   
   public void setName(String restaurantName) {  // Sets the restaurant's name        
      ...
   }
   
   public void setRating(int userRating) {       // Sets the rating (1-5, with 5 best)    
      ...
   }
   
   public void print() {                         // Prints name and rating on one line 
      ...
   }
}


public class RestaurantFavorites {
   public static void main(String[] args) {
      Restaurant favLunchPlace = new Restaurant();
   
      favLunchPlace.rating = 5; // A class definition has private fields for storing local data. A class user cannot access a class' private fields; only the class' member methods can.
      ...
   }
}

// RUNNER INFO EXERSISE

class RunnerInfo {
   private int timeRun; // Fields are private and thus appear after the private access modifier.
   private double distRun;

   public void setTime(int timeRunSecs) {     // Time run in seconds.  Methods are public and thus appear after the public access modifier.
      timeRun = timeRunSecs;                   // timeRun refers to the field
   }

   public void setDist(double distRunMiles) {  // Distance run in miles
      distRun = distRunMiles;
   }

   public double getSpeedMph() {               // Speed in miles/hour
      return distRun / (timeRun / 3600.0);     // miles / (secs / (secs / hour))
   }
}

public class RaceResults {
   public static void main(String[] args) {
      RunnerInfo runner1 = new RunnerInfo();  // User-created object of class type RunnerInfo The new operator is used to create a new object of type RunnerInfo.
      RunnerInfo runner2 = new RunnerInfo(); // A second object

      runner1.setTime(360);
      runner1.setDist(1.2);
      runner2.setTime(200);
      runner2.setDist(0.5);

      System.out.println("Runner1's speed in MPH: " + runner1.getSpeedMph()); // A class user can call an object's member method using the "." member access operator, followed by the member method's name.
      System.out.println("Runner2's speed in MPH: " + runner2.getSpeedMph()); // The class user created two objects: runner1 and runner2. This statement calls a member method on the runner2 object.
   }
}






// Person Exersise 

public class CallPerson {
   public static void main(String [] args) {
      String userName;
      Person person1 = new Person(); // initalizing a new object within the Person class.
   
      userName = "Joe";
      
      person1.setFirstName(userName); // Setting the first name variable in person1 to the userName variable in main which is set to "Joe".
      
      System.out.print("I am " + person1.getFirstName());
   }


   public class Person {
      private String firstName;
   
      public void setFirstName(String firstNameToSet) { // This is why person.setFirstName is a thing, the setFirstName after the '.' is the methods name.
         firstName = firstNameToSet; // making a variable for passing in the getFirstName method
      }
      public String getFirstName() {
         return firstName;
      }
   }
}



// Person Exersise Cont:

public class CallPerson {
   public static void main(String [] args) {
      String userName;
      String differentUserName;
      Person person1 = new Person();

      userName = "Bob";
      differentUserName = "Ron";
   
      person1.setFirstName(userName); // sets username to first name
      System.out.println("You are not " + person1.getFirstName());
      person1.setFirstName(differentUserName); // overrides initail first name and changes it to differentUserName.
      System.out.println("You are " + person1.getFirstName());
   }
}

public class Person {
   private String firstName;

   public void setFirstName(String firstNameToSet) {
      firstName = firstNameToSet;
   }
   
   public String getFirstName() {
      return firstName;
   }
}



// Mutators, accessors, and private helpers:

// Commonly, a field has two associated methods: a mutator for setting the value, and an accessor for getting the value, 
// known as a setter and getter method, respectively, and typically with names starting with set or get. 
// Other mutators and accessors may exist that aren't associated with just one field, such as the print() method below.



// A MUTATOR method may modify ("mutate") a class' fields.
// An ACCESSOR method accesses fields but may not modify a class' fields.


// Restaurant.java
public class Restaurant {                          
   private String name;
   private int rating;

   public void setName(String restaurantName) {  // Mutator
      name = restaurantName;
   }

   public void setRating(int userRating) {       // Mutator
      rating = userRating;
   }

   public String getName() {  // Accessor
      return name;
   }

   public int getRating() {  // Accessor
      return rating;
   }

   public void print() {      // Accessor
      System.out.println(name + " -- " + rating);
   }
}

// MyRestaurant.java
public class MyRestaurant {
   public static void main(String[] args) {
      Restaurant myPlace = new Restaurant();
      myPlace.setName("Maria's Diner");
      myPlace.setRating(5);
      System.out.print(myPlace.getName() + " is rated ");
      System.out.println(myPlace.getRating());
   }
 }



 // PRIVATE HELPER MEMBER METHODS

//  In addition to public member methods, a class may define private member methods.
//  Any member method (public or private) may call a private member method.
//  A user of the class can call public member methods, but a user can not call private member methods (which would yield a compiler error).
 
public class MyClass {
   private int numA;

   private int methodX() { // private method
      ...
   }

   public void method1() { // public method, its okay for the public method to access private methods
      numA = methodX();


   }
}

public class TestClass {
   public static void main(String[] args) {
      
      MyClass someObj = new MyClass();

      someObj.method1(); // this one will work 

      ...

      someObj.methodX(); // this one will throw a compile error because the user is trying to access a private method.
   }
}




// Initialization and Constructors

public class Restaurant {                          
   private String name = "NoName"; // initilly this is what the class will say if you try to print favLunchPlace
   private int rating = -1; // this will be the default initial rating aswell if none is entered prior to a print()

   public void setName(String restaurantName) {  
      name = restaurantName;
   }

   public void setRating(int userRating) {
      rating = userRating;
   }

   public void print() {  
      System.out.println(name + " -- " + rating);
   }
}

public class RestaurantFavorites {
   public static void main(String[] args) {
      Restaurant favLunchPlace = new Restaurant(); // Initializes fields with values in class definition

      favLunchPlace.print(); // this will print NoName -- -1

      favLunchPlace.setName("Central Deli");
      favLunchPlace.setRating(4);
      
      favLunchPlace.print(); // this will print Central Deli -- 4
   }
}


// Constructors 

// Constructors
// Java provides a special class member method, known as a constructor, that is called when an object of that class type is created, and which can be used to initialize all fields. 
// The constructor has the same name as the class. The constructor method has no return type, not even void. Ex: public Restaurant() {...} defines a constructor for the Restaurant class.
// A programmer specifies the constructor that should be called when creating an object. Ex: Restaurant favLunchPlace = new Restaurant(); creates a new Restaurant object and calls the constructor Restaurant().
// If a class does not have a programmer-defined constructor, then the Java compiler implicitly defines a default constructor with no arguments. 
// The Java compiler also initializes all fields to their default values.

// Restaurant.java

public class Restaurant {
   private String name;
   private int rating;

   public Restaurant() {  // Constructor with no arguments, see lack of return type 
      name = "NoName";    // Default name: NoName indicates name was not set
      rating = -1;        // Default rating: -1 indicates rating was not set
   }

   public void setName(String restaurantName) {
      name = restaurantName;
   }

   public void setRating(int userRating) {
      rating = userRating;
   }

   public void print() {
      System.out.println(name + " -- " + rating);
   }
}

// RestaurantFavorites.java

public class RestaurantFavorites {
   public static void main(String[] args) {
      Restaurant favLunchPlace = new Restaurant(); // Calls the constructor, doesnt print anything but does take the variables in the constructor to memory, now if you were to print, 
      // whatever was set in the constructor would be what you see

      favLunchPlace.print();

      favLunchPlace.setName("Central Deli");
      favLunchPlace.setRating(4);
      favLunchPlace.print();
   }
}




// Choosing classes to create

// PERSON CLASS

public class TeamPerson {
   private String fullName;
   private int ageYears;
   
   public void setFullName(String firstAndLastName) { // sets full name 
      fullName = firstAndLastName;
   }
   
   public void setAgeYears(int ageInYears) { // sets age 
      ageYears = ageInYears;
   }
   
   public String getFullName() { // get full name 
      return fullName;
   }
   
   public int getAgeYears() { // get age 
      return ageYears;
   }
   
   public void print() {
      System.out.println("Full name: " + fullName);
      System.out.println("Age (years): " + ageYears);
   }
}



// TEAM CLASS

public class SoccerTeam {
   private TeamPerson headCoach;
   private TeamPerson assistantCoach;
   // Players omitted for brevity
   
   public void setHeadCoach(TeamPerson teamPerson) {
      headCoach = teamPerson;
   }
   
   public void setAssistantCoach(TeamPerson teamPerson) {
      assistantCoach = teamPerson;
   }
   
   public TeamPerson getHeadCoach() {
      return headCoach;  
   }
   
   public TeamPerson getAssistantCoach() {
      return assistantCoach;
   }
   
   public void print() {
      System.out.println("HEAD COACH: ");
      headCoach.print();
      System.out.println();
      
      System.out.println("ASSISTANT COACH: ");
      assistantCoach.print(); // printing the asstCoach object, theres not a method for this per say, 
      System.out.println();
   }
}



// MAIN

public class SoccerTeamPrinter {
   public static void main(String[] args) {
      SoccerTeam teamCalifornia = new SoccerTeam(); // Creating a new soccerteam object
      TeamPerson headCoach = new TeamPerson(); // head coach object
      TeamPerson asstCoach = new TeamPerson(); // asst coach object
      
      headCoach.setFullName("Mark Miwerds"); // giving a name to head coach
      headCoach.setAgeYears(42); // headcoach age 
      teamCalifornia.setHeadCoach(headCoach); // telling the soccer team class that the head coach is Mark Miwerds

      asstCoach.setFullName("Stanley Lee");
      asstCoach.setAgeYears(30);
      teamCalifornia.setAssistantCoach(asstCoach);

      teamCalifornia.print(); // Printing the team coaches info out from the soccer team class, has the ability to do the players aswell, just wasnt done in this example
   }
}

// OUTPUT 

// HEAD COACH: 
// Full name: Mark Miwerds
// Age (years): 42

// ASSISTANT COACH: 
// Full name: Stanley Lee
// Age (years): 30









// Defining main() in a programmer-defined class

// The main() method can be defined within a programmer-defined class and create objects of that class type. 
// The BasicCar class defined in the example below represents a car that keeps track of the number of miles driven. 
// BasicCar has a field that maintains the miles driven and three methods that set, retrieve, and modify the object's field.
// main() is a static method that is independent of class objects. main() can access other static methods and static fields of the class, 
// but cannot directly access non-static methods or fields, like BasicCar's checkOdometer() method. So, a programmer must create objects within main() to call non-static methods on those objects. 
// Ex: BasicCar's main() creates two objects of type BasicCar and performs operations on those objects.
// Non-static fields and methods are also called instance variables and instance methods.

public class BasicCar {

   // Total miles driven by the car
   private int milesDriven;
    
   // Constructor assigns initial values to instance variables
   public BasicCar() {
      milesDriven = 0;   
   }

   // Drive the requested miles
   public void drive(int tripMiles) {
      milesDriven = milesDriven + tripMiles;
   }

   // Return total number of miles driven
   public int checkOdometer() {
      return milesDriven;
   }

   // Main() creates objects of type BasicCar and 
   // calls methods to operate on the objects
   public static void main(String [] args) {
      BasicCar redCorvette = new BasicCar();
      BasicCar fordMustang = new BasicCar();

      redCorvette.drive(100);        
      fordMustang.drive(75);
      fordMustang.drive(300);
      fordMustang.drive(50);        
   }
}




// UNIT TESTING (CLASSES)

// A typical program may not thoroughly use all class items.
// A testbench's job is to thoroughly test all public class items.
// After testing, class is ready for use. The tester program is kept for later tests.

// The testbench below creates an object, then checks public methods for correctness. Some tests failed.

// Features of a good testbench include:

// Automatic checks. Ex: Values are compared, as in testData.GetNum1() != 100. For conciseness, only fails are printed.
// Independent test cases. Ex: The test case for GetAverage() assigns new values, vs. relying on earlier values.
// 100% code coverage: Every line of code is executed. A good testbench would have more test cases than below.
// Includes not just typical values but also border cases: Unusual or extreme test case values like 0, negative numbers, or large numbers.

// Class to test: StatsInfo.java
public class StatsInfo {

   // Note: This class intentionally has errors

   private int num1;
   private int num2;

   public void setNum1(int numVal) {
      num1 = numVal;
   }

   public void setNum2(int numVal) {
      num2 = numVal;
   }

   public int getNum1() {
      return num1;
   }

   public int getNum2() {
      return num1;
   }

   public int getAverage() {
      return num1 + num2 / 2;
   }
}

// Testbench: StatsInfoTest.java
public class StatsInfoTest {
   public static void main(String[] args) {
      StatsInfo testData = new StatsInfo();

      // Typical testbench tests more thoroughly

      System.out.println("Beginning tests.");

      // Check set/get num1
      testData.setNum1(100);
      if (testData.getNum1() != 100) {
         System.out.println("   FAILED set/get num1");
      }

      // Check set/get num2
      testData.setNum2(50);
      if (testData.getNum2() != 50) {
         System.out.println("   FAILED set/get num2");
      }

      // Check getAverage()
      testData.setNum1(10);
      testData.setNum2(20);
      if (testData.getAverage() != 15) {
         System.out.println("   FAILED GetAverage for 10, 20");
      }

      testData.setNum1(-10);
      testData.setNum2(0);
      if (testData.getAverage() != -5) {
         System.out.println("   FAILED GetAverage for -10, 0");
      }

      System.out.println("Tests complete.");
   }
}
//OUTPUT
// Beginning tests.
//    FAILED set/get num2
//    FAILED GetAverage for 10, 20
//    FAILED GetAverage for -10, 0
// Tests complete.




// Regression testing
// Regression testing means to retest an item like a class anytime that item is changed; if previously-passed test cases fail, the item has "regressed".






// CONTSTRUCTOR OVERLOADING

// remember how if you name 2 methods the same thing but give them different parameters everything is fine? Same with Constructors.
// if you initiate an object with particular arguments that align with a constructor it will know which one to choose.

public class Restaurant {
   private String name;
   private int rating;

   // Default constructor
   public Restaurant() {
      name = "NoName";
      rating = -1;
   }

   // Another constructor
   public Restaurant(String initName, int initRating) {
      name = initName;
      rating = initRating;
   }

   // Prints name and rating on one line
   public void print() {                           
      System.out.println(name + " -- " + rating);
   }
}

public class RestaurantFavorites {
   public static void main(String[] args) {
      Restaurant foodPlace = new Restaurant();            // Calls default constructor
      Restaurant coffeePlace = new Restaurant("Joe's", 5); // Calls another constructor

      foodPlace.print();
      coffeePlace.print();
   }
}

// Output
// NoName -- -1
// Joe's -- 5


// If a programmer defines any constructor, the compiler does not implicitly define a default constructor, 
// so good practice is for the programmer to also explicitly define a default constructor so that an object creation like new MyClass() remains supported.

public class Restaurant {
   public Restaurant(String initName, int initRating) {
      ... 
   }

   // No other constructors
}

public class RestaurantFavorites {
   public static void main(String[] args) {
      Restaurant foodPlace = new Restaurant();              
      ...
   }
}





// OBJECTS AND REFRENCES






RunnerInfo lastRun; // A reference variable lastRun of type RunnerInfo is declared but not initialized. 
RunnerInfo currRun = new RunnerInfo(); // A reference variable currRun of type RunnerInfo is declared and initialized to a new RunnerInfo object.

currRun.setTime(300);// currRun's time is set to 300 and distance is set to 1.5. 
currRun.setDist(1.5); // The getSpeed() method on the RunnerInfo object referred to by currRun returns the run speed.
// currRun's time is set to 300 and distance is set to 1.5. The getSpeed() method on the RunnerInfo object referred to by currRun returns the run speed.
System.out.print("Run speed: ");
System.out.println(currRun.getSpeed());

// Assign reference to lastRun
lastRun = currRun; // Assigning lastRun with currRun causes lastRun and currRun to refer to the same object.

lastRun.setTime(250); // Calling the setTime() and setDist() methods on lastRun update the objects referred to by both lastRun and currRun.
lastRun.setDist(1.2);


//  The 'this' implicit parameter

public class Airplane {
   private int elevation;

   public Airplane() {
      this.elevation = 0;
   }

   public void setAltitude(int elevation) {
      this.elevation = elevation;
   }

   public void print() {
      System.out.println(this.elevation + " meters");
   }
}

public class CallAirplane {
   public static void main(String[] args) {
      Airplane boeing747 = new Airplane();

      boeing747.setAltitude(13000);
      boeing747.print();
   }
}




// Primitive and reference types

// Program using the Double class to calculate flight and driving times.
import java.util.Scanner;

public class FlyDrive {
   public static void main(String [] args) {
      Scanner scnr = new Scanner(System.in);
      Double distMiles; 
      Double hoursFly;
      Double hoursDrive;

      System.out.print("Enter a distance in miles: ");
      distMiles = scnr.nextDouble();

      hoursFly = distMiles / 500.0;
      hoursDrive = distMiles / 60.0;

      System.out.println(distMiles + " miles would take:");
      System.out.println(hoursFly + " hours to fly");
      System.out.println(hoursDrive + " hours to drive");
   }
}

// primitive is like the lowercsae ones. short, byte, int, float, double, long, char.
// references are the Capitalized ones. Integer, Double, Character.

// a primitive type is going to have a default value.
// a refrence will not have a default value until you give it one.

// reference data types like String have useful functions built into them.
// reference types are slower than primitive data types

Boolean a = true;
Character b = '@';
Integer c = 123;
Double d = 3.14;
String e = "Bro";

d.toString(); //

// ^ this is called autoboxing. its automatically assigning these things to wrapper classes
// unboxing is when you convert a wrapper class back to its original value.



// ESSENTIALLY ALL A REFERENSE TYPE IS IS A WAY TO HAVE BUILT IN FUNCTIONS WORK WITH YOUR VARIABLE
// PRIMITIVE TYPES CANT DO THIS BUT ARE SOOOOO MUCH FASTER BECAUSE OF IT, SO DONT MAKE SOMETHING A REFERENCE TYPE UNLESS ITS NESSESARY

Integer x = new Integer(10);
// this is the same thing as saying 
Integer x = 10; // this is known as autoboxing, because java auto assigns x to the built in Integer class
// now x is not an primitive int (int x = 10;) but instead an object of the built in Integer class (Integer x = 10;)

System.out.print(x.compareTo(15));
// outputs -1 because 10 is less than 15

System.out.print(x.compareTo(5));
// outputs 1 because 10 is greater than 5

x = x + 10; // This is called unboxing, because java is allowing this x to function as a primitive data type even though it was initialized as a referecnce type





// SUPER COOL SHIT 

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




// ARRAY LISTS 

import java.util.ArrayList;

// this is how you make an arrayList
// A common error among beginners is to declare an ArrayList of a primitive type like int, as in ArrayList<int> myVals, yielding a compilation error: 
// "unexpected type, found : int, required: reference."

ArrayList<Integer> vals = new ArrayList<Integer>()


ArrayList<Integer> valsList = new ArrayList<Integer>();

//Creating space for 3 Integers
valsList.add(31);
valsList.add(41);
valsList.add(59);

System.out.println(valsList.get(1)); // outputs 41

// Setting the value of existing elements
valsList.set(1, 119); // sets the index 1 of the array list to 119 as opposed to 41

System.out.println(valsList.get(1)); // outputs 119

// Java automatically creates an Integer object from the integer literal passed to the add() method. The add() method then adds the Integer object to the end of the ArrayList.
// The get() method returns the element at the specified list location.
// The set() method replaces the element at the specified list position with the new Integer object. Again, Java automatically converts the integer literal 119 to an Integer object with that value.
// Playing step 4: The set() method replaces the element at the specified list position with the new Integer object. 
// Again, Java automatically converts the integer literal 119 to an Integer object with that value. Step finished playing


add(element) // Create space for and add the element at the end of the list.	

get(index) // Returns the element at the specified list location known as the index. Indices start at 0.

set(index, element) // Replaces the element at the specified position in this list with the specified element.

size() // Returns the number of list elements.

// List originally empty
valsList.add(31); // List now: 31 
valsList.add(41); // List now: 31 41


// List originally: 31 41 59. Assume x is an int. 
x = valsList.get(0);  // Assigns 31 to x
x = valsList.get(1);  // Assigns 41
x = valsList.get(2);  // Assigns 59
x = valsList.get(3);  // Error: No such element


// List originally: 31 41 59 
valsList.set(1, 119);  // List now 31 119 59


// List originally: 31 41 59. Assume x is an int. 
x = valsList.size();  // Assigns x with 3







// Note that the index is nthOS - 1 rather than just nthOS because an ArrayList's indices start at 0, so the 1st operating system is at index 0, the 2nd at index 1, etc.


import java.util.ArrayList;
import java.util.Scanner;

public class MostPopularOS {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      ArrayList<String> operatingSystems = new ArrayList<String>(); 
      int nthOS;      // User input, Nth most popular OS
      
      // Source: StatCounter.com, 2018
      operatingSystems.add("Windows 10");
      operatingSystems.add("Windows 7");
      operatingSystems.add("Mac OS X");
      operatingSystems.add("Windows 8");
      operatingSystems.add("Windows XP");
      operatingSystems.add("Linux");
      operatingSystems.add("Chrome OS");
      operatingSystems.add("Other");

      System.out.println("Enter N (1-8): ");
      nthOS = scnr.nextInt();

      if ((nthOS >= 1) && (nthOS <= 8)) {
         System.out.print("The " + getNumberSuffix(nthOS) + " most popular OS is ");
         System.out.println(operatingSystems.get(nthOS - 1));
      }
   }

   private static String getNumberSuffix(int number) {
      String[] firstThree = { "st", "nd", "rd" };
      if (number >= 1 && number <= 3) {
         return number + firstThree[number - 1];
      }
      return number + "th";
   }
}


// output 
// Enter N (1-8): 
// 1
// The 1st most popular OS is Windows 10
// ...
// Enter N (1-8): 
// 3
// The 3rd most popular OS is Mac OS X
// ...
// Enter N (1-8): 
// 6
// The 6th most popular OS is Linux