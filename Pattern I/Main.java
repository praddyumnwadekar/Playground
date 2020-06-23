#include<iostream>
using namespace std;

int main(){
	int num = 0;
    cin>>num;
  
  	for(int i = 1; i<= 4;i++)
    {
    	for(int j = 1 ; j <= i; j++)
          cout<<num;
      num++;
      cout<<"\n";
    }
	num--;
   for(int i = 1; i<= 4;i++)
    {
    	for(int j = 4 ; j >=i ; j--)
          cout<<num;
      num--;
      cout<<"\n";
    }
}