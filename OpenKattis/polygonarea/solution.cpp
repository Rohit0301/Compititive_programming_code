#include<bits/stdc++.h>

using namespace std;

int main(){
    int T; 

    while(cin >> T && T){
        vector <pair<int, int> > points;
        for (int i = 0; i < T; i++){
            int x, y; cin >> x >> y;
            points.push_back(make_pair(x, y));
        }
        points.push_back(make_pair(points[0].first, points[0].second));
        double sum  = 0.0;
        int ccw = 0;
        for(int i = 0; i < T; ++i){
            double ans = (points[i].first * points[i+1].second) - (points[i].second *  points[i+1].first);
            ccw += (points[i+1].first - points[i].first) * (points[i+1].second + points[i].second);
            sum += ans;
        }
        if (ccw < 0){
            cout << "CCW ";
        }else{
            cout << "CW ";
        }
        printf("%.1f\n", abs(sum * 1.0) / 2);
        // cout << fixed << setprecision(1) << abs(sum * 1.0) / 2 << endl;
    }
}