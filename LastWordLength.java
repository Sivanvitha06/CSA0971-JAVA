public class LastWordLength {
    public static void main(String[] args) {
        String s = "Hello World";
        int length = lengthOfLastWord(s);
        System.out.println("Length of the last word: " + length);
    }

    public static int lengthOfLastWord(String s) {
        // Trim the string to remove any trailing spaces
        s = s.trim();
        
        // Find the last space in the string
        int lastSpaceIndex = s.lastIndexOf(' ');
        
        // The length of the last word is the difference between the length of the string
        // and the index of the last space
        return s.length() - lastSpaceIndex - 1;
    }
}
