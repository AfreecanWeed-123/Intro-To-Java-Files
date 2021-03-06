public class Lesson10 {
    public static void main (String[] args) {
        /*
         * Write a program based upon the following requirements:
         *      - Declare and instantiate a String of your choice
         *      - Print out the following information on that string:
         *      - Length
         *      - First 3 characters
         *      - Convert all of the String’s letters to uppercase, and store in a new String object reference variable
         * 
         * Choose two additional methods from the String class and use those on your String. Display the results.
         */
        
        String phrase = "Look, Lilly allows lending calculators!"; // Declarartion and instantiation
        System.out.println("Length: " + phrase.length()); //Length
        System.out.println("First three characters: " + phrase.substring(0,3)); // First 3 characters.

        String uppercasePhrase = phrase.toUpperCase(); // Appercase
        System.out.println("Uppercase: " + uppercasePhrase);
        System.out.println("Lowercase: " + uppercasePhrase.toLowerCase().replace('l', 'w')); // Lowercase and replace
        // Bonus! Use 4 string methods in different, useful ways!
        // valueOf, toLowercase, substring, and toUppercase
        String fruit = "orangesba" + String.valueOf(1.0%0) + "as"; // baNaNas haha that's a fruit
        System.out.println(fruit);
        System.out.println("I like " + fruit.toLowerCase().substring(7) + " and " + fruit.substring(0,7).toUpperCase());
    }
}