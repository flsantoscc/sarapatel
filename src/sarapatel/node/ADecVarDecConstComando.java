/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.node;

import java.util.*;
import sarapatel.analysis.*;

@SuppressWarnings("nls")
public final class ADecVarDecConstComando extends PComando
{
    private final LinkedList<PDecVarDecConst> _decVarDecConst_ = new LinkedList<PDecVarDecConst>();
    private final LinkedList<PComando> _comando_ = new LinkedList<PComando>();

    public ADecVarDecConstComando()
    {
        // Constructor
    }

    public ADecVarDecConstComando(
        @SuppressWarnings("hiding") List<?> _decVarDecConst_,
        @SuppressWarnings("hiding") List<?> _comando_)
    {
        // Constructor
        setDecVarDecConst(_decVarDecConst_);

        setComando(_comando_);

    }

    @Override
    public Object clone()
    {
        return new ADecVarDecConstComando(
            cloneList(this._decVarDecConst_),
            cloneList(this._comando_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADecVarDecConstComando(this);
    }

    public LinkedList<PDecVarDecConst> getDecVarDecConst()
    {
        return this._decVarDecConst_;
    }

    public void setDecVarDecConst(List<?> list)
    {
        for(PDecVarDecConst e : this._decVarDecConst_)
        {
            e.parent(null);
        }
        this._decVarDecConst_.clear();

        for(Object obj_e : list)
        {
            PDecVarDecConst e = (PDecVarDecConst) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._decVarDecConst_.add(e);
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
            + toString(this._decVarDecConst_)
            + toString(this._comando_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._decVarDecConst_.remove(child))
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
        for(ListIterator<PDecVarDecConst> i = this._decVarDecConst_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PDecVarDecConst) newChild);
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