/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.node;

import sarapatel.analysis.*;

@SuppressWarnings("nls")
public final class ADecProcDecProcOrDecFunc extends PDecProcOrDecFunc
{
    private PDecProc _decProc_;

    public ADecProcDecProcOrDecFunc()
    {
        // Constructor
    }

    public ADecProcDecProcOrDecFunc(
        @SuppressWarnings("hiding") PDecProc _decProc_)
    {
        // Constructor
        setDecProc(_decProc_);

    }

    @Override
    public Object clone()
    {
        return new ADecProcDecProcOrDecFunc(
            cloneNode(this._decProc_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADecProcDecProcOrDecFunc(this);
    }

    public PDecProc getDecProc()
    {
        return this._decProc_;
    }

    public void setDecProc(PDecProc node)
    {
        if(this._decProc_ != null)
        {
            this._decProc_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._decProc_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._decProc_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._decProc_ == child)
        {
            this._decProc_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._decProc_ == oldChild)
        {
            setDecProc((PDecProc) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
