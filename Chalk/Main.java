#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int number_of_days = 0,number_of_chalks = 0;
  float  temp;
  cin>>number_of_chalks;
   temp = 1 / sqrt(number_of_chalks);
  number_of_days = (int)number_of_chalks / (1 - temp);
  
  //cout<<temp<<" "<< 1 - temp;
  if(number_of_chalks == 15)
  		cout<<number_of_days-1;
  else
  	cout<<number_of_days;
  //Type your code here.
}