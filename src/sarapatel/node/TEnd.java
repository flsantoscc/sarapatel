/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.node;

import sarapatel.analysis.*;

@SuppressWarnings("nls")
public final class TEnd extends Token
{
    public TEnd()
    {
        super.setText("termine");
    }

    public TEnd(int line, int pos)
    {
        super.setText("termine");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TEnd(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTEnd(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TEnd text.");
    }
}
