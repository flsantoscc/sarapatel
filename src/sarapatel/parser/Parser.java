/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.parser;

import sarapatel.lexer.*;
import sarapatel.node.*;
import sarapatel.analysis.*;
import java.util.*;

import java.io.DataInputStream;
import java.io.BufferedInputStream;
import java.io.IOException;

@SuppressWarnings("nls")
public class Parser
{
    public final Analysis ignoredTokens = new AnalysisAdapter();

    protected ArrayList<Object> nodeList;

    private final Lexer lexer;
    private final ListIterator<Object> stack = new LinkedList<Object>().listIterator();
    private int last_pos;
    private int last_line;
    private Token last_token;
    private final TokenIndex converter = new TokenIndex();
    private final int[] action = new int[2];

    private final static int SHIFT = 0;
    private final static int REDUCE = 1;
    private final static int ACCEPT = 2;
    private final static int ERROR = 3;

    public Parser(@SuppressWarnings("hiding") Lexer lexer)
    {
        this.lexer = lexer;
    }

    protected void filter() throws ParserException, LexerException, IOException
    {
        // Empty body
    }

    private void push(int numstate, ArrayList<Object> listNode, boolean hidden) throws ParserException, LexerException, IOException
    {
        this.nodeList = listNode;

        if(!hidden)
        {
            filter();
        }

        if(!this.stack.hasNext())
        {
            this.stack.add(new State(numstate, this.nodeList));
            return;
        }

        State s = (State) this.stack.next();
        s.state = numstate;
        s.nodes = this.nodeList;
    }

    private int goTo(int index)
    {
        int state = state();
        int low = 1;
        int high = gotoTable[index].length - 1;
        int value = gotoTable[index][0][1];

        while(low <= high)
        {
            // int middle = (low + high) / 2;
            int middle = (low + high) >>> 1;

            if(state < gotoTable[index][middle][0])
            {
                high = middle - 1;
            }
            else if(state > gotoTable[index][middle][0])
            {
                low = middle + 1;
            }
            else
            {
                value = gotoTable[index][middle][1];
                break;
            }
        }

        return value;
    }

    private int state()
    {
        State s = (State) this.stack.previous();
        this.stack.next();
        return s.state;
    }

    private ArrayList<Object> pop()
    {
        return ((State) this.stack.previous()).nodes;
    }

    private int index(Switchable token)
    {
        this.converter.index = -1;
        token.apply(this.converter);
        return this.converter.index;
    }

    @SuppressWarnings("unchecked")
    public Start parse() throws ParserException, LexerException, IOException
    {
        push(0, null, true);
        List<Node> ign = null;
        while(true)
        {
            while(index(this.lexer.peek()) == -1)
            {
                if(ign == null)
                {
                    ign = new LinkedList<Node>();
                }

                ign.add(this.lexer.next());
            }

            if(ign != null)
            {
                this.ignoredTokens.setIn(this.lexer.peek(), ign);
                ign = null;
            }

            this.last_pos = this.lexer.peek().getPos();
            this.last_line = this.lexer.peek().getLine();
            this.last_token = this.lexer.peek();

            int index = index(this.lexer.peek());
            this.action[0] = Parser.actionTable[state()][0][1];
            this.action[1] = Parser.actionTable[state()][0][2];

            int low = 1;
            int high = Parser.actionTable[state()].length - 1;

            while(low <= high)
            {
                int middle = (low + high) / 2;

                if(index < Parser.actionTable[state()][middle][0])
                {
                    high = middle - 1;
                }
                else if(index > Parser.actionTable[state()][middle][0])
                {
                    low = middle + 1;
                }
                else
                {
                    this.action[0] = Parser.actionTable[state()][middle][1];
                    this.action[1] = Parser.actionTable[state()][middle][2];
                    break;
                }
            }

            switch(this.action[0])
            {
                case SHIFT:
		    {
		        ArrayList<Object> list = new ArrayList<Object>();
		        list.add(this.lexer.next());
                        push(this.action[1], list, false);
                    }
		    break;
                case REDUCE:
                    {
                        int reduction = this.action[1];
                        if(reduction < 500) reduce_0(reduction);
                    }
                    break;
                case ACCEPT:
                    {
                        EOF node2 = (EOF) this.lexer.next();
                        PTypeSpecifier node1 = (PTypeSpecifier) pop().get(0);
                        Start node = new Start(node1, node2);
                        return node;
                    }
                case ERROR:
                    throw new ParserException(this.last_token,
                        "[" + this.last_line + "," + this.last_pos + "] " +
                        Parser.errorMessages[Parser.errors[this.action[1]]]);
            }
        }
    }

    private void reduce_0(int reduction) throws IOException, LexerException, ParserException
    {
        switch(reduction)
        {
            case 0: /* reduce ABooleanTypeSpecifier */
            {
                ArrayList<Object> list = new0();
                push(goTo(0), list, false);
            }
            break;
            case 1: /* reduce AIntegerTypeSpecifier */
            {
                ArrayList<Object> list = new1();
                push(goTo(0), list, false);
            }
            break;
            case 2: /* reduce AFloatTypeSpecifier */
            {
                ArrayList<Object> list = new2();
                push(goTo(0), list, false);
            }
            break;
            case 3: /* reduce AStringTypeSpecifier */
            {
                ArrayList<Object> list = new3();
                push(goTo(0), list, false);
            }
            break;
            case 4: /* reduce AIntegerSpecifier */
            {
                ArrayList<Object> list = new4();
                push(goTo(1), list, false);
            }
            break;
            case 5: /* reduce ABooleanSpecifier */
            {
                ArrayList<Object> list = new5();
                push(goTo(2), list, false);
            }
            break;
            case 6: /* reduce AStringSpecifier */
            {
                ArrayList<Object> list = new6();
                push(goTo(3), list, false);
            }
            break;
            case 7: /* reduce AFloatSpecifier */
            {
                ArrayList<Object> list = new7();
                push(goTo(4), list, false);
            }
            break;
            case 8: /* reduce AIdentifierArrayDeclarator */
            {
                ArrayList<Object> list = new8();
                push(goTo(5), list, false);
            }
            break;
            case 9: /* reduce AArrayArrayDeclarator */
            {
                ArrayList<Object> list = new9();
                push(goTo(5), list, false);
            }
            break;
            case 10: /* reduce AArrayDeclaration */
            {
                ArrayList<Object> list = new10();
                push(goTo(6), list, false);
            }
            break;
        }
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new0() /* reduce ABooleanTypeSpecifier */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        PTypeSpecifier ptypespecifierNode1;
        {
            // Block
        PBooleanSpecifier pbooleanspecifierNode2;
        pbooleanspecifierNode2 = (PBooleanSpecifier)nodeArrayList1.get(0);

        ptypespecifierNode1 = new ABooleanTypeSpecifier(pbooleanspecifierNode2);
        }
	nodeList.add(ptypespecifierNode1);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new1() /* reduce AIntegerTypeSpecifier */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        PTypeSpecifier ptypespecifierNode1;
        {
            // Block
        PIntegerSpecifier pintegerspecifierNode2;
        pintegerspecifierNode2 = (PIntegerSpecifier)nodeArrayList1.get(0);

        ptypespecifierNode1 = new AIntegerTypeSpecifier(pintegerspecifierNode2);
        }
	nodeList.add(ptypespecifierNode1);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new2() /* reduce AFloatTypeSpecifier */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        PTypeSpecifier ptypespecifierNode1;
        {
            // Block
        PFloatSpecifier pfloatspecifierNode2;
        pfloatspecifierNode2 = (PFloatSpecifier)nodeArrayList1.get(0);

        ptypespecifierNode1 = new AFloatTypeSpecifier(pfloatspecifierNode2);
        }
	nodeList.add(ptypespecifierNode1);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new3() /* reduce AStringTypeSpecifier */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        PTypeSpecifier ptypespecifierNode1;
        {
            // Block
        PStringSpecifier pstringspecifierNode2;
        pstringspecifierNode2 = (PStringSpecifier)nodeArrayList1.get(0);

        ptypespecifierNode1 = new AStringTypeSpecifier(pstringspecifierNode2);
        }
	nodeList.add(ptypespecifierNode1);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new4() /* reduce AIntegerSpecifier */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        PIntegerSpecifier pintegerspecifierNode1;
        {
            // Block
        TTInteiro ttinteiroNode2;
        ttinteiroNode2 = (TTInteiro)nodeArrayList1.get(0);

        pintegerspecifierNode1 = new AIntegerSpecifier(ttinteiroNode2);
        }
	nodeList.add(pintegerspecifierNode1);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new5() /* reduce ABooleanSpecifier */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        PBooleanSpecifier pbooleanspecifierNode1;
        {
            // Block
        TTBooleano ttbooleanoNode2;
        ttbooleanoNode2 = (TTBooleano)nodeArrayList1.get(0);

        pbooleanspecifierNode1 = new ABooleanSpecifier(ttbooleanoNode2);
        }
	nodeList.add(pbooleanspecifierNode1);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new6() /* reduce AStringSpecifier */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        PStringSpecifier pstringspecifierNode1;
        {
            // Block
        TTCadeia ttcadeiaNode2;
        ttcadeiaNode2 = (TTCadeia)nodeArrayList1.get(0);

        pstringspecifierNode1 = new AStringSpecifier(ttcadeiaNode2);
        }
	nodeList.add(pstringspecifierNode1);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new7() /* reduce AFloatSpecifier */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        PFloatSpecifier pfloatspecifierNode1;
        {
            // Block
        TTReal ttrealNode2;
        ttrealNode2 = (TTReal)nodeArrayList1.get(0);

        pfloatspecifierNode1 = new AFloatSpecifier(ttrealNode2);
        }
	nodeList.add(pfloatspecifierNode1);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new8() /* reduce AIdentifierArrayDeclarator */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList4 = pop();
        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList3 = pop();
        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList2 = pop();
        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        PArrayDeclarator parraydeclaratorNode1;
        {
            // Block
        TLBracket tlbracketNode2;
        TIntegerConstant tintegerconstantNode3;
        TRBracket trbracketNode4;
        TIdentifier tidentifierNode5;
        tlbracketNode2 = (TLBracket)nodeArrayList1.get(0);
        tintegerconstantNode3 = (TIntegerConstant)nodeArrayList2.get(0);
        trbracketNode4 = (TRBracket)nodeArrayList3.get(0);
        tidentifierNode5 = (TIdentifier)nodeArrayList4.get(0);

        parraydeclaratorNode1 = new AIdentifierArrayDeclarator(tlbracketNode2, tintegerconstantNode3, trbracketNode4, tidentifierNode5);
        }
	nodeList.add(parraydeclaratorNode1);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new9() /* reduce AArrayArrayDeclarator */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList4 = pop();
        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList3 = pop();
        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList2 = pop();
        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        PArrayDeclarator parraydeclaratorNode1;
        {
            // Block
        PArrayDeclarator parraydeclaratorNode2;
        TLBracket tlbracketNode3;
        TIntegerConstant tintegerconstantNode4;
        TRBracket trbracketNode5;
        parraydeclaratorNode2 = (PArrayDeclarator)nodeArrayList1.get(0);
        tlbracketNode3 = (TLBracket)nodeArrayList2.get(0);
        tintegerconstantNode4 = (TIntegerConstant)nodeArrayList3.get(0);
        trbracketNode5 = (TRBracket)nodeArrayList4.get(0);

        parraydeclaratorNode1 = new AArrayArrayDeclarator(parraydeclaratorNode2, tlbracketNode3, tintegerconstantNode4, trbracketNode5);
        }
	nodeList.add(parraydeclaratorNode1);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new10() /* reduce AArrayDeclaration */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList5 = pop();
        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList4 = pop();
        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList3 = pop();
        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList2 = pop();
        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        PArrayDeclaration parraydeclarationNode1;
        {
            // Block
        TVar tvarNode2;
        TColon tcolonNode3;
        PTypeSpecifier ptypespecifierNode4;
        PArrayDeclarator parraydeclaratorNode5;
        TSemicolon tsemicolonNode6;
        tvarNode2 = (TVar)nodeArrayList1.get(0);
        tcolonNode3 = (TColon)nodeArrayList2.get(0);
        ptypespecifierNode4 = (PTypeSpecifier)nodeArrayList3.get(0);
        parraydeclaratorNode5 = (PArrayDeclarator)nodeArrayList4.get(0);
        tsemicolonNode6 = (TSemicolon)nodeArrayList5.get(0);

        parraydeclarationNode1 = new AArrayDeclaration(tvarNode2, tcolonNode3, ptypespecifierNode4, parraydeclaratorNode5, tsemicolonNode6);
        }
	nodeList.add(parraydeclarationNode1);
        return nodeList;
    }



    private static int[][][] actionTable;
/*      {
			{{-1, ERROR, 0}, {37, SHIFT, 1}, {38, SHIFT, 2}, {39, SHIFT, 3}, {40, SHIFT, 4}, },
			{{-1, REDUCE, 4}, },
			{{-1, REDUCE, 7}, },
			{{-1, REDUCE, 6}, },
			{{-1, REDUCE, 5}, },
			{{-1, ERROR, 5}, {46, ACCEPT, -1}, },
			{{-1, REDUCE, 1}, },
			{{-1, REDUCE, 0}, },
			{{-1, REDUCE, 3}, },
			{{-1, REDUCE, 2}, },
        };*/
    private static int[][][] gotoTable;
/*      {
			{{-1, 5}, },
			{{-1, 6}, },
			{{-1, 7}, },
			{{-1, 8}, },
			{{-1, 9}, },
			{{-1, -1}, },
			{{-1, -1}, },
        };*/
    private static String[] errorMessages;
/*      {
			"expecting: 'inteiro', 'real', 'cadeia', 'booleano'",
			"expecting: EOF",
        };*/
    private static int[] errors;
/*      {
			0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 
        };*/

    static 
    {
        try
        {
            DataInputStream s = new DataInputStream(
                new BufferedInputStream(
                Parser.class.getResourceAsStream("parser.dat")));

            // read actionTable
            int length = s.readInt();
            Parser.actionTable = new int[length][][];
            for(int i = 0; i < Parser.actionTable.length; i++)
            {
                length = s.readInt();
                Parser.actionTable[i] = new int[length][3];
                for(int j = 0; j < Parser.actionTable[i].length; j++)
                {
                for(int k = 0; k < 3; k++)
                {
                    Parser.actionTable[i][j][k] = s.readInt();
                }
                }
            }

            // read gotoTable
            length = s.readInt();
            gotoTable = new int[length][][];
            for(int i = 0; i < gotoTable.length; i++)
            {
                length = s.readInt();
                gotoTable[i] = new int[length][2];
                for(int j = 0; j < gotoTable[i].length; j++)
                {
                for(int k = 0; k < 2; k++)
                {
                    gotoTable[i][j][k] = s.readInt();
                }
                }
            }

            // read errorMessages
            length = s.readInt();
            errorMessages = new String[length];
            for(int i = 0; i < errorMessages.length; i++)
            {
                length = s.readInt();
                StringBuffer buffer = new StringBuffer();

                for(int j = 0; j < length; j++)
                {
                buffer.append(s.readChar());
                }
                errorMessages[i] = buffer.toString();
            }

            // read errors
            length = s.readInt();
            errors = new int[length];
            for(int i = 0; i < errors.length; i++)
            {
                errors[i] = s.readInt();
            }

            s.close();
        }
        catch(Exception e)
        {
            throw new RuntimeException("The file \"parser.dat\" is either missing or corrupted.");
        }
    }
}
