#include <bits/stdc++.h>
using namespace std;

struct TreeNode {
  int data;
  struct TreeNode * left, * right;
};

struct TreeNode * newNode(int data) {
  struct TreeNode * node = new TreeNode();
  node -> data = data;
  node -> left = NULL;
  node -> right = NULL;

  return (node);
}

    vector<int> inorderTraversal(TreeNode* Root) {
       vector<int> ans;
        
        if(Root == NULL) return ans;
        
        stack<TreeNode*> st;
        
        while(true){
             if(Root!=NULL){
            st.push(Root);
            
            Root=Root->left;
        }
        else{
            if(st.empty()) break;
            Root=st.top();
            
            ans.push_back(Root->data);
            st.pop();
            
            Root=Root->right;
          }
       }
         return ans;
    }

int main() {

  struct TreeNode * root = newNode(1);
  root -> left = newNode(2);
  root -> right = newNode(3);
  root -> left -> left = newNode(4);
  root -> left -> right = newNode(5);
  root -> left -> right -> left = newNode(8);
  root -> right -> left = newNode(6);
  root -> right -> right = newNode(7);
  root -> right -> right -> left = newNode(9);
  root -> right -> right -> right = newNode(10);

  vector < int > ans;
  ans = inorderTraversal(root);

  cout << "The inOrder Traversal is : ";
  for (int i = 0; i < ans.size(); i++) {
    cout << ans[i] << " ";
  }
  return 0;
}