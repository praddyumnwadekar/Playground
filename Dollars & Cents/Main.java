#include<iostream>
using namespace std;
int main()
{
  int d1,d2,c1,c2,sumd = 0,sumc = 0;
  cin>>d1>>c1>>d2>>c2;
  
  sumc = c1 + c2;
  sumd = d1 + d2;
  
  if(sumc > 100)
  	sumd += 1;
  	sumc %= 100;
  
  cout<<sumd<<endl;
  cout<<sumc;
  //Type your code here.
}