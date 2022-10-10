## Method1: Using hashTable [T(n) = S(n) = O(n)]

Idea is to simply use a hashTable to store the frequency of each num in one pass. Then iterate over the element: x in hashTable and include x in ans only if freq[x] == 1.

```cpp
vector<int> singleNumber(vector<int> &nums) {
	unordered_map<int, int> freq;
	// generate freq
	for (auto &num: nums) ++freq[num];
	vector<int> ans;
	// generate ans
	for (auto &[x, f]: freq)
		if (f == 1) {
			ans.push_back(x);
			if (ans.size() == 2)
				return ans;
		}
	return ans;
}
```
## Method2: Using Set [T(n) = S(n) = O(n)]
Idea is to simply use a set (unordered_set to get avg. O(1) insert and delete) to store each num in it in one pass. While storing, if num is already present in set then delete it and if not then insert it so that at the end, in the set, we only have elements with odd frequency and since, only two elements (distinct) in the nums are having odd frequency (=1), we get these two distinct elements stored in the set at the end.
```cpp
vector<int> singleNumber(vector<int> &nums) {
	unordered_set<int> visited;
	// store num with odd freq into set
	for (auto &num: nums)
		if (visited.count(num))
			visited.erase(num);
		else visited.insert(num);
	// return ans
	return vector<int> (visited.begin(), visited.end());
}
```
## Method3: Using Sorting [T(n) = O(nlgn) and S(n) = O(1), excluding S(n) for std::sort()]
Idea is to simply use sorting to club the elements together in the nums vector. Finally, use a while loop to iterate over the sorted nums, if nums[i] == nums[i+1], then skip these two by moving forward using i += 2 otherwise add nums[i] to ans and move forward using i++.
Corner Case: if nums[n - 1] != nums[n - 2] (where n:= nums.size()) then we might skip adding nums[n - 1] to the ans. So, check at the end, if ans.size() == 1 then add nums[n - 1] to the ans.
```cpp
vector<int> singleNumber(vector<int> &nums) {
	sort (nums.begin(), nums.end());
	vector<int> ans;
	int i = 0, n = nums.size();
	while (i < n - 1)
	    // skip equal elements
		if (nums[i] == nums[i + 1]) i += 2;
		// generate ans
		else {
			ans.push_back(nums[i++]);
			if (ans.size() == 2)
				return ans;
		}
	// corner case
	if (ans.size() == 1) 
		ans.push_back(nums.back());
	return ans;
}
```
## Method4: Using Bit Manipulation [T(n) = O(n) and S(n) = O(1)]
Idea is to use property of XOR:
1. xor(a, a) = 0
2. xor(a, 0) = xor(0, a) = a
3. xor(1, 1) = xor(0, 0) = 0
4. xor(1, 0) = xor(0, 1) = 1
5. xor(a, b) = c => xor(a, c) = b and xor(b, c) = a

Let two distinct elements be: first and sec. Now, firstXorSec := xor(first, sec) = xor(nums[i], 0), 0 <= i < [n:= nums.size()], why? because nums has odd and even freq. elements, doing xor will cancel out elements with even freq. using the 1. property of xor. So, at the end, xor of only odd freq. elements i.e first and sec remains.

Now, first != sec => there is atleast 1 set bit in firstXorSec. Using 4. property of xor, one of first and sec, must have a set bit (Let it be first). We find/ denote this rightmost set bit using mask: has all bits 0 except the rightmost set bit in firstXorSec. So, we can divide the elements in nums in two groups A and B, where:
1. groupA: (num & mask) == 1 i.e bit is set
2. groupB: (num & mask) == 0 i.e bit is not set

Clearly, both first and sec belong to different groups and since, all other elements occurs in pair, so, we can safely again use 1. property of xor to generate first. Finally, using 5. propery of xor, we have sec = xor(firstXorSec, first).
```cpp
vector<int> singleNumber(vector<int> &nums) {
	int firstXorSec = 0, mask = 1, first = 0;
	// get xor of first and sec
	for (auto &num: nums) firstXorSec ^= num;
	// get rightmost set bit in above xor
	while (not (firstXorSec & mask)) mask <<= 1;
	// get first distinct number
	for (auto &num: nums)
		if (num & mask) first ^= num;
	// return ans
	return {first, firstXorSec ^ first};
}
```
