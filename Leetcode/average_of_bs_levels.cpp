class Solution {
public:
    vector<double> averageOfLevels(TreeNode* root) {
        vector<double> ans;
        queue<TreeNode*> q;
        q.push(root);
        while(!q.empty()){
            long temp=0;
            int size= q.size();
            for(int i=0;i<size;i++){
                TreeNode * node = q.front();
                q.pop();
                if(node->left!=NULL) q.push(node->left);
                if(node->right!=NULL) q.push(node->right);
                temp+=node->val;
            }
            ans.push_back((double)temp/size);
        }
        return ans;
    }
};
// Time Complexity : O(N), where N is the number of nodes in the given Tree.
// Space Complexity : O(M), where M is the maximum number of nodes at any level in the binary tree.