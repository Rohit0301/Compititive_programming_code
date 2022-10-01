 // Diameter= Longest path betm two path.

    int diameterOfBinaryTree(TreeNode* root) {
        int diameter=0;
        height(root, diameter);
        return diameter;
    }
    
private:
    int height(TreeNode* root, int &diameter){
        if(root == NULL) return 0;
        
        int Lt= height(root->left, diameter);
        int Rt= height(root->right, diameter);
        
        diameter= max(diameter, Lt+Rt);
        
        return 1+max(Lt,Rt);
    }