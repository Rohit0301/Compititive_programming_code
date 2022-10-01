class Solution {
public:
    int minSetSize(vector<int>& arr) {
    
    int n=arr.size();
    unordered_map<int,int> mp;    //to store the frequency
    priority_queue<int> pq;       //max heap
    
    for(auto it:arr) mp[it]++;    //updating frequency of each element
    
    for(auto it:mp) pq.push(it.second);  //pushing all the frequencies into max heap

    int ele=0, setCount=0;
    while(!pq.empty()){    
        ele+=pq.top();     //ele will sum up the frequencies respectively
        pq.pop();          //if ele >= n/2, just return setCount
        setCount++;
        
        if(ele>=n/2) return setCount;
    }
    return 0;
}
};
