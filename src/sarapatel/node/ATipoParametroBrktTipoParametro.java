/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.node;

import sarapatel.analysis.*;

@SuppressWarnings("nls")
public final class ATipoParametroBrktTipoParametro extends PTipoParametro
{
    private PTipoParametro _tipoParametro_;
    private TLBracket _lBracket_;
    private TRBracket _rBracket_;

    public ATipoParametroBrktTipoParametro()
    {
        // Constructor
    }

    public ATipoParametroBrktTipoParametro(
        @SuppressWarnings("hiding") PTipoParametro _tipoParametro_,
        @SuppressWarnings("hiding") TLBracket _lBracket_,
        @SuppressWarnings("hiding") TRBracket _rBracket_)
    {
        // Constructor
        setTipoParametro(_tipoParametro_);

        setLBracket(_lBracket_);

        setRBracket(_rBracket_);

    }

    @Override
    public Object clone()
    {
        return new ATipoParametroBrktTipoParametro(
            cloneNode(this._tipoParametro_),
            cloneNode(this._lBracket_),
            cloneNode(this._rBracket_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseATipoParametroBrktTipoParametro(this);
    }

    public PTipoParametro getTipoParametro()
    {
        return this._tipoParametro_;
    }

    public void setTipoParametro(PTipoParametro node)
    {
        if(this._tipoParametro_ != null)
        {
            this._tipoParametro_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tipoParametro_ = node;
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
            + toString(this._tipoParametro_)
            + toString(this._lBracket_)
            + toString(this._rBracket_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._tipoParametro_ == child)
        {
            this._tipoParametro_ = null;
            return;
        }

        if(this._lBracket_ == child)
        {
            this._lBracket_ = null;
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
        if(this._tipoParametro_ == oldChild)
        {
            setTipoParametro((PTipoParametro) newChild);
            return;
        }

        if(this._lBracket_ == oldChild)
        {
            setLBracket((TLBracket) newChild);
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