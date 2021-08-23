#include <iostream>
#include <vector>
#include <cmath>
using namespace std;

class Solution {
public:
    double largestTriangleArea(vector<vector<int>>& points) {
        double maxn = 0;
        int n = points.size();
        for(int i = 0;i < n;i++) {
            for(int j = i + 1;j < n;j++) {
                for(int k = j + 1;k < n;k++) {
                    double s = 0.5*fabs(points[i][0]*points[j][1]+points[j][0]*points[k][1]+points[k][0]*points[i][1]-points[i][1]*points[j][0]-points[j][1]*points[k][0]-points[k][1]*points[i][0]);
                    maxn = max(maxn,s);
                }
            }
        }
        return maxn;
    }
};

// class Solution {
// public:
//     double largestTriangleArea(vector<vector<int>>& points) {
//         double maxn = 0;
//         int n = points.size();
//         for(int i = 0;i < n;i++) {
//             for(int j = i + 1;j < n;j++) {
//                 for(int k = j + 1;k < n;k++) {
//                     double a = sqrt((points[i][0]-points[j][0])*(points[i][0]-points[j][0])+(points[i][1]-points[j][1])*(points[i][1]-points[j][1]));
//                     double b = sqrt((points[i][0]-points[k][0])*(points[i][0]-points[k][0])+(points[i][1]-points[k][1])*(points[i][1]-points[k][1]));
//                     double c = sqrt((points[j][0]-points[k][0])*(points[j][0]-points[k][0])+(points[j][1]-points[k][1])*(points[j][1]-points[k][1]));
//                     double p = (a+b+c)/2;
//                     double s = sqrt(p*(p-a)*(p-b)*(p-c));
//                     maxn = max(maxn,s);
//                 }
//             }
//         }
//         return maxn;
//     }
// };

int main()
{
    
    return 0;
}
