package vav.codility.backtracking;

import java.util.HashSet;
import java.util.Set;

public class LetterTilePossibilities {

    Set<String> set = new HashSet();
    boolean[] vis;
    public int numTilePossibilities(String tiles) {
        int n = tiles.length();
        vis = new boolean[n];
        dfs(new StringBuilder(), tiles);
        return set.size();
    }
    void dfs(StringBuilder sb, String tiles){
        if(sb.length()>0) set.add(sb.toString());
        if(sb.length()>=tiles.length()) return;
        for(int i=0;i<tiles.length();i++){
            if(vis[i]) continue;
            vis[i] = true;
            int len = sb.length();
            dfs(sb.append(tiles.charAt(i)), tiles);
            sb.setLength(len);
            vis[i] = false;
        }
    }
}
