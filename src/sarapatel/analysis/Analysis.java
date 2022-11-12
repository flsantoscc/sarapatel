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
    void caseADecVar(ADecVar node);
    void caseADecConst(ADecConst node);
    void caseADecVarDecVarOrDecConst(ADecVarDecVarOrDecConst node);
    void caseADecConstDecVarOrDecConst(ADecConstDecVarOrDecConst node);
    void caseABaseTipo(ABaseTipo node);
    void caseAArrTipo(AArrTipo node);
    void caseAIntTipoBase(AIntTipoBase node);
    void caseABoolTipoBase(ABoolTipoBase node);
    void caseARealTipoBase(ARealTipoBase node);
    void caseACadeiaTipoBase(ACadeiaTipoBase node);
    void caseAIdAtribuicao(AIdAtribuicao node);
    void caseADecProcDecProcOrDecFunc(ADecProcDecProcOrDecFunc node);
    void caseADecFuncDecProcOrDecFunc(ADecFuncDecProcOrDecFunc node);
    void caseADecProc(ADecProc node);
    void caseADecFunc(ADecFunc node);
    void caseAParametro(AParametro node);
    void caseAParTipoParam(AParTipoParam node);
    void caseAArrParTipoParam(AArrParTipoParam node);
    void caseABaseTipoFunc(ABaseTipoFunc node);
    void caseAArrTipoFunc(AArrTipoFunc node);
    void caseASeComando(ASeComando node);
    void caseASeSenaoComando(ASeSenaoComando node);
    void caseAEnquantoComando(AEnquantoComando node);
    void caseAIdAtribuicaoComando(AIdAtribuicaoComando node);
    void caseAProcComando(AProcComando node);
    void caseADecVarOrDecConstComando(ADecVarOrDecConstComando node);
    void caseASeComandoAux(ASeComandoAux node);
    void caseAEnquantoComandoAux(AEnquantoComandoAux node);
    void caseAProcComandoAux(AProcComandoAux node);
    void caseAIdAtribuicaoComandoAux(AIdAtribuicaoComandoAux node);
    void caseADecVarOrDecConstComandoAux(ADecVarOrDecConstComandoAux node);
    void caseAIdValor(AIdValor node);
    void caseAExpValor(AExpValor node);
    void caseAIntExp(AIntExp node);
    void caseABoolExp(ABoolExp node);
    void caseARealExp(ARealExp node);
    void caseACadeiaExp(ACadeiaExp node);
    void caseAValorExp(AValorExp node);
    void caseACFuncExp(ACFuncExp node);
    void caseAArrayCompExp(AArrayCompExp node);
    void caseAIncrementoExp(AIncrementoExp node);
    void caseADecrementoExp(ADecrementoExp node);
    void caseASeExpExp(ASeExpExp node);
    void caseASomaExp(ASomaExp node);
    void caseAMinusExp(AMinusExp node);
    void caseAMultExp(AMultExp node);
    void caseADivExp(ADivExp node);
    void caseAModExp(AModExp node);
    void caseAEqualExp(AEqualExp node);
    void caseAGreaterEqExp(AGreaterEqExp node);
    void caseAGreaterExp(AGreaterExp node);
    void caseAEExp(AEExp node);
    void caseAOuExp(AOuExp node);
    void caseAParExp(AParExp node);
    void caseANegacaoExp(ANegacaoExp node);
    void caseABExpExp(ABExpExp node);
    void caseABDecConstExpExp(ABDecConstExpExp node);
    void caseABlocoExpressoes(ABlocoExpressoes node);
    void caseAArrayComp(AArrayComp node);
    void caseAChamadaFuncao(AChamadaFuncao node);
    void caseAChamadaProcedimento(AChamadaProcedimento node);

    void caseTVar(TVar node);
    void caseTConst(TConst node);
    void caseTSe(TSe node);
    void caseTSenao(TSenao node);
    void caseTEnquanto(TEnquanto node);
    void caseTFuncao(TFuncao node);
    void caseTProcedimento(TProcedimento node);
    void caseTE(TE node);
    void caseTOu(TOu node);
    void caseTNegacao(TNegacao node);
    void caseTComece(TComece node);
    void caseTTermine(TTermine node);
    void caseTIntKw(TIntKw node);
    void caseTFloatKw(TFloatKw node);
    void caseTStringKw(TStringKw node);
    void caseTBoolKw(TBoolKw node);
    void caseTInt(TInt node);
    void caseTFloat(TFloat node);
    void caseTString(TString node);
    void caseTBool(TBool node);
    void caseTPlus(TPlus node);
    void caseTMinus(TMinus node);
    void caseTStar(TStar node);
    void caseTDiv(TDiv node);
    void caseTMod(TMod node);
    void caseTGreater(TGreater node);
    void caseTGreaterEq(TGreaterEq node);
    void caseTEqual(TEqual node);
    void caseTLPar(TLPar node);
    void caseTRPar(TRPar node);
    void caseTLBrkt(TLBrkt node);
    void caseTRBrkt(TRBrkt node);
    void caseTDd(TDd node);
    void caseTMainInit(TMainInit node);
    void caseTSemi(TSemi node);
    void caseTPipe(TPipe node);
    void caseTColon(TColon node);
    void caseTId(TId node);
    void caseTComment(TComment node);
    void caseTMlComment(TMlComment node);
    void caseTBlank(TBlank node);
    void caseEOF(EOF node);
    void caseInvalidToken(InvalidToken node);
}
