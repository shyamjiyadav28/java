class Solution {

    private int[] getLPS(String needle, int n) {
        int[] lps = new int[n];
        int len = 0;
        int i = 1;

        while (i < n) {
            if (needle.charAt(i) == needle.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }

        return lps;
    }

    public int strStr(String haystack, String needle) {

        if (needle.length() == 0) {
            return 0;
        }

        int m = haystack.length();
        int n = needle.length();

        int[] lps = getLPS(needle, n);

        int i = 0;
        int j = 0;

        while (i < m) {

            if (haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;

                if (j == n) {
                    return i - n;
                }
            } else {

                if (j > 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }

        return -1;
    }
}

