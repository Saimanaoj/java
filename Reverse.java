class Reverse
 {
    public static void main(String[] args) 
{
        String word = "TEMPLE";
        String reversedWord = "";
        for (int i = word.length() - 1; i >= 0; i--)
            reversedWord += word.charAt(i);
        System.out.println("Reversed word: " + reversedWord);
    }
}
