Given the root of a Binary Search Tree and a target number k, return true if there exist two elements in the BST such that their sum is equal to the given target.

 

Example 1:


Input: root = [5,3,6,2,4,null,7], k = 9
Output: true


Solution:
if(root==null){
        
        return false;
        
    }
    
    Queue<TreeNode>q = new LinkedList<>();
    
    HashSet<Integer>ss = new HashSet<>();
    
    q.offer(root);
    
    while(!q.isEmpty()){
        
        int sz = q.size();
        
        while(sz-->0){
            
            TreeNode n = q.poll();
            
            int nn = n.val;
            
            if(ss.contains(k-nn)){
                
                return true;
            }
            
            ss.add(nn);
            
            if(n.left!=null){
                
                q.offer(n.left);
                
            }
            
            if(n.right!=null){
                
                q.offer(n.right);
            }
            
            
            
        }
        
        
    }
    
    return false;
    
    
}
}