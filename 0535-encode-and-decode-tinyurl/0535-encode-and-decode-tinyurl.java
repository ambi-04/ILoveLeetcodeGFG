public class Codec {
    HashMap<Integer,String> map = new HashMap<>();
    int count = 0;
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        count++;
        map.put(count,longUrl);
        return String.valueOf(count);
        
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        int count = Integer.valueOf(shortUrl);
        return map.get(count);
        
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));