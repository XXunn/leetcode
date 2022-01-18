package leetcode;

public class countVowelPermutation {
    long a = 1, e = 1, i = 1, o = 1, u = 1;
    static final long MOD = (long)(1e9+7);
    public int countVowelPermutation(int n) {
        long _a = 0, _e = 0, _i = 0, _o = 0, _u = 0;
        while(--n > 0) {
            _a = e+i+u;
            _e = a+i;
            _i = e+o;
            _o = i;
            _u = i+o;
            a = _a;
            e = _e;
            i = _i;
            o = _o;
            u = _u;
            DoMOD();
        }
        return (int)((a+e+i+o+u)%MOD);
    }
    public void DoMOD() {
        a %= MOD;
        e %= MOD;
        i %= MOD;
        o %= MOD;
        u %= MOD;
    }
}
