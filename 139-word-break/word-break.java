class Solution {
    static class Node {
        Node[] children = new Node[26];
        boolean eow;
    }
    Node root;

    public Solution() {
        root = new Node();
    }
    public void insert(String word) {
        Node curr=root;
        for (char ch : word.toCharArray()) {
            int idx=ch - 'a';
            if (curr.children[idx]==null) {
                curr.children[idx]=new Node();
            }
            curr=curr.children[idx];
        }
        curr.eow=true;
    }

    private boolean dfs(String s, int start, Boolean[] dp) {
        if (start==s.length()) return true;
        if (dp[start]!=null) return dp[start];

        Node curr=root;

        for (int i=start;i<s.length();i++) {
            int idx=s.charAt(i) - 'a';

            if (curr.children[idx]==null) break;

            curr = curr.children[idx];

            if (curr.eow && dfs(s, i + 1, dp)) {
                return dp[start] = true;
            }
        }

        return dp[start] = false;
    }

    public boolean wordBreak(String s, List<String> wordDict) {
        for (String word : wordDict) {
            insert(word);
        }

        Boolean[] dp = new Boolean[s.length()];
        return dfs(s, 0, dp);
    }
}
