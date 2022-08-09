/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.node;

import sarapatel.analysis.*;

@SuppressWarnings("nls")
public final class AArrayArrayDeclarator extends PArrayDeclarator
{
    private PArrayDeclarator _arrayDeclarator_;
    private TLBracket _lBracket_;
    private TIntegerConstant _integerConstant_;
    private TRBracket _rBracket_;

    public AArrayArrayDeclarator()
    {
        // Constructor
    }

    public AArrayArrayDeclarator(
        @SuppressWarnings("hiding") PArrayDeclarator _arrayDeclarator_,
        @SuppressWarnings("hiding") TLBracket _lBracket_,
        @SuppressWarnings("hiding") TIntegerConstant _integerConstant_,
        @SuppressWarnings("hiding") TRBracket _rBracket_)
    {
        // Constructor
        setArrayDeclarator(_arrayDeclarator_);

        setLBracket(_lBracket_);

        setIntegerConstant(_integerConstant_);

        setRBracket(_rBracket_);

    }

    @Override
    public Object clone()
    {
        return new AArrayArrayDeclarator(
            cloneNode(this._arrayDeclarator_),
            cloneNode(this._lBracket_),
            cloneNode(this._integerConstant_),
            cloneNode(this._rBracket_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAArrayArrayDeclarator(this);
    }

    public PArrayDeclarator getArrayDeclarator()
    {
        return this._arrayDeclarator_;
    }

    public void setArrayDeclarator(PArrayDeclarator node)
    {
        if(this._arrayDeclarator_ != null)
        {
            this._arrayDeclarator_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._arrayDeclarator_ = node;
    }

    public TLBracket getLBracket()
    {
        return this._lBracket_;
    }

    public void setLBracket(TLBracket node)
    {
        if(this._lBracket_ != null)
        {
            this._lBracket_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lBracket_ = node;
    }

    public TIntegerConstant getIntegerConstant()
    {
        return this._integerConstant_;
    }

    public void setIntegerConstant(TIntegerConstant node)
    {
        if(this._integerConstant_ != null)
        {
            this._integerConstant_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._integerConstant_ = node;
    }

    public TRBracket getRBracket()
    {
        return this._rBracket_;
    }

    public void setRBracket(TRBracket node)
    {
        if(this._rBracket_ != null)
        {
            this._rBracket_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rBracket_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._arrayDeclarator_)
            + toString(this._lBracket_)
            + toString(this._integerConstant_)
            + toString(this._rBracket_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._arrayDeclarator_ == child)
        {
            this._arrayDeclarator_ = null;
            return;
        }

        if(this._lBracket_ == child)
        {
            this._lBracket_ = null;
            return;
        }

        if(this._integerConstant_ == child)
        {
            this._integerConstant_ = null;
            return;
        }

        if(this._rBracket_ == child)
        {
            this._rBracket_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._arrayDeclarator_ == oldChild)
        {
            setArrayDeclarator((PArrayDeclarator) newChild);
            return;
        }

        if(this._lBracket_ == oldChild)
        {
            setLBracket((TLBracket) newChild);
            return;
        }

        if(this._integerConstant_ == oldChild)
        {
            setIntegerConstant((TIntegerConstant) newChild);
            return;
        }

        if(this._rBracket_ == oldChild)
        {
            setRBracket((TRBracket) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}