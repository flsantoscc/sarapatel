/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.node;

import sarapatel.analysis.*;

@SuppressWarnings("nls")
public final class ASeSenaoComando extends PComando
{
    private PExp _exp_;
    private PComandoAux _comandoAux_;
    private PComando _comando_;

    public ASeSenaoComando()
    {
        // Constructor
    }

    public ASeSenaoComando(
        @SuppressWarnings("hiding") PExp _exp_,
        @SuppressWarnings("hiding") PComandoAux _comandoAux_,
        @SuppressWarnings("hiding") PComando _comando_)
    {
        // Constructor
        setExp(_exp_);

        setComandoAux(_comandoAux_);

        setComando(_comando_);

    }

    @Override
    public Object clone()
    {
        return new ASeSenaoComando(
            cloneNode(this._exp_),
            cloneNode(this._comandoAux_),
            cloneNode(this._comando_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASeSenaoComando(this);
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

    public PComandoAux getComandoAux()
    {
        return this._comandoAux_;
    }

    public void setComandoAux(PComandoAux node)
    {
        if(this._comandoAux_ != null)
        {
            this._comandoAux_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._comandoAux_ = node;
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

    @Override
    public String toString()
    {
        return ""
            + toString(this._exp_)
            + toString(this._comandoAux_)
            + toString(this._comando_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._exp_ == child)
        {
            this._exp_ = null;
            return;
        }

        if(this._comandoAux_ == child)
        {
            this._comandoAux_ = null;
            return;
        }

        if(this._comando_ == child)
        {
            this._comando_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._exp_ == oldChild)
        {
            setExp((PExp) newChild);
            return;
        }

        if(this._comandoAux_ == oldChild)
        {
            setComandoAux((PComandoAux) newChild);
            return;
        }

        if(this._comando_ == oldChild)
        {
            setComando((PComando) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}