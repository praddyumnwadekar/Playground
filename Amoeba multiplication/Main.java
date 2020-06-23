#include<iostream>
using namespace std;
int main()
{
  int i = 1,count = 0,month_count = 0,a = -1,b = 1,sum = 0;
  cin>>month_count;
 	
  while(i <= month_count)
  {
  	sum = a + b;
    a = b;
    b = sum;
    count++;
    i++;
  }
  
  cout<<sum;
  //Type your code here.
}