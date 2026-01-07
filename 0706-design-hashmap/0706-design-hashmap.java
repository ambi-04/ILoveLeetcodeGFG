class MyHashMap 
{
    static class Node
    {
        Node next;
        int key;
        int value;
        Node(int key, int value)
        {
            this.key = key;
            this.value = value;
        }

    }
    Node[] hashTable;
    public MyHashMap() 
    {
        hashTable = new Node[1333333];    
    }
    
    public void put(int key, int value) 
    {
        Node pair = new Node(key,value);
        int index = key % 1333332;
        if(hashTable[index] == null)
            hashTable[index] = pair;
        else
        {
            Node head = hashTable[index];
            Node curr = head;
            boolean exists = false;
            while(curr != null)
            {
                if(curr.key == key)
                {
                    exists = true;
                    curr.value = value;
                    break;
                }
                curr = curr.next;
                
            }
            if(!exists)
            {
                Node nextNode = head.next;
                head.next = pair;
                pair.next = nextNode;
            }
        }

    }
    
    public int get(int key) 
    {
        int index = key % 1333332;
        if(hashTable[index] == null)
            return -1;
        Node curr = hashTable[index];
        while(curr != null)
        {
            if(curr.key == key)
                return curr.value;
            curr = curr.next;  
        }
        return -1;
    }
    
    public void remove(int key) 
    {
        int index = key % 1333332;
        if(hashTable[index] == null)
            return;
        Node curr = hashTable[index];
        Node prev = null;
        while(curr != null)
        {
            if(curr.key == key)
            {
                if(curr == hashTable[index])
                    hashTable[index]= null;
                else
                {
                    prev.next = curr.next;
                }
            }
            prev = curr;
            curr = curr.next;
        }
        
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */