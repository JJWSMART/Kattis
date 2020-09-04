#include <cstdio>
#include <vector>
#include <deque>
#include <iostream>

using namespace std;
const int MAX_N = 110;

char st[MAX_N];
int n;
vector<char> num, op; //num & operation
deque<char> ret;

int main(){
    while (scanf("%s", st), st[0] != '0'){
        num.clear();
        op.clear();
        ret.clear();
        n = 0;
        for (int i = 0; st[i]; ++ i){
            if(st[i] >= 'a'){ num.push_back(st[i]);}
            else if( st[i] == 'N'){++n; }
            else{ op.push_back(st[i]); }
        }
        if(num.empty()){
            cout << "no WFF possible"<< endl;
            continue;
        }
        ret.push_front(num[0]);
        while(n--) ret.push_front('N');
        for(int i = 1, j = 0; i < num.size() && j < op.size();){
            ret.push_front(num[i++]);
            ret.push_front(op[j++]);
        }
        
        for (int i = 0; i < ret.size(); ++ i){
            cout << ret[i] << endl;
        }
//        for(int i = 0; i < ret.size(); ++ i){
//            pushchar(ret[i]);
//        }
        puts("");
    }
    return 0;
}
