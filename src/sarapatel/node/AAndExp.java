/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.node;

import sarapatel.analysis.*;

@SuppressWarnings("nls")
public final class AAndExp extends PExp
{
    private PExp _exp_;
    private TE _e_;
    private PBooleanExp _booleanExp_;

    public AAndExp()
    {
        // Constructor
    }

    public AAndExp(
        @SuppressWarnings("hiding") PExp _exp_,
        @SuppressWarnings("hiding") TE _e_,
        @SuppressWarnings("hiding") PBooleanExp _booleanExp_)
    {
        // Constructor
        setExp(_exp_);

        setE(_e_);

        setBooleanExp(_booleanExp_);

    }

    @Override
    public Object clone()
    {
        return new AAndExp(
            cloneNode(this._exp_),
            cloneNode(this._e_),
            cloneNode(this._booleanExp_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAndExp(this);
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

    public TE getE()
    {
        return this._e_;
    }

    public void setE(TE node)
    {
        if(this._e_ != null)
        {
            this._e_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._e_ = node;
    }

    public PBooleanExp getBooleanExp()
    {
        return this._booleanExp_;
    }

    public void setBooleanExp(PBooleanExp node)
    {
        if(this._booleanExp_ != null)
        {
            this._booleanExp_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._booleanExp_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._exp_)
            + toString(this._e_)
            + toString(this._booleanExp_);
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

        if(this._e_ == child)
        {
            this._e_ = null;
            return;
        }

        if(this._booleanExp_ == child)
        {
            this._booleanExp_ = null;
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

        if(this._e_ == oldChild)
        {
            setE((TE) newChild);
            return;
        }

        if(this._booleanExp_ == oldChild)
        {
            setBooleanExp((PBooleanExp) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}