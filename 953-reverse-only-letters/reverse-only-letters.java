class Solution {
    public String reverseOnlyLetters(String s) {
        Stack<Character> st = new Stack<>();
        char[] arr = s.toCharArray();


        for (char c : arr) {
            if (Character.isLetter(c)) {
                st.push(c);
            }
        }

 
        for (int i = 0; i < arr.length; i++) {
            if (Character.isLetter(arr[i])) {
                arr[i] = st.pop();
            }
        }

        return new String(arr);
    }
}
