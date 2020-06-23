#include<iostream>
using namespace std;
int main()
{
  int num = 0,mod = 0,sum = 0,tmp = 0;
  cin>>num;
  tmp = num;
  while(num > 0)
  {
    mod = num % 10;
    sum += mod;
    num = num / 10;
  }
  if(tmp % sum == 0)
    cout<<"Harshad Number";
  else
    cout<<"Not Harshad Number";
  //Type your code here.
}