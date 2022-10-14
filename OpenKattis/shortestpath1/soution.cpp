#include<bits/stdc++.h>
#define INF 99999999

using namespace std;

struct edge
{
	int first;
	int second;
	edge(){}
	edge(int f, int s){
		first = f;
		second = s;
	}
	bool operator<(edge e) const{
		return first > e.first; 
	}
};

bitset<10000+9> visited;
int main(){
	ios_base::sync_with_stdio(false);
    cin.tie(NULL);  
	int n, m, q, s, u, v, w;
	while(cin >> n >> m >> q >> s){
		if ((n + m + q + s) == 0)
			break;
	
		vector<edge> arr[n+1];

		for(int i = 0; i < m; i++){
			cin >> u >> v >> w;
			arr[u].push_back(edge(w, v));
		}
		vector<int> dist(n+9, INF);
		dist[s] = 0;

		priority_queue<edge> short_path;
		
		visited.reset();
		short_path.push(edge(0, s));

		while(!short_path.empty()){
			edge data = short_path.top();
			short_path.pop();
	
			int node = data.second;

			if (visited[node]) continue;
			visited.set(node);

			for(auto p: arr[node]) {
				if (dist[p.second] > (dist[node] + p.first)){
					dist[p.second] 	= dist[node] + p.first;
					short_path.push(edge(dist[p.second], p.second));
				}
			}
		}
		int in; 
		for (int i = 0; i < q; i++){
			cin >> in; 
			if(dist[in] == INF)
				cout << "Impossible\n";	
			else
				cout << dist[in] << "\n";
		}
		cout << "\n";
	}
}
