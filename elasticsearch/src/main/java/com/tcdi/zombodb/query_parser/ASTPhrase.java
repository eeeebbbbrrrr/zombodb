/* Generated By:JJTree: Do not edit this line. ASTPhrase.java Version 6.1 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.tcdi.zombodb.query_parser;

public
class ASTPhrase extends com.tcdi.zombodb.query_parser.QueryParserNode {

  private boolean beenSubparsed = false;

  public ASTPhrase(int id) {
    super(id);
  }

  public ASTPhrase(QueryParser p, int id) {
    super(p, id);
  }

  public boolean isBeenSubparsed() {
    return beenSubparsed;
  }

  public void setBeenSubparsed(boolean beenSubparsed) {
    this.beenSubparsed = beenSubparsed;
  }

  /** Accept the visitor. **/
  public Object jjtAccept(QueryParserVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=853ecfad975acea4677258c2f633eb46 (do not edit this line) */
