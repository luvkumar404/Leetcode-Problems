class Solution {
    public List<String> letterCombinations(String digits) {
         List<String> res = new ArrayList<>();

        if (digits==null || digits.length()==0) {
            return res;
        }

        Map<Character, String> m = new HashMap<>();
        m.put('2', "abc");
        m.put('3', "def");
        m.put('4', "ghi");
        m.put('5', "jkl");
        m.put('6', "mno");
        m.put('7', "pqrs");
        m.put('8', "tuv");
        m.put('9', "wxyz");

        backtrack(0,digits,res,m,new StringBuilder());

        return res;
    }

    static void backtrack(int idx, String digits, List<String> res, Map<Character, String> m, StringBuilder str) {
        if (idx==digits.length()) {
            res.add(str.toString());
            return;
        }

        String letters=m.get(digits.charAt(idx));
        for (char ch : letters.toCharArray()) {
            str.append(ch);
            backtrack(idx+1,digits,res,m,str);
            str.deleteCharAt(str.length()-1);
        }
    }
}