#include <iostream>
#include <vector>
#include <map>
using namespace std;

class Solution {
public:
    map<int,int>mp;
    int cnt = 0;int roomsize;int flag = 0;
    bool canVisitAllRooms(vector<vector<int>>& rooms) {
        roomsize = rooms.size();
        dfs(rooms,0);
        return (cnt != roomsize ? false : true);
    }
    void dfs(vector<vector<int>>& rooms,int n) {
        cnt++;
        mp[n] = 1;
        for(int i = 0;i < rooms[n].size();i++) {
            if(mp[rooms[n][i]]!=1) {
                dfs(rooms,rooms[n][i]);
            }
        }
    }
};

int main()
{
    
    return 0;
}
