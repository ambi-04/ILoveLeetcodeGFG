class Solution {
    public String mapWordWeights(String[] words, int[] weights) 
    {
        StringBuilder sb = new StringBuilder();
        for(String x : words)
        {
            int sum = 0;
            for(int i = 0; i < x.length();i++)
            {
                char ch = x.charAt(i);
                sum = sum + weights[(ch - 'a')];
            }
            sum = sum % 26;
            char ch = (char)('a' + 26 - sum - 1);
            sb.append(ch);
        }
        return sb.toString();
        
    }
}