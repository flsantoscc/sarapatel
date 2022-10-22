/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.node;

import sarapatel.analysis.*;

@SuppressWarnings("nls")
public final class ASeExpExp extends PExp
{
    private PExp _if_;
    private PExp _then_;
    private PExp _else_;

    public ASeExpExp()
    {
        // Constructor
    }

    public ASeExpExp(
        @SuppressWarnings("hiding") PExp _if_,
        @SuppressWarnings("hiding") PExp _then_,
        @SuppressWarnings("hiding") PExp _else_)
    {
        // Constructor
        setIf(_if_);

        setThen(_then_);

        setElse(_else_);

    }

    @Override
    public Object clone()
    {
        return new ASeExpExp(
            cloneNode(this._if_),
            cloneNode(this._then_),
            cloneNode(this._else_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASeExpExp(this);
    }

    public PExp getIf()
    {
        return this._if_;
    }

    public void setIf(PExp node)
    {
        if(this._if_ != null)
        {
            this._if_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._if_ = node;
    }

    public PExp getThen()
    {
        return this._then_;
    }

    public void setThen(PExp node)
    {
        if(this._then_ != null)
        {
            this._then_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._then_ = node;
    }

    public PExp getElse()
    {
        return this._else_;
    }

    public void setElse(PExp node)
    {
        if(this._else_ != null)
        {
            this._else_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._else_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._if_)
            + toString(this._then_)
            + toString(this._else_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._if_ == child)
        {
            this._if_ = null;
            return;
        }

        if(this._then_ == child)
        {
            this._then_ = null;
            return;
        }

        if(this._else_ == child)
        {
            this._else_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._if_ == oldChild)
        {
            setIf((PExp) newChild);
            return;
        }

        if(this._then_ == oldChild)
        {
            setThen((PExp) newChild);
            return;
        }

        if(this._else_ == oldChild)
        {
            setElse((PExp) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
