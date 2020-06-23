#include<iostream>
using namespace std;

int main(){
	int perfect_num = 0,start_num = 0,end_num = 0,temp = 0;
  	cin>>start_num>>end_num;
  
  	for(int i = start_num; i <= end_num; i++)
    {
       temp = i;
       perfect_num = 0;
    	for(int j = 1; j < i; j++)
        {
         
          if(i % j == 0)
          {
           	perfect_num = perfect_num + j;
          }
          
        }
        
        if(temp == perfect_num)
        {
        	cout<<perfect_num<<" ";
        }
    }

}