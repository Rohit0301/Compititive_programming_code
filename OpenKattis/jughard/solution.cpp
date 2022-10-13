#include<bits/stdc++.h>

using namespace std;

int main(){
	#define int unsigned long long
	int T;  cin >> T;
	int a, b, d;
	int gcd;
	while(T--){
		cin >> a >> b >> d;
		gcd =  __gcd(a, b);
		if (d % gcd == 0){
			cout << "Yes\n";
		} else {
			cout << "No\n";
		}
	}
}
