package BitMap;

import java.util.BitSet;

/**
 * 例题：
 * implement an algorithm to determine if the string has all unique characters, do not use additional structures.
 *
 */
public class BitMap {
    /**
     * 使用各个字符的占位情况来判断是否是unique digit
     */

    public static boolean isUniqueCharacters(String str) {
        if (str.length() > 256)
            return false;

        int checker = 0;

        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if ((checker & (1 << val)) > 0)
                return false;
            checker |= (1 << val);
        }
        return true;
    }

    public static void bitSet() {
        BitSet bitSet = new BitSet();
        System.out.println(bitSet.get(0));
        System.out.println(bitSet.size());
        bitSet.set(0);
        System.out.println(bitSet.get(0));
        System.out.println(bitSet.size());
        bitSet.set(65);
        System.out.println(bitSet.get(0));
        System.out.println(bitSet);
        bitSet.set(129);
        System.out.println(bitSet.get(65));
        System.out.println(bitSet);
    }

    public static void main(String[] s) {
        bitSet();
    }
}
