/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.node;

import sarapatel.analysis.*;

@SuppressWarnings("nls")
public final class AIntegerTypeSpecifier extends PTypeSpecifier
{
    private PIntegerSpecifier _integerSpecifier_;

    public AIntegerTypeSpecifier()
    {
        // Constructor
    }

    public AIntegerTypeSpecifier(
        @SuppressWarnings("hiding") PIntegerSpecifier _integerSpecifier_)
    {
        // Constructor
        setIntegerSpecifier(_integerSpecifier_);

    }

    @Override
    public Object clone()
    {
        return new AIntegerTypeSpecifier(
            cloneNode(this._integerSpecifier_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAIntegerTypeSpecifier(this);
    }

    public PIntegerSpecifier getIntegerSpecifier()
    {
        return this._integerSpecifier_;
    }

    public void setIntegerSpecifier(PIntegerSpecifier node)
    {
        if(this._integerSpecifier_ != null)
        {
            this._integerSpecifier_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._integerSpecifier_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._integerSpecifier_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._integerSpecifier_ == child)
        {
            this._integerSpecifier_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._integerSpecifier_ == oldChild)
        {
            setIntegerSpecifier((PIntegerSpecifier) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
