package vav.codility.arrays.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FindDuplicateFileInSystem {
    public List<List<String>> findDuplicate(String[] paths) {
        Map<String, List<String>> map = new HashMap<>();
        for (String path: paths) {
            String[] token = path.split(" ");
            for (int i=1; i< token.length; i++) {
                String[] desc = split(token[i]);
                List<String> bucket = map.getOrDefault(desc[1], new ArrayList<>());
                bucket.add(token[0] + "/" + desc[0]);
                map.put(desc[1], bucket);
            }
        }
        List<List<String>> ans = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry: map.entrySet()) {
            if ( entry.getValue().size() >1) {
                ans.add(entry.getValue());
            }
        }
        return ans;
    }

    private String[] split(String file) {
        String fileName = file.substring(0, file.indexOf("("));
        String content = file.substring(file.indexOf("(")+1, file.length() -1);
        return new String[] {fileName, content};
    }
}
