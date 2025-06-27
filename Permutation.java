public class Permutation {
    public static void findPermutaion(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            String NewString = str.substring(0, i) + str.substring(i + 1);
            findPermutaion(NewString, ans + curr);
        }

    }

    public static void main(String args[]) {
        String str = "abc";
        String ans = "";
        findPermutaion(str, ans);

    }
}