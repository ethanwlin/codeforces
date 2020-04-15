#include <bits/stdc++.h>
using namespace std;

int main ()
{
	int numWords;
	cin >> numWords;
	for(int i=0; i < numWords; i++){
		string str;
		cin >> str;
		
		if( str.length() > 10){
			cout << str.at(0) << str.length()-2 << str.at(str.length()-1) << "\n";
		}else{
			cout << str << "\n";
		}
	}
}