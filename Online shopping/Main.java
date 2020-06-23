#include<iostream>
using namespace std;
int main()
{
  int amt_flip,dis_flip,shipping_flip,amt_snap,dis_snap,shipping_snap,amt_amz,dis_amz,shipping_amz;
  int x;
  cin>>amt_flip>>dis_flip>>shipping_flip>>amt_snap>>dis_snap>>shipping_snap>>amt_amz>>dis_amz>>shipping_amz;
  int total_price_flip = (amt_flip - (amt_flip*dis_flip/100)) + shipping_flip;
  int total_price_snap = (amt_snap - (amt_snap*dis_snap/100)) + shipping_snap;
  int total_price_amz = (amt_amz - (amt_amz * dis_amz/100)) + shipping_amz;
  cout<<"In Flipkart Rs."<<total_price_flip<<endl;
  cout<<"In Snapdeal Rs."<<total_price_snap<<endl;
  cout<<"In Amazon Rs."<<total_price_amz<<endl;
 
   if(total_price_flip <= total_price_snap && total_price_flip < total_price_amz)
    	cout<<"He will prefer Flipkart";
  else if(total_price_snap < total_price_amz)  
    	cout<<"He will prefer Snapdeal";
  else
    cout<<"He will prefer Amazon";	
  //Type your code here.
}