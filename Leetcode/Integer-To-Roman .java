class Solution {
public:
	vector<pair<int, string>> map = {
		{1000, "M"},
		{900,  "CM"},
		{500,  "D"},
		{400,  "CD"},
		{100,  "C"},
		{90,   "XC"},
		{50,   "L"},
		{40,   "XL"},
		{10,   "X"},
		{9,    "IX"},
		{5,    "V"},
		{4,    "IV"},
		{1,    "I"}
	};

	string intToRoman(int num) {
		string ans = "";
        int size = map.size();
        for(int i=0; i<size;){
            if(num - map[i].first >= 0){
                num -= map[i].first;
                ans += map[i].second;
            }
            else i++;
        }
        return ans;
	}
};