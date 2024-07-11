import java.util.HashMap;
import java.util.Map;

class Solution {
    public int romanToInt(String s) {
        // Create a mapping of Roman numerals to their integer values
        Map<Character, Integer> romanToInt = new HashMap<>();
        romanToInt.put('I', 1);
        romanToInt.put('V', 5);
        romanToInt.put('X', 10);
        romanToInt.put('L', 50);
        romanToInt.put('C', 100);
        romanToInt.put('D', 500);
        romanToInt.put('M', 1000);

        int total = 0;
        int prevValue = 0;

        // Iterate through the Roman numeral string from left to right
        for (int i = 0; i < s.length(); i++) {
            int currentValue = romanToInt.get(s.charAt(i));

            // If the current value is greater than the previous value, subtract twice the previous value
            // (because we already added it in the previous step)
            if (currentValue > prevValue) {
                total += currentValue - 2 * prevValue;
            } else {
                total += currentValue;
            }

            // Update the previous value
            prevValue = currentValue;
        }

        return total;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "III";
        System.out.println(solution.romanToInt(s));  // Output: 3
    }
}