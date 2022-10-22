/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.node;

import sarapatel.analysis.*;

@SuppressWarnings("nls")
public final class AProcComandoAux extends PComandoAux
{
    private PChamadaProcedimento _chamadaProcedimento_;

    public AProcComandoAux()
    {
        // Constructor
    }

    public AProcComandoAux(
        @SuppressWarnings("hiding") PChamadaProcedimento _chamadaProcedimento_)
    {
        // Constructor
        setChamadaProcedimento(_chamadaProcedimento_);

    }

    @Override
    public Object clone()
    {
        return new AProcComandoAux(
            cloneNode(this._chamadaProcedimento_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAProcComandoAux(this);
    }

    public PChamadaProcedimento getChamadaProcedimento()
    {
        return this._chamadaProcedimento_;
    }

    public void setChamadaProcedimento(PChamadaProcedimento node)
    {
        if(this._chamadaProcedimento_ != null)
        {
            this._chamadaProcedimento_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._chamadaProcedimento_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._chamadaProcedimento_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._chamadaProcedimento_ == child)
        {
            this._chamadaProcedimento_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._chamadaProcedimento_ == oldChild)
        {
            setChamadaProcedimento((PChamadaProcedimento) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}