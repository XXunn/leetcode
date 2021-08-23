#include <iostream>
#include <string>
#include <map>
#include <sstream>
#include <fstream>
using namespace std;
// "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
// date = "20th Oct 2052"
class Solution {
public:
    map<string,string>Month;
    void init() {
        Month["Jan"] = "01";
        Month["Feb"] = "02";
        Month["Mar"] = "03";
        Month["Apr"] = "04";
        Month["May"] = "05";
        Month["Jun"] = "06";
        Month["Jul"] = "07";
        Month["Aug"] = "08";
        Month["Sep"] = "09";
        Month["Oct"] = "10";
        Month["Nov"] = "11";
        Month["Dec"] = "12";
    }
    string trans_day(string day) {
        string ans = "";
        for(int i = 0;i < day.size();i++) {
            if(day[i]>='0' && day[i]<='9')  ans += day[i];
            else    break;
        }
        if(ans.size() == 1)     ans = "0" + ans;
        return ans;
    }
    string reformatDate(string date) {
        init();
        // string day(dt[0]),month(dt[1]),year(dt[2]);
        string dt[3];
        int cnt = 0;
        istringstream ss(date);
        while(ss>>dt[cnt])  cnt++;
        // for(int i = 0;i < 3;i++)
        //     cout << dt[i] << endl;
        string ans = "";
        ans += dt[2];
        ans += "-";
        ans += Month[dt[1]];
        ans += "-";
        ans += trans_day(dt[0]);
        return ans;
    }
};

int main()
{
    Solution slt;
    cout << slt.reformatDate("20th Oct 2052") << endl;
    cout << slt.trans_day("30th");
    return 0;
}
