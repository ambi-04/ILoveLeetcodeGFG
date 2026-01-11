class Solution {
    static List<Integer> get(int a, int b) {
        // code here
        a = a ^ b;
        b = b ^ a;
        a = a ^ b;
        List<Integer> result = new ArrayList<Integer>();
        result.add(a);
        result.add(b);
        return result;
    }
}
