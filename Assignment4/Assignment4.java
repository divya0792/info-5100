import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Assignment4 {

    /*
     * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
     * s = "leetcode" return 0.
     * s = "loveleetcode" return 2.
     */
    public int firstUniqChar(String s) {
        if(s == null) {
            throw new IllegalArgumentException("string cannot be null");
        }
        s = s.toLowerCase();
        Map<Character, Integer> map = new HashMap<>();
        char[] charArray = s.toCharArray();

        for(char character : charArray) {
            if(map.containsKey(character)) {
                map.put(character, map.get(character) + 1);
            } else {
                map.put(character, 1);
            }
        }

        for(int i = 0; i < charArray.length; i++) {
            if(map.get(charArray[i]) == 1) {
                return i;
            }
        }
        return -1;
    }

    /*
     *Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
     * Input: 38 Output: 2
     * Explanation: The process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
     */

    public int addDigits(final int num) {
        if(num < 0) {
            throw new IllegalArgumentException("number cannot be negative");
        }
        int rem = num;
        while(rem > 9) {
            int sum = 0;
            while (rem != 0) {
                sum += rem % 10;
                rem = rem / 10;
            }
            rem = sum;
        }
        return rem;
    }

    /*
     *  Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
     *  Input: [0,1,0,3,12] Output: [1,3,12,0,0]
     */
    public void moveZeroes(int[] nums) {
        if(nums == null) {
            throw new IllegalArgumentException("input array cannot be null");
        }
        int counter = 0;
        for(int number : nums) {
            if(number != 0) {
                nums[counter] = number;
                counter++;
            }
        }
        for(int i = counter; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    /*
     * Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
     * Input: "babad" Output: "bab" Note: "aba" is also a valid answer.
     */
    public String longestPalindrome(String s) {
        if(s == null) {
            throw new IllegalArgumentException("string cannot be null");
        }
        int i;
        int counter = s.length();
        while(counter >= 1) {
            i= 0;
            while(i + counter <= s.length()) {
                if(isPalindrome(s.substring(i, i + counter))) {
                    return s.substring(i, i + counter);
                }
                i++;
            }
            counter--;
        }
        return s;
    }

    public String longestPalindromeUsingMap(String s) {
        if(s == null) {
            throw new IllegalArgumentException("string cannot be null");
        }
        if(s.equals("") || s.length() < 2) {
            return s;
        }
        String longestPalindrome = "";
        Set<String> set = new HashSet<>();
        longestPalindrome = s.charAt(0) + "";

        for(int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length() - i; j++) {
                if(i < 2) {
                    set.add(s.charAt(j) + "");
                    if(j + 1 < s.length()) {
                        if (s.charAt(j) == s.charAt(j + 1)) {
                            String str = s.charAt(j) + ""  + s.charAt(j + 1) + "";
                            set.add(str);
                            if (str.length() > longestPalindrome.length()) {
                                longestPalindrome = str;
                            }
                        }
                    }
                } else if (s.charAt(j) == s.charAt(j + i) && set.contains(s.substring(j + 1, j + i))) {
                    String str = s.substring(j, j + i + 1);
                    set.add(str);
                    if(i + 1 > longestPalindrome.length()) {
                        longestPalindrome = str;
                    }
                }
            }
        }
        return longestPalindrome;
    }

    private boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;

        while(i < j) {
            if(str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    /*
     * You are given an n x n 2D matrix representing an image. Rotate the image by 90 degrees (clockwise).
     * Given input matrix = [ [1,2,3],
  			      [4,5,6]
  			      [7,8,9] ],
     * rotate the input matrix in-place such that it becomes: [  [7,4,1],
  								 [8,5,2],
  								  [9,6,3] ],
     */
    public int[][] rotate(int[][] matrix) {
        if(matrix == null) {
            throw new IllegalArgumentException("matrix is null");
        }
        if(matrix.length == 1) {
            return matrix;
        }
        int i = 0;
        int j = 0;
        int matrixLimit = matrix.length - 1;
        for (int m = 0; m < matrixLimit; m++) {
            for (int k = m; k < matrixLimit - m; k++) {
                if(matrixLimit % 2 == 0 && m == matrixLimit - 1) {
                    break;
                }
                j = k;
                i = m;
                int oldVal = matrix[i][j];

                j = j + matrixLimit - k - m;
                i = i + k - m;
                oldVal = swap(matrix, i, j, oldVal);

                j = j - k + m;
                i = i + matrixLimit - k - m;
                oldVal = swap(matrix, i, j, oldVal);

                j = j - (matrixLimit - k - m);
                i = i - k + m;
                oldVal = swap(matrix, i, j, oldVal);

                j = j + k - m;
                i = i - (matrixLimit - k - m);
                oldVal = swap(matrix, i, j, oldVal);
            }


        }
        return matrix;
    }

        private int swap(int[][] arr, int i, int j, int value) {
            int temp = arr[i][j];
            arr[i][j] = value;
            return temp;
    }
}


