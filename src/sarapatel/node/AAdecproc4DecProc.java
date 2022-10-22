/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.node;

import java.util.*;
import sarapatel.analysis.*;

@SuppressWarnings("nls")
public final class AAdecproc4DecProc extends PDecProc
{
    private TId _id_;
    private final LinkedList<PParametro> _parametro_ = new LinkedList<PParametro>();
    private PComando _comando_;

    public AAdecproc4DecProc()
    {
        // Constructor
    }

    public AAdecproc4DecProc(
        @SuppressWarnings("hiding") TId _id_,
        @SuppressWarnings("hiding") List<?> _parametro_,
        @SuppressWarnings("hiding") PComando _comando_)
    {
        // Constructor
        setId(_id_);

        setParametro(_parametro_);

        setComando(_comando_);

    }

    @Override
    public Object clone()
    {
        return new AAdecproc4DecProc(
            cloneNode(this._id_),
            cloneList(this._parametro_),
            cloneNode(this._comando_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAdecproc4DecProc(this);
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

    public LinkedList<PParametro> getParametro()
    {
        return this._parametro_;
    }

    public void setParametro(List<?> list)
    {
        for(PParametro e : this._parametro_)
        {
            e.parent(null);
        }
        this._parametro_.clear();

        for(Object obj_e : list)
        {
            PParametro e = (PParametro) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._parametro_.add(e);
        }
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
            + toString(this._id_)
            + toString(this._parametro_)
            + toString(this._comando_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._id_ == child)
        {
            this._id_ = null;
            return;
        }

        if(this._parametro_.remove(child))
        {
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
        if(this._id_ == oldChild)
        {
            setId((TId) newChild);
            return;
        }

        for(ListIterator<PParametro> i = this._parametro_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PParametro) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        if(this._comando_ == oldChild)
        {
            setComando((PComando) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
