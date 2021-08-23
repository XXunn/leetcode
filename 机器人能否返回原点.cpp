#include <iostream>
#include <string>
#include <map>
using namespace std;

class Solution {
public:
    bool judgeCircle(string moves) {
        int ud,lr;
        ud = lr = 0;
        for(int i = 0;i < moves.size();i++) {
            if(moves[i]=='U') {
                ud++;
                continue;
            }
            if(moves[i]=='D') {
                ud--;
                continue;
            }
            if(moves[i]=='L') {
                lr--;
                continue;
            }
            if(moves[i]=='R') {
                lr++;
                continue;
            }
        }
        return lr==0&&ud==0;
    }
};

int main()
{
    
    return 0;
}
