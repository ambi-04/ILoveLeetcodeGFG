class MyHashSet 
{
    static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
        }
    }
    Node[] hashTable;
    public MyHashSet() 
    {
        hashTable = new Node[1333];
    }
    
    public void add(int key) 
    {
        int index = key % 1333;
        Node head = hashTable[index];
        Node curr = head;
        while(curr != null)
        {
            if(curr.data == key)
                break;
            curr = curr.next;
        }
        if(curr == null)
        {
            Node newnode = new Node(key);
            newnode.next = head;
            hashTable[index] = newnode;
        }
            

    }
    
    public void remove(int key) 
    {
        int index = key % 1333;
        if(hashTable[index] != null)
        {
            Node head = hashTable[index];
            if(head.data == key)
                hashTable[index] = head.next;
            else
            {
                Node prev = null;
                while(head != null)
                {
                    if(head.data == key)
                    {
                        prev.next = head.next;
                        break;
                    }
                    prev = head;
                    head = head.next;
                }
            }
        }

    }
    
    public boolean contains(int key) 
    {
        boolean result = false;
        int index = key % 1333;
        Node head = hashTable[index];
        while(head != null)
        {
            if(head.data == key)
            {
                result = true;
                break;
            }
            head = head.next;
        }
        return result;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */