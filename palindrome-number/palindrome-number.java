class Solution {
    public boolean isPalindrome(int x) {
       String input=String.valueOf(x);
        StringBuilder input1 = new StringBuilder();
        input1.append(input);
        input1.reverse();
        String singleString = input1.toString();
        if(input.equals(singleString)){
          return true; 
        }else{
            return false; 
        }
        
    }
    
}
