/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.node;

import sarapatel.analysis.*;

@SuppressWarnings("nls")
public final class AListaExpListaExp extends PListaExp
{
    private PListaExpAux _listaExpAux_;

    public AListaExpListaExp()
    {
        // Constructor
    }

    public AListaExpListaExp(
        @SuppressWarnings("hiding") PListaExpAux _listaExpAux_)
    {
        // Constructor
        setListaExpAux(_listaExpAux_);

    }

    @Override
    public Object clone()
    {
        return new AListaExpListaExp(
            cloneNode(this._listaExpAux_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAListaExpListaExp(this);
    }

    public PListaExpAux getListaExpAux()
    {
        return this._listaExpAux_;
    }

    public void setListaExpAux(PListaExpAux node)
    {
        if(this._listaExpAux_ != null)
        {
            this._listaExpAux_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._listaExpAux_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._listaExpAux_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._listaExpAux_ == child)
        {
            this._listaExpAux_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._listaExpAux_ == oldChild)
        {
            setListaExpAux((PListaExpAux) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
