#include<iostream>
using namespace std;

int main(){
	int num = 0,series = 11;
  	cin>>num;
  	for(int i = 1; i <= num; i++)
    {
    	cout<<(series * series)<<" ";
      	series += 4;
    }

}