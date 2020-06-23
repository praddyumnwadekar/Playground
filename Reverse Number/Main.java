#include <iostream>
using namespace std;
int main() 
{
  int num = 0,mod = 0;
  
  cin>>num;
  
  while(num > 0)
  { 
    mod = num % 10;
    cout<<mod;
    num = num / 10;
  }
	return 0;
}