class Solution {
public:
    
    double find_Median(vector<int>& arr1, vector<int>& arr2)
    {
       int size = arr1.size()+arr2.size();
        vector<int> ans;
        
        int i=0;
        int j=0;
        
        int m=size/2;
        
        double an=0.0;
        
        if(arr1.size()==0)
        {
            if(size%2==0)
            {
                an= (arr2[m]+arr2[m-1])/2.0;

            }
            else
            {
                int s= size/2;
                an= arr2[m];
            }
                return an;
        }
        
         while(i<arr1.size()&& j<arr2.size() && ans.size()<=m+1)
        {
           if(arr1[i]<arr2[j] && i<arr1.size()&& ans.size()<=m+1)
            {
                ans.push_back(arr1[i]);
                i++;
                if(i==arr1.size())
                {
                    while(j<arr2.size()&& ans.size()<=m+1)
                    {
                        ans.push_back(arr2[j]);
                        j++;
                    }
                break;
                }
            }

            else if(arr1[i]>arr2[j] && j<arr2.size()&& ans.size()<=m+1)
            {
                ans.push_back(arr2[j]);
                j++;
                if(j==arr2.size())
                {
                    while(i<arr1.size()&& ans.size()<=m+1)
                    {
                        ans.push_back(arr1[i]);
                        i++;
                    }
                break;
                }
            }
            if(arr1[i]==arr2[j]&& ans.size()<=m+1){
                ans.push_back(arr1[i]);
                ans.push_back(arr2[j]);
                i++;
                j++;
                if(i==arr1.size())
                {
                    while(j<arr2.size()&& ans.size()<=m+1)
                    {
                        ans.push_back(arr2[j]);
                        j++;
                    }
                break;
                }
            }
        }
    
        if(size%2==0)
        {
            an= (ans[m]+ans[m-1])/2.0;
        }
        else
        {
            int s= size/2;
            an= ans[m];
        }
        
        return an;
    }

    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
        
        int size = nums1.size()+nums2.size();
        
        int i=0;
        int j=0;
        
        int m=size/2;
        
        double ans=0.0;
        
        if(nums1.size()<=nums2.size())
        {
            ans=find_Median(nums1,nums2);
        }
        
        if(nums1.size()>nums2.size()){
            ans=find_Median(nums2,nums1);
        }
        return ans;
    }
};