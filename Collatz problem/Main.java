#include<iostream>
using namespace std;
int main()
{
  int num = 0,count = 0;
  cin>>num;
  
  while(num > 1)
  {
    if(num % 2 == 0)
    {
      cout<<num<<endl;
      num /= 2;
      count++;
    }
    else
    {
	   cout<<num<<endl;
       num = (3 * num) + 1;
       count++;
    }
  }
  cout<<"1"<<endl;
  cout<<count;
  //Type your code here.
}