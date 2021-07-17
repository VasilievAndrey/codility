package vav.codility.arrays.strings;

import java.util.HashMap;
import java.util.Map;

public class Codec {

    Map<Integer, String> map = new HashMap<>();
    private static final String path = "http://tinyurl.com/";
    public String encode(String longUrl) {
        map.put(longUrl.hashCode(), longUrl);
        return path + longUrl.hashCode();
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        String replace = shortUrl.replace(path, "");
        return map.get(Integer.parseInt(replace));
    }
}
