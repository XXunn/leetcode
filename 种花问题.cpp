#include <bits/stdc++.h>

using namespace std;

class Solution {
public:
    bool canPlaceFlowers(vector<int>& flowerbed, int n) {
        int cnt = 0;
        int l = flowerbed.size();
        if(l == 1) {
            if(flowerbed[0] == 0)   return n<=1;
            else    return n==0;
        } else if(l == 0) {
            return n == 0;
        } else {
            for(int i = 0;i < l;i++) {
                if(i == 0 && i+1 < l) {
                    if(flowerbed[i]==0 && flowerbed[i+1]==0) {
                        flowerbed[i]=1;
                        cnt++;
                        cout << "fir" << i << endl;
                        continue;
                    }
                }
                if(i == l-1 && i-1 >= 0) {
                    if(flowerbed[i]==0 && flowerbed[i-1]==0)  {
                        flowerbed[i] = 1;
                        cnt++;
                        cout << "sec" << i << endl;
                        continue;
                    }
                }
                if(i-1 >= 0 && i+1 < l && flowerbed[i]==0 && flowerbed[i-1]==0 && flowerbed[i+1]==0) {
                    flowerbed[i] = 1;
                    cnt++;
                    cout << "third" << i << endl;
                }
            }
            //cout << cnt << endl;
            return cnt >= n;
        }
        
    }
};
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for(int i=0; i<flowerbed.length; i++) {
            if(flowerbed[i] == 0 && (i == 0 || flowerbed[i-1] == 0) && (i == flowerbed.length-1 || flowerbed[i+1] == 0)) {
                n--;
                if(n <= 0) return true;
                flowerbed[i] = 1;
            }
        }

        return n <= 0;
    }
}


int main()
{
    
    return 0;
}
