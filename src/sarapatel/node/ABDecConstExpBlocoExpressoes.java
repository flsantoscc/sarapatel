/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.node;

import java.util.*;
import sarapatel.analysis.*;

@SuppressWarnings("nls")
public final class ABDecConstExpBlocoExpressoes extends PBlocoExpressoes
{
    private final LinkedList<PDecConst> _decConst_ = new LinkedList<PDecConst>();
    private PExp _exp_;

    public ABDecConstExpBlocoExpressoes()
    {
        // Constructor
    }

    public ABDecConstExpBlocoExpressoes(
        @SuppressWarnings("hiding") List<?> _decConst_,
        @SuppressWarnings("hiding") PExp _exp_)
    {
        // Constructor
        setDecConst(_decConst_);

        setExp(_exp_);

    }

    @Override
    public Object clone()
    {
        return new ABDecConstExpBlocoExpressoes(
            cloneList(this._decConst_),
            cloneNode(this._exp_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseABDecConstExpBlocoExpressoes(this);
    }

    public LinkedList<PDecConst> getDecConst()
    {
        return this._decConst_;
    }

    public void setDecConst(List<?> list)
    {
        for(PDecConst e : this._decConst_)
        {
            e.parent(null);
        }
        this._decConst_.clear();

        for(Object obj_e : list)
        {
            PDecConst e = (PDecConst) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._decConst_.add(e);
        }
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

    @Override
    public String toString()
    {
        return ""
            + toString(this._decConst_)
            + toString(this._exp_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._decConst_.remove(child))
        {
            return;
        }

        if(this._exp_ == child)
        {
            this._exp_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        for(ListIterator<PDecConst> i = this._decConst_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PDecConst) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        if(this._exp_ == oldChild)
        {
            setExp((PExp) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}