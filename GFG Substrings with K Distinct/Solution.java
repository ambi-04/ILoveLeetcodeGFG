class Solution 
{
    public int countSubstr(String s, int k) 
    {
        //  code here
        int i = 0;
        int j = 0;
        int cnt1 = 0;
        HashMap<Character,Integer> map1 = new HashMap<>();
        //Finding substrings with at most k distinct
        while(j < s.length())
        {
            char ch2 = s.charAt(j);
            int freq = 0;
            if(map1.containsKey(ch2))
                freq = map1.get(ch2);
            map1.put(ch2, freq + 1);
            if(map1.size() > k)
            {
                while(map1.size() != k)
                {
                    char ch1 = s.charAt(i);
                    int freqi = map1.get(ch1);
                    if(freqi == 1)
                        map1.remove(ch1);
                    else
                        map1.put(ch1,freqi - 1);
                    i++;
                }
            }
            
            cnt1 = cnt1 + (j - i + 1);
            j++;
            //System.out.println(map + " " + cnt);
        }
        //Finding substrings with atmost k - 1 distinct
        i = 0;
        j = 0;
        int cnt2 = 0;
        HashMap<Character,Integer> map2 = new HashMap<>();
        
        while(j < s.length())
        {
            char ch2 = s.charAt(j);
            int freq = 0;
            if(map2.containsKey(ch2))
                freq = map2.get(ch2);
            map2.put(ch2, freq + 1);
            if(map2.size() > k - 1)
            {
                while(map2.size() != k - 1)
                {
                    char ch1 = s.charAt(i);
                    int freqi = map2.get(ch1);
                    if(freqi == 1)
                        map2.remove(ch1);
                    else
                        map2.put(ch1,freqi - 1);
                    i++;
                }
            }
            
            cnt2 = cnt2 + (j - i + 1);
            j++;
            //System.out.println(map + " " + cnt);
        }
        return cnt1 - cnt2;
        
    }
}
