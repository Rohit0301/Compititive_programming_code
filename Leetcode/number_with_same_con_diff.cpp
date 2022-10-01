vector<int> ans;

vector<int> numsSameConsecDiff(int n, int k) {
	for(int i = 1; i < 10; i++)
		genNum(n - 1, k, i, i);
	return ans;
}

void genNum(int n, int& k, int sum, int last) {
	if(n == 0) {
		ans.push_back(sum);
		return;
	}
	for(int i = 0; i < 10; i++) {
		if(abs(i - last) == k) {
			genNum(n - 1, k, sum * 10 + i, i);
		}
	}
}