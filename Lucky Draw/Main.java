#include<iostream>
#include<cmath>
using namespace std;

int main(){
	int num = 0,count = 0,m = 0;
  	cin>>num;
  	m = num / 2;
  for(int i = 1; i <= num ;i++)
  {
  	if(num % i == 0)
    {
      count++;
    }
  }	
	if(count == 2)
  			cout<<"Eligible"<<endl;
  	else
      	cout<<"Not eligible"<<endl;
}