#include <bits/stdc++.h>
using namespace std;

int main (){
	int numPpl;
	int place;
	int placeScore;
	
	cin >> numPpl;
	cin >> place;
	
	place--;
	
	int scores[numPpl];
	
	for(int i=0; i < numPpl; i++){
		int score;
		cin >> score;
		scores[i] = score;
		
		if(i == place) placeScore = score;
	}
	
	int passed = 0;
	for(int score : scores){
		if(score >= placeScore && score > 0) passed++;
	}
	
	cout << passed << endl;
}