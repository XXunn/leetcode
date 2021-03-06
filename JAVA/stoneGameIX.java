package leetcode;

public class stoneGameIX {
    public boolean stoneGameIX(int[] stones) {
        // mod[0] - 余数为0的个数， mod[1] - 余数为1的个数， mod[2] - 余数为2的个数
        int[] mod = new int[3];
        for(int stone : stones) {
            mod[stone%3]++;
        }
        if((mod[0]&1) == 0) {   // 若为奇数
            // 一个0相当于交换次序, 每两个0相当于没用, 所以0 只有 0个和 1个的区别
            // 没0的时候，只要1，2大于零，Alice都可以取少的那个，让Bob无法选择
            // 比如如果 1 少些, 开始Alice取 1,然后Bob只能取 1,然后Alice 2, Bob 1, 如下循环
            // 1 (1, 2, 1, 2...) ?
            // 此时 1 没有了, Bob只能选 2(满3了), Alice赢
            // 相反如果 2 少一些, Alice可以先取 2 , 让 Bob 取 1
            if(mod[1] > 0 && mod[2] > 0) {
                return true;
            }
        } else {
            // 有0时, 假设1比2多, Alice最开始取 1
            // 1 (1 2 1 2...) | (2取完了, 这右边只可能有1(当然也可能没有1!), 外加一个0, 并且Bob从该位开始取)
            // - 如果右边没有1, Bob取0, Alice输                                             --> 1 比 2 只多了 1 个 (多了最左边的那一个1)
            // - 如果右边有1个和1一个0, Bob取0或1, Alice再取到最后一个数(Alice取完了), Alice输 --> 1 比 2 只多了两个 (左边最开始一个1,加上后面的一个1)
            // 如果右边有 >= 两个 1, 和 1个0   : 注意: 被取之和能被3整除的条件 大于 全部被取完的条件
            // * 若Bob取了1, Alice只能取0, Bob最终只能取1, Alice赢(Bob满3了)                --> 1 比 2 至少多了三个 (首一个1,尾两个1)
            // * 若Bob取了0, Alice只能取1, Bob最终还是只能取1, Alice赢(Bob满3了)            --> 1 比 2 至少多了三个 (首一个1, 尾两个1)
            // ----------------------------------------- //
            // 有0时, 假设1比2多, 为什么 Alice最开始不能取 2 ??? 假设Alice最开始取 2
            // 2 (2, 1, 2, 1...) | (这边只有 1(一定有1!) 和 0, Bob从此处先取)
            // Bob取0, Alice只能取1, Alice输掉(Alice满3了)
            // 同理可证2比1多的情况
            // ----------------------------------------- //
            // 综上: 当有0时, 2比1多三个或以上, 或者 1比2多三个或以上, 就能保证Alice赢
            if(Math.abs(mod[1] - mod[2]) >= 3) {
                return true;
            }
        }
        return false;
    }
}

