Logarithm approach is correct but it could fail because we cannot calculate log n base 2 directly in java. We have to use the change of base formula  
log<sub>2</sub>(x) = log<sub>e</sub>(x) / log<sub>e</sub>(2)


```
class Solution 
{
    public boolean isPowerOfTwo(int n) 
    {
        if(n <= 0)
            return false;
        double x = Math.log(n)/Math.log(2);
        return x == Math.floor(x);
        
    }
}
```
This approach can fail because it relies on floating-point computations (double) and floating-point math is not exact.
Math.log() returns an approximation, so even if the real answer should be an integer (like log₂(2²⁹) = 29), the computed value may be 29 ± tiny error such as 28.999999999999996.
Then an equality check like x == floor(x) fails because floating point values almost never match exactly
