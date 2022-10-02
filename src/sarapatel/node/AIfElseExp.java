/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.node;

import sarapatel.analysis.*;

@SuppressWarnings("nls")
public final class AIfElseExp extends PExp
{
    private TSe _se_;
    private TLPar _lPar_;
    private PExp _condition_;
    private TRPar _rPar_;
    private PExp _exp1_;
    private TSenao _senao_;
    private PExp _exp2_;

    public AIfElseExp()
    {
        // Constructor
    }

    public AIfElseExp(
        @SuppressWarnings("hiding") TSe _se_,
        @SuppressWarnings("hiding") TLPar _lPar_,
        @SuppressWarnings("hiding") PExp _condition_,
        @SuppressWarnings("hiding") TRPar _rPar_,
        @SuppressWarnings("hiding") PExp _exp1_,
        @SuppressWarnings("hiding") TSenao _senao_,
        @SuppressWarnings("hiding") PExp _exp2_)
    {
        // Constructor
        setSe(_se_);

        setLPar(_lPar_);

        setCondition(_condition_);

        setRPar(_rPar_);

        setExp1(_exp1_);

        setSenao(_senao_);

        setExp2(_exp2_);

    }

    @Override
    public Object clone()
    {
        return new AIfElseExp(
            cloneNode(this._se_),
            cloneNode(this._lPar_),
            cloneNode(this._condition_),
            cloneNode(this._rPar_),
            cloneNode(this._exp1_),
            cloneNode(this._senao_),
            cloneNode(this._exp2_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAIfElseExp(this);
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

    public PExp getCondition()
    {
        return this._condition_;
    }

    public void setCondition(PExp node)
    {
        if(this._condition_ != null)
        {
            this._condition_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._condition_ = node;
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

    public PExp getExp1()
    {
        return this._exp1_;
    }

    public void setExp1(PExp node)
    {
        if(this._exp1_ != null)
        {
            this._exp1_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exp1_ = node;
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

    public PExp getExp2()
    {
        return this._exp2_;
    }

    public void setExp2(PExp node)
    {
        if(this._exp2_ != null)
        {
            this._exp2_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exp2_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._se_)
            + toString(this._lPar_)
            + toString(this._condition_)
            + toString(this._rPar_)
            + toString(this._exp1_)
            + toString(this._senao_)
            + toString(this._exp2_);
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

        if(this._condition_ == child)
        {
            this._condition_ = null;
            return;
        }

        if(this._rPar_ == child)
        {
            this._rPar_ = null;
            return;
        }

        if(this._exp1_ == child)
        {
            this._exp1_ = null;
            return;
        }

        if(this._senao_ == child)
        {
            this._senao_ = null;
            return;
        }

        if(this._exp2_ == child)
        {
            this._exp2_ = null;
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

        if(this._condition_ == oldChild)
        {
            setCondition((PExp) newChild);
            return;
        }

        if(this._rPar_ == oldChild)
        {
            setRPar((TRPar) newChild);
            return;
        }

        if(this._exp1_ == oldChild)
        {
            setExp1((PExp) newChild);
            return;
        }

        if(this._senao_ == oldChild)
        {
            setSenao((TSenao) newChild);
            return;
        }

        if(this._exp2_ == oldChild)
        {
            setExp2((PExp) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}