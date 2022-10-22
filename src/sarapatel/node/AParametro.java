/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.node;

import sarapatel.analysis.*;

@SuppressWarnings("nls")
public final class AParametro extends PParametro
{
    private PTipoParam _tipoParam_;
    private TId _id_;

    public AParametro()
    {
        // Constructor
    }

    public AParametro(
        @SuppressWarnings("hiding") PTipoParam _tipoParam_,
        @SuppressWarnings("hiding") TId _id_)
    {
        // Constructor
        setTipoParam(_tipoParam_);

        setId(_id_);

    }

    @Override
    public Object clone()
    {
        return new AParametro(
            cloneNode(this._tipoParam_),
            cloneNode(this._id_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAParametro(this);
    }

    public PTipoParam getTipoParam()
    {
        return this._tipoParam_;
    }

    public void setTipoParam(PTipoParam node)
    {
        if(this._tipoParam_ != null)
        {
            this._tipoParam_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tipoParam_ = node;
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

    @Override
    public String toString()
    {
        return ""
            + toString(this._tipoParam_)
            + toString(this._id_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._tipoParam_ == child)
        {
            this._tipoParam_ = null;
            return;
        }

        if(this._id_ == child)
        {
            this._id_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._tipoParam_ == oldChild)
        {
            setTipoParam((PTipoParam) newChild);
            return;
        }

        if(this._id_ == oldChild)
        {
            setId((TId) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
