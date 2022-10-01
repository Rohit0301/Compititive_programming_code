class Solution {
  public:


  int uniqueMorseRepresentations(vector<string>& words) 
  {
  	vector<string> a = {".-","-...","-.-.","-..",".","..-.","--.","....",
                  "..",".---","-.-",".-..","--","-.","---",".--.",
                  "--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

  	unordered_set<string> u;

  	for (auto word : words) {
  		string t;
  		for (auto c : word) t += a[c - 'a'];
  		u.insert (t);
  	 }

  return u.size ();
  }
  };
