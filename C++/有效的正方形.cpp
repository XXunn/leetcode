#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

class Solution {
public:
    bool validSquare(vector<int>& p1, vector<int>& p2, vector<int>& p3, vector<int>& p4) {
        double l[6];
        l[0] = abs((p1[0]-p2[0])*(p1[0]-p2[0])+(p1[1]-p2[1])*(p1[1]-p2[1]));
        l[1] = abs((p1[0]-p3[0])*(p1[0]-p3[0])+(p1[1]-p3[1])*(p1[1]-p3[1]));
        l[2] = abs((p1[0]-p4[0])*(p1[0]-p4[0])+(p1[1]-p4[1])*(p1[1]-p4[1]));
        l[3] = abs((p2[0]-p3[0])*(p2[0]-p3[0])+(p2[1]-p3[1])*(p2[1]-p3[1]));
        l[4] = abs((p2[0]-p4[0])*(p2[0]-p4[0])+(p2[1]-p4[1])*(p2[1]-p4[1]));
        l[5] = abs((p3[0]-p4[0])*(p3[0]-p4[0])+(p3[1]-p4[1])*(p3[1]-p4[1]));
        sort(l,l+6);
        if(abs(l[0]-l[3])<1e-6 && abs(l[4]-l[5])<1e-6 && l[0]!=l[5])
            return true;
        return false;
    }
};

int main()
{
    vector<int>vec1;    vec1.push_back(0);vec1.push_back(0);
    vector<int>vec2;    vec2.push_back(5);vec2.push_back(0);
    vector<int>vec3;    vec3.push_back(5);vec3.push_back(4);
    vector<int>vec4;    vec4.push_back(0);vec4.push_back(4);
    Solution slt;
    cout << slt.validSquare(vec1,vec2,vec3,vec4);
    return 0;
}
