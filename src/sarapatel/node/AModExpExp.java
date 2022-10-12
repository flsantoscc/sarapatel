/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.node;

import sarapatel.analysis.*;

@SuppressWarnings("nls")
public final class AModExpExp extends PExp
{
    private PModExp _modExp_;
    private PNumber _number_;

    public AModExpExp()
    {
        // Constructor
    }

    public AModExpExp(
        @SuppressWarnings("hiding") PModExp _modExp_,
        @SuppressWarnings("hiding") PNumber _number_)
    {
        // Constructor
        setModExp(_modExp_);

        setNumber(_number_);

    }

    @Override
    public Object clone()
    {
        return new AModExpExp(
            cloneNode(this._modExp_),
            cloneNode(this._number_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAModExpExp(this);
    }

    public PModExp getModExp()
    {
        return this._modExp_;
    }

    public void setModExp(PModExp node)
    {
        if(this._modExp_ != null)
        {
            this._modExp_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._modExp_ = node;
    }

    public PNumber getNumber()
    {
        return this._number_;
    }

    public void setNumber(PNumber node)
    {
        if(this._number_ != null)
        {
            this._number_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._number_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._modExp_)
            + toString(this._number_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._modExp_ == child)
        {
            this._modExp_ = null;
            return;
        }

        if(this._number_ == child)
        {
            this._number_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._modExp_ == oldChild)
        {
            setModExp((PModExp) newChild);
            return;
        }

        if(this._number_ == oldChild)
        {
            setNumber((PNumber) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}