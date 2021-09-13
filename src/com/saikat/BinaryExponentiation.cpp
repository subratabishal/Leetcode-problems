#include <bits/stdc++.h>
using namespace std;
double binaryExponentiation(double x, int n);
double negExp(double x, int n);
int main()
{
    cout << "Enter base number\n";
    double base;
    cin>>base;
    cout << "Enter exponent\n";
    int exponent;
    cin >> exponent;
    double ans = binaryExponentiation(base, exponent);
    cout << ans;
    return 0;
}
double binaryExponentiation(double x, int n)
{
    if(n<0)
        return negExp(x,n);
   if(n == 0)
       return 1;
   int result = binaryExponentiation(x,n/2);
   if(n&1)
       return x*(result*result*1LL);
   return result*result;
}
double negExp(double x, int n)
{
    if(n<0)
       return 1/x *(negExp(1/x,-(n+1)));
   return binaryExponentiation(x,n);
}