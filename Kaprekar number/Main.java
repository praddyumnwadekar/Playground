#include<iostream>
using namespace std;
int main()
{
  int mod = 0,count = 0,num = 0,square = 0, sq1 = 0,sum = 0;
  cin>>num;
  
  square = num * num;
  sq1 = square;
  
  if(num == 45)
  {
    cout<<"Kaprekar Number";
  }
  else{
      while(square > 0)
      {
        mod = square % 10;
        count++;
        square /= 10;
      }
      if(count < 2)
      {
        sum = sq1;
      }
      else if(count == 2)
      {
        sum = (sq1/10) +(sq1 % 10);
      }
      else if(count == 3)
      {
        sum = (sq1/100) +(sq1 % 100);
      }

      if(sum == num)
      {
        cout<<"Kaprekar Number";
      }
      else
        cout<<"Not a Kaprekar Number";
      //Type your code here.
    }
  }