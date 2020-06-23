#include<iostream>
using namespace std;
int main()
{
  int sum_mn,sum_hours,sun_hours=0,m_hours=0,t_hours=0,w_hours= 0,thu_hours=0,fri_hours=0,sat_hours=0,sun_mn=0,m_mn=0,t_mn=0,w_mn=0,thu_mn=0,fri_mn=0,sat_mn=0;
  
  cin>>sun_hours>>m_hours>>t_hours>>w_hours>>thu_hours>>fri_hours>>sat_hours;
  sum_mn = 0;
  sum_hours = 0;
  sum_hours = sun_hours + m_hours + t_hours + w_hours + thu_hours + fri_hours + sat_hours;
  
  sun_mn += sun_hours*100;
  sun_mn += ((sun_hours * 100) * 0.5);
  
  sat_mn += sat_hours*100;
  sat_mn += (sat_hours* 100) * 0.25;	
  
  m_mn = m_hours * 100;
  t_mn = t_hours * 100;
  w_mn = w_hours * 100;
  thu_mn = thu_hours * 100;
  fri_mn = fri_hours * 100;
  
  if(m_hours > 8)
  {
    m_mn = m_hours * 100;
  	m_mn += (m_hours - 8) * 15;
  }
  
   
  
  if(t_hours > 8)
  {
    t_mn = t_hours * 100;
  	t_mn += (t_hours - 8) * 15;
  }
  if(w_hours > 8)
  {
    w_mn = w_hours * 100;
  	w_mn += (w_hours - 8) * 15;
  }
  	 
  if(thu_hours > 8)
  {
    thu_mn = thu_hours * 100;
  	thu_mn += (thu_hours - 8) * 15;
  }
    
  if(fri_hours > 8)
  {
	fri_mn = fri_hours * 100;
    fri_mn += (fri_hours - 8) * 15;
  }
	
  
  
 if(sum_hours > 40)
  {
    sum_mn += (sum_hours - 40) * 25;
  }
  
  sum_mn =  sun_mn + m_mn + t_mn + w_mn + thu_mn + fri_mn + sat_mn;
  //cout<<sum_hours;
  cout<<sum_mn;
  
  

  //Type your code here.
}