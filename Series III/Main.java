#include<iostream>
using namespace std;

int main(){
	int num = 0,series = 6;
  	cin>>num;
  
  	for(int i = 1; i <=num; i++)
    {
      cout<<series<<" ";
      series = series + (5 * i);
    }
}