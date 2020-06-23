#include<iostream>
using namespace std;
int main()
{
  	int x,y,z,l,s_l,min,f = 0,c;
  	cin>>x>>y>>z;
  	
  	if(x > y && x > z)
    { 
      l = x;
  	  f = 1;
    }   
  	else if(y > z)
     { 
      l = x;
  	  f = 2;
    }
  	else
     { 
      l = x;
  	  f = 3;
    }
  	if(f == 1)
      if( l > y && y > z)
        s_l = y;
  	  else
        s_l = z;
  	if(f == 2)
      if( l > x && x > z)
        s_l = x;
  	  else
        s_l = z;
  	if(f == 3)
      if( l > x && x > y)
        s_l = x;
  	  else
        s_l = y;
  
  	if(x  < y && x < z)
      min = x;
  	else if(y < z)
      min = y;
  	else
      min = z;	
      
   if(s_l % min == 0)
        c = min;
   else if(s_l % min == 0)
        c = min;
   else if(s_l % min == 0)
        c = min;
	else 
      	c = 1;
  	
  
  	cout<<"The treasure is in box which has number "<<s_l<<endl;
  	cout<<"The code to open the box is "<<c<<endl;
  //Type your code here.
}