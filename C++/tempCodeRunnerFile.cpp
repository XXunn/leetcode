#include <bits/stdc++.h>

using namespace std;

int gcd(int n, int m) {
    return n%m==0?m:gcd(m%n,n);
}

int main()
{
    cout << gcd(5,8) << endl;
    return 0;
}
