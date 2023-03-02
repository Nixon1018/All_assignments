package org.calculator;

public abstract class   Calculator
{
    protected abstract void calculateadd (int a);
    protected abstract void calculatesub (int a);
    protected abstract void calculatemul (int a);
    protected abstract void calculatediv (int a);
    private int value;
    protected int getvalue()
    {
        return this.value;
    }
    protected void setValue(int value)
    {
        this.value=value;
    }
}
