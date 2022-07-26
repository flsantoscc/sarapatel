/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.node;

import sarapatel.analysis.*;

@SuppressWarnings("nls")
public final class AArrayCompExp extends PExp
{
    private PArrayComp _arrayComp_;

    public AArrayCompExp()
    {
        // Constructor
    }

    public AArrayCompExp(
        @SuppressWarnings("hiding") PArrayComp _arrayComp_)
    {
        // Constructor
        setArrayComp(_arrayComp_);

    }

    @Override
    public Object clone()
    {
        return new AArrayCompExp(
            cloneNode(this._arrayComp_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAArrayCompExp(this);
    }

    public PArrayComp getArrayComp()
    {
        return this._arrayComp_;
    }

    public void setArrayComp(PArrayComp node)
    {
        if(this._arrayComp_ != null)
        {
            this._arrayComp_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._arrayComp_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._arrayComp_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._arrayComp_ == child)
        {
            this._arrayComp_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._arrayComp_ == oldChild)
        {
            setArrayComp((PArrayComp) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
