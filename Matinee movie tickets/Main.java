#include<iostream>
using namespace std;
int main()
{
  int age;
  float show_time,a= 10.15,b = 13.30,c = 18.00,d = 22.00;
  cin>>age>>show_time;
    if(age >= 13 && show_time == b || show_time == c)
      cout<<"$5.00";
  	else if(age>=13 && show_time == a || show_time == d)
      cout<<"$8.00";
  	else if(age < 13 && show_time == b || show_time == c)
      cout<<"$2.00";
   else if(age < 13 && show_time == a || show_time == d)
      cout<<"$4.00";
  //Type your code here.
}