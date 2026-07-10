class Solution {
    public int strStr(String haystack, String needle) {
        int index = -1;
        for(int i = 0; i < haystack.length(); i++){
            if(haystack.charAt(i) == needle.charAt(0)){
                int j1 = i;
                int j2 = 0;
                for(;j1 < haystack.length() && j2 < needle.length(); j2++){
                    if(haystack.charAt(j1) != needle.charAt(j2))
                        break;
                    j1++;
                }
                if(j2 == needle.length())
                    return i;
                if(j1 == haystack.length())
                    return -1;
            }
        }
        return -1;
        
    }
}