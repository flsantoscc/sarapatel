/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.node;

import sarapatel.analysis.*;

@SuppressWarnings("nls")
public final class ADividitiveExpExp extends PExp
{
    private PDividitiveExp _dividitiveExp_;

    public ADividitiveExpExp()
    {
        // Constructor
    }

    public ADividitiveExpExp(
        @SuppressWarnings("hiding") PDividitiveExp _dividitiveExp_)
    {
        // Constructor
        setDividitiveExp(_dividitiveExp_);

    }

    @Override
    public Object clone()
    {
        return new ADividitiveExpExp(
            cloneNode(this._dividitiveExp_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADividitiveExpExp(this);
    }

    public PDividitiveExp getDividitiveExp()
    {
        return this._dividitiveExp_;
    }

    public void setDividitiveExp(PDividitiveExp node)
    {
        if(this._dividitiveExp_ != null)
        {
            this._dividitiveExp_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._dividitiveExp_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._dividitiveExp_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._dividitiveExp_ == child)
        {
            this._dividitiveExp_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._dividitiveExp_ == oldChild)
        {
            setDividitiveExp((PDividitiveExp) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
