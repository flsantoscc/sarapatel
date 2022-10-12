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
    void caseAProgramaPrograma(AProgramaPrograma node);
    void caseADecProcedimentoDecProcPrincipal(ADecProcedimentoDecProcPrincipal node);
    void caseADecVarDecVarOrConst(ADecVarDecVarOrConst node);
    void caseADecConstDecVarOrConst(ADecConstDecVarOrConst node);
    void caseADecProcDecProcOrFuncao(ADecProcDecProcOrFuncao node);
    void caseADecFuncaoDecProcOrFuncao(ADecFuncaoDecProcOrFuncao node);
    void caseADecVarDecVar(ADecVarDecVar node);
    void caseADecConsDecCons(ADecConsDecCons node);
    void caseAIdIdOrIdAtribuicao(AIdIdOrIdAtribuicao node);
    void caseAIdAtribuicaoIdOrIdAtribuicao(AIdAtribuicaoIdOrIdAtribuicao node);
    void caseATipoBaseTipo(ATipoBaseTipo node);
    void caseATipoBrktTipo(ATipoBrktTipo node);
    void caseAInteiroTipoBase(AInteiroTipoBase node);
    void caseABooleanoTipoBase(ABooleanoTipoBase node);
    void caseARealTipoBase(ARealTipoBase node);
    void caseACadeiaTipoBase(ACadeiaTipoBase node);
    void caseAArrayCompArrayComp(AArrayCompArrayComp node);
    void caseADecProcedimentoDecProcedimento(ADecProcedimentoDecProcedimento node);
    void caseADecFuncaoDecFuncao(ADecFuncaoDecFuncao node);
    void caseAParametrosParametros(AParametrosParametros node);
    void caseAPipeParametroClosureParametrosAux(APipeParametroClosureParametrosAux node);
    void caseAPipeParametroPipeParametro(APipeParametroPipeParametro node);
    void caseAParametroParametro(AParametroParametro node);
    void caseATipoBaseTipoParametro(ATipoBaseTipoParametro node);
    void caseATipoParametroBrktTipoParametro(ATipoParametroBrktTipoParametro node);
    void caseASeComandoComando(ASeComandoComando node);
    void caseASeSenaoComandoComando(ASeSenaoComandoComando node);
    void caseAEnquantoComando(AEnquantoComando node);
    void caseAIdAtribuicaoComando(AIdAtribuicaoComando node);
    void caseAChamadaProcComando(AChamadaProcComando node);
    void caseABlocoComandosComando(ABlocoComandosComando node);
    void caseABlocoComandosBlocoComandos(ABlocoComandosBlocoComandos node);
    void caseAIdValor(AIdValor node);
    void caseAValorBrktsValor(AValorBrktsValor node);
    void caseABlocoExpressoesBlocoExpressoes(ABlocoExpressoesBlocoExpressoes node);
    void caseAChamadaFuncaoChamadaFuncao(AChamadaFuncaoChamadaFuncao node);
    void caseAChamadaProcedimentoChamadaProcedimento(AChamadaProcedimentoChamadaProcedimento node);
    void caseAListaExpListaExp(AListaExpListaExp node);
    void caseAAuxListaExpAux(AAuxListaExpAux node);
    void caseAPipeExpPipeExp(APipeExpPipeExp node);
    void caseAIntegerNumber(AIntegerNumber node);
    void caseARealNumber(ARealNumber node);
    void caseABooleanBooleanExp(ABooleanBooleanExp node);
    void caseACadeiaCadeiaExp(ACadeiaCadeiaExp node);
    void caseAIntegerLiteral(AIntegerLiteral node);
    void caseARealLiteral(ARealLiteral node);
    void caseABooleanLiteral(ABooleanLiteral node);
    void caseACadeiaLiteral(ACadeiaLiteral node);
    void caseAMultiplicationMultiplicativeExp(AMultiplicationMultiplicativeExp node);
    void caseANumberMultiplicativeExp(ANumberMultiplicativeExp node);
    void caseADivisionDividitiveExp(ADivisionDividitiveExp node);
    void caseAModModExp(AModModExp node);
    void caseAAdditiveExpAdditiveExp(AAdditiveExpAdditiveExp node);
    void caseASubtractiveExpSubtractiveExp(ASubtractiveExpSubtractiveExp node);
    void caseABooleanExpExp(ABooleanExpExp node);
    void caseACadeiaExpExp(ACadeiaExpExp node);
    void caseAValorExp(AValorExp node);
    void caseASorroundedExpExp(ASorroundedExpExp node);
    void caseAChamadaFuncaoExp(AChamadaFuncaoExp node);
    void caseAArrayCompExp(AArrayCompExp node);
    void caseAMinusExpExp(AMinusExpExp node);
    void caseASubtractiveExpExp(ASubtractiveExpExp node);
    void caseAModExpExp(AModExpExp node);
    void caseAEqualExpExp(AEqualExpExp node);
    void caseAGreaterExp(AGreaterExp node);
    void caseAGreaterEqualExp(AGreaterEqualExp node);
    void caseANotExp(ANotExp node);
    void caseAAndExp(AAndExp node);
    void caseAOrExp(AOrExp node);
    void caseABlocoExpressoesExp(ABlocoExpressoesExp node);

    void caseTDigit(TDigit node);
    void caseTDot(TDot node);
    void caseTComma(TComma node);
    void caseTColon(TColon node);
    void caseTSemicolon(TSemicolon node);
    void caseTLPar(TLPar node);
    void caseTRPar(TRPar node);
    void caseTLBracket(TLBracket node);
    void caseTRBracket(TRBracket node);
    void caseTStar(TStar node);
    void caseTDiv(TDiv node);
    void caseTMod(TMod node);
    void caseTPlus(TPlus node);
    void caseTMinus(TMinus node);
    void caseTPipe(TPipe node);
    void caseTMainInit(TMainInit node);
    void caseTAttr(TAttr node);
    void caseTE(TE node);
    void caseTOu(TOu node);
    void caseTNao(TNao node);
    void caseTGreater(TGreater node);
    void caseTGreaterEqual(TGreaterEqual node);
    void caseTEqual(TEqual node);
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
    void caseTPrincipal(TPrincipal node);
    void caseTTInteiro(TTInteiro node);
    void caseTTReal(TTReal node);
    void caseTTCadeia(TTCadeia node);
    void caseTTBooleano(TTBooleano node);
    void caseTFloatingConstant(TFloatingConstant node);
    void caseTIntegerConstant(TIntegerConstant node);
    void caseTCadeiaConstant(TCadeiaConstant node);
    void caseTBooleanConstant(TBooleanConstant node);
    void caseTNegativeFloatingConstant(TNegativeFloatingConstant node);
    void caseTNegativeIntegerConstant(TNegativeIntegerConstant node);
    void caseTEol(TEol node);
    void caseTBlank(TBlank node);
    void caseTId(TId node);
    void caseTComment(TComment node);
    void caseEOF(EOF node);
    void caseInvalidToken(InvalidToken node);
}
