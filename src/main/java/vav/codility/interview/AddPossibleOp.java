package vav.codility.interview;

import java.util.ArrayList;
import java.util.List;

public class AddPossibleOp {
    public List<String> addOperators(String num, int target) {
    List<String> ans = new ArrayList<>();
        if(num == null || num.length()== 0) return ans;
    dfs(ans, num, "", target, 0, 0, 0);
        return ans;
}
    private void dfs(List<String> ans, String num,  String path, int target, int depth, long eval, long lastAdd){
        if(depth == num.length()){
            if(eval == target) ans.add(path);
            return;
        }

        for(int i = depth; i < num.length(); i++){
            if(i > depth && num.charAt(depth) == '0') break;
            long cur = Long.parseLong(num.substring(depth, i + 1)); //[depth... i]
            // global first operand
            if(depth == 0){
                dfs(ans, num , Long.toString(cur), target, i + 1, cur, cur); // leading element
            }
            else{
                //add
                dfs(ans,num,path + "+" + cur, target, i + 1, eval + cur, cur);
                //subtract
                dfs(ans,num,path + "-" + cur, target, i + 1, eval - cur, -cur);
                //multiply
                dfs(ans,num,path + "*" + cur, target, i + 1, eval - lastAdd + lastAdd * cur, lastAdd * cur);
            }
        }
    }
}
