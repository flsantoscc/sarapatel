/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.node;

import sarapatel.analysis.*;

@SuppressWarnings("nls")
public final class AGreaterExp extends PExp
{
    private PExp _exp_;
    private TGreater _greater_;
    private PNumber _number_;

    public AGreaterExp()
    {
        // Constructor
    }

    public AGreaterExp(
        @SuppressWarnings("hiding") PExp _exp_,
        @SuppressWarnings("hiding") TGreater _greater_,
        @SuppressWarnings("hiding") PNumber _number_)
    {
        // Constructor
        setExp(_exp_);

        setGreater(_greater_);

        setNumber(_number_);

    }

    @Override
    public Object clone()
    {
        return new AGreaterExp(
            cloneNode(this._exp_),
            cloneNode(this._greater_),
            cloneNode(this._number_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAGreaterExp(this);
    }

    public PExp getExp()
    {
        return this._exp_;
    }

    public void setExp(PExp node)
    {
        if(this._exp_ != null)
        {
            this._exp_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exp_ = node;
    }

    public TGreater getGreater()
    {
        return this._greater_;
    }

    public void setGreater(TGreater node)
    {
        if(this._greater_ != null)
        {
            this._greater_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._greater_ = node;
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
            + toString(this._exp_)
            + toString(this._greater_)
            + toString(this._number_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._exp_ == child)
        {
            this._exp_ = null;
            return;
        }

        if(this._greater_ == child)
        {
            this._greater_ = null;
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
        if(this._exp_ == oldChild)
        {
            setExp((PExp) newChild);
            return;
        }

        if(this._greater_ == oldChild)
        {
            setGreater((TGreater) newChild);
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