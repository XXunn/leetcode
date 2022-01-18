#include <bits/stdc++.h>

using namespace std;

struct TreeNode {
    int val;
    TreeNode *left;
    TreeNode *right;
    TreeNode(int x) : val(x), left(NULL), right(NULL) {}
};

class Solution {
public:
    const int NO_CAMERA = 0;    // 该点没被监控
    const int HAS_CAMERA = 1;   // 该点有一个监控
    const int NONEED = 2;       // 该点无监控，但是被子节点监控
    int ans = 0;
    int countCamera(TreeNode* node) {
        // node为空
        if(node == NULL)    return NONEED;
        // 左边和右边的值
        int l = countCamera(node->left),r = countCamera(node->right);
        //如果左右子节点有一个是NO_CAMERA，表示的是子节点既没相机，也没相机覆盖它，
        //所以当前节点需要有一个相机
        if(l == NO_CAMERA || r == NO_CAMERA) {
            ans++;
            return HAS_CAMERA;
        }
        //如果左右子节点只要有一个有相机，那么当前节点就不需要相机了，否则返回一个没有相机的标记
        return (l == HAS_CAMERA || r == HAS_CAMERA ? NONEED : NO_CAMERA);
    }
    int minCameraCover(TreeNode* root) {
        if(root == NULL)    return 0;
        if(countCamera(root) == NO_CAMERA)  ans++;
        return ans;
    }
};

int main()
{
    
    return 0;
}
