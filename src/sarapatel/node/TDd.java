/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.node;

import sarapatel.analysis.*;

@SuppressWarnings("nls")
public final class TDd extends Token
{
    public TDd()
    {
        super.setText("<<");
    }

    public TDd(int line, int pos)
    {
        super.setText("<<");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TDd(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTDd(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TDd text.");
    }
}
