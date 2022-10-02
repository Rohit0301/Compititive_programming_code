// leetcode (https://leetcode.com/problems/maximum-units-on-a-truck/)
Q..  Maximum units on a truck

// solutin 

class Solution {
public:
    static bool cmp(pair<int,int>&p1,pair<int,int>&p2)
    {
	  return p1.second>p2.second;
    }
    int maximumUnits(vector<vector<int>>& arr, int size) 
    {
      vector<pair<int,int>>v;
   
       vector<int>temp;
       for(int i=0;i<arr.size();i++)
       {
          temp=arr[i];
          v.push_back(make_pair(temp[0],temp[1]));	
       }        
       int ans=0;
       sort(v.begin(),v.end(),cmp);
       for(int i=0;i<v.size();i++)
       {
            auto p=v[i];

            int box=p.first;
            int unit=p.second;

            while(box and size)
            {
                ans=ans+unit;
                box--;
                size--;            
            }
            if(size==0)
            return ans;
       }
       return ans;
    }
};
