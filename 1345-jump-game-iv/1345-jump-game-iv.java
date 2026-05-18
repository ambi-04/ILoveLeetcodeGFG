class Solution {
    public int minJumps(int[] arr) 
    {
        Queue<int[]> q = new LinkedList<>();//stores (index,numberOfJumps)
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        int n = arr.length;
        for(int i = 1; i < n; i++)
        {
            List<Integer> indices = null;
            if(!map.containsKey(arr[i]))
                indices = new ArrayList<>();
            else
                indices = map.get(arr[i]);
            indices.add(i);
            map.put(arr[i],indices);
        }
        //System.out.println(map);
        q.add(new int[]{0,0});
        int[] visited = new int[n];
        visited[0] = 1;
        //int minJumps = n - 1;
        while(!q.isEmpty())
        {
            int[] node = q.poll();
            //System.out.println(Arrays.toString(node));
            int index = node[0];
            int jumps = node[1];
            if(index == n - 1)
                return jumps;
            if(index + 1 < n && visited[index + 1] != 1)
            {
                q.add(new int[]{index + 1,jumps + 1});
                visited[index + 1] = 1;
                //map.get(arr[index + 1]).remove(Integer.valueOf(index + 1));
            }
            if(index - 1 >= 0 && visited[index - 1] != 1)
            {
                q.add(new int[]{index - 1,jumps + 1});
                visited[index - 1] = 1;
                //map.get(arr[index - 1]).remove(Integer.valueOf(index - 1));
            }
            List<Integer> neighbours = map.get(arr[index]);
            if(neighbours != null)
            {
                for(int i = neighbours.size() - 1; i >= 0; i--)
                {
                    int x = neighbours.get(i);
                    if(visited[x] == 0)
                    {
                        q.add(new int[]{x,jumps + 1});
                        visited[x] = 1;
                        //neighbours.remove(Integer.valueOf(x));
                    }
                }
                
            }
            map.remove(arr[index]);
            

            
        }
        return 0;

        
    }
}