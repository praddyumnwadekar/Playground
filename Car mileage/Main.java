#include<iostream>
using namespace std;
int main()
{
  float milege;
  int liters_of_petrol,distance;
  
  cin>>milege>>liters_of_petrol>>distance;
  
  if((milege * liters_of_petrol) >= distance)
    cout<<"Can reach";
  else
    cout<<"Cannot reach";
  //Type your code here.
}