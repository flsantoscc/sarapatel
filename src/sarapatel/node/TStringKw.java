/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.node;

import sarapatel.analysis.*;

@SuppressWarnings("nls")
public final class TStringKw extends Token
{
    public TStringKw()
    {
        super.setText("cadeia");
    }

    public TStringKw(int line, int pos)
    {
        super.setText("cadeia");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TStringKw(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTStringKw(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TStringKw text.");
    }
}
