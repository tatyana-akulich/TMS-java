package by.teachmeskills.homework10.strings.optionaltask;

public class Methods {

    private static String[] splitString(String string) {
        return string.split(" ");
    }

    /*2. Дана строка произвольной длины с произвольными словами.
    Найти самое короткое слово в строке и вывести его на экран.
    Найти самое длинное слово в строке и вывести его на экран.
    Если таких слов несколько, то вывести последнее из них.*/

    public static void findShortestAndLongestWords(String string) {
        String[] words = splitString(string);
        String shortestWord = words[0];
        String longestWord = words[0];
        int length;
        for (String word : words
        ) {
            length = word.length();
            if (length <= shortestWord.length()) {
                shortestWord = word;
            }
            if (length >= longestWord.length()) {
                longestWord = word;
            }
        }
        System.out.printf("Last shortest word is %s. Last longest word is %s. \n\n", shortestWord, longestWord);
    }

    /*3. Дана строка произвольной длины с произвольными словами.
    Найти слово, в котором число различных символов минимально. Слово
    может содержать буквы и цифры.
    Если таких слов несколько, найти первое из них.
    Например, в строке "fffff ab f 1234 jkjk" найденное слово должно быть "fffff".*/

    public static void findWordWithMinOfDiffSymbols(String string) {
        String[] words = splitString(string);
        int minAmountOfUniqueSymbols = string.length();
        String result = string;
        for (String word : words
        ) {
            char[] symbols = word.toCharArray();
            int length = symbols.length;
            int counterOfUniqueElements = 0;
            for (int i = 0; i < length; i++) {
                for (int j = 0; j < length; j++) {
                    if (i != j && symbols[i] == symbols[j]) {
                        break;
                    }
                    counterOfUniqueElements++;
                }
            }
            if (counterOfUniqueElements < minAmountOfUniqueSymbols) {
                minAmountOfUniqueSymbols = counterOfUniqueElements;
                result = word;
            }
        }
        System.out.println("First word with minimum amount of repeating symbols is " + result + "\n");
    }

    /*4. Дана строка произвольной длины с произвольными словами.
    Написать программу для проверки является ли любое выбранное слово в
    строке палиндромом.
    Например, есть строка, вводится число 3, значит необходимо проверить
    является ли 3-е слово в этой строке палиндромом.
    Предусмотреть предупреждающие сообщения на случаи ошибочных
    ситуаций: например, в строке 5 слов, а на вход программе передали число
        500 и т. п. ситуации.*/

    public static void isWordPalindrome(String string, int index) {
        String[] words = splitString(string);
        if (words.length <= index || index < 0) {
            System.out.println("Invalid index");
        } else {
            /*String chosenWord = words[index];
            int length = chosenWord.length();
            StringBuilder firstHalfOfWord;
            StringBuilder secondHalfOfWord;
            firstHalfOfWord = new StringBuilder(chosenWord.substring(0, length / 2));
            secondHalfOfWord = (length % 2 == 0) ? new StringBuilder(chosenWord.substring(length / 2)) :
                    new StringBuilder(chosenWord.substring(length / 2 + 1));
            boolean result = (firstHalfOfWord.reverse().toString().equals(secondHalfOfWord.toString()));
            System.out.println("Is palindrome " + chosenWord + "? - " + result + "\n");*/
            String chosenWord = words[index];
            boolean result = chosenWord.equals(new StringBuilder(chosenWord).reverse().toString());
            System.out.println("Is palindrome " + chosenWord + "? - " + result + "\n");
        }
    }

    /*5. Дана произвольная строка.
    Вывести на консоль новую строку, которой задублирована каждая буква из
    начальной строки. Например, "Hello" -> "HHeelllloo".*/

    public static void doubleLetters(String string) {
        System.out.printf("String: %s, \nString with doubled letters: ", string);
        int length = string.length();
        for (int i = 0; i < length; i++) {
            System.out.printf("%s%s", string.charAt(i), string.charAt(i));
        }
        System.out.println();
    }
}
