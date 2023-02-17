class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        String vow = "aeiouAEIOU";

        int left = 0;
        int right = s.length() - 1;

        while(left < right) {
            while(left < right && vow.indexOf(arr[left]) == -1) {
                left++;
            }

            while(left < right && vow.indexOf(arr[right]) == -1) {
                right--;
            }

            char c = arr[left];
            arr[left] = arr[right];
            arr[right] = c;
            left++;
            right--;
        }

        return new String(arr);
    }
    }
