package by.teachmeskills.homework10.strings.obligatorytask;

public class Methods {

    public static void print2BlocksOf4Elements(String string) {
        System.out.println("First 2 blocks of 4 letters in one line");
        String[] blocks = string.split("-");
        int counter = 1;
        for (String element : blocks) {
            if (element.matches("\\d{4}")) {
                System.out.print(element);
                counter++;
                if (counter > 2) {
                    break;
                }
            }
        }
        System.out.println();
    }

    public static void changeLettersToStars(String string) {
        System.out.println("Number with blocks of 3 letters changed to ***");
        System.out.println(string.replaceAll("[a-zA-z]{3}", "***"));
    }

    public static void printLetterInLowerCase(String string) {
        System.out.println("Print letters in format yyy/yyy/y/y in lower case");
        String[] blocks = string.split("-");
        String result = "";

        for (String element : blocks) {
            if (element.matches("[a-zA-z]{3}")) {
                result += element.toLowerCase() + "/";
            } else {
                char[] symbols = element.toCharArray();
                for (char symbol : symbols) {
                    if (Character.isAlphabetic(symbol)) {
                        result +=(Character.toLowerCase(symbol) + "/");
                    }
                }
            }
        }
        result = result.substring(0, result.length() -1);
        System.out.println(result);
    }

    public static void printLettersInUpperCase(String string) {
        System.out.println("Print letters in format \"Letters:yyy/yyy/y/y\" in upper case");
        String[] blocks = string.split("-");
        StringBuilder stringOfLetters = new StringBuilder("Letters:");
        for (String element : blocks) {
            if (element.matches("[a-zA-z]{3}")) {
                stringOfLetters.append(element.toUpperCase()).append("/");
            } else {
                char[] symbols = element.toCharArray();
                for (char symbol : symbols) {
                    if (Character.isAlphabetic(symbol)) {
                        stringOfLetters.append(Character.toUpperCase(symbol)).append("/");
                    }
                }
            }
        }
        System.out.println(stringOfLetters.deleteCharAt(stringOfLetters.length() -1));
    }

    public static boolean containsAbc(String string) {
        System.out.println("Number contains \"abc\" ignore case");
        return string.toLowerCase().contains("abc");
    }

    public static boolean startsWith555(String string) {
        System.out.println("Number starts with 555");
        return string.startsWith("555");
    }

    public static boolean endsWith1a2b(String string) {
        System.out.println("Number ends with 1a2b");
        return string.endsWith("1a2b");
    }
}
