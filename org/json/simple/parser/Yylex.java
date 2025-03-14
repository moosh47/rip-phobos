/*     */ package org.json.simple.parser;
/*     */ 
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.InputStreamReader;
/*     */ import java.io.Reader;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class Yylex
/*     */ {
/*     */   public static final int YYEOF;
/*     */   private static final int ZZ_BUFFERSIZE;
/*     */   public static final int YYINITIAL;
/*     */   public static final int STRING_BEGIN;
/*  23 */   private static final int[] ZZ_LEXSTATE = new int[] {};
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final String ZZ_CMAP_PACKED = "";
  /*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  40 */   private static final char[] ZZ_CMAP = "";
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  45 */   private static final int[] ZZ_ACTION;
/*     */ 
/*     */ 
/*     */   
/*     */   private static final String ZZ_ACTION_PACKED_0 = "";
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static int[] zzUnpackAction() {
/*  55 */     int[] result = new int[45];
/*  56 */     int offset = 0;
/*  57 */     offset;
/*  58 */     return result;
/*     */   }
/*     */   
/*     */   private static int zzUnpackAction(String packed, int offset, int[] result) {
/*  62 */     int i = 0;
/*  63 */     int j = offset;
/*  64 */     int l = packed.length();
/*  65 */     label10: while (i < l) {
/*  66 */       int count = packed.charAt(i++);
/*  67 */       int value = packed.charAt(i++); while (true)
/*  68 */       { result[j++] = value; if (--count <= 0)
/*     */           continue label10;  } 
/*  70 */     }  return j;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  77 */   private static final int[] ZZ_ROWMAP = zzUnpackRowMap();
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final String ZZ_ROWMAP_PACKED_0 = "";
  /*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static int[] zzUnpackRowMap() {
/*  88 */     int[] result = new int[45];
/*  89 */     int offset = 0;
/*  90 */     offset;
/*  91 */     return result;
/*     */   }
/*     */   
/*     */   private static int zzUnpackRowMap(String packed, int offset, int[] result) {
/*  95 */     int i = 0;
/*  96 */     int j = offset;
/*  97 */     int l = packed.length();
/*  98 */     while (i < l) {
/*  99 */       int high = packed.charAt(i++) << 16;
/* 100 */       result[j++] = high | packed.charAt(i++);
/*     */     } 
/* 102 */     return j;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 108 */   private static final int[] ZZ_TRANS = new int[] {};
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final int ZZ_UNKNOWN_ERROR = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final int ZZ_NO_MATCH = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final int ZZ_PUSHBACK_2BIG = 2;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 185 */   private static final String[] ZZ_ERROR_MSG = new String[] { "Unkown internal scanner error", "Error: could not match input", "Error: pushback value was too large" };
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 194 */   private static final int[] ZZ_ATTRIBUTE = zzUnpackAttribute();
/*     */   
/*     */   private static final String ZZ_ATTRIBUTE_PACKED_0 = "";
/*     */   
/*     */   private Reader zzReader;
/*     */   private int zzState;
/*     */   
/*     */   private static int[] zzUnpackAttribute() {
/* 202 */     int[] result = new int[45];
/* 203 */     int offset = 0;
/* 204 */     offset;
/* 205 */     return result;
/*     */   }
/*     */   
/*     */   private static int zzUnpackAttribute(String packed, int offset, int[] result) {
/* 209 */     int i = 0;
/* 210 */     int j = offset;
/* 211 */     int l = packed.length();
/* 212 */     label10: while (i < l) {
/* 213 */       int count = packed.charAt(i++);
/* 214 */       int value = packed.charAt(i++); while (true)
/* 215 */       { result[j++] = value; if (--count <= 0)
/*     */           continue label10;  } 
/* 217 */     }  return j;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 227 */   private int zzLexicalState = 0;
/*     */ 
/*     */ 
/*     */   
/* 231 */   private char[] zzBuffer = new char[16384];
/*     */ 
/*     */ 
/*     */   
/*     */   private int zzMarkedPos;
/*     */ 
/*     */ 
/*     */   
/*     */   private int zzCurrentPos;
/*     */ 
/*     */ 
/*     */   
/*     */   private int zzStartRead;
/*     */ 
/*     */ 
/*     */   
/*     */   private int zzEndRead;
/*     */ 
/*     */ 
/*     */   
/*     */   private int yyline;
/*     */ 
/*     */ 
/*     */   
/*     */   private int yychar;
/*     */ 
/*     */   
/*     */   private int yycolumn;
/*     */ 
/*     */   
/*     */   private boolean zzAtBOL = true;
/*     */ 
/*     */   
/*     */   private boolean zzAtEOF;
/*     */ 
/*     */   
/* 267 */   private StringBuffer sb = new StringBuffer();
/*     */   
/*     */   int getPosition() {
/* 270 */     return this.yychar;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   Yylex(Reader in) {
/* 282 */     this.zzReader = in;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   Yylex(InputStream in) {
/* 292 */     this(new InputStreamReader(in));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static char[] zzUnpackCMap(String packed) {
/* 302 */     char[] map = new char[65536];
/* 303 */     int i = 0;
/* 304 */     int j = 0;
/* 305 */     label10: while (i < 90) {
/* 306 */       int count = packed.charAt(i++);
/* 307 */       char value = packed.charAt(i++); while (true)
/* 308 */       { map[j++] = value; if (--count <= 0)
/*     */           continue label10;  } 
/* 310 */     }  return map;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean zzRefill() throws IOException {
/* 324 */     if (this.zzStartRead > 0) {
/* 325 */       System.arraycopy(this.zzBuffer, this.zzStartRead, this.zzBuffer, 0, this.zzEndRead - this.zzStartRead);
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 330 */       this.zzEndRead -= this.zzStartRead;
/* 331 */       this.zzCurrentPos -= this.zzStartRead;
/* 332 */       this.zzMarkedPos -= this.zzStartRead;
/* 333 */       this.zzStartRead = 0;
/*     */     } 
/*     */ 
/*     */     
/* 337 */     if (this.zzCurrentPos >= this.zzBuffer.length) {
/*     */       
/* 339 */       char[] newBuffer = new char[this.zzCurrentPos * 2];
/* 340 */       System.arraycopy(this.zzBuffer, 0, newBuffer, 0, this.zzBuffer.length);
/* 341 */       this.zzBuffer = newBuffer;
/*     */     } 
/*     */ 
/*     */     
/* 345 */     int numRead = this.zzReader.read(this.zzBuffer, this.zzEndRead, this.zzBuffer.length - this.zzEndRead);
/*     */ 
/*     */     
/* 348 */     if (numRead > 0) {
/* 349 */       this.zzEndRead += numRead;
/* 350 */       return false;
/*     */     } 
/*     */     
/* 353 */     if (numRead == 0) {
/* 354 */       int c = this.zzReader.read();
/* 355 */       if (c == -1) {
/* 356 */         return true;
/*     */       }
/* 358 */       this.zzBuffer[this.zzEndRead++] = (char)c;
/* 359 */       return false;
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 364 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void yyclose() throws IOException {
/* 372 */     this.zzAtEOF = true;
/* 373 */     this.zzEndRead = this.zzStartRead;
/*     */     
/* 375 */     if (this.zzReader != null) {
/* 376 */       this.zzReader.close();
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void yyreset(Reader reader) {
/* 391 */     this.zzReader = reader;
/* 392 */     this.zzAtBOL = true;
/* 393 */     this.zzAtEOF = false;
/* 394 */     this.zzEndRead = this.zzStartRead = 0;
/* 395 */     this.zzCurrentPos = this.zzMarkedPos = 0;
/* 396 */     this.yyline = this.yychar = this.yycolumn = 0;
/* 397 */     this.zzLexicalState = 0;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final int yystate() {
/* 405 */     return this.zzLexicalState;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void yybegin(int newState) {
/* 415 */     this.zzLexicalState = newState;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final String yytext() {
/* 423 */     return new String(this.zzBuffer, this.zzStartRead, this.zzMarkedPos - this.zzStartRead);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final char yycharat(int pos) {
/* 439 */     return this.zzBuffer[this.zzStartRead + pos];
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final int yylength() {
/* 447 */     return this.zzMarkedPos - this.zzStartRead;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void zzScanError(int errorCode) {
/*     */     String str;
/*     */     try {
/* 468 */       str = ZZ_ERROR_MSG[errorCode];
/*     */     }
/* 470 */     catch (ArrayIndexOutOfBoundsException e) {
/* 471 */       str = ZZ_ERROR_MSG[0];
/*     */     } 
/*     */     
/* 474 */     throw new Error(str);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void yypushback(int number) {
/* 487 */     if (number > yylength()) {
/* 488 */       zzScanError(2);
/*     */     }
/* 490 */     this.zzMarkedPos -= number;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Yytoken yylex() throws IOException, ParseException {
/* 508 */     int zzEndReadL = this.zzEndRead;
/* 509 */     char[] zzBufferL = this.zzBuffer;
/* 510 */     char[] zzCMapL = ZZ_CMAP;
/*     */     
/* 512 */     int[] zzTransL = ZZ_TRANS;
/* 513 */     int[] zzRowMapL = ZZ_ROWMAP;
/* 514 */     int[] zzAttrL = ZZ_ATTRIBUTE; while (true) {
/*     */       int zzInput; Boolean bool; Double double_;
/*     */       Long val;
/* 517 */       int zzMarkedPosL = this.zzMarkedPos;
/*     */       
/* 519 */       this.yychar += zzMarkedPosL - this.zzStartRead;
/*     */       
/* 521 */       int zzAction = -1;
/*     */       
/* 523 */       int zzCurrentPosL = this.zzCurrentPos = this.zzStartRead = zzMarkedPosL;
/*     */       
/* 525 */       this.zzState = ZZ_LEXSTATE[this.zzLexicalState];
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       while (true) {
/* 531 */         if (zzCurrentPosL < zzEndReadL)
/* 532 */         { zzInput = zzBufferL[zzCurrentPosL++]; }
/* 533 */         else { if (this.zzAtEOF) {
/* 534 */             int i = -1;
/*     */             
/*     */             break;
/*     */           } 
/*     */           
/* 539 */           this.zzCurrentPos = zzCurrentPosL;
/* 540 */           this.zzMarkedPos = zzMarkedPosL;
/* 541 */           boolean eof = zzRefill();
/*     */           
/* 543 */           zzCurrentPosL = this.zzCurrentPos;
/* 544 */           zzMarkedPosL = this.zzMarkedPos;
/* 545 */           zzBufferL = this.zzBuffer;
/* 546 */           zzEndReadL = this.zzEndRead;
/* 547 */           if (eof) {
/* 548 */             int i = -1;
/*     */             
/*     */             break;
/*     */           } 
/* 552 */           zzInput = zzBufferL[zzCurrentPosL++]; }
/*     */ 
/*     */         
/* 555 */         int zzNext = zzTransL[zzRowMapL[this.zzState] + zzCMapL[zzInput]];
/* 556 */         if (zzNext == -1)
/* 557 */           break;  this.zzState = zzNext;
/*     */         
/* 559 */         int zzAttributes = zzAttrL[this.zzState];
/* 560 */         if ((zzAttributes & 0x1) == 1) {
/* 561 */           zzAction = this.zzState;
/* 562 */           zzMarkedPosL = zzCurrentPosL;
/* 563 */           if ((zzAttributes & 0x8) == 8) {
/*     */             break;
/*     */           }
/*     */         } 
/*     */       } 
/*     */ 
/*     */       
/* 570 */       this.zzMarkedPos = zzMarkedPosL;
/*     */       
/* 572 */       switch ((zzAction < 0) ? zzAction : ZZ_ACTION[zzAction]) {
/*     */         case 11:
/* 574 */           this.sb.append(yytext()); continue;
/*     */         case 25:
/*     */           continue;
/*     */         case 4:
/* 578 */           this.sb.delete(0, this.sb.length()); yybegin(2); continue;
/*     */         case 26:
/*     */           continue;
/*     */         case 16:
/* 582 */           this.sb.append('\b'); continue;
/*     */         case 27:
/*     */           continue;
/*     */         case 6:
/* 586 */           return new Yytoken(2, null);
/*     */         case 28:
/*     */           continue;
/*     */         case 23:
/* 590 */           bool = Boolean.valueOf(yytext()); return new Yytoken(0, bool);
/*     */         case 29:
/*     */           continue;
/*     */         case 22:
/* 594 */           return new Yytoken(0, null);
/*     */         case 30:
/*     */           continue;
/*     */         case 13:
/* 598 */           yybegin(0); return new Yytoken(0, this.sb.toString());
/*     */         case 31:
/*     */           continue;
/*     */         case 12:
/* 602 */           this.sb.append('\\'); continue;
/*     */         case 32:
/*     */           continue;
/*     */         case 21:
/* 606 */           double_ = Double.valueOf(yytext()); return new Yytoken(0, double_);
/*     */         case 33:
/*     */           continue;
/*     */         case 1:
/* 610 */           throw new ParseException(this.yychar, 0, new Character(yycharat(0)));
/*     */         case 34:
/*     */           continue;
/*     */         case 8:
/* 614 */           return new Yytoken(4, null);
/*     */         case 35:
/*     */           continue;
/*     */         case 19:
/* 618 */           this.sb.append('\r'); continue;
/*     */         case 36:
/*     */           continue;
/*     */         case 15:
/* 622 */           this.sb.append('/'); continue;
/*     */         case 37:
/*     */           continue;
/*     */         case 10:
/* 626 */           return new Yytoken(6, null);
/*     */         case 38:
/*     */           continue;
/*     */         case 14:
/* 630 */           this.sb.append('"'); continue;
/*     */         case 39:
/*     */           continue;
/*     */         case 5:
/* 634 */           return new Yytoken(1, null);
/*     */         case 40:
/*     */           continue;
/*     */         case 17:
/* 638 */           this.sb.append('\f'); continue;
/*     */         case 41:
/*     */           continue;
/*     */         case 24:
/*     */           try {
/* 643 */             int ch = Integer.parseInt(yytext().substring(2), 16);
/* 644 */             this.sb.append((char)ch);
/*     */           }
/* 646 */           catch (Exception e) {
/* 647 */             throw new ParseException(this.yychar, 2, e);
/*     */           }  continue;
/*     */         case 42:
/*     */           continue;
/*     */         case 20:
/* 652 */           this.sb.append('\t'); continue;
/*     */         case 43:
/*     */           continue;
/*     */         case 7:
/* 656 */           return new Yytoken(3, null);
/*     */         case 44:
/*     */           continue;
/*     */         case 2:
/* 660 */           val = Long.valueOf(yytext()); return new Yytoken(0, val);
/*     */         case 45:
/*     */           continue;
/*     */         case 18:
/* 664 */           this.sb.append('\n'); continue;
/*     */         case 46:
/*     */           continue;
/*     */         case 9:
/* 668 */           return new Yytoken(5, null);
/*     */         
/*     */         case 47:
/*     */         case 3:
/*     */         case 48:
/*     */           continue;
/*     */       } 
/*     */       
/* 676 */       if (zzInput == -1 && this.zzStartRead == this.zzCurrentPos) {
/* 677 */         this.zzAtEOF = true;
/* 678 */         return null;
/*     */       } 
/*     */       
/* 681 */       zzScanError(1);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\miss_\Desktop\Phobos-1.3.3-release.jar!\org\json\simple\parser\Yylex.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */
