class Trie{
    class Node{
        Node[]children=new Node[26];
        boolean eow;
        Node(){
            for(int i=0;i<26;i++)children[i]=null;
            eow=false;
        }
    }
    Node root;
    public Trie(){
        root=new Node();
    }
    public void insert(String word){
        Node curr=root;
        for(int level=0;level<word.length();level++){
            int i=word.charAt(level)-'a';
            if(curr.children[i]==null){
                curr.children[i]=new Node();
            }
            curr=curr.children[i];
        }
        curr.eow=true;
    }
    public boolean search(String word){
        Node curr=root;
        for(int level=0;level<word.length();level++){
            int i=word.charAt(level)-'a';
            if(curr.children[i]==null)return false;
            curr=curr.children[i];
        }
        return curr.eow;
    }
    public boolean startsWith(String prefix){
        Node curr=root;
        for(int level=0;level<prefix.length();level++){
            int i=prefix.charAt(level)-'a';
            if(curr.children[i]==null)return false;
            curr=curr.children[i];
        }
        return true;
    }
}
