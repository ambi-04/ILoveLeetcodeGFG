class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        int cnt = 0;
        int n = s.length();
        HashSet<String> set1 = new HashSet<>();
        HashSet<String> set2 = new HashSet<>();
        for(int k = 0; k < words.length; k++){
            String s2 = words[k];
            int m = s2.length();
            if(m > n || set2.contains(s2))
                continue;
            if(set1.contains(s2))
            {
                cnt++;
                continue;
            }
            int p1 = 0;
            int p2  = 0;
            while(p1 < n && p2 < m){
                if(s.charAt(p1) == s2.charAt(p2))
                    p2++;
                p1++;
            }
            if(p2 == m){
                set1.add(s2);
                cnt++; 
            }
            else{
                set2.add(s2);
            }
                     
        }
        return cnt;
    }
}