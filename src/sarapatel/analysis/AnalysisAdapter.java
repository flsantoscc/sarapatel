/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.analysis;

import java.util.*;
import sarapatel.node.*;

public class AnalysisAdapter implements Analysis
{
    private Hashtable<Node,Object> in;
    private Hashtable<Node,Object> out;

    @Override
    public Object getIn(Node node)
    {
        if(this.in == null)
        {
            return null;
        }

        return this.in.get(node);
    }

    @Override
    public void setIn(Node node, Object o)
    {
        if(this.in == null)
        {
            this.in = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.in.put(node, o);
        }
        else
        {
            this.in.remove(node);
        }
    }

    @Override
    public Object getOut(Node node)
    {
        if(this.out == null)
        {
            return null;
        }

        return this.out.get(node);
    }

    @Override
    public void setOut(Node node, Object o)
    {
        if(this.out == null)
        {
            this.out = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.out.put(node, o);
        }
        else
        {
            this.out.remove(node);
        }
    }

    @Override
    public void caseStart(Start node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPrograma(APrograma node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIdDecVar(AIdDecVar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIdAtribuicaoDecVar(AIdAtribuicaoDecVar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADecConst(ADecConst node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADecVarDecVarOrDecConst(ADecVarDecVarOrDecConst node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADecConstDecVarOrDecConst(ADecConstDecVarOrDecConst node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABaseTipo(ABaseTipo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAArrTipo(AArrTipo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIntTipoBase(AIntTipoBase node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABoolTipoBase(ABoolTipoBase node)
    {
        defaultCase(node);
    }

    @Override
    public void caseARealTipoBase(ARealTipoBase node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACadeiaTipoBase(ACadeiaTipoBase node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIdAtribuicao(AIdAtribuicao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIdValor(AIdValor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpValor(AExpValor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADecProcDecProcOrDecFunc(ADecProcDecProcOrDecFunc node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADecFuncDecProcOrDecFunc(ADecFuncDecProcOrDecFunc node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADecProc(ADecProc node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADecFunc(ADecFunc node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAParametro(AParametro node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAParTipoParam(AParTipoParam node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAArrParTipoParam(AArrParTipoParam node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASeComando(ASeComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASeSenaoComando(ASeSenaoComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEnquantoComando(AEnquantoComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIdAtribuicaoComando(AIdAtribuicaoComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAProcComando(AProcComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADecVarOrDecConstComando(ADecVarOrDecConstComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASeComandoAux(ASeComandoAux node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEnquantoComandoAux(AEnquantoComandoAux node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAProcComandoAux(AProcComandoAux node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIdAtribuicaoComandoAux(AIdAtribuicaoComandoAux node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADecVarOrDecConstComandoAux(ADecVarOrDecConstComandoAux node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIntExp(AIntExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABoolExp(ABoolExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseARealExp(ARealExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACadeiaExp(ACadeiaExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAValorExp(AValorExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACFuncExp(ACFuncExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAArrayCompExp(AArrayCompExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIncrementoExp(AIncrementoExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADecrementoExp(ADecrementoExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASeExp(ASeExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASomaExp(ASomaExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMinusExp(AMinusExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMultExp(AMultExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADivExp(ADivExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAModExp(AModExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEqualExp(AEqualExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAGreaterEqExp(AGreaterEqExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAGreaterExp(AGreaterExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEExp(AEExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAOuExp(AOuExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAParExp(AParExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANegacaoExp(ANegacaoExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABExpExp(ABExpExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABDecConstExpExp(ABDecConstExpExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABlocoExpressoes(ABlocoExpressoes node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAArrayComp(AArrayComp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAChamadaFuncao(AChamadaFuncao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAChamadaProcedimento(AChamadaProcedimento node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTVar(TVar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTConst(TConst node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSe(TSe node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSenao(TSenao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEnquanto(TEnquanto node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFuncao(TFuncao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTProcedimento(TProcedimento node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTE(TE node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTOu(TOu node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNegacao(TNegacao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComece(TComece node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTermine(TTermine node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTIntKw(TIntKw node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFloatKw(TFloatKw node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTStringKw(TStringKw node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTBoolKw(TBoolKw node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTInt(TInt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFloat(TFloat node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTString(TString node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTBool(TBool node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPlus(TPlus node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMinus(TMinus node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTStar(TStar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDiv(TDiv node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMod(TMod node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTGreater(TGreater node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTGreaterEq(TGreaterEq node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEqual(TEqual node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLPar(TLPar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRPar(TRPar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLBrkt(TLBrkt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRBrkt(TRBrkt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDd(TDd node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMainInit(TMainInit node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSemi(TSemi node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPipe(TPipe node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTColon(TColon node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTId(TId node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComment(TComment node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMlComment(TMlComment node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTBlank(TBlank node)
    {
        defaultCase(node);
    }

    @Override
    public void caseEOF(EOF node)
    {
        defaultCase(node);
    }

    @Override
    public void caseInvalidToken(InvalidToken node)
    {
        defaultCase(node);
    }

    public void defaultCase(@SuppressWarnings("unused") Node node)
    {
        // do nothing
    }
}
