The code generates all permutations of the characters in a given string using recursion.

📦 Class & Method Overview
🔹 Class: Permutation
A public class to hold the logic for generating string permutations.

🔹 Method: findPermutaion(String str, String ans)
str: Remaining characters to be permuted.

ans: Accumulated answer (characters selected so far).

⚙️ How It Works (Step-by-step) -

if (str.length() == 0) {
    System.out.println(ans);
    return;
}
Base Case: If no characters are left in str, print the current permutation stored in ans.

for (int i = 0; i < str.length(); i++) {
    char curr = str.charAt(i);
    String NewString = str.substring(0, i) + str.substring(i + 1);
    findPermutaion(NewString, ans + curr);
}
Loop through each character in str.

Pick the i-th character curr.

Create a new string by removing curr from str.

Recursively call findPermutaion with the remaining string and append curr to ans.

🧠 Example: Input "abc"
Initial call:
findPermutaion("abc", "")
Recursive calls:

→ a + findPermutaion("bc", "a")
   → b + findPermutaion("c", "ab")
      → c + findPermutaion("", "abc") → print "abc"
   → c + findPermutaion("b", "ac")
      → b + findPermutaion("", "acb") → print "acb"

→ b + findPermutaion("ac", "b")
   → a + findPermutaion("c", "ba")
      → c + findPermutaion("", "bac") → print "bac"
   → c + findPermutaion("a", "bc")
      → a + findPermutaion("", "bca") → print "bca"

→ c + findPermutaion("ab", "c")
   → a + findPermutaion("b", "ca")
      → b + findPermutaion("", "cab") → print "cab"
   → b + findPermutaion("a", "cb")
      → a + findPermutaion("", "cba") → print "cba"
✅ Final Output:

abc
acb
bac
bca
cab
cba
📌 Key Concepts Used:
Recursion

Backtracking (via recursive stack)

String slicing (substring)

Permutation logic by character exclusion

📎 Note:
Time complexity: O(n!) where n is the length of the string.

For longer strings, the number of permutations grows very fast.
