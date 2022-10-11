/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.node;

import sarapatel.analysis.*;

@SuppressWarnings("nls")
public final class ADecProcedimentoDecProcedimento extends PDecProcedimento
{
    private TAttr _attr_;
    private TProcedimento _procedimento_;
    private TColon _colon_;
    private TId _id_;
    private TLPar _lPar_;
    private PParametros _parametros_;
    private TRPar _rPar_;
    private TComece _comece_;
    private PComando _comando_;
    private TTermine _termine_;

    public ADecProcedimentoDecProcedimento()
    {
        // Constructor
    }

    public ADecProcedimentoDecProcedimento(
        @SuppressWarnings("hiding") TAttr _attr_,
        @SuppressWarnings("hiding") TProcedimento _procedimento_,
        @SuppressWarnings("hiding") TColon _colon_,
        @SuppressWarnings("hiding") TId _id_,
        @SuppressWarnings("hiding") TLPar _lPar_,
        @SuppressWarnings("hiding") PParametros _parametros_,
        @SuppressWarnings("hiding") TRPar _rPar_,
        @SuppressWarnings("hiding") TComece _comece_,
        @SuppressWarnings("hiding") PComando _comando_,
        @SuppressWarnings("hiding") TTermine _termine_)
    {
        // Constructor
        setAttr(_attr_);

        setProcedimento(_procedimento_);

        setColon(_colon_);

        setId(_id_);

        setLPar(_lPar_);

        setParametros(_parametros_);

        setRPar(_rPar_);

        setComece(_comece_);

        setComando(_comando_);

        setTermine(_termine_);

    }

    @Override
    public Object clone()
    {
        return new ADecProcedimentoDecProcedimento(
            cloneNode(this._attr_),
            cloneNode(this._procedimento_),
            cloneNode(this._colon_),
            cloneNode(this._id_),
            cloneNode(this._lPar_),
            cloneNode(this._parametros_),
            cloneNode(this._rPar_),
            cloneNode(this._comece_),
            cloneNode(this._comando_),
            cloneNode(this._termine_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADecProcedimentoDecProcedimento(this);
    }

    public TAttr getAttr()
    {
        return this._attr_;
    }

    public void setAttr(TAttr node)
    {
        if(this._attr_ != null)
        {
            this._attr_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._attr_ = node;
    }

    public TProcedimento getProcedimento()
    {
        return this._procedimento_;
    }

    public void setProcedimento(TProcedimento node)
    {
        if(this._procedimento_ != null)
        {
            this._procedimento_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._procedimento_ = node;
    }

    public TColon getColon()
    {
        return this._colon_;
    }

    public void setColon(TColon node)
    {
        if(this._colon_ != null)
        {
            this._colon_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._colon_ = node;
    }

    public TId getId()
    {
        return this._id_;
    }

    public void setId(TId node)
    {
        if(this._id_ != null)
        {
            this._id_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._id_ = node;
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

    public PParametros getParametros()
    {
        return this._parametros_;
    }

    public void setParametros(PParametros node)
    {
        if(this._parametros_ != null)
        {
            this._parametros_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._parametros_ = node;
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

    public TComece getComece()
    {
        return this._comece_;
    }

    public void setComece(TComece node)
    {
        if(this._comece_ != null)
        {
            this._comece_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._comece_ = node;
    }

    public PComando getComando()
    {
        return this._comando_;
    }

    public void setComando(PComando node)
    {
        if(this._comando_ != null)
        {
            this._comando_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._comando_ = node;
    }

    public TTermine getTermine()
    {
        return this._termine_;
    }

    public void setTermine(TTermine node)
    {
        if(this._termine_ != null)
        {
            this._termine_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._termine_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._attr_)
            + toString(this._procedimento_)
            + toString(this._colon_)
            + toString(this._id_)
            + toString(this._lPar_)
            + toString(this._parametros_)
            + toString(this._rPar_)
            + toString(this._comece_)
            + toString(this._comando_)
            + toString(this._termine_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._attr_ == child)
        {
            this._attr_ = null;
            return;
        }

        if(this._procedimento_ == child)
        {
            this._procedimento_ = null;
            return;
        }

        if(this._colon_ == child)
        {
            this._colon_ = null;
            return;
        }

        if(this._id_ == child)
        {
            this._id_ = null;
            return;
        }

        if(this._lPar_ == child)
        {
            this._lPar_ = null;
            return;
        }

        if(this._parametros_ == child)
        {
            this._parametros_ = null;
            return;
        }

        if(this._rPar_ == child)
        {
            this._rPar_ = null;
            return;
        }

        if(this._comece_ == child)
        {
            this._comece_ = null;
            return;
        }

        if(this._comando_ == child)
        {
            this._comando_ = null;
            return;
        }

        if(this._termine_ == child)
        {
            this._termine_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._attr_ == oldChild)
        {
            setAttr((TAttr) newChild);
            return;
        }

        if(this._procedimento_ == oldChild)
        {
            setProcedimento((TProcedimento) newChild);
            return;
        }

        if(this._colon_ == oldChild)
        {
            setColon((TColon) newChild);
            return;
        }

        if(this._id_ == oldChild)
        {
            setId((TId) newChild);
            return;
        }

        if(this._lPar_ == oldChild)
        {
            setLPar((TLPar) newChild);
            return;
        }

        if(this._parametros_ == oldChild)
        {
            setParametros((PParametros) newChild);
            return;
        }

        if(this._rPar_ == oldChild)
        {
            setRPar((TRPar) newChild);
            return;
        }

        if(this._comece_ == oldChild)
        {
            setComece((TComece) newChild);
            return;
        }

        if(this._comando_ == oldChild)
        {
            setComando((PComando) newChild);
            return;
        }

        if(this._termine_ == oldChild)
        {
            setTermine((TTermine) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
