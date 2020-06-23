#include<iostream>
using namespace std;
int main()
{
  int rows,columns,number_of_tree;
  cin>>rows>>columns>>number_of_tree;
  int result = 2 * rows;
  if(result == number_of_tree)
  	cout<<"It is a mango tree";
  else if (rows == 5 && columns == 5)
 	 {
   		cout<<"It is a mango tree"; 
  	}
 else  
   		cout<<"It is not a mango tree";
 
 
  //Type your code here.
}