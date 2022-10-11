/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.node;

import sarapatel.analysis.*;

@SuppressWarnings("nls")
public final class AIfElseConditional extends PConditional
{
    private TSe _se_;
    private TLPar _lPar_;
    private PExp _exp_;
    private TRPar _rPar_;
    private PConditionalAux _conditionalAux_;
    private TSenao _senao_;
    private PConditional _conditional_;

    public AIfElseConditional()
    {
        // Constructor
    }

    public AIfElseConditional(
        @SuppressWarnings("hiding") TSe _se_,
        @SuppressWarnings("hiding") TLPar _lPar_,
        @SuppressWarnings("hiding") PExp _exp_,
        @SuppressWarnings("hiding") TRPar _rPar_,
        @SuppressWarnings("hiding") PConditionalAux _conditionalAux_,
        @SuppressWarnings("hiding") TSenao _senao_,
        @SuppressWarnings("hiding") PConditional _conditional_)
    {
        // Constructor
        setSe(_se_);

        setLPar(_lPar_);

        setExp(_exp_);

        setRPar(_rPar_);

        setConditionalAux(_conditionalAux_);

        setSenao(_senao_);

        setConditional(_conditional_);

    }

    @Override
    public Object clone()
    {
        return new AIfElseConditional(
            cloneNode(this._se_),
            cloneNode(this._lPar_),
            cloneNode(this._exp_),
            cloneNode(this._rPar_),
            cloneNode(this._conditionalAux_),
            cloneNode(this._senao_),
            cloneNode(this._conditional_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAIfElseConditional(this);
    }

    public TSe getSe()
    {
        return this._se_;
    }

    public void setSe(TSe node)
    {
        if(this._se_ != null)
        {
            this._se_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._se_ = node;
    }

    public TLPar getLPar()
    {
        return this._lPar_;
    }

    public void setLPar(TLPar node)
    {
        if(this._lPar_ != null)
        {
            this._lPar_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lPar_ = node;
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

    public TRPar getRPar()
    {
        return this._rPar_;
    }

    public void setRPar(TRPar node)
    {
        if(this._rPar_ != null)
        {
            this._rPar_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rPar_ = node;
    }

    public PConditionalAux getConditionalAux()
    {
        return this._conditionalAux_;
    }

    public void setConditionalAux(PConditionalAux node)
    {
        if(this._conditionalAux_ != null)
        {
            this._conditionalAux_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._conditionalAux_ = node;
    }

    public TSenao getSenao()
    {
        return this._senao_;
    }

    public void setSenao(TSenao node)
    {
        if(this._senao_ != null)
        {
            this._senao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._senao_ = node;
    }

    public PConditional getConditional()
    {
        return this._conditional_;
    }

    public void setConditional(PConditional node)
    {
        if(this._conditional_ != null)
        {
            this._conditional_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._conditional_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._se_)
            + toString(this._lPar_)
            + toString(this._exp_)
            + toString(this._rPar_)
            + toString(this._conditionalAux_)
            + toString(this._senao_)
            + toString(this._conditional_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._se_ == child)
        {
            this._se_ = null;
            return;
        }

        if(this._lPar_ == child)
        {
            this._lPar_ = null;
            return;
        }

        if(this._exp_ == child)
        {
            this._exp_ = null;
            return;
        }

        if(this._rPar_ == child)
        {
            this._rPar_ = null;
            return;
        }

        if(this._conditionalAux_ == child)
        {
            this._conditionalAux_ = null;
            return;
        }

        if(this._senao_ == child)
        {
            this._senao_ = null;
            return;
        }

        if(this._conditional_ == child)
        {
            this._conditional_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._se_ == oldChild)
        {
            setSe((TSe) newChild);
            return;
        }

        if(this._lPar_ == oldChild)
        {
            setLPar((TLPar) newChild);
            return;
        }

        if(this._exp_ == oldChild)
        {
            setExp((PExp) newChild);
            return;
        }

        if(this._rPar_ == oldChild)
        {
            setRPar((TRPar) newChild);
            return;
        }

        if(this._conditionalAux_ == oldChild)
        {
            setConditionalAux((PConditionalAux) newChild);
            return;
        }

        if(this._senao_ == oldChild)
        {
            setSenao((TSenao) newChild);
            return;
        }

        if(this._conditional_ == oldChild)
        {
            setConditional((PConditional) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
