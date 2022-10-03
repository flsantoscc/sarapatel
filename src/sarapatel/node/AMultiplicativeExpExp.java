/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.node;

import sarapatel.analysis.*;

@SuppressWarnings("nls")
public final class AMultiplicativeExpExp extends PExp
{
    private PMultiplicativeExp _multiplicativeExp_;

    public AMultiplicativeExpExp()
    {
        // Constructor
    }

    public AMultiplicativeExpExp(
        @SuppressWarnings("hiding") PMultiplicativeExp _multiplicativeExp_)
    {
        // Constructor
        setMultiplicativeExp(_multiplicativeExp_);

    }

    @Override
    public Object clone()
    {
        return new AMultiplicativeExpExp(
            cloneNode(this._multiplicativeExp_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMultiplicativeExpExp(this);
    }

    public PMultiplicativeExp getMultiplicativeExp()
    {
        return this._multiplicativeExp_;
    }

    public void setMultiplicativeExp(PMultiplicativeExp node)
    {
        if(this._multiplicativeExp_ != null)
        {
            this._multiplicativeExp_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._multiplicativeExp_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._multiplicativeExp_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._multiplicativeExp_ == child)
        {
            this._multiplicativeExp_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._multiplicativeExp_ == oldChild)
        {
            setMultiplicativeExp((PMultiplicativeExp) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
