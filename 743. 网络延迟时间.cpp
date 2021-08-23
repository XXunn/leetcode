#include <bits/stdc++.h>

using namespace std;

class Solution {
public:
    static const int maxn = 105;
    static const int maxm = 6500;
    static const int inf = 0x3f3f3f3f;
    struct edge{
        int to,w,next;
    }e[maxm];
    int head[maxn],dis[maxn];
    bool vis[maxn];
    int cnt, s;
    void add_edge(int u,int v,int w) {
        e[++cnt].to = v;
        e[cnt].w = w;
        e[cnt].next = head[u];
        head[u] = cnt;
    }
    struct node {
        int dis,pos;
        bool operator < (const node &x) const {
            return x.dis < dis;
        }
    };
    priority_queue<node> q;
    void dijkstra() {
        dis[s] = 0;
        q.push((node){0,s});
        while(!q.empty()) {
            node temp = q.top();
            q.pop();
            int x = temp.pos;
            if(vis[x])  continue;
            vis[x] = 1;
            for(int i = head[x];i;i=e[i].next) {
                if(dis[e[i].to] > dis[x] + e[i].w) {
                    dis[e[i].to] = dis[x] + e[i].w;
                    if(!vis[e[i].to])   q.push((node){dis[e[i].to],e[i].to});
                }
            }
        }
    }
    int networkDelayTime(vector<vector<int>>& times, int n, int k) {
        s = k;
        fill(dis,dis+n+1,inf);
        for(auto time : times) {
            add_edge(time[0], time[1],time[2]);
        }
        dijkstra();
        int ans = *max_element(dis+1,dis+n+1);
        return ans == inf ? -1: ans;
    }
};


// class Solution {
// public:
//     int networkDelayTime(vector<vector<int>>& times, int n, int k) {
//         const int inf = 0x3f3f3f3f;
//         vector<vector<int>> g(n, vector<int>(n,inf));
//         for(auto &t : times) {
//             int x = t[0] - 1;
//             int y = t[1] - 1;
//             g[x][y] = t[2];
//         }
//         vector<int> dist(n, inf);
//         dist[k-1] = 0;
//         vector<int> used(n);
//         for(int i = 0; i < n; i++) {
//             int x = -1;
//             for(int y = 0; y < n; y++) {
//                 if(!used[y] && (x == -1 || dist[y] < dist[x])) {
//                     x = y;
//                 }
//             }
//             used[x] = true;
//             for(int y = 0; y < n; y++) {
//                 dist[y] = min(dist[y], dist[x] + g[x][y]);
//             }
//         }
//         int ans = *max_element(dist.begin(), dist.end());
//         return ans == inf ? -1 : ans;
//     }
// };

int main()
{
    
    return 0;
}
