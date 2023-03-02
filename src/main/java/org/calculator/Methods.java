package org.calculator;

public class Methods extends Calculator
{
    protected void calculateadd(int a)
    {
        setValue(getvalue()+a);
    }
    protected void  calculatesub(int a)
    {
        setValue(getvalue()-a);
    }
    protected void calculatemul(int a)
    {
        setValue(getvalue()*a);
    }
    protected void calculatediv(int a)
    {
        setValue(getvalue()/a);
    }
}