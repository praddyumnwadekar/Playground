#include<iostream>
using namespace std;
int main(){
  int num = 0,fact = 1;
  cin>>num;
  
  for(int i = num; i >= 1; i--)
    fact =(fact * i);
  // Type your code here
  cout<<fact;
}