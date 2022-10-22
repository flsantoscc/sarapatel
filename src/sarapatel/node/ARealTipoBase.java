/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.node;

import sarapatel.analysis.*;

@SuppressWarnings("nls")
public final class ARealTipoBase extends PTipoBase
{
    private TFloatKw _floatKw_;

    public ARealTipoBase()
    {
        // Constructor
    }

    public ARealTipoBase(
        @SuppressWarnings("hiding") TFloatKw _floatKw_)
    {
        // Constructor
        setFloatKw(_floatKw_);

    }

    @Override
    public Object clone()
    {
        return new ARealTipoBase(
            cloneNode(this._floatKw_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseARealTipoBase(this);
    }

    public TFloatKw getFloatKw()
    {
        return this._floatKw_;
    }

    public void setFloatKw(TFloatKw node)
    {
        if(this._floatKw_ != null)
        {
            this._floatKw_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._floatKw_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._floatKw_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._floatKw_ == child)
        {
            this._floatKw_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._floatKw_ == oldChild)
        {
            setFloatKw((TFloatKw) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}