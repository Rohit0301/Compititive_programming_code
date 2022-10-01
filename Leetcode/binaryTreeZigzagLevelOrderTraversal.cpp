class Solution {
public:
vector<vector<int>> zigzagLevelOrder(TreeNode* root) {
    vector<vector<int>> result;
    if(root== NULL) return result;
    
    queue<TreeNode*> nodesqueue;
      nodesqueue.push(root);
    bool righttoleft=true;
    
    while(!nodesqueue.empty()){
        int size=nodesqueue.size();
        
        vector<int>row(size);
        for(int i=0;i<size;i++){
            TreeNode* node = nodesqueue.front();
            nodesqueue.pop();
            
            int index=righttoleft ? i:(size-1-i);
            row[index]=node->val;
            if(node->left)
                nodesqueue.push(node->left);
            if(node->right)
                nodesqueue.push(node->right);
        }
        righttoleft=!righttoleft;
        result.push_back(row);
    }
    return result;
}
};
