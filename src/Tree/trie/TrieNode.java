package Tree.trie;

import javax.swing.tree.TreeNode;
import java.util.HashMap;

public class TrieNode {

    public TrieNode[] children;
    public char c;
    public boolean isWord;
    HashMap<Character, TreeNode> map;   //  不一定要存26个字母
    String word;    //  当前存入的是什么单词


    public TrieNode() {
        children = new TrieNode[26];
        isWord = false;

    }
}
