/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.node;

import sarapatel.analysis.*;

@SuppressWarnings("nls")
public final class AGreaterEqRelacao extends PRelacao
{
    private PRelacao _relacao_;
    private TGreaterEq _greaterEq_;
    private PAdicao _adicao_;

    public AGreaterEqRelacao()
    {
        // Constructor
    }

    public AGreaterEqRelacao(
        @SuppressWarnings("hiding") PRelacao _relacao_,
        @SuppressWarnings("hiding") TGreaterEq _greaterEq_,
        @SuppressWarnings("hiding") PAdicao _adicao_)
    {
        // Constructor
        setRelacao(_relacao_);

        setGreaterEq(_greaterEq_);

        setAdicao(_adicao_);

    }

    @Override
    public Object clone()
    {
        return new AGreaterEqRelacao(
            cloneNode(this._relacao_),
            cloneNode(this._greaterEq_),
            cloneNode(this._adicao_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAGreaterEqRelacao(this);
    }

    public PRelacao getRelacao()
    {
        return this._relacao_;
    }

    public void setRelacao(PRelacao node)
    {
        if(this._relacao_ != null)
        {
            this._relacao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._relacao_ = node;
    }

    public TGreaterEq getGreaterEq()
    {
        return this._greaterEq_;
    }

    public void setGreaterEq(TGreaterEq node)
    {
        if(this._greaterEq_ != null)
        {
            this._greaterEq_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._greaterEq_ = node;
    }

    public PAdicao getAdicao()
    {
        return this._adicao_;
    }

    public void setAdicao(PAdicao node)
    {
        if(this._adicao_ != null)
        {
            this._adicao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._adicao_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._relacao_)
            + toString(this._greaterEq_)
            + toString(this._adicao_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._relacao_ == child)
        {
            this._relacao_ = null;
            return;
        }

        if(this._greaterEq_ == child)
        {
            this._greaterEq_ = null;
            return;
        }

        if(this._adicao_ == child)
        {
            this._adicao_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._relacao_ == oldChild)
        {
            setRelacao((PRelacao) newChild);
            return;
        }

        if(this._greaterEq_ == oldChild)
        {
            setGreaterEq((TGreaterEq) newChild);
            return;
        }

        if(this._adicao_ == oldChild)
        {
            setAdicao((PAdicao) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}