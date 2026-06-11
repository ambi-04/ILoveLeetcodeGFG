class Solution 
{
    public static int dfs(ArrayList<Integer>[]adj,int cnt, int i,int[] visited)
    {
        int max = cnt;
        for(int j = 0; j < adj[i].size();j++)
        {
            int neighbour = adj[i].get(j);
            int depth = 0;
            if(visited[neighbour] != 1)
            {
                visited[neighbour] = 1;
                depth = dfs(adj,cnt + 1,adj[i].get(j),visited);
                visited[neighbour] = 0;
            }
            if(depth > max)
                max = depth;
        }
        return max;
    }
    public static int exponentiation(int base,int power)
    {
        int res = 1;
        while(power != 0)
        {
            res = (res * base) % 1000000007;
            power--;
        }
        return res;
    }
    public int assignEdgeWeights(int[][] edges) 
    {

        int n = edges.length + 1;//no of nodes
        ArrayList<Integer>[] adj = new ArrayList[n];
        for(int[] edge: edges)
        {
            int n1 = edge[0] - 1;
            int n2 = edge[1] - 1;
            if(adj[n1] == null)
                adj[n1] = new ArrayList<>();
            if(adj[n2] == null)
                adj[n2] = new ArrayList<>();
            adj[n1].add(n2);
            adj[n2].add(n1);
        }
        int[] visited = new int[n];
        visited[0] = 1;
        int maxDepth = dfs(adj,0,0,visited);
        return exponentiation(2,maxDepth - 1);

    }
}