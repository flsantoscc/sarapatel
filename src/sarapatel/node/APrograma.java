/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.node;

import java.util.*;
import sarapatel.analysis.*;

@SuppressWarnings("nls")
public final class APrograma extends PPrograma
{
    private final LinkedList<PDecVarOrDecConst> _decVarOrDecConst_ = new LinkedList<PDecVarOrDecConst>();
    private final LinkedList<PDecProcOrDecFunc> _decProcOrDecFunc_ = new LinkedList<PDecProcOrDecFunc>();

    public APrograma()
    {
        // Constructor
    }

    public APrograma(
        @SuppressWarnings("hiding") List<?> _decVarOrDecConst_,
        @SuppressWarnings("hiding") List<?> _decProcOrDecFunc_)
    {
        // Constructor
        setDecVarOrDecConst(_decVarOrDecConst_);

        setDecProcOrDecFunc(_decProcOrDecFunc_);

    }

    @Override
    public Object clone()
    {
        return new APrograma(
            cloneList(this._decVarOrDecConst_),
            cloneList(this._decProcOrDecFunc_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAPrograma(this);
    }

    public LinkedList<PDecVarOrDecConst> getDecVarOrDecConst()
    {
        return this._decVarOrDecConst_;
    }

    public void setDecVarOrDecConst(List<?> list)
    {
        for(PDecVarOrDecConst e : this._decVarOrDecConst_)
        {
            e.parent(null);
        }
        this._decVarOrDecConst_.clear();

        for(Object obj_e : list)
        {
            PDecVarOrDecConst e = (PDecVarOrDecConst) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._decVarOrDecConst_.add(e);
        }
    }

    public LinkedList<PDecProcOrDecFunc> getDecProcOrDecFunc()
    {
        return this._decProcOrDecFunc_;
    }

    public void setDecProcOrDecFunc(List<?> list)
    {
        for(PDecProcOrDecFunc e : this._decProcOrDecFunc_)
        {
            e.parent(null);
        }
        this._decProcOrDecFunc_.clear();

        for(Object obj_e : list)
        {
            PDecProcOrDecFunc e = (PDecProcOrDecFunc) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._decProcOrDecFunc_.add(e);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._decVarOrDecConst_)
            + toString(this._decProcOrDecFunc_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._decVarOrDecConst_.remove(child))
        {
            return;
        }

        if(this._decProcOrDecFunc_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        for(ListIterator<PDecVarOrDecConst> i = this._decVarOrDecConst_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PDecVarOrDecConst) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        for(ListIterator<PDecProcOrDecFunc> i = this._decProcOrDecFunc_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PDecProcOrDecFunc) newChild);
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
