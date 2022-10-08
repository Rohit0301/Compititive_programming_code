class Solution {
public:
    bool canEatAll(vector<int>& piles , int mid,int h)
    {
        int count=0;
        for(auto pile : piles) {
            count+=pile/mid;
            if(pile%mid!=0) count++;
        }
        return count<=h;
    }
    int minEatingSpeed(vector<int>& piles, int h) {
        int low=1 , high = *max_element(begin(piles),end(piles));
        while(low<high)
        {
            int mid=low+((high-low)>>1);
            if(canEatAll(piles,mid,h))
                high=mid;
            else low=mid+1;
        }
        return low;
    }
};