package leetcode;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/**
 * @author szx
 * @version 1.0
 * @description: TODO
 * @date 2022/7/7 22:30
 **/

public class replaceWords {

    class Trie {
        Trie child[];
        boolean isEnd;
        public Trie() {
            isEnd = false;
            child = new Trie[26];
        }
    }

    void TrieInsert(Trie trie, String s) {
        Trie t = trie;
        for(int i = 0; i < s.length(); i++) {
            int x = s.charAt(i) - 'a';
            if(t.child[x]==null) {
                t.child[x] = new Trie();
            }
            t = t.child[x];
        }
        t.isEnd = true;
    }

    String searchS(Trie trie, String s) {
        Trie t = trie;
        for(int i = 0; i < s.length(); i++) {
            int x = s.charAt(i)-'a';
            if(t.child[x] == null) {
                break;
            }
            if(t.child[x].isEnd) {
                return s.substring(0, i+1);
            }
            t = t.child[x];
        }
        return s;
    }


    public String replaceWords(List<String> dictionary, String sentence) {
        String s[]=sentence.split(" ");
        Trie trie=new Trie();
        for(int i=0;i<dictionary.size();i++){TrieInsert(trie,dictionary.get(i));}
        StringBuilder ans=new StringBuilder(searchS(trie,s[0]));
        for(int i=1;i<s.length;i++){ans.append(" ").append(searchS(trie,s[i]));}
        return ans.toString();
    }


    /* Hash  效率相对较低
    public String replaceWords(List<String> dictionary, String sentence) {
        List<String> ans = new LinkedList<>();
        HashSet<String> recordedWords = new HashSet<>();
        for(String s : dictionary) {
            recordedWords.add(s);
        }
        String[] words = sentence.split(" ");
        for(String word : words) {
            int flag = 0;
            for(int i = 1; i <= word.length(); i++) {
                String curStr = word.substring(0, i);
                if(recordedWords.contains(curStr)) {
                    ans.add(curStr);
                    flag = 1;
                    break;
                }
            }
            if(flag == 0) {
                ans.add(word);
            }
        }
        return String.join(" ", ans);
    }
    */
}
