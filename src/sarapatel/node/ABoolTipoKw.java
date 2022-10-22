/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.node;

import sarapatel.analysis.*;

@SuppressWarnings("nls")
public final class ABoolTipoKw extends PTipoKw
{
    private TBoolKw _boolKw_;

    public ABoolTipoKw()
    {
        // Constructor
    }

    public ABoolTipoKw(
        @SuppressWarnings("hiding") TBoolKw _boolKw_)
    {
        // Constructor
        setBoolKw(_boolKw_);

    }

    @Override
    public Object clone()
    {
        return new ABoolTipoKw(
            cloneNode(this._boolKw_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseABoolTipoKw(this);
    }

    public TBoolKw getBoolKw()
    {
        return this._boolKw_;
    }

    public void setBoolKw(TBoolKw node)
    {
        if(this._boolKw_ != null)
        {
            this._boolKw_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._boolKw_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._boolKw_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._boolKw_ == child)
        {
            this._boolKw_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._boolKw_ == oldChild)
        {
            setBoolKw((TBoolKw) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}