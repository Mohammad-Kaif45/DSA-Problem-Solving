package TCS_NQT_Questions;
// Write a function to find the longest common prefix string amongst an array of strings.
//If there is no common prefix, return an empty string "".
public class LongestCommonPrefix {
    public static String longest(String[] strs){
        if(strs.length == 0) return "";
        String first = strs[0];
        int n = first.length();

        for(int i = 0; i < n; i++){
            char ch = first.charAt(i);
            for(int j = 1; j < strs.length; j++){
                if(i >= strs[j].length() || strs[j].charAt(i) != ch){
                    return first.substring(0,i);
                }
            }
        }
        return first;
    }
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        String result = longest(strs);
        System.out.println("Longest Common Prefix is : " + result);
    }
}
