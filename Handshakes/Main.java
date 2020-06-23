#include<iostream>
using namespace std;
int main()
{
  int students_number,sum = 0;
  cin>>students_number;
  
  for(int i = 1; i <= students_number;i++)
  {
   	for(int j = students_number - 1; j >=1 ;j--)
      ++sum;
  }
  cout<<sum/2;
  //Type your code here.
}