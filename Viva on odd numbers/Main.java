#include<iostream>
using namespace std;
int main()
{
  int i = 0,num = 0;
  float score = 0.0;
  
  while(i < 3)
  {
    cin>>num;
    
    if(num < 0)
    {
      score -= 1;
      break;
    }
    else if(num % 2 == 0)
    {
      score -= 0.5;
    }
    else if(num % 2 != 0)
    {
      score++;
      i++;
    }
    
  }
  cout<<score<<endl;	
	
  
  //Type your code here.
}