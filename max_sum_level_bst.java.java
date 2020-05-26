class Solution {
    public int maxLevelSum(TreeNode root) {
        int[] map = new int[(int)Math.pow(10, 4)+1];
        recur(root, map, 1);
        int maxLevel = 1;
        for(int i = 0; i < map.length; i++) if(map[i] > map[maxLevel]) maxLevel = i;
        return maxLevel;
    }
    
    public void recur(TreeNode root, int[] map, int level) {
        if(root == null) return;
        map[level] += root.val;
        recur(root.right, map, level + 1);
        recur(root.left, map, level + 1);
    }
}