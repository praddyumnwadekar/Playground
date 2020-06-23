#include<iostream>
using namespace std;
int main()
{
  int number_of_items;
  float single_item_time,l,b;
  cin>>number_of_items>>single_item_time;
  l = number_of_items * single_item_time;
  b = single_item_time * 0.5;
  if(number_of_items > 3)
    	cout<<"Number of items is more";
  		//exit();
    if(number_of_items <= 2)
      	 cout<<l-b;
  	else if(number_of_items == 3)
      	cout<<single_item_time * 2;
  
  //cout<<single_item_time;
  //Type your code here.
}