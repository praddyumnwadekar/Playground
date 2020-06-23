#include<iostream>
using namespace std;

int main(){
	int enc_num = 0,terror_num= 0,perfect_num = 0;
  	cin>>enc_num>>terror_num;
  	int sum = enc_num + terror_num;
  
  	for(int i = 1; i < sum; i++)
    {
      if(sum % i == 0)
        perfect_num += i;
    }
  	
  if(perfect_num == sum)
  	cout<<"They can read the message";
  else
    cout<<"They can't read the message";


}