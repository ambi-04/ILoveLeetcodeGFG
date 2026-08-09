class Solution 
{
    static List<List<String>> result = new ArrayList<>();
    public static boolean isPalindrome(String s){
        int i =  0; 
        int j = s.length() - 1;
        while(i < j){
            if(s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
    public static void func(List<String> list, int i, int j, String s){
        if(i > j){
            result.add(new ArrayList<>(list));
        }
        else{
            for(int k = i; k <= j; k ++){
                String substring = s.substring(i, k + 1);
                if(isPalindrome(substring)){
                    list.add(substring);
                    func(list, k + 1, j,s);
                    list.remove(list.size() - 1);
                } 
            }
        }

    }
    public List<List<String>> partition(String s) 
    {
        result = new ArrayList<>();
        func(new ArrayList<String>(),0,s.length() - 1, s);
        return result;

        
    }
}