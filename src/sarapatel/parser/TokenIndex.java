/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.parser;

import sarapatel.node.*;
import sarapatel.analysis.*;

class TokenIndex extends AnalysisAdapter
{
    int index;

    @Override
    public void caseTDigit(@SuppressWarnings("unused") TDigit node)
    {
        this.index = 0;
    }

    @Override
    public void caseTDot(@SuppressWarnings("unused") TDot node)
    {
        this.index = 1;
    }

    @Override
    public void caseTComma(@SuppressWarnings("unused") TComma node)
    {
        this.index = 2;
    }

    @Override
    public void caseTColon(@SuppressWarnings("unused") TColon node)
    {
        this.index = 3;
    }

    @Override
    public void caseTSemicolon(@SuppressWarnings("unused") TSemicolon node)
    {
        this.index = 4;
    }

    @Override
    public void caseTLPar(@SuppressWarnings("unused") TLPar node)
    {
        this.index = 5;
    }

    @Override
    public void caseTRPar(@SuppressWarnings("unused") TRPar node)
    {
        this.index = 6;
    }

    @Override
    public void caseTLBracket(@SuppressWarnings("unused") TLBracket node)
    {
        this.index = 7;
    }

    @Override
    public void caseTRBracket(@SuppressWarnings("unused") TRBracket node)
    {
        this.index = 8;
    }

    @Override
    public void caseTStar(@SuppressWarnings("unused") TStar node)
    {
        this.index = 9;
    }

    @Override
    public void caseTDiv(@SuppressWarnings("unused") TDiv node)
    {
        this.index = 10;
    }

    @Override
    public void caseTMod(@SuppressWarnings("unused") TMod node)
    {
        this.index = 11;
    }

    @Override
    public void caseTPlus(@SuppressWarnings("unused") TPlus node)
    {
        this.index = 12;
    }

    @Override
    public void caseTMinus(@SuppressWarnings("unused") TMinus node)
    {
        this.index = 13;
    }

    @Override
    public void caseTPipe(@SuppressWarnings("unused") TPipe node)
    {
        this.index = 14;
    }

    @Override
    public void caseTMainInit(@SuppressWarnings("unused") TMainInit node)
    {
        this.index = 15;
    }

    @Override
    public void caseTAttr(@SuppressWarnings("unused") TAttr node)
    {
        this.index = 16;
    }

    @Override
    public void caseTE(@SuppressWarnings("unused") TE node)
    {
        this.index = 17;
    }

    @Override
    public void caseTOu(@SuppressWarnings("unused") TOu node)
    {
        this.index = 18;
    }

    @Override
    public void caseTNao(@SuppressWarnings("unused") TNao node)
    {
        this.index = 19;
    }

    @Override
    public void caseTGreater(@SuppressWarnings("unused") TGreater node)
    {
        this.index = 20;
    }

    @Override
    public void caseTGreaterOrEqual(@SuppressWarnings("unused") TGreaterOrEqual node)
    {
        this.index = 21;
    }

    @Override
    public void caseTEqual(@SuppressWarnings("unused") TEqual node)
    {
        this.index = 22;
    }

    @Override
    public void caseTSe(@SuppressWarnings("unused") TSe node)
    {
        this.index = 23;
    }

    @Override
    public void caseTSenao(@SuppressWarnings("unused") TSenao node)
    {
        this.index = 24;
    }

    @Override
    public void caseTFuncao(@SuppressWarnings("unused") TFuncao node)
    {
        this.index = 25;
    }

    @Override
    public void caseTProcedimento(@SuppressWarnings("unused") TProcedimento node)
    {
        this.index = 26;
    }

    @Override
    public void caseTEnquanto(@SuppressWarnings("unused") TEnquanto node)
    {
        this.index = 27;
    }

    @Override
    public void caseTComece(@SuppressWarnings("unused") TComece node)
    {
        this.index = 28;
    }

    @Override
    public void caseTTermine(@SuppressWarnings("unused") TTermine node)
    {
        this.index = 29;
    }

    @Override
    public void caseTVar(@SuppressWarnings("unused") TVar node)
    {
        this.index = 30;
    }

    @Override
    public void caseTConst(@SuppressWarnings("unused") TConst node)
    {
        this.index = 31;
    }

    @Override
    public void caseTImprima(@SuppressWarnings("unused") TImprima node)
    {
        this.index = 32;
    }

    @Override
    public void caseTLeia(@SuppressWarnings("unused") TLeia node)
    {
        this.index = 33;
    }

    @Override
    public void caseTSize(@SuppressWarnings("unused") TSize node)
    {
        this.index = 34;
    }

    @Override
    public void caseTTInteiro(@SuppressWarnings("unused") TTInteiro node)
    {
        this.index = 35;
    }

    @Override
    public void caseTTReal(@SuppressWarnings("unused") TTReal node)
    {
        this.index = 36;
    }

    @Override
    public void caseTTCadeia(@SuppressWarnings("unused") TTCadeia node)
    {
        this.index = 37;
    }

    @Override
    public void caseTTBooleano(@SuppressWarnings("unused") TTBooleano node)
    {
        this.index = 38;
    }

    @Override
    public void caseTFloatingConstant(@SuppressWarnings("unused") TFloatingConstant node)
    {
        this.index = 39;
    }

    @Override
    public void caseTIntegerConstant(@SuppressWarnings("unused") TIntegerConstant node)
    {
        this.index = 40;
    }

    @Override
    public void caseTCadeiaConstant(@SuppressWarnings("unused") TCadeiaConstant node)
    {
        this.index = 41;
    }

    @Override
    public void caseTBooleanConstantTrue(@SuppressWarnings("unused") TBooleanConstantTrue node)
    {
        this.index = 42;
    }

    @Override
    public void caseTBooleanConstantFalse(@SuppressWarnings("unused") TBooleanConstantFalse node)
    {
        this.index = 43;
    }

    @Override
    public void caseTNegativeFloatingConstant(@SuppressWarnings("unused") TNegativeFloatingConstant node)
    {
        this.index = 44;
    }

    @Override
    public void caseTNegativeIntegerConstant(@SuppressWarnings("unused") TNegativeIntegerConstant node)
    {
        this.index = 45;
    }

    @Override
    public void caseTIdentifier(@SuppressWarnings("unused") TIdentifier node)
    {
        this.index = 46;
    }

    @Override
    public void caseEOF(@SuppressWarnings("unused") EOF node)
    {
        this.index = 47;
    }
}
