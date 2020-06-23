#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  char door[10];
  int rail;
  
  cin>>door;
  cin>>rail;
  
  if((strcmp(door,"front") == 0))
     if(rail == 1)
    	cout<<"Left Handed";
  	else
  		cout<<"Right Handed";
  else 
    if(rail == 1)	
  		cout<<"Right Handed";
  else
    cout<<"Left Handed";
  //Type your code here.
}