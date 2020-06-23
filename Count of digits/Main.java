#include<iostream>
int main()
{
  int mod = 0,num = 0, count = 0;
  std::cin>>num;
  if(num > 0){
    while(num > 0 )
    {
      mod = num % 10;
      ++count;
      num =num / 10;
    }
    std::cout<<count;
  }
  else
  		std::cout<<count + 1;
  // Type your code here
}