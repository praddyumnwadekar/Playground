#include<iostream>
using namespace std;
int main()
{
  int count = 1, num = 0,series = 0;
  
  cin>>num;
  
  for(int i = 1; i <= num; i++)
  {
  	cout<< (i * i) - count<<" ";
    if(count == 1)
      count += 1;
    else
      count -= 1;
  }
  //Type your code here.
}