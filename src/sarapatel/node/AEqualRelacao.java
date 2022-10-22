/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.node;

import sarapatel.analysis.*;

@SuppressWarnings("nls")
public final class AEqualRelacao extends PRelacao
{
    private PRelacao _relacao_;
    private TEqual _equal_;
    private PAdicao _adicao_;

    public AEqualRelacao()
    {
        // Constructor
    }

    public AEqualRelacao(
        @SuppressWarnings("hiding") PRelacao _relacao_,
        @SuppressWarnings("hiding") TEqual _equal_,
        @SuppressWarnings("hiding") PAdicao _adicao_)
    {
        // Constructor
        setRelacao(_relacao_);

        setEqual(_equal_);

        setAdicao(_adicao_);

    }

    @Override
    public Object clone()
    {
        return new AEqualRelacao(
            cloneNode(this._relacao_),
            cloneNode(this._equal_),
            cloneNode(this._adicao_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAEqualRelacao(this);
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

    public TEqual getEqual()
    {
        return this._equal_;
    }

    public void setEqual(TEqual node)
    {
        if(this._equal_ != null)
        {
            this._equal_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._equal_ = node;
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
            + toString(this._equal_)
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

        if(this._equal_ == child)
        {
            this._equal_ = null;
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

        if(this._equal_ == oldChild)
        {
            setEqual((TEqual) newChild);
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