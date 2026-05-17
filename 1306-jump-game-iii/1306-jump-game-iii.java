class Solution 
{

    public boolean canReach(int[] arr, int start) {
        Queue<Integer> q  = new LinkedList<>();
        q.add(start);
        int n = arr.length;
        int[] visited = new int[n];
        visited[start] = 1;
        while(!q.isEmpty())
        {
            int node = q.poll();
            int n1 = -1;
            int n2 = -1;
            if(node + arr[node] < n)
            {
                n1 = node + arr[node];
                if(arr[n1] == 0)
                    return true;
                if(visited[n1] != 1)
                    q.add(n1);
                visited[n1] = 1;
            }    
            if(node - arr[node] >= 0)
            {
                n2 = node - arr[node];
                if(arr[n2] == 0)
                    return true;
                if(visited[n2] != 1)
                    q.add(n2);
                visited[n2] = 1;
            }
                
            
        }
        return false;
        
    }
}