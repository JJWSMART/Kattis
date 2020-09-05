#include<vector>
#include<iostream>
#include<string>

using namespace std;

int main() {
    string a, b;
    cin >> a >> b;
    int len_a = a.size(), len_b = b.size();
    // find the left one
    while(a[0] == b[0] && a.size() && b.size())
    {
        a.erase(0, 1);
        b.erase(0, 1);
    }
    // find the right one
    while(a[a.size() - 1] == b[b.size() - 1] && a.size() && b.size())
    {
        a.erase(a.size() - 1, 1); // delete one character from index a.size() - 1
        b.erase(b.size() - 1, 1);
    }
    // smallest string be inserted is in the middle
    cout << b.size() << endl;
}
