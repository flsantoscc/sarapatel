/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.node;

import sarapatel.analysis.*;

@SuppressWarnings("nls")
public final class TStringKeyword extends Token
{
    public TStringKeyword()
    {
        super.setText("cadeia");
    }

    public TStringKeyword(int line, int pos)
    {
        super.setText("cadeia");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TStringKeyword(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTStringKeyword(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TStringKeyword text.");
    }
}