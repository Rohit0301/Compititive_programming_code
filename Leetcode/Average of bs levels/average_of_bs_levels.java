class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        ArrayList<Double> list = new ArrayList<>();
        
        queue.add(root);
        
        while(!queue.isEmpty()){
            double size = (double)queue.size();
            double average = 0;
            
            for(int i = 0; i<size; i++){
                TreeNode node = queue.poll();
                average += (double)node.val;
                
                if(node.left!=null) queue.add(node.left);
                if(node.right!=null) queue.add(node.right);
            }
            list.add(average/size);
        }
        
        return list;
    }
}