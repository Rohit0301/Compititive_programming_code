#include <bits/stdc++.h>

using namespace std;

int main()
{
    int x, a, b;



    while (cin >> x)
    {
        queue <int> q;
        stack <int> s;
        priority_queue <int> p;

        int n (1), m (1), l (1);
        for (int test = 0; test < x; test++)
        {
            cin>>a>>b;

            if (a == 1)
            {
                q.push(b), s.push(b), p.push(b);
            }
            else
            {
                if (q.empty() || s.empty() || p.empty())
                {
                    n = 0;
                    m =0;
                    l =0;
                }
                else
                {
                    if (b != q.front()) n = 0;
                    if (b != p.top()) l = 0;
                    if (b != s.top()) m = 0;
                    q.pop(), s.pop(), p.pop();
                }
            }
        }

        if (n + m +l == 0)cout << "impossible\n";
        else if (n + m + l > 1)cout<<"not sure\n";
        else if (n)cout << "queue\n";
        else if (m)cout<<"stack\n";
        else cout << "priority queue\n";
    }


    return 0;
}
