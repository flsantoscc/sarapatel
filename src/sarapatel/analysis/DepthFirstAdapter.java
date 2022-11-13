/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.analysis;

import java.util.*;
import sarapatel.node.*;

public class DepthFirstAdapter extends AnalysisAdapter
{
    public void inStart(Start node)
    {
        defaultIn(node);
    }

    public void outStart(Start node)
    {
        defaultOut(node);
    }

    public void defaultIn(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    public void defaultOut(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    @Override
    public void caseStart(Start node)
    {
        inStart(node);
        node.getPPrograma().apply(this);
        node.getEOF().apply(this);
        outStart(node);
    }

    public void inAPrograma(APrograma node)
    {
        defaultIn(node);
    }

    public void outAPrograma(APrograma node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAPrograma(APrograma node)
    {
        inAPrograma(node);
        {
            List<PDecVarOrDecConst> copy = new ArrayList<PDecVarOrDecConst>(node.getDecVarOrDecConst());
            for(PDecVarOrDecConst e : copy)
            {
                e.apply(this);
            }
        }
        {
            List<PDecProcOrDecFunc> copy = new ArrayList<PDecProcOrDecFunc>(node.getDecProcOrDecFunc());
            for(PDecProcOrDecFunc e : copy)
            {
                e.apply(this);
            }
        }
        outAPrograma(node);
    }

    public void inADecVar(ADecVar node)
    {
        defaultIn(node);
    }

    public void outADecVar(ADecVar node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADecVar(ADecVar node)
    {
        inADecVar(node);
        if(node.getTipo() != null)
        {
            node.getTipo().apply(this);
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        if(node.getIdAtribuicao() != null)
        {
            node.getIdAtribuicao().apply(this);
        }
        outADecVar(node);
    }

    public void inADecConst(ADecConst node)
    {
        defaultIn(node);
    }

    public void outADecConst(ADecConst node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADecConst(ADecConst node)
    {
        inADecConst(node);
        if(node.getTipo() != null)
        {
            node.getTipo().apply(this);
        }
        if(node.getIdAtribuicao() != null)
        {
            node.getIdAtribuicao().apply(this);
        }
        outADecConst(node);
    }

    public void inADecVarDecVarOrDecConst(ADecVarDecVarOrDecConst node)
    {
        defaultIn(node);
    }

    public void outADecVarDecVarOrDecConst(ADecVarDecVarOrDecConst node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADecVarDecVarOrDecConst(ADecVarDecVarOrDecConst node)
    {
        inADecVarDecVarOrDecConst(node);
        if(node.getDecVar() != null)
        {
            node.getDecVar().apply(this);
        }
        outADecVarDecVarOrDecConst(node);
    }

    public void inADecConstDecVarOrDecConst(ADecConstDecVarOrDecConst node)
    {
        defaultIn(node);
    }

    public void outADecConstDecVarOrDecConst(ADecConstDecVarOrDecConst node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADecConstDecVarOrDecConst(ADecConstDecVarOrDecConst node)
    {
        inADecConstDecVarOrDecConst(node);
        if(node.getDecConst() != null)
        {
            node.getDecConst().apply(this);
        }
        outADecConstDecVarOrDecConst(node);
    }

    public void inABaseTipo(ABaseTipo node)
    {
        defaultIn(node);
    }

    public void outABaseTipo(ABaseTipo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseABaseTipo(ABaseTipo node)
    {
        inABaseTipo(node);
        if(node.getTipoBase() != null)
        {
            node.getTipoBase().apply(this);
        }
        outABaseTipo(node);
    }

    public void inAArrTipo(AArrTipo node)
    {
        defaultIn(node);
    }

    public void outAArrTipo(AArrTipo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAArrTipo(AArrTipo node)
    {
        inAArrTipo(node);
        if(node.getTipo() != null)
        {
            node.getTipo().apply(this);
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        outAArrTipo(node);
    }

    public void inAIntTipoBase(AIntTipoBase node)
    {
        defaultIn(node);
    }

    public void outAIntTipoBase(AIntTipoBase node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIntTipoBase(AIntTipoBase node)
    {
        inAIntTipoBase(node);
        if(node.getIntKw() != null)
        {
            node.getIntKw().apply(this);
        }
        outAIntTipoBase(node);
    }

    public void inABoolTipoBase(ABoolTipoBase node)
    {
        defaultIn(node);
    }

    public void outABoolTipoBase(ABoolTipoBase node)
    {
        defaultOut(node);
    }

    @Override
    public void caseABoolTipoBase(ABoolTipoBase node)
    {
        inABoolTipoBase(node);
        if(node.getBoolKw() != null)
        {
            node.getBoolKw().apply(this);
        }
        outABoolTipoBase(node);
    }

    public void inARealTipoBase(ARealTipoBase node)
    {
        defaultIn(node);
    }

    public void outARealTipoBase(ARealTipoBase node)
    {
        defaultOut(node);
    }

    @Override
    public void caseARealTipoBase(ARealTipoBase node)
    {
        inARealTipoBase(node);
        if(node.getFloatKw() != null)
        {
            node.getFloatKw().apply(this);
        }
        outARealTipoBase(node);
    }

    public void inACadeiaTipoBase(ACadeiaTipoBase node)
    {
        defaultIn(node);
    }

    public void outACadeiaTipoBase(ACadeiaTipoBase node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACadeiaTipoBase(ACadeiaTipoBase node)
    {
        inACadeiaTipoBase(node);
        if(node.getStringKw() != null)
        {
            node.getStringKw().apply(this);
        }
        outACadeiaTipoBase(node);
    }

    public void inAIdAtribuicao(AIdAtribuicao node)
    {
        defaultIn(node);
    }

    public void outAIdAtribuicao(AIdAtribuicao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdAtribuicao(AIdAtribuicao node)
    {
        inAIdAtribuicao(node);
        if(node.getValor() != null)
        {
            node.getValor().apply(this);
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        outAIdAtribuicao(node);
    }

    public void inADecProcDecProcOrDecFunc(ADecProcDecProcOrDecFunc node)
    {
        defaultIn(node);
    }

    public void outADecProcDecProcOrDecFunc(ADecProcDecProcOrDecFunc node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADecProcDecProcOrDecFunc(ADecProcDecProcOrDecFunc node)
    {
        inADecProcDecProcOrDecFunc(node);
        if(node.getDecProc() != null)
        {
            node.getDecProc().apply(this);
        }
        outADecProcDecProcOrDecFunc(node);
    }

    public void inADecFuncDecProcOrDecFunc(ADecFuncDecProcOrDecFunc node)
    {
        defaultIn(node);
    }

    public void outADecFuncDecProcOrDecFunc(ADecFuncDecProcOrDecFunc node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADecFuncDecProcOrDecFunc(ADecFuncDecProcOrDecFunc node)
    {
        inADecFuncDecProcOrDecFunc(node);
        if(node.getDecFunc() != null)
        {
            node.getDecFunc().apply(this);
        }
        outADecFuncDecProcOrDecFunc(node);
    }

    public void inADecProc(ADecProc node)
    {
        defaultIn(node);
    }

    public void outADecProc(ADecProc node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADecProc(ADecProc node)
    {
        inADecProc(node);
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        {
            List<PParametro> copy = new ArrayList<PParametro>(node.getParametro());
            for(PParametro e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getComando() != null)
        {
            node.getComando().apply(this);
        }
        outADecProc(node);
    }

    public void inADecFunc(ADecFunc node)
    {
        defaultIn(node);
    }

    public void outADecFunc(ADecFunc node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADecFunc(ADecFunc node)
    {
        inADecFunc(node);
        if(node.getTipoFunc() != null)
        {
            node.getTipoFunc().apply(this);
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        {
            List<PParametro> copy = new ArrayList<PParametro>(node.getParametro());
            for(PParametro e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        outADecFunc(node);
    }

    public void inAParametro(AParametro node)
    {
        defaultIn(node);
    }

    public void outAParametro(AParametro node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAParametro(AParametro node)
    {
        inAParametro(node);
        if(node.getTipoParam() != null)
        {
            node.getTipoParam().apply(this);
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        outAParametro(node);
    }

    public void inAParTipoParam(AParTipoParam node)
    {
        defaultIn(node);
    }

    public void outAParTipoParam(AParTipoParam node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAParTipoParam(AParTipoParam node)
    {
        inAParTipoParam(node);
        if(node.getTipoBase() != null)
        {
            node.getTipoBase().apply(this);
        }
        outAParTipoParam(node);
    }

    public void inAArrParTipoParam(AArrParTipoParam node)
    {
        defaultIn(node);
    }

    public void outAArrParTipoParam(AArrParTipoParam node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAArrParTipoParam(AArrParTipoParam node)
    {
        inAArrParTipoParam(node);
        if(node.getTipoParam() != null)
        {
            node.getTipoParam().apply(this);
        }
        outAArrParTipoParam(node);
    }

    public void inABaseTipoFunc(ABaseTipoFunc node)
    {
        defaultIn(node);
    }

    public void outABaseTipoFunc(ABaseTipoFunc node)
    {
        defaultOut(node);
    }

    @Override
    public void caseABaseTipoFunc(ABaseTipoFunc node)
    {
        inABaseTipoFunc(node);
        if(node.getTipoBase() != null)
        {
            node.getTipoBase().apply(this);
        }
        outABaseTipoFunc(node);
    }

    public void inAArrTipoFunc(AArrTipoFunc node)
    {
        defaultIn(node);
    }

    public void outAArrTipoFunc(AArrTipoFunc node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAArrTipoFunc(AArrTipoFunc node)
    {
        inAArrTipoFunc(node);
        if(node.getTipoFunc() != null)
        {
            node.getTipoFunc().apply(this);
        }
        outAArrTipoFunc(node);
    }

    public void inASeComando(ASeComando node)
    {
        defaultIn(node);
    }

    public void outASeComando(ASeComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASeComando(ASeComando node)
    {
        inASeComando(node);
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getComando() != null)
        {
            node.getComando().apply(this);
        }
        outASeComando(node);
    }

    public void inASeSenaoComando(ASeSenaoComando node)
    {
        defaultIn(node);
    }

    public void outASeSenaoComando(ASeSenaoComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASeSenaoComando(ASeSenaoComando node)
    {
        inASeSenaoComando(node);
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getComandoAux() != null)
        {
            node.getComandoAux().apply(this);
        }
        if(node.getComando() != null)
        {
            node.getComando().apply(this);
        }
        outASeSenaoComando(node);
    }

    public void inAEnquantoComando(AEnquantoComando node)
    {
        defaultIn(node);
    }

    public void outAEnquantoComando(AEnquantoComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEnquantoComando(AEnquantoComando node)
    {
        inAEnquantoComando(node);
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getComando() != null)
        {
            node.getComando().apply(this);
        }
        outAEnquantoComando(node);
    }

    public void inAIdAtribuicaoComando(AIdAtribuicaoComando node)
    {
        defaultIn(node);
    }

    public void outAIdAtribuicaoComando(AIdAtribuicaoComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdAtribuicaoComando(AIdAtribuicaoComando node)
    {
        inAIdAtribuicaoComando(node);
        if(node.getIdAtribuicao() != null)
        {
            node.getIdAtribuicao().apply(this);
        }
        outAIdAtribuicaoComando(node);
    }

    public void inAProcComando(AProcComando node)
    {
        defaultIn(node);
    }

    public void outAProcComando(AProcComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAProcComando(AProcComando node)
    {
        inAProcComando(node);
        if(node.getChamadaProcedimento() != null)
        {
            node.getChamadaProcedimento().apply(this);
        }
        outAProcComando(node);
    }

    public void inADecVarOrDecConstComando(ADecVarOrDecConstComando node)
    {
        defaultIn(node);
    }

    public void outADecVarOrDecConstComando(ADecVarOrDecConstComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADecVarOrDecConstComando(ADecVarOrDecConstComando node)
    {
        inADecVarOrDecConstComando(node);
        {
            List<PDecVarOrDecConst> copy = new ArrayList<PDecVarOrDecConst>(node.getDecVarOrDecConst());
            for(PDecVarOrDecConst e : copy)
            {
                e.apply(this);
            }
        }
        {
            List<PComando> copy = new ArrayList<PComando>(node.getComando());
            for(PComando e : copy)
            {
                e.apply(this);
            }
        }
        outADecVarOrDecConstComando(node);
    }

    public void inASeComandoAux(ASeComandoAux node)
    {
        defaultIn(node);
    }

    public void outASeComandoAux(ASeComandoAux node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASeComandoAux(ASeComandoAux node)
    {
        inASeComandoAux(node);
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getThen() != null)
        {
            node.getThen().apply(this);
        }
        if(node.getElse() != null)
        {
            node.getElse().apply(this);
        }
        outASeComandoAux(node);
    }

    public void inAEnquantoComandoAux(AEnquantoComandoAux node)
    {
        defaultIn(node);
    }

    public void outAEnquantoComandoAux(AEnquantoComandoAux node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEnquantoComandoAux(AEnquantoComandoAux node)
    {
        inAEnquantoComandoAux(node);
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getComandoAux() != null)
        {
            node.getComandoAux().apply(this);
        }
        outAEnquantoComandoAux(node);
    }

    public void inAProcComandoAux(AProcComandoAux node)
    {
        defaultIn(node);
    }

    public void outAProcComandoAux(AProcComandoAux node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAProcComandoAux(AProcComandoAux node)
    {
        inAProcComandoAux(node);
        if(node.getChamadaProcedimento() != null)
        {
            node.getChamadaProcedimento().apply(this);
        }
        outAProcComandoAux(node);
    }

    public void inAIdAtribuicaoComandoAux(AIdAtribuicaoComandoAux node)
    {
        defaultIn(node);
    }

    public void outAIdAtribuicaoComandoAux(AIdAtribuicaoComandoAux node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdAtribuicaoComandoAux(AIdAtribuicaoComandoAux node)
    {
        inAIdAtribuicaoComandoAux(node);
        if(node.getIdAtribuicao() != null)
        {
            node.getIdAtribuicao().apply(this);
        }
        outAIdAtribuicaoComandoAux(node);
    }

    public void inADecVarOrDecConstComandoAux(ADecVarOrDecConstComandoAux node)
    {
        defaultIn(node);
    }

    public void outADecVarOrDecConstComandoAux(ADecVarOrDecConstComandoAux node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADecVarOrDecConstComandoAux(ADecVarOrDecConstComandoAux node)
    {
        inADecVarOrDecConstComandoAux(node);
        {
            List<PDecVarOrDecConst> copy = new ArrayList<PDecVarOrDecConst>(node.getDecVarOrDecConst());
            for(PDecVarOrDecConst e : copy)
            {
                e.apply(this);
            }
        }
        {
            List<PComando> copy = new ArrayList<PComando>(node.getComando());
            for(PComando e : copy)
            {
                e.apply(this);
            }
        }
        outADecVarOrDecConstComandoAux(node);
    }

    public void inAIdValor(AIdValor node)
    {
        defaultIn(node);
    }

    public void outAIdValor(AIdValor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdValor(AIdValor node)
    {
        inAIdValor(node);
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        outAIdValor(node);
    }

    public void inAExpValor(AExpValor node)
    {
        defaultIn(node);
    }

    public void outAExpValor(AExpValor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpValor(AExpValor node)
    {
        inAExpValor(node);
        if(node.getValor() != null)
        {
            node.getValor().apply(this);
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        outAExpValor(node);
    }

    public void inAIntExp(AIntExp node)
    {
        defaultIn(node);
    }

    public void outAIntExp(AIntExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIntExp(AIntExp node)
    {
        inAIntExp(node);
        if(node.getInt() != null)
        {
            node.getInt().apply(this);
        }
        outAIntExp(node);
    }

    public void inABoolExp(ABoolExp node)
    {
        defaultIn(node);
    }

    public void outABoolExp(ABoolExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseABoolExp(ABoolExp node)
    {
        inABoolExp(node);
        if(node.getBool() != null)
        {
            node.getBool().apply(this);
        }
        outABoolExp(node);
    }

    public void inARealExp(ARealExp node)
    {
        defaultIn(node);
    }

    public void outARealExp(ARealExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseARealExp(ARealExp node)
    {
        inARealExp(node);
        if(node.getFloat() != null)
        {
            node.getFloat().apply(this);
        }
        outARealExp(node);
    }

    public void inACadeiaExp(ACadeiaExp node)
    {
        defaultIn(node);
    }

    public void outACadeiaExp(ACadeiaExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACadeiaExp(ACadeiaExp node)
    {
        inACadeiaExp(node);
        if(node.getString() != null)
        {
            node.getString().apply(this);
        }
        outACadeiaExp(node);
    }

    public void inAValorExp(AValorExp node)
    {
        defaultIn(node);
    }

    public void outAValorExp(AValorExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAValorExp(AValorExp node)
    {
        inAValorExp(node);
        if(node.getValor() != null)
        {
            node.getValor().apply(this);
        }
        outAValorExp(node);
    }

    public void inACFuncExp(ACFuncExp node)
    {
        defaultIn(node);
    }

    public void outACFuncExp(ACFuncExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACFuncExp(ACFuncExp node)
    {
        inACFuncExp(node);
        if(node.getChamadaFuncao() != null)
        {
            node.getChamadaFuncao().apply(this);
        }
        outACFuncExp(node);
    }

    public void inAArrayCompExp(AArrayCompExp node)
    {
        defaultIn(node);
    }

    public void outAArrayCompExp(AArrayCompExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAArrayCompExp(AArrayCompExp node)
    {
        inAArrayCompExp(node);
        if(node.getArrayComp() != null)
        {
            node.getArrayComp().apply(this);
        }
        outAArrayCompExp(node);
    }

    public void inAIncrementoExp(AIncrementoExp node)
    {
        defaultIn(node);
    }

    public void outAIncrementoExp(AIncrementoExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIncrementoExp(AIncrementoExp node)
    {
        inAIncrementoExp(node);
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        outAIncrementoExp(node);
    }

    public void inADecrementoExp(ADecrementoExp node)
    {
        defaultIn(node);
    }

    public void outADecrementoExp(ADecrementoExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADecrementoExp(ADecrementoExp node)
    {
        inADecrementoExp(node);
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        outADecrementoExp(node);
    }

    public void inASeExp(ASeExp node)
    {
        defaultIn(node);
    }

    public void outASeExp(ASeExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASeExp(ASeExp node)
    {
        inASeExp(node);
        if(node.getIf() != null)
        {
            node.getIf().apply(this);
        }
        if(node.getThen() != null)
        {
            node.getThen().apply(this);
        }
        if(node.getElse() != null)
        {
            node.getElse().apply(this);
        }
        outASeExp(node);
    }

    public void inASomaExp(ASomaExp node)
    {
        defaultIn(node);
    }

    public void outASomaExp(ASomaExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASomaExp(ASomaExp node)
    {
        inASomaExp(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outASomaExp(node);
    }

    public void inAMinusExp(AMinusExp node)
    {
        defaultIn(node);
    }

    public void outAMinusExp(AMinusExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMinusExp(AMinusExp node)
    {
        inAMinusExp(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outAMinusExp(node);
    }

    public void inAMultExp(AMultExp node)
    {
        defaultIn(node);
    }

    public void outAMultExp(AMultExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMultExp(AMultExp node)
    {
        inAMultExp(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outAMultExp(node);
    }

    public void inADivExp(ADivExp node)
    {
        defaultIn(node);
    }

    public void outADivExp(ADivExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADivExp(ADivExp node)
    {
        inADivExp(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outADivExp(node);
    }

    public void inAModExp(AModExp node)
    {
        defaultIn(node);
    }

    public void outAModExp(AModExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAModExp(AModExp node)
    {
        inAModExp(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outAModExp(node);
    }

    public void inAEqualExp(AEqualExp node)
    {
        defaultIn(node);
    }

    public void outAEqualExp(AEqualExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEqualExp(AEqualExp node)
    {
        inAEqualExp(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outAEqualExp(node);
    }

    public void inAGreaterEqExp(AGreaterEqExp node)
    {
        defaultIn(node);
    }

    public void outAGreaterEqExp(AGreaterEqExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAGreaterEqExp(AGreaterEqExp node)
    {
        inAGreaterEqExp(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outAGreaterEqExp(node);
    }

    public void inAGreaterExp(AGreaterExp node)
    {
        defaultIn(node);
    }

    public void outAGreaterExp(AGreaterExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAGreaterExp(AGreaterExp node)
    {
        inAGreaterExp(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outAGreaterExp(node);
    }

    public void inAEExp(AEExp node)
    {
        defaultIn(node);
    }

    public void outAEExp(AEExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEExp(AEExp node)
    {
        inAEExp(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outAEExp(node);
    }

    public void inAOuExp(AOuExp node)
    {
        defaultIn(node);
    }

    public void outAOuExp(AOuExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAOuExp(AOuExp node)
    {
        inAOuExp(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outAOuExp(node);
    }

    public void inAParExp(AParExp node)
    {
        defaultIn(node);
    }

    public void outAParExp(AParExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAParExp(AParExp node)
    {
        inAParExp(node);
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        outAParExp(node);
    }

    public void inANegacaoExp(ANegacaoExp node)
    {
        defaultIn(node);
    }

    public void outANegacaoExp(ANegacaoExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANegacaoExp(ANegacaoExp node)
    {
        inANegacaoExp(node);
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        outANegacaoExp(node);
    }

    public void inABExpExp(ABExpExp node)
    {
        defaultIn(node);
    }

    public void outABExpExp(ABExpExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseABExpExp(ABExpExp node)
    {
        inABExpExp(node);
        if(node.getBlocoExpressoes() != null)
        {
            node.getBlocoExpressoes().apply(this);
        }
        outABExpExp(node);
    }

    public void inABDecConstExpExp(ABDecConstExpExp node)
    {
        defaultIn(node);
    }

    public void outABDecConstExpExp(ABDecConstExpExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseABDecConstExpExp(ABDecConstExpExp node)
    {
        inABDecConstExpExp(node);
        {
            List<PDecConst> copy = new ArrayList<PDecConst>(node.getDecConst());
            for(PDecConst e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        outABDecConstExpExp(node);
    }

    public void inABlocoExpressoes(ABlocoExpressoes node)
    {
        defaultIn(node);
    }

    public void outABlocoExpressoes(ABlocoExpressoes node)
    {
        defaultOut(node);
    }

    @Override
    public void caseABlocoExpressoes(ABlocoExpressoes node)
    {
        inABlocoExpressoes(node);
        {
            List<PDecConst> copy = new ArrayList<PDecConst>(node.getDecConst());
            for(PDecConst e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        outABlocoExpressoes(node);
    }

    public void inAArrayComp(AArrayComp node)
    {
        defaultIn(node);
    }

    public void outAArrayComp(AArrayComp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAArrayComp(AArrayComp node)
    {
        inAArrayComp(node);
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        outAArrayComp(node);
    }

    public void inAChamadaFuncao(AChamadaFuncao node)
    {
        defaultIn(node);
    }

    public void outAChamadaFuncao(AChamadaFuncao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAChamadaFuncao(AChamadaFuncao node)
    {
        inAChamadaFuncao(node);
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        {
            List<PExp> copy = new ArrayList<PExp>(node.getExp());
            for(PExp e : copy)
            {
                e.apply(this);
            }
        }
        outAChamadaFuncao(node);
    }

    public void inAChamadaProcedimento(AChamadaProcedimento node)
    {
        defaultIn(node);
    }

    public void outAChamadaProcedimento(AChamadaProcedimento node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAChamadaProcedimento(AChamadaProcedimento node)
    {
        inAChamadaProcedimento(node);
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        {
            List<PExp> copy = new ArrayList<PExp>(node.getExp());
            for(PExp e : copy)
            {
                e.apply(this);
            }
        }
        outAChamadaProcedimento(node);
    }
}
