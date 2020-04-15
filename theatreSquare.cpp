#include <bits/stdc++.h>
using namespace std;

int main ()
{
    long n, m, a;

    cin >> n;
    cin >> m;
    cin >> a;

    long long nTiles = ceil( ((double)n)/a );
    long long mTiles = ceil( ((double)m)/a );
    
    cout << nTiles * mTiles;
}