#include<iostream>
using namespace std;
int main()
{
  int birth_year,current_year,age;
  cin>>birth_year>>current_year;
  if(birth_year > current_year)
  { 
  //  cout<<"HIIII";
    birth_year += 1900;
    current_year = current_year + 2000;
    cout<< current_year - birth_year;
   // birth_year += 2000;
  } 
  else{
    birth_year += 2000;
    current_year = current_year + 2000;
    cout<< current_year - birth_year;
  }
  //Type your code heree
}