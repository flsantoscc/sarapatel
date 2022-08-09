/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.node;

import sarapatel.analysis.*;

@SuppressWarnings("nls")
public final class AStringSpecifier extends PStringSpecifier
{
    private TTCadeia _tCadeia_;

    public AStringSpecifier()
    {
        // Constructor
    }

    public AStringSpecifier(
        @SuppressWarnings("hiding") TTCadeia _tCadeia_)
    {
        // Constructor
        setTCadeia(_tCadeia_);

    }

    @Override
    public Object clone()
    {
        return new AStringSpecifier(
            cloneNode(this._tCadeia_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAStringSpecifier(this);
    }

    public TTCadeia getTCadeia()
    {
        return this._tCadeia_;
    }

    public void setTCadeia(TTCadeia node)
    {
        if(this._tCadeia_ != null)
        {
            this._tCadeia_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tCadeia_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._tCadeia_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._tCadeia_ == child)
        {
            this._tCadeia_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._tCadeia_ == oldChild)
        {
            setTCadeia((TTCadeia) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}