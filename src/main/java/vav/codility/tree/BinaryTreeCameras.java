package vav.codility.tree;

public class BinaryTreeCameras {
    private static final int NONE = 0;
    private static final int COVER = 1;
    private static final int CAMERA = 2;
    private int res;
    public int minCameraCover(TreeNode root) {
        if(dfs(root) == NONE) res++;
        return res;
    }
    private int dfs(TreeNode node){
        if(node == null) return COVER;
        int left = dfs(node.left);
        int right = dfs(node.right);
        if(left == NONE || right == NONE){
            res++;
            return CAMERA;
        }
        if(left == CAMERA || right == CAMERA) return COVER;
        return NONE;
    }
}
