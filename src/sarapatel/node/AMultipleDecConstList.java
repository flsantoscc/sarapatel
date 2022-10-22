/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.node;

import sarapatel.analysis.*;

@SuppressWarnings("nls")
public final class AMultipleDecConstList extends PDecConstList
{
    private PExp _exp_;
    private PDecConst _decConst_;
    private PDecConstList _decConstList_;

    public AMultipleDecConstList()
    {
        // Constructor
    }

    public AMultipleDecConstList(
        @SuppressWarnings("hiding") PExp _exp_,
        @SuppressWarnings("hiding") PDecConst _decConst_,
        @SuppressWarnings("hiding") PDecConstList _decConstList_)
    {
        // Constructor
        setExp(_exp_);

        setDecConst(_decConst_);

        setDecConstList(_decConstList_);

    }

    @Override
    public Object clone()
    {
        return new AMultipleDecConstList(
            cloneNode(this._exp_),
            cloneNode(this._decConst_),
            cloneNode(this._decConstList_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMultipleDecConstList(this);
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

    public PDecConst getDecConst()
    {
        return this._decConst_;
    }

    public void setDecConst(PDecConst node)
    {
        if(this._decConst_ != null)
        {
            this._decConst_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._decConst_ = node;
    }

    public PDecConstList getDecConstList()
    {
        return this._decConstList_;
    }

    public void setDecConstList(PDecConstList node)
    {
        if(this._decConstList_ != null)
        {
            this._decConstList_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._decConstList_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._exp_)
            + toString(this._decConst_)
            + toString(this._decConstList_);
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

        if(this._decConst_ == child)
        {
            this._decConst_ = null;
            return;
        }

        if(this._decConstList_ == child)
        {
            this._decConstList_ = null;
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

        if(this._decConst_ == oldChild)
        {
            setDecConst((PDecConst) newChild);
            return;
        }

        if(this._decConstList_ == oldChild)
        {
            setDecConstList((PDecConstList) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
