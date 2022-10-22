/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.node;

import sarapatel.analysis.*;

@SuppressWarnings("nls")
public final class ADecVarDecVar extends PDecVar
{
    private PTipo _tipo_;
    private TId _id_;
    private PIdAtribuicao _idAtribuicao_;

    public ADecVarDecVar()
    {
        // Constructor
    }

    public ADecVarDecVar(
        @SuppressWarnings("hiding") PTipo _tipo_,
        @SuppressWarnings("hiding") TId _id_,
        @SuppressWarnings("hiding") PIdAtribuicao _idAtribuicao_)
    {
        // Constructor
        setTipo(_tipo_);

        setId(_id_);

        setIdAtribuicao(_idAtribuicao_);

    }

    @Override
    public Object clone()
    {
        return new ADecVarDecVar(
            cloneNode(this._tipo_),
            cloneNode(this._id_),
            cloneNode(this._idAtribuicao_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADecVarDecVar(this);
    }

    public PTipo getTipo()
    {
        return this._tipo_;
    }

    public void setTipo(PTipo node)
    {
        if(this._tipo_ != null)
        {
            this._tipo_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tipo_ = node;
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

    public PIdAtribuicao getIdAtribuicao()
    {
        return this._idAtribuicao_;
    }

    public void setIdAtribuicao(PIdAtribuicao node)
    {
        if(this._idAtribuicao_ != null)
        {
            this._idAtribuicao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._idAtribuicao_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._tipo_)
            + toString(this._id_)
            + toString(this._idAtribuicao_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._tipo_ == child)
        {
            this._tipo_ = null;
            return;
        }

        if(this._id_ == child)
        {
            this._id_ = null;
            return;
        }

        if(this._idAtribuicao_ == child)
        {
            this._idAtribuicao_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._tipo_ == oldChild)
        {
            setTipo((PTipo) newChild);
            return;
        }

        if(this._id_ == oldChild)
        {
            setId((TId) newChild);
            return;
        }

        if(this._idAtribuicao_ == oldChild)
        {
            setIdAtribuicao((PIdAtribuicao) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
