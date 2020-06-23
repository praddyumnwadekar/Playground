#include<iostream>
using namespace std;

int main(){
	int  num = 0;
  	float sum = 0.5;
  
  cin>>num;
  for(int i = 1; i <= num; i++)
  {
      cout<<sum<<" ";
	  sum =  (sum * 3);
  }

}