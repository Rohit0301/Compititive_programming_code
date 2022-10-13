#include<bits/stdc++.h>

using namespace std;

int main(){
        #define int long long
        int n; cin >> n;
        string arr[n+9];
        for(int i = 0; i < n; i++) cin >> arr[i];

        bool inc = false;
        bool dec = false;
        for(int i = 1; i < n; i++){
                if (arr[i] >= arr[i-1]) {
                        inc = true;
                } else {
                        dec = true;
                }
        }
        if (inc && dec) cout << "NEITHER\n";
        else if (inc) cout << "INCREASING\n";
        else cout << "DECREASING\n";
}

