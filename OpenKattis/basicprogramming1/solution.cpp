#include <bits/stdc++.h>

using namespace std;

int main(){
	#define int long long
    int N, t; cin >> N >> t;
    int arr[N+5];
    int sum = 0;
    int even = 0;
    string alp = "abcdefghijklmnopqrstuvwxyz";
    string str = "";
    for (int i = 0; i < N; i++){
        int in;
        cin  >> in;
        arr[i] = in;
        sum += in;
        if (in % 2 == 0){
            even += in;
        }
        str += alp[in % 26];
    }
    if (t == 1){
        cout << 7 << endl;
    } else if (t == 2){
        if (arr[0] > arr[1]){
            cout << "Bigger\n";
        } else if (arr[0] == arr[1]){
            cout << "Equal\n";
        } else {
            cout << "Smaller\n";
        }
    } else if (t == 3) {
        int arr1[] = {arr[0], arr[1], arr[2]};
        sort(arr1, arr1+3);
        cout << arr1[1] << endl;
    } else if (t == 4){
        cout << sum << endl;
    } else if(t == 5){
        cout << even << endl;
    } else if (t == 6){
        cout << str << endl;
    } else {
        int index = 0;
        int count = 0;
        while(index < (N-1) && count++ <= N){
            // cout << "C: " << count << endl;
            index = arr[index];
        }
        if (index > (N-1)){
            cout << "Out\n";
        } else if (index  == (N-1)){
            cout << "Done\n";
        } else {
            cout << "Cyclic\n";
        }
    }
}
