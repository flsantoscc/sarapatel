/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.node;

import sarapatel.analysis.*;

@SuppressWarnings("nls")
public final class ABooleanSpecifier extends PBooleanSpecifier
{
    private TTBooleano _tBooleano_;

    public ABooleanSpecifier()
    {
        // Constructor
    }

    public ABooleanSpecifier(
        @SuppressWarnings("hiding") TTBooleano _tBooleano_)
    {
        // Constructor
        setTBooleano(_tBooleano_);

    }

    @Override
    public Object clone()
    {
        return new ABooleanSpecifier(
            cloneNode(this._tBooleano_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseABooleanSpecifier(this);
    }

    public TTBooleano getTBooleano()
    {
        return this._tBooleano_;
    }

    public void setTBooleano(TTBooleano node)
    {
        if(this._tBooleano_ != null)
        {
            this._tBooleano_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tBooleano_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._tBooleano_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._tBooleano_ == child)
        {
            this._tBooleano_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._tBooleano_ == oldChild)
        {
            setTBooleano((TTBooleano) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}