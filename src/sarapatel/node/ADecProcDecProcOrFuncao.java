/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.node;

import sarapatel.analysis.*;

@SuppressWarnings("nls")
public final class ADecProcDecProcOrFuncao extends PDecProcOrFuncao
{
    private PDecProcedimento _decProcedimento_;

    public ADecProcDecProcOrFuncao()
    {
        // Constructor
    }

    public ADecProcDecProcOrFuncao(
        @SuppressWarnings("hiding") PDecProcedimento _decProcedimento_)
    {
        // Constructor
        setDecProcedimento(_decProcedimento_);

    }

    @Override
    public Object clone()
    {
        return new ADecProcDecProcOrFuncao(
            cloneNode(this._decProcedimento_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADecProcDecProcOrFuncao(this);
    }

    public PDecProcedimento getDecProcedimento()
    {
        return this._decProcedimento_;
    }

    public void setDecProcedimento(PDecProcedimento node)
    {
        if(this._decProcedimento_ != null)
        {
            this._decProcedimento_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._decProcedimento_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._decProcedimento_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._decProcedimento_ == child)
        {
            this._decProcedimento_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._decProcedimento_ == oldChild)
        {
            setDecProcedimento((PDecProcedimento) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
