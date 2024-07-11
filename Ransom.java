class Ransom {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] magazineLetters = new int[26];

        // Count the occurrences of each letter in the magazine
        for (char c : magazine.toCharArray()) {
            magazineLetters[c - 'a']++;
        }

        // Check if ransomNote can be constructed from the magazine
        for (char c : ransomNote.toCharArray()) {
            if (magazineLetters[c - 'a'] == 0) {
                return false;
            }
            magazineLetters[c - 'a']--;
        }

        return true;
    }

    public static void main(String[] args) {
        Ransom solution = new Ransom();

        // Example 1
        String RansomNote1 = "a";
        String magazine1 = "b";
        System.out.println(solution.canConstruct(RansomNote1, magazine1)); // Output: false

        // Example 2
        String RansomNote2 = "aa";
        String magazine2 = "ab";
        System.out.println(solution.canConstruct(RansomNote2, magazine2)); // Output: false

        // Example 3
        String RansomNote3 = "aa";
        String magazine3 = "aab";
        System.out.println(solution.canConstruct(RansomNote3, magazine3)); // Output: true
    }
}