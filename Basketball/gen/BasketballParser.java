// Generated from /Users/abramjstamper/Documents/Junior Year/2nd Semester/COS382/cos382LanguageStructs/Basketball/Basketball.g4 by ANTLR 4.6
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BasketballParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, CLOCK=6, QUARTERS=7, SEMI=8, NUMBER=9, 
		FGM=10, FGA=11, TEAM=12, WS=13;
	public static final int
		RULE_start = 0, RULE_shot = 1, RULE_rebound = 2, RULE_assist = 3, RULE_assistAtt = 4, 
		RULE_player = 5, RULE_turnover = 6, RULE_foul = 7, RULE_freethrow = 8, 
		RULE_quarter = 9;
	public static final String[] ruleNames = {
		"start", "shot", "rebound", "assist", "assistAtt", "player", "turnover", 
		"foul", "freethrow", "quarter"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'t'", "'f'", "'m'", "'a'", "'q'", null, null, "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, "CLOCK", "QUARTERS", "SEMI", "NUMBER", 
		"FGM", "FGA", "TEAM", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Basketball.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BasketballParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(BasketballParser.SEMI, 0); }
		public ShotContext shot() {
			return getRuleContext(ShotContext.class,0);
		}
		public FoulContext foul() {
			return getRuleContext(FoulContext.class,0);
		}
		public TurnoverContext turnover() {
			return getRuleContext(TurnoverContext.class,0);
		}
		public TerminalNode CLOCK() { return getToken(BasketballParser.CLOCK, 0); }
		public QuarterContext quarter() {
			return getRuleContext(QuarterContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasketballListener ) ((BasketballListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasketballListener ) ((BasketballListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasketballVisitor ) return ((BasketballVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEMI:
			case FGM:
			case FGA:
				{
				setState(20);
				shot();
				}
				break;
			case T__1:
				{
				setState(21);
				foul();
				}
				break;
			case T__0:
				{
				setState(22);
				turnover();
				}
				break;
			case CLOCK:
				{
				setState(23);
				match(CLOCK);
				}
				break;
			case T__4:
				{
				setState(24);
				quarter();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(27);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShotContext extends ParserRuleContext {
		public TerminalNode FGM() { return getToken(BasketballParser.FGM, 0); }
		public PlayerContext player() {
			return getRuleContext(PlayerContext.class,0);
		}
		public AssistContext assist() {
			return getRuleContext(AssistContext.class,0);
		}
		public TerminalNode FGA() { return getToken(BasketballParser.FGA, 0); }
		public ReboundContext rebound() {
			return getRuleContext(ReboundContext.class,0);
		}
		public AssistAttContext assistAtt() {
			return getRuleContext(AssistAttContext.class,0);
		}
		public ShotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasketballListener ) ((BasketballListener)listener).enterShot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasketballListener ) ((BasketballListener)listener).exitShot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasketballVisitor ) return ((BasketballVisitor<? extends T>)visitor).visitShot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShotContext shot() throws RecognitionException {
		ShotContext _localctx = new ShotContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_shot);
		int _la;
		try {
			setState(42);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FGM:
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				match(FGM);
				setState(30);
				player();
				setState(32);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TEAM) {
					{
					setState(31);
					assist();
					}
				}

				}
				break;
			case FGA:
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				match(FGA);
				setState(35);
				player();
				setState(37);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(36);
					assistAtt();
					}
					break;
				}
				setState(39);
				rebound();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReboundContext extends ParserRuleContext {
		public PlayerContext player() {
			return getRuleContext(PlayerContext.class,0);
		}
		public ReboundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rebound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasketballListener ) ((BasketballListener)listener).enterRebound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasketballListener ) ((BasketballListener)listener).exitRebound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasketballVisitor ) return ((BasketballVisitor<? extends T>)visitor).visitRebound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReboundContext rebound() throws RecognitionException {
		ReboundContext _localctx = new ReboundContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_rebound);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			player();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssistContext extends ParserRuleContext {
		public PlayerContext player() {
			return getRuleContext(PlayerContext.class,0);
		}
		public AssistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasketballListener ) ((BasketballListener)listener).enterAssist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasketballListener ) ((BasketballListener)listener).exitAssist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasketballVisitor ) return ((BasketballVisitor<? extends T>)visitor).visitAssist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssistContext assist() throws RecognitionException {
		AssistContext _localctx = new AssistContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			player();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssistAttContext extends ParserRuleContext {
		public PlayerContext player() {
			return getRuleContext(PlayerContext.class,0);
		}
		public AssistAttContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assistAtt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasketballListener ) ((BasketballListener)listener).enterAssistAtt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasketballListener ) ((BasketballListener)listener).exitAssistAtt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasketballVisitor ) return ((BasketballVisitor<? extends T>)visitor).visitAssistAtt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssistAttContext assistAtt() throws RecognitionException {
		AssistAttContext _localctx = new AssistAttContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assistAtt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			player();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PlayerContext extends ParserRuleContext {
		public TerminalNode TEAM() { return getToken(BasketballParser.TEAM, 0); }
		public TerminalNode NUMBER() { return getToken(BasketballParser.NUMBER, 0); }
		public PlayerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_player; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasketballListener ) ((BasketballListener)listener).enterPlayer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasketballListener ) ((BasketballListener)listener).exitPlayer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasketballVisitor ) return ((BasketballVisitor<? extends T>)visitor).visitPlayer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlayerContext player() throws RecognitionException {
		PlayerContext _localctx = new PlayerContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_player);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(TEAM);
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER) {
				{
				setState(51);
				match(NUMBER);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TurnoverContext extends ParserRuleContext {
		public List<PlayerContext> player() {
			return getRuleContexts(PlayerContext.class);
		}
		public PlayerContext player(int i) {
			return getRuleContext(PlayerContext.class,i);
		}
		public TurnoverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_turnover; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasketballListener ) ((BasketballListener)listener).enterTurnover(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasketballListener ) ((BasketballListener)listener).exitTurnover(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasketballVisitor ) return ((BasketballVisitor<? extends T>)visitor).visitTurnover(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TurnoverContext turnover() throws RecognitionException {
		TurnoverContext _localctx = new TurnoverContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_turnover);
		try {
			setState(60);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				match(T__0);
				setState(55);
				player();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				match(T__0);
				setState(57);
				player();
				setState(58);
				player();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FoulContext extends ParserRuleContext {
		public PlayerContext player() {
			return getRuleContext(PlayerContext.class,0);
		}
		public TerminalNode CLOCK() { return getToken(BasketballParser.CLOCK, 0); }
		public List<FreethrowContext> freethrow() {
			return getRuleContexts(FreethrowContext.class);
		}
		public FreethrowContext freethrow(int i) {
			return getRuleContext(FreethrowContext.class,i);
		}
		public FoulContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foul; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasketballListener ) ((BasketballListener)listener).enterFoul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasketballListener ) ((BasketballListener)listener).exitFoul(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasketballVisitor ) return ((BasketballVisitor<? extends T>)visitor).visitFoul(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FoulContext foul() throws RecognitionException {
		FoulContext _localctx = new FoulContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_foul);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(T__1);
			setState(63);
			player();
			setState(64);
			match(CLOCK);
			 System.out.println("What time is it?"); 
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(66);
				freethrow();
				}
				break;
			}
			setState(70);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(69);
				freethrow();
				}
				break;
			}
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2 || _la==T__3) {
				{
				setState(72);
				freethrow();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FreethrowContext extends ParserRuleContext {
		public PlayerContext player() {
			return getRuleContext(PlayerContext.class,0);
		}
		public ReboundContext rebound() {
			return getRuleContext(ReboundContext.class,0);
		}
		public FreethrowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_freethrow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasketballListener ) ((BasketballListener)listener).enterFreethrow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasketballListener ) ((BasketballListener)listener).exitFreethrow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasketballVisitor ) return ((BasketballVisitor<? extends T>)visitor).visitFreethrow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FreethrowContext freethrow() throws RecognitionException {
		FreethrowContext _localctx = new FreethrowContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_freethrow);
		try {
			setState(81);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				match(T__2);
				setState(76);
				player();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				match(T__3);
				setState(78);
				player();
				setState(79);
				rebound();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuarterContext extends ParserRuleContext {
		public TerminalNode QUARTERS() { return getToken(BasketballParser.QUARTERS, 0); }
		public TerminalNode CLOCK() { return getToken(BasketballParser.CLOCK, 0); }
		public QuarterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quarter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasketballListener ) ((BasketballListener)listener).enterQuarter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasketballListener ) ((BasketballListener)listener).exitQuarter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasketballVisitor ) return ((BasketballVisitor<? extends T>)visitor).visitQuarter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuarterContext quarter() throws RecognitionException {
		QuarterContext _localctx = new QuarterContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_quarter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(T__4);
			setState(84);
			match(QUARTERS);
			setState(85);
			match(CLOCK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\17Z\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\3\2\3\2\3\2\3\2\5\2\34\n\2\3\2\3\2\3\3\3\3\3\3\5\3#\n\3\3\3\3\3\3\3"+
		"\5\3(\n\3\3\3\3\3\3\3\5\3-\n\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\5\7\67"+
		"\n\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b?\n\b\3\t\3\t\3\t\3\t\3\t\5\tF\n\t\3\t"+
		"\5\tI\n\t\3\t\5\tL\n\t\3\n\3\n\3\n\3\n\3\n\3\n\5\nT\n\n\3\13\3\13\3\13"+
		"\3\13\3\13\2\2\f\2\4\6\b\n\f\16\20\22\24\2\2]\2\33\3\2\2\2\4,\3\2\2\2"+
		"\6.\3\2\2\2\b\60\3\2\2\2\n\62\3\2\2\2\f\64\3\2\2\2\16>\3\2\2\2\20@\3\2"+
		"\2\2\22S\3\2\2\2\24U\3\2\2\2\26\34\5\4\3\2\27\34\5\20\t\2\30\34\5\16\b"+
		"\2\31\34\7\b\2\2\32\34\5\24\13\2\33\26\3\2\2\2\33\27\3\2\2\2\33\30\3\2"+
		"\2\2\33\31\3\2\2\2\33\32\3\2\2\2\34\35\3\2\2\2\35\36\7\n\2\2\36\3\3\2"+
		"\2\2\37 \7\f\2\2 \"\5\f\7\2!#\5\b\5\2\"!\3\2\2\2\"#\3\2\2\2#-\3\2\2\2"+
		"$%\7\r\2\2%\'\5\f\7\2&(\5\n\6\2\'&\3\2\2\2\'(\3\2\2\2()\3\2\2\2)*\5\6"+
		"\4\2*-\3\2\2\2+-\3\2\2\2,\37\3\2\2\2,$\3\2\2\2,+\3\2\2\2-\5\3\2\2\2./"+
		"\5\f\7\2/\7\3\2\2\2\60\61\5\f\7\2\61\t\3\2\2\2\62\63\5\f\7\2\63\13\3\2"+
		"\2\2\64\66\7\16\2\2\65\67\7\13\2\2\66\65\3\2\2\2\66\67\3\2\2\2\67\r\3"+
		"\2\2\289\7\3\2\29?\5\f\7\2:;\7\3\2\2;<\5\f\7\2<=\5\f\7\2=?\3\2\2\2>8\3"+
		"\2\2\2>:\3\2\2\2?\17\3\2\2\2@A\7\4\2\2AB\5\f\7\2BC\7\b\2\2CE\b\t\1\2D"+
		"F\5\22\n\2ED\3\2\2\2EF\3\2\2\2FH\3\2\2\2GI\5\22\n\2HG\3\2\2\2HI\3\2\2"+
		"\2IK\3\2\2\2JL\5\22\n\2KJ\3\2\2\2KL\3\2\2\2L\21\3\2\2\2MN\7\5\2\2NT\5"+
		"\f\7\2OP\7\6\2\2PQ\5\f\7\2QR\5\6\4\2RT\3\2\2\2SM\3\2\2\2SO\3\2\2\2T\23"+
		"\3\2\2\2UV\7\7\2\2VW\7\t\2\2WX\7\b\2\2X\25\3\2\2\2\f\33\"\',\66>EHKS";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}