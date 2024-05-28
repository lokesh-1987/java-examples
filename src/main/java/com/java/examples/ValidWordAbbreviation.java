package com.java.examples;

/*
        A string can be abbreviated by replacing any number of non-adjacent, non-empty substrings with their lengths. The lengths should not have leading zeros.

        For example, a string such as "substitution" could be abbreviated as (but not limited to):

        "s10n" ("s ubstitutio n")
        "sub4u4" ("sub stit u tion")
        "12" ("substitution")
        "su3i1u2on" ("su bst i t u ti on")
        "substitution" (no substrings replaced)
        The following are not valid abbreviations:

        "s55n" ("s ubsti tutio n", the replaced substrings are adjacent)
        "s010n" (has leading zeros)
        "s0ubstitution" (replaces an empty substring)
        Given a string word and an abbreviation abbr, return whether the string matches the given abbreviation.

        A substring is a contiguous non-empty sequence of characters within a string.
 */
public class ValidWordAbbreviation {

    public static void main(String[] args) {
        System.out.println(validWordAbbreviation("substitution", "sub4u4"));
    }

    public static boolean validWordAbbreviation(String word, String abbr) {

        if (abbr.length() > word.length()) {
            return false;
        }

        int m = word.length(), n = abbr.length();
        int i = 0, j = 0;

        while (i < m && j < n) {
            if (word.charAt(i) == abbr.charAt(j)) {
                ++i;
                ++j;
                continue;
            }

            if (abbr.charAt(j) <= '0' && abbr.charAt(j) > '9') {
                return false;
            }

            int start = j;

            while (j < abbr.length() && abbr.charAt(j) > '0' && abbr.charAt(j) <= '9') {
                ++j;
            }
            int num = Integer.parseInt(abbr.substring(start, j));
            i += num;
        }
        return i == word.length() && j == abbr.length();
    }
}
