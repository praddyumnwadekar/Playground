#include<iostream>
using namespace std;
int main()
{
  int units = 0,charged = 0;
  cin>>units;
  if(units <= 200)
    	charged = units*0.5;
  else if(units >200 && units <= 400)
    	charged = 100 + (units*0.65);
  else if(units >400 && units <= 600)
    	charged = 200 + (units*0.80);
  else if (units > 600)
    	charged = 425 + (units*1.25);
  cout<<"Rs."<<charged;
  //Type your code here.
}