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
    public void caseAProgramaPrograma(AProgramaPrograma node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADecProcedimentoDecProcPrincipal(ADecProcedimentoDecProcPrincipal node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADecVarDecVarOrConst(ADecVarDecVarOrConst node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADecConstDecVarOrConst(ADecConstDecVarOrConst node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADecProcDecProcOrFuncao(ADecProcDecProcOrFuncao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADecFuncaoDecProcOrFuncao(ADecFuncaoDecProcOrFuncao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADecVarDecVar(ADecVarDecVar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADecConsDecCons(ADecConsDecCons node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIdIdOrIdAtribuicao(AIdIdOrIdAtribuicao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIdAtribuicaoIdOrIdAtribuicao(AIdAtribuicaoIdOrIdAtribuicao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATipoBaseTipo(ATipoBaseTipo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATipoBrktTipo(ATipoBrktTipo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAInteiroTipoBase(AInteiroTipoBase node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABooleanoTipoBase(ABooleanoTipoBase node)
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
    public void caseAArrayCompArrayComp(AArrayCompArrayComp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADecProcedimentoDecProcedimento(ADecProcedimentoDecProcedimento node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADecFuncaoDecFuncao(ADecFuncaoDecFuncao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAParametrosParametros(AParametrosParametros node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPipeParametroClosureParametrosAux(APipeParametroClosureParametrosAux node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPipeParametroPipeParametro(APipeParametroPipeParametro node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAParametroParametro(AParametroParametro node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATipoBaseTipoParametro(ATipoBaseTipoParametro node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATipoParametroBrktTipoParametro(ATipoParametroBrktTipoParametro node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASeComandoComando(ASeComandoComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASeSenaoComandoComando(ASeSenaoComandoComando node)
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
    public void caseAChamadaProcComando(AChamadaProcComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABlocoComandosComando(ABlocoComandosComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABlocoComandosBlocoComandos(ABlocoComandosBlocoComandos node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIdValor(AIdValor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAValorBrktsValor(AValorBrktsValor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABlocoExpressoesBlocoExpressoes(ABlocoExpressoesBlocoExpressoes node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAChamadaFuncaoChamadaFuncao(AChamadaFuncaoChamadaFuncao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAChamadaProcedimentoChamadaProcedimento(AChamadaProcedimentoChamadaProcedimento node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAListaExpListaExp(AListaExpListaExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAuxListaExpAux(AAuxListaExpAux node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPipeExpPipeExp(APipeExpPipeExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIntegerNumber(AIntegerNumber node)
    {
        defaultCase(node);
    }

    @Override
    public void caseARealNumber(ARealNumber node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABooleanBooleanExp(ABooleanBooleanExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACadeiaCadeiaExp(ACadeiaCadeiaExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIntegerLiteral(AIntegerLiteral node)
    {
        defaultCase(node);
    }

    @Override
    public void caseARealLiteral(ARealLiteral node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABooleanLiteral(ABooleanLiteral node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACadeiaLiteral(ACadeiaLiteral node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMultiplicationMultiplicativeExp(AMultiplicationMultiplicativeExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANumberMultiplicativeExp(ANumberMultiplicativeExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADivisionDividitiveExp(ADivisionDividitiveExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAModModExp(AModModExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAdditiveExpAdditiveExp(AAdditiveExpAdditiveExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASubtractiveExpSubtractiveExp(ASubtractiveExpSubtractiveExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABooleanExpExp(ABooleanExpExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACadeiaExpExp(ACadeiaExpExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAValorExp(AValorExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASorroundedExpExp(ASorroundedExpExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAChamadaFuncaoExp(AChamadaFuncaoExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAArrayCompExp(AArrayCompExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMinusExpExp(AMinusExpExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASubtractiveExpExp(ASubtractiveExpExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAModExpExp(AModExpExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEqualExpExp(AEqualExpExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAGreaterExp(AGreaterExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAGreaterEqualExp(AGreaterEqualExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANotExp(ANotExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAndExp(AAndExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAOrExp(AOrExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABlocoExpressoesExp(ABlocoExpressoesExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDigit(TDigit node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDot(TDot node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComma(TComma node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTColon(TColon node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSemicolon(TSemicolon node)
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
    public void caseTLBracket(TLBracket node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRBracket(TRBracket node)
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
    public void caseTPipe(TPipe node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMainInit(TMainInit node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAttr(TAttr node)
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
    public void caseTNao(TNao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTGreater(TGreater node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTGreaterEqual(TGreaterEqual node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEqual(TEqual node)
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
    public void caseTEnquanto(TEnquanto node)
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
    public void caseTImprima(TImprima node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLeia(TLeia node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSize(TSize node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPrincipal(TPrincipal node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTInteiro(TTInteiro node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTReal(TTReal node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTCadeia(TTCadeia node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTBooleano(TTBooleano node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFloatingConstant(TFloatingConstant node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTIntegerConstant(TIntegerConstant node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCadeiaConstant(TCadeiaConstant node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTBooleanConstant(TBooleanConstant node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNegativeFloatingConstant(TNegativeFloatingConstant node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNegativeIntegerConstant(TNegativeIntegerConstant node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEol(TEol node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTBlank(TBlank node)
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
