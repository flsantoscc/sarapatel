/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.node;

import sarapatel.analysis.*;

@SuppressWarnings("nls")
public final class TGreaterOrEqual extends Token
{
    public TGreaterOrEqual()
    {
        super.setText(">=");
    }

    public TGreaterOrEqual(int line, int pos)
    {
        super.setText(">=");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TGreaterOrEqual(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTGreaterOrEqual(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TGreaterOrEqual text.");
    }
}
