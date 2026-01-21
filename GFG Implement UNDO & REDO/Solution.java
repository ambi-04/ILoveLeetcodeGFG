class Solution 
{
    StringBuilder document = new StringBuilder();
    Stack<Character> stk = new Stack<>(); 
    public void append(char x) {
        // append x into document
        document.append(x);
    }

    public void undo() {
        // undo last change
        
        int n = document.length();
        if(n == 0)
            return;
        char ch = document.charAt(n - 1);
        document.deleteCharAt(n - 1);
        stk.push(ch);
    }

    public void redo() {
        // redo changes
        if(stk.isEmpty())
            return;
        document.append(stk.pop());
    }

    public String read() {
        // read the document
        return document.toString();
    }
}
