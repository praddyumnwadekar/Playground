#include<iostream>
using namespace std;
int main()
{
  int target = 0, score = 0, sum = 0, count = 0;
  cin>>target;
  //Type your code here.
  
  while(sum < target )
  {
    cin>>score;
    sum  += score;
    count++;
  }
  cout<<"The number of turns is "<<count<<"\n";
}
