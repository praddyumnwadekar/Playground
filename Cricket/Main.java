#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main()
{
  float c6,trr,crr;
  int o,tb,tr,cr,cb,t,p;
  cin>>tb>>tr>>cr>>cb;
  //Type your code here.
  o = tb / 6;
  t = cb / 6;
  p = cb % 6;
  c6 = ((float)t + (float)p/10);
  crr = cr / c6;
  trr = (float)tr / o;
  
  cout<<o<<"\n"<<fixed<<setprecision(1)<<c6<<"\n"<<crr<<"\n"<<trr<<"\n";
  if( crr > trr)
    cout<<"Eligible to Win";
  else
    cout<<"Not Eligible to Win";
}