/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.analysis;

import sarapatel.node.*;

public interface Analysis extends Switch
{
    Object getIn(Node node);
    void setIn(Node node, Object o);
    Object getOut(Node node);
    void setOut(Node node, Object o);

    void caseStart(Start node);
    void caseABooleanTypeSpecifier(ABooleanTypeSpecifier node);
    void caseAIntegerTypeSpecifier(AIntegerTypeSpecifier node);
    void caseAFloatTypeSpecifier(AFloatTypeSpecifier node);
    void caseAStringTypeSpecifier(AStringTypeSpecifier node);
    void caseAIntegerSpecifier(AIntegerSpecifier node);
    void caseABooleanSpecifier(ABooleanSpecifier node);
    void caseAStringSpecifier(AStringSpecifier node);
    void caseAFloatSpecifier(AFloatSpecifier node);
    void caseAIdentifierArrayDeclarator(AIdentifierArrayDeclarator node);
    void caseAArrayArrayDeclarator(AArrayArrayDeclarator node);
    void caseAArrayDeclaration(AArrayDeclaration node);

    void caseTDigit(TDigit node);
    void caseTLetter(TLetter node);
    void caseTDot(TDot node);
    void caseTComma(TComma node);
    void caseTColon(TColon node);
    void caseTSemicolon(TSemicolon node);
    void caseTLPar(TLPar node);
    void caseTRPar(TRPar node);
    void caseTLBracket(TLBracket node);
    void caseTRBracket(TRBracket node);
    void caseTLBrace(TLBrace node);
    void caseTRBrace(TRBrace node);
    void caseTStar(TStar node);
    void caseTDiv(TDiv node);
    void caseTMod(TMod node);
    void caseTPlus(TPlus node);
    void caseTMinus(TMinus node);
    void caseTAttr(TAttr node);
    void caseTE(TE node);
    void caseTOu(TOu node);
    void caseTNao(TNao node);
    void caseTGreater(TGreater node);
    void caseTGreaterOrEqual(TGreaterOrEqual node);
    void caseTSe(TSe node);
    void caseTSenao(TSenao node);
    void caseTFuncao(TFuncao node);
    void caseTProcedimento(TProcedimento node);
    void caseTEnquanto(TEnquanto node);
    void caseTComece(TComece node);
    void caseTTermine(TTermine node);
    void caseTVar(TVar node);
    void caseTConst(TConst node);
    void caseTImprima(TImprima node);
    void caseTLeia(TLeia node);
    void caseTSize(TSize node);
    void caseTTInteiro(TTInteiro node);
    void caseTTReal(TTReal node);
    void caseTTCadeia(TTCadeia node);
    void caseTTBooleano(TTBooleano node);
    void caseTIdentifier(TIdentifier node);
    void caseTFloatingConstant(TFloatingConstant node);
    void caseTIntegerConstant(TIntegerConstant node);
    void caseTCadeiaConstant(TCadeiaConstant node);
    void caseTBooleanConstant(TBooleanConstant node);
    void caseTEol(TEol node);
    void caseTBlank(TBlank node);
    void caseTComment(TComment node);
    void caseEOF(EOF node);
    void caseInvalidToken(InvalidToken node);
}
