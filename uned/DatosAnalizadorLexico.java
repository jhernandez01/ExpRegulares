/* The following code was generated by JFlex 1.6.1 */

/* Secci�n de declaraciones de JFlex */

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>C:/jflex/uned/DatosAnalizadorLexico.flex</tt>
 */
public class DatosAnalizadorLexico {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\44\1\45\1\51\1\52\1\46\22\0\1\44\1\0\1\50"+
    "\1\47\4\0\1\1\1\1\1\36\1\36\1\33\1\34\1\5\1\37"+
    "\1\41\11\42\1\2\1\2\1\36\1\35\2\0\1\54\32\43\1\3"+
    "\1\0\1\4\1\0\1\40\1\0\1\12\1\6\1\14\1\23\1\11"+
    "\1\25\1\30\1\32\1\15\1\32\1\32\1\10\1\20\1\13\1\7"+
    "\1\27\1\32\1\16\1\22\1\17\1\26\1\24\2\32\1\31\1\21"+
    "\1\0\1\53\10\0\1\51\56\0\1\2\u1f67\0\1\2\13\0\1\51"+
    "\1\51\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\2\1\1\0\13\2\1\3\2\2\2\4\1\5"+
    "\2\6\1\2\2\7\3\0\1\2\1\0\1\5\1\0"+
    "\1\3\4\2\1\3\1\2\1\3\7\2\4\5\1\6"+
    "\2\5\1\6\1\5\1\10\1\0\1\2\2\5\1\0"+
    "\11\2\1\3\4\2\5\5\1\0\1\6\2\5\1\6"+
    "\1\11\1\2\2\5\1\0\16\2\1\0\1\2\1\0"+
    "\13\2\1\0\1\2\1\12\11\2\1\0\1\12\3\2"+
    "\1\0\2\2\1\0\2\2\1\0\2\2\1\13";

  private static int [] zzUnpackAction() {
    int [] result = new int[147];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\55\0\132\0\207\0\264\0\341\0\u010e\0\u013b"+
    "\0\u0168\0\u0195\0\u01c2\0\u01ef\0\u021c\0\u0249\0\u0276\0\341"+
    "\0\55\0\u02a3\0\u02d0\0\55\0\u02fd\0\u032a\0\u0357\0\u0384"+
    "\0\55\0\u03b1\0\u03de\0\u040b\0\u0438\0\u0465\0\u02a3\0\u0492"+
    "\0\u04bf\0\u04ec\0\u0519\0\u0546\0\u0573\0\u05a0\0\u05cd\0\u05fa"+
    "\0\u0627\0\u0654\0\u0681\0\u06ae\0\u06db\0\u0708\0\u0735\0\u0762"+
    "\0\u078f\0\u07bc\0\u07e9\0\u0816\0\u0843\0\u0870\0\u089d\0\u08ca"+
    "\0\u08f7\0\u0924\0\u0951\0\u097e\0\u09ab\0\u09d8\0\u0a05\0\u0a32"+
    "\0\u0a5f\0\u0a8c\0\u0ab9\0\u0ae6\0\u0b13\0\u0b40\0\u0b6d\0\u0b9a"+
    "\0\u0bc7\0\u0bf4\0\u0c21\0\u0c4e\0\u0c7b\0\u0ca8\0\u0cd5\0\u0d02"+
    "\0\u0d2f\0\u0d5c\0\u0d89\0\u0db6\0\u0de3\0\u0e10\0\u0e3d\0\55"+
    "\0\u0e6a\0\u0e97\0\u0ec4\0\u0ef1\0\u0f1e\0\u0f4b\0\u0f78\0\u0fa5"+
    "\0\u0fd2\0\u0fff\0\u102c\0\u1059\0\u1086\0\u10b3\0\u10e0\0\u110d"+
    "\0\u113a\0\u1167\0\u1194\0\u11c1\0\u11ee\0\u121b\0\u1248\0\u1275"+
    "\0\u12a2\0\u12cf\0\u12fc\0\u1329\0\u1356\0\u1383\0\u13b0\0\u13dd"+
    "\0\u140a\0\u05cd\0\u1437\0\u1464\0\u1491\0\u14be\0\u14eb\0\u1518"+
    "\0\u1545\0\u1572\0\u159f\0\u15cc\0\u15f9\0\u0a05\0\u1626\0\u1653"+
    "\0\u1680\0\u16ad\0\u16da\0\u1707\0\u1734\0\u1761\0\u178e\0\u17bb"+
    "\0\u17e8\0\u1815\0\55";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[147];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\0\2\2\1\3\1\2\1\4\1\5\2\6\1\7"+
    "\1\6\1\10\1\11\2\6\1\12\2\6\1\13\1\14"+
    "\1\15\1\16\1\6\1\17\1\6\1\20\1\6\1\21"+
    "\1\22\1\23\2\24\1\25\1\26\1\27\1\30\2\31"+
    "\1\32\1\33\1\34\1\0\1\31\63\0\1\24\55\0"+
    "\1\2\54\0\1\35\1\6\1\36\23\6\1\0\1\37"+
    "\3\0\1\37\2\40\1\30\10\0\1\41\5\0\1\35"+
    "\25\6\1\0\1\37\3\0\1\37\2\40\1\30\10\0"+
    "\1\41\5\0\1\35\5\6\1\42\6\6\1\43\10\6"+
    "\1\0\1\37\3\0\1\37\2\40\1\30\10\0\1\41"+
    "\5\0\1\35\1\6\1\20\23\6\1\0\1\37\3\0"+
    "\1\37\2\40\1\30\10\0\1\41\5\0\1\35\1\6"+
    "\1\44\5\6\1\45\15\6\1\0\1\37\3\0\1\37"+
    "\2\40\1\30\10\0\1\41\5\0\1\35\7\6\1\46"+
    "\15\6\1\0\1\37\3\0\1\37\2\40\1\30\10\0"+
    "\1\41\5\0\1\35\7\6\1\47\10\6\1\50\4\6"+
    "\1\0\1\37\3\0\1\37\2\40\1\30\10\0\1\41"+
    "\5\0\1\35\3\6\1\51\21\6\1\0\1\37\3\0"+
    "\1\37\2\40\1\30\10\0\1\41\5\0\1\35\3\6"+
    "\1\52\1\53\20\6\1\0\1\37\3\0\1\37\2\40"+
    "\1\30\10\0\1\41\5\0\1\35\4\6\1\54\2\6"+
    "\1\55\10\6\1\56\4\6\1\0\1\37\3\0\1\37"+
    "\2\40\1\30\10\0\1\41\5\0\1\35\4\6\1\57"+
    "\3\6\1\60\14\6\1\0\1\37\3\0\1\37\2\40"+
    "\1\30\10\0\1\41\5\0\1\35\25\37\1\0\1\37"+
    "\3\0\3\37\11\0\1\41\35\0\1\24\24\0\1\35"+
    "\25\61\1\0\1\37\3\0\1\25\2\62\1\63\10\0"+
    "\1\41\5\0\1\35\25\64\1\0\1\37\3\0\1\37"+
    "\1\65\1\66\1\67\10\0\1\41\5\0\1\35\25\64"+
    "\1\0\1\37\3\0\1\37\2\70\1\67\10\0\1\41"+
    "\6\0\25\30\6\0\2\71\1\30\56\0\1\31\7\0"+
    "\45\72\2\0\2\72\2\0\2\72\45\73\2\0\2\73"+
    "\2\0\2\73\6\0\25\37\1\0\1\37\3\0\3\37"+
    "\17\0\1\35\1\6\1\74\23\6\1\0\1\37\3\0"+
    "\1\37\2\40\1\30\10\0\1\41\5\0\1\35\25\75"+
    "\1\0\1\37\3\0\1\37\2\40\1\76\10\0\1\41"+
    "\6\0\25\77\6\0\2\77\17\0\1\35\11\6\1\100"+
    "\13\6\1\0\1\37\3\0\1\37\2\40\1\30\10\0"+
    "\1\41\5\0\1\35\6\6\1\101\16\6\1\0\1\37"+
    "\3\0\1\37\2\40\1\30\10\0\1\41\5\0\1\35"+
    "\5\6\1\102\4\6\1\103\12\6\1\0\1\37\3\0"+
    "\1\37\2\40\1\30\10\0\1\41\5\0\1\35\3\6"+
    "\1\104\21\6\1\0\1\37\3\0\1\37\2\40\1\30"+
    "\10\0\1\41\5\0\1\35\21\6\1\105\3\6\1\0"+
    "\1\37\3\0\1\37\2\40\1\30\10\0\1\41\5\0"+
    "\1\35\5\6\1\10\17\6\1\0\1\37\3\0\1\37"+
    "\2\40\1\30\10\0\1\41\5\0\1\35\1\106\24\6"+
    "\1\0\1\37\3\0\1\37\2\40\1\30\10\0\1\41"+
    "\5\0\1\35\16\6\1\107\6\6\1\0\1\37\3\0"+
    "\1\37\2\40\1\30\10\0\1\41\5\0\1\35\6\6"+
    "\1\110\16\6\1\0\1\37\3\0\1\37\2\40\1\30"+
    "\10\0\1\41\5\0\1\35\10\6\1\111\14\6\1\0"+
    "\1\37\3\0\1\37\2\40\1\30\10\0\1\41\5\0"+
    "\1\35\2\6\1\112\22\6\1\0\1\37\3\0\1\37"+
    "\2\40\1\30\10\0\1\41\5\0\1\35\5\6\1\20"+
    "\17\6\1\0\1\37\3\0\1\37\2\40\1\30\10\0"+
    "\1\41\5\0\1\35\5\6\1\113\17\6\1\0\1\37"+
    "\3\0\1\37\2\40\1\30\10\0\1\41\5\0\1\35"+
    "\10\6\1\114\14\6\1\0\1\37\3\0\1\37\2\40"+
    "\1\30\10\0\1\41\5\0\1\35\1\6\1\115\23\6"+
    "\1\0\1\37\3\0\1\37\2\40\1\30\10\0\1\41"+
    "\5\0\1\35\25\61\1\0\1\37\3\0\1\116\2\62"+
    "\1\63\10\0\1\41\5\0\1\35\25\117\1\0\1\37"+
    "\3\0\1\37\2\62\1\120\10\0\1\41\6\0\25\63"+
    "\5\0\1\121\2\122\1\63\16\0\1\35\25\64\1\0"+
    "\1\37\3\0\1\37\2\62\1\67\10\0\1\41\5\0"+
    "\1\35\25\64\1\0\1\37\2\0\1\123\1\37\1\124"+
    "\1\125\1\67\10\0\1\41\5\0\1\35\25\64\1\0"+
    "\1\37\2\0\1\123\1\37\1\126\1\125\1\67\10\0"+
    "\1\41\6\0\25\67\6\0\2\122\1\67\16\0\1\35"+
    "\25\64\1\0\1\37\2\0\1\123\1\37\2\127\1\67"+
    "\10\0\1\41\6\0\25\76\6\0\2\71\1\76\11\0"+
    "\1\72\1\0\43\72\1\0\1\72\1\0\3\72\1\0"+
    "\1\72\50\73\1\130\4\73\5\0\1\35\2\6\1\131"+
    "\22\6\1\0\1\37\3\0\1\37\2\40\1\30\10\0"+
    "\1\41\5\0\1\35\25\75\1\0\1\37\3\0\1\37"+
    "\2\132\1\76\10\0\1\41\6\0\25\76\6\0\2\133"+
    "\1\76\16\0\1\134\25\77\6\0\2\77\17\0\1\35"+
    "\1\6\1\135\1\6\1\136\21\6\1\0\1\37\3\0"+
    "\1\37\2\40\1\30\10\0\1\41\5\0\1\35\10\6"+
    "\1\137\14\6\1\0\1\37\3\0\1\37\2\40\1\30"+
    "\10\0\1\41\5\0\1\35\14\6\1\140\10\6\1\0"+
    "\1\37\3\0\1\37\2\40\1\30\10\0\1\41\5\0"+
    "\1\35\7\6\1\141\15\6\1\0\1\37\3\0\1\37"+
    "\2\40\1\30\10\0\1\41\5\0\1\35\10\6\1\142"+
    "\14\6\1\0\1\37\3\0\1\37\2\40\1\30\10\0"+
    "\1\41\5\0\1\35\1\6\1\143\23\6\1\0\1\37"+
    "\3\0\1\37\2\40\1\30\10\0\1\41\5\0\1\35"+
    "\21\6\1\144\3\6\1\0\1\37\3\0\1\37\2\40"+
    "\1\30\10\0\1\41\5\0\1\35\1\6\1\145\23\6"+
    "\1\0\1\37\3\0\1\37\2\40\1\30\10\0\1\41"+
    "\5\0\1\35\11\6\1\146\13\6\1\0\1\37\3\0"+
    "\1\37\2\40\1\30\10\0\1\41\5\0\1\35\7\6"+
    "\1\147\15\6\1\0\1\37\3\0\1\37\2\40\1\30"+
    "\10\0\1\41\5\0\1\35\14\6\1\10\10\6\1\0"+
    "\1\37\3\0\1\37\2\40\1\30\10\0\1\41\5\0"+
    "\1\35\6\6\1\150\16\6\1\0\1\37\3\0\1\37"+
    "\2\40\1\30\10\0\1\41\5\0\1\35\4\6\1\20"+
    "\20\6\1\0\1\37\3\0\1\37\2\40\1\30\10\0"+
    "\1\41\5\0\1\35\6\6\1\151\13\6\1\152\2\6"+
    "\1\0\1\37\3\0\1\37\2\40\1\30\10\0\1\41"+
    "\5\0\1\35\25\117\1\0\1\37\3\0\1\116\2\37"+
    "\1\120\10\0\1\41\5\0\1\35\25\117\1\0\1\37"+
    "\3\0\3\37\1\120\10\0\1\41\6\0\25\120\10\0"+
    "\1\120\17\0\25\120\5\0\1\121\2\0\1\120\17\0"+
    "\25\120\6\0\2\122\1\120\52\0\2\153\17\0\1\35"+
    "\25\64\1\0\1\37\3\0\1\37\1\124\1\125\1\67"+
    "\10\0\1\41\5\0\1\35\25\64\1\0\1\37\3\0"+
    "\1\37\1\126\1\125\1\67\10\0\1\41\5\0\1\35"+
    "\25\64\1\0\1\37\3\0\1\37\1\126\1\127\1\67"+
    "\10\0\1\41\5\0\1\35\25\64\1\0\1\37\3\0"+
    "\1\37\2\127\1\67\10\0\1\41\5\0\1\35\3\6"+
    "\1\154\21\6\1\0\1\37\3\0\1\37\2\40\1\30"+
    "\10\0\1\41\5\0\1\35\25\37\1\0\1\37\3\0"+
    "\1\37\2\132\11\0\1\41\41\0\2\133\20\0\25\155"+
    "\6\0\2\77\17\0\1\35\5\6\1\156\17\6\1\0"+
    "\1\37\3\0\1\37\2\40\1\30\10\0\1\41\5\0"+
    "\1\35\10\6\1\10\14\6\1\0\1\37\3\0\1\37"+
    "\2\40\1\30\10\0\1\41\5\0\1\35\7\6\1\157"+
    "\15\6\1\0\1\37\3\0\1\37\2\40\1\30\10\0"+
    "\1\41\5\0\1\35\11\6\1\160\13\6\1\0\1\37"+
    "\3\0\1\37\2\40\1\30\10\0\1\41\5\0\1\35"+
    "\3\6\1\161\21\6\1\0\1\37\3\0\1\37\2\40"+
    "\1\30\10\0\1\41\5\0\1\35\11\6\1\10\13\6"+
    "\1\0\1\37\3\0\1\37\2\40\1\30\10\0\1\41"+
    "\5\0\1\35\14\6\1\20\10\6\1\0\1\37\3\0"+
    "\1\37\2\40\1\30\10\0\1\41\5\0\1\35\10\6"+
    "\1\162\14\6\1\0\1\37\3\0\1\37\2\40\1\30"+
    "\10\0\1\41\5\0\1\35\2\6\1\163\22\6\1\0"+
    "\1\37\3\0\1\37\2\40\1\30\10\0\1\41\5\0"+
    "\1\35\1\6\1\164\23\6\1\0\1\37\3\0\1\37"+
    "\2\40\1\30\10\0\1\41\5\0\1\35\4\6\1\165"+
    "\20\6\1\0\1\37\3\0\1\37\2\40\1\30\10\0"+
    "\1\41\5\0\1\35\7\6\1\166\15\6\1\0\1\37"+
    "\3\0\1\37\2\40\1\30\10\0\1\41\5\0\1\35"+
    "\3\6\1\167\21\6\1\0\1\37\3\0\1\37\2\40"+
    "\1\30\10\0\1\41\5\0\1\35\10\6\1\170\14\6"+
    "\1\0\1\37\3\0\1\37\2\40\1\30\10\0\1\41"+
    "\41\0\2\171\17\0\1\35\4\6\1\172\20\6\1\0"+
    "\1\37\3\0\1\37\2\40\1\30\10\0\1\41\5\0"+
    "\1\134\25\173\6\0\2\77\17\0\1\35\6\6\1\174"+
    "\16\6\1\0\1\37\3\0\1\37\2\40\1\30\10\0"+
    "\1\41\5\0\1\35\1\175\24\6\1\0\1\37\3\0"+
    "\1\37\2\40\1\30\10\0\1\41\5\0\1\35\4\6"+
    "\1\176\20\6\1\0\1\37\3\0\1\37\2\40\1\30"+
    "\10\0\1\41\5\0\1\35\5\6\1\177\17\6\1\0"+
    "\1\37\3\0\1\37\2\40\1\30\10\0\1\41\5\0"+
    "\1\35\1\6\1\200\23\6\1\0\1\37\3\0\1\37"+
    "\2\40\1\30\10\0\1\41\5\0\1\35\16\6\1\201"+
    "\6\6\1\0\1\37\3\0\1\37\2\40\1\30\10\0"+
    "\1\41\5\0\1\35\10\6\1\20\14\6\1\0\1\37"+
    "\3\0\1\37\2\40\1\30\10\0\1\41\5\0\1\35"+
    "\1\202\24\6\1\0\1\37\3\0\1\37\2\40\1\30"+
    "\10\0\1\41\5\0\1\35\1\6\1\55\23\6\1\0"+
    "\1\37\3\0\1\37\2\40\1\30\10\0\1\41\5\0"+
    "\1\35\15\6\1\203\7\6\1\0\1\37\3\0\1\37"+
    "\2\40\1\30\10\0\1\41\5\0\1\35\4\6\1\204"+
    "\20\6\1\0\1\37\3\0\1\37\2\40\1\30\10\0"+
    "\1\41\37\0\1\205\22\0\1\134\25\206\6\0\2\77"+
    "\17\0\1\35\3\6\1\143\21\6\1\0\1\37\3\0"+
    "\1\37\2\40\1\30\10\0\1\41\5\0\1\35\7\6"+
    "\1\164\15\6\1\0\1\37\3\0\1\37\2\40\1\30"+
    "\10\0\1\41\5\0\1\35\5\6\1\207\17\6\1\0"+
    "\1\37\3\0\1\37\2\40\1\30\10\0\1\41\5\0"+
    "\1\35\13\6\1\10\11\6\1\0\1\37\3\0\1\37"+
    "\2\40\1\30\10\0\1\41\5\0\1\35\22\6\1\210"+
    "\2\6\1\0\1\37\3\0\1\37\2\40\1\30\10\0"+
    "\1\41\5\0\1\35\3\6\1\164\21\6\1\0\1\37"+
    "\3\0\1\37\2\40\1\30\10\0\1\41\5\0\1\35"+
    "\2\6\1\174\22\6\1\0\1\37\3\0\1\37\2\40"+
    "\1\30\10\0\1\41\5\0\1\35\7\6\1\211\15\6"+
    "\1\0\1\37\3\0\1\37\2\40\1\30\10\0\1\41"+
    "\5\0\1\35\12\6\1\114\12\6\1\0\1\37\3\0"+
    "\1\37\2\40\1\30\10\0\1\41\41\0\2\212\17\0"+
    "\1\35\11\6\1\174\13\6\1\0\1\37\3\0\1\37"+
    "\2\40\1\30\10\0\1\41\5\0\1\35\10\6\1\213"+
    "\14\6\1\0\1\37\3\0\1\37\2\40\1\30\10\0"+
    "\1\41\5\0\1\35\12\6\1\214\12\6\1\0\1\37"+
    "\3\0\1\37\2\40\1\30\10\0\1\41\41\0\2\215"+
    "\17\0\1\35\4\6\1\216\20\6\1\0\1\37\3\0"+
    "\1\37\2\40\1\30\10\0\1\41\5\0\1\35\7\6"+
    "\1\217\15\6\1\0\1\37\3\0\1\37\2\40\1\30"+
    "\10\0\1\41\41\0\2\220\17\0\1\35\12\6\1\221"+
    "\12\6\1\0\1\37\3\0\1\37\2\40\1\30\10\0"+
    "\1\41\5\0\1\35\3\6\1\222\21\6\1\0\1\37"+
    "\3\0\1\37\2\40\1\30\10\0\1\41\41\0\2\223"+
    "\17\0\1\35\4\6\1\143\20\6\1\0\1\37\3\0"+
    "\1\37\2\40\1\30\10\0\1\41\5\0\1\35\5\6"+
    "\1\142\17\6\1\0\1\37\3\0\1\37\2\40\1\30"+
    "\10\0\1\41";

  private static int [] zzUnpackTrans() {
    int [] result = new int[6210];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\1\1\1\0\14\1\1\11\2\1\1\11"+
    "\4\1\1\11\1\1\3\0\1\1\1\0\1\1\1\0"+
    "\31\1\1\0\3\1\1\0\23\1\1\0\4\1\1\11"+
    "\3\1\1\0\16\1\1\0\1\1\1\0\13\1\1\0"+
    "\13\1\1\0\4\1\1\0\2\1\1\0\2\1\1\0"+
    "\2\1\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[147];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
 
 //Esta propiedad permite verificar si existen tokens pendientes
 private boolean _existenTokens = false;
 
 public boolean existenTokens(){
 return this._existenTokens;
 }
 


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public DatosAnalizadorLexico(java.io.Reader in) {
   /* C�digo que se ejecutar� en el constructor de la clase */
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 176) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
     
 /* C�digo a ejecutar al finalizar el an�lisis, en este caso cambiaremos el valor de una variable bandera */
 this._existenTokens = false;
 

    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public ControlTokenPersonalizado yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { ControlTokenPersonalizado t = new ControlTokenPersonalizado(yytext(), " DELIMITADOR ");
 this._existenTokens = true;
 return t;
            }
          case 12: break;
          case 2: 
            { ControlTokenPersonalizado t = new ControlTokenPersonalizado(yytext(), " IDENTIFICADOR ");
 this._existenTokens = true;
 return t;
            }
          case 13: break;
          case 3: 
            { ControlTokenPersonalizado t = new ControlTokenPersonalizado(yytext(), " PALABRA RESERVADA ");
 this._existenTokens = true;
 return t;
            }
          case 14: break;
          case 4: 
            { ControlTokenPersonalizado t = new ControlTokenPersonalizado(yytext(), " OPERADOR ");
 this._existenTokens = true;
 return t;
            }
          case 15: break;
          case 5: 
            { ControlTokenPersonalizado t = new ControlTokenPersonalizado(yytext(), " IDENTIFICADOR "); 
 this._existenTokens = true;
 return t;
            }
          case 16: break;
          case 6: 
            { ControlTokenPersonalizado t = new ControlTokenPersonalizado(yytext(), " CONSTANTE ");
 this._existenTokens = true;
 return t;
            }
          case 17: break;
          case 7: 
            { 
            }
          case 18: break;
          case 8: 
            { ControlTokenPersonalizado t = new ControlTokenPersonalizado(yytext(), " COMENTARIO ");
 this._existenTokens = true;
 return t;
            }
          case 19: break;
          case 9: 
            { ControlTokenPersonalizado t = new ControlTokenPersonalizado(yytext(), " CADENA ENTRE COMILLAS ");
 this._existenTokens = true;
 return t;
            }
          case 20: break;
          case 10: 
            { ControlTokenPersonalizado t = new ControlTokenPersonalizado(yytext(), " EMAIL ");
 this._existenTokens = true;
 return t;
            }
          case 21: break;
          case 11: 
            { ControlTokenPersonalizado t = new ControlTokenPersonalizado(yytext(), " FECHA DD/MM/AAAA ");
 this._existenTokens = true;
 return t;
            }
          case 22: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
