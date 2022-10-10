class Solution:
	def minPatches(self, nums: List[int], n: int) -> int:
		ans, total = 0, 0
		num_idx = 0
		while total < n:
			if num_idx < len(nums):
				if total < nums[num_idx] - 1:
					total = total * 2 + 1
					ans += 1
				else:
					total += nums[num_idx]
					num_idx += 1
			else:
				total = total * 2 + 1
				ans += 1
		return ans