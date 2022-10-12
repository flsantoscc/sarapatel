/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.node;

import sarapatel.analysis.*;

@SuppressWarnings("nls")
public final class ARealLiteral extends PLiteral
{
    private TFloatingConstant _floatingConstant_;

    public ARealLiteral()
    {
        // Constructor
    }

    public ARealLiteral(
        @SuppressWarnings("hiding") TFloatingConstant _floatingConstant_)
    {
        // Constructor
        setFloatingConstant(_floatingConstant_);

    }

    @Override
    public Object clone()
    {
        return new ARealLiteral(
            cloneNode(this._floatingConstant_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseARealLiteral(this);
    }

    public TFloatingConstant getFloatingConstant()
    {
        return this._floatingConstant_;
    }

    public void setFloatingConstant(TFloatingConstant node)
    {
        if(this._floatingConstant_ != null)
        {
            this._floatingConstant_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._floatingConstant_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._floatingConstant_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._floatingConstant_ == child)
        {
            this._floatingConstant_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._floatingConstant_ == oldChild)
        {
            setFloatingConstant((TFloatingConstant) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
