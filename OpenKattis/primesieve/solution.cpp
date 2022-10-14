#include <bits/stdc++.h>
#include <cstdio>
#include <cstring>
#include <cmath>
#include <cstring>
#include <chrono>
#include <complex>
#define endl "\n"
#define ll long long int
#define vi vector<int>
#define vll vector<ll>
#define vvi vector < vi >
#define pii pair<int,int>
#define pll pair<long long, long long>
#define mod 1000000007
#define inf 1000000000000000001;
#define all(c) c.begin(),c.end()
#define mp(x,y) make_pair(x,y)
#define mem(a,val) memset(a,val,sizeof(a))
#define eb emplace_back
#define f first
#define s second

using namespace std;

const long long MAXN = 100000000;
bitset<MAXN + 1> t; // initialize to ‘false’.

int main()
{


    t[1] = 1;
    int test , in;
    cin>>in>>test;
    for(long long  p = 2; p <= in; p++)
    {
// if p is marked, p is composite.
        if(t[p]) continue;
// otherwise, mark all multiples of p.
        for(long long i = 2*p; i <= in; i += p) t[i] = 1;
    }
    cout<<in - t.count()<<endl;


    for (int i = 0; i < test; i++)
    {
        int inp; cin>>inp;
        cout<<!t[inp]<<endl;
    }
}
