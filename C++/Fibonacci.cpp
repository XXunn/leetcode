#include <bits/stdc++.h>

using namespace std;
char a[1006][1006];
char b[1006][1006];
int main()
{
    int n,m;
    scanf("%d%d",&n,&m);
    for(int i = 0;i < n;i++)
        scanf("%s",a[i]);
    for(int j = 0;j < n;j++)
        scanf("%s",b[j]);
    int dif = 0;
    for(int i = 0;i < n;i++) {
        for(int j = 0;j < m;j++) {
            if(a[i][j] != b[i][j])
                dif++;
        }
    }
    if(dif <= n*m/2) {
        for(int i = 0; i < n;i++) {
            printf("%s\n",a[i]);
        }
    } else {
        for(int i = 0; i < n;i++) {
            for(int j = 0;j < m;j++) {
                if(a[i][j] == '.')  printf("X");
                else                printf(".");
            }
            printf("\n");
        }
    }
    return 0;
}
