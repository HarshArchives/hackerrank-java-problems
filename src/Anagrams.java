package src;

// {@author -> geekyharsh05}

import java.util.Scanner;

public class Anagrams {

    static boolean isAnagram(String a, String b) {
        // If the length of the strings is not the same, they cannot be anagrams
        if (a.length() != b.length()) {
            return false;
        }

        // Convert both strings to lowercase and count the frequency of each character
        int[] freqA = new int[26];
        int[] freqB = new int[26];
        a = a.toLowerCase();
        b = b.toLowerCase();
        for (int i = 0; i < a.length(); i++) {
            freqA[a.charAt(i) - 'a']++;
            freqB[b.charAt(i) - 'a']++;
        }

        // Compare the frequency of each character in both strings
        for (int i = 0; i < 26; i++) {
            if (freqA[i] != freqB[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean result = isAnagram(a, b);
        System.out.println((result) ? "Anagrams" : "Not Anagrams");
    }
}
