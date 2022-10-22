/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.node;

import java.util.*;
import sarapatel.analysis.*;

@SuppressWarnings("nls")
public final class ABlocoComandoAux extends PComandoAux
{
    private final LinkedList<PSubBloco> _subBloco_ = new LinkedList<PSubBloco>();
    private final LinkedList<PComando> _comando_ = new LinkedList<PComando>();

    public ABlocoComandoAux()
    {
        // Constructor
    }

    public ABlocoComandoAux(
        @SuppressWarnings("hiding") List<?> _subBloco_,
        @SuppressWarnings("hiding") List<?> _comando_)
    {
        // Constructor
        setSubBloco(_subBloco_);

        setComando(_comando_);

    }

    @Override
    public Object clone()
    {
        return new ABlocoComandoAux(
            cloneList(this._subBloco_),
            cloneList(this._comando_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseABlocoComandoAux(this);
    }

    public LinkedList<PSubBloco> getSubBloco()
    {
        return this._subBloco_;
    }

    public void setSubBloco(List<?> list)
    {
        for(PSubBloco e : this._subBloco_)
        {
            e.parent(null);
        }
        this._subBloco_.clear();

        for(Object obj_e : list)
        {
            PSubBloco e = (PSubBloco) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._subBloco_.add(e);
        }
    }

    public LinkedList<PComando> getComando()
    {
        return this._comando_;
    }

    public void setComando(List<?> list)
    {
        for(PComando e : this._comando_)
        {
            e.parent(null);
        }
        this._comando_.clear();

        for(Object obj_e : list)
        {
            PComando e = (PComando) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._comando_.add(e);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._subBloco_)
            + toString(this._comando_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._subBloco_.remove(child))
        {
            return;
        }

        if(this._comando_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        for(ListIterator<PSubBloco> i = this._subBloco_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PSubBloco) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        for(ListIterator<PComando> i = this._comando_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PComando) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        throw new RuntimeException("Not a child.");
    }
}
