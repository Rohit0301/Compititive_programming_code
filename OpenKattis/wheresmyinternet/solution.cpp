
	#include<bits/stdc++.h>
	#include<cstdio>
	#include<cstring>
	#include<cmath>
	#include<cstring>
	#include<chrono>
	#include<complex>
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

	int arr[200005];

	int root(int A)
	{
	    if (arr[A] == A) return A;
	    arr[A] = root(arr[A]);
		return arr[A];
	}

	void Union(int A , int B)
	{
		int rootA = root(A);
		int rootB = root(B);

		arr[rootA] = rootB;
	}

	int main()
	{
		int V, E;

		cin>>V>>E;

		for (int i = 0; i <= V; i++)arr[i] = i;

		int in1 , in2;

		for (int i = 0; i < E; i++)
		{
			cin>>in1>>in2;
			Union(in1,in2);
		}

		bool conected = true;
		string pr = "";
		for (int i = 2; i <= V; i++)
		{
			if (root(i) != root(1))
			{
				conected = false;
				cout<<i<<endl;
			}
		}
		if (conected)cout<<"Connected"<<endl;
	


		return 0;
	}
