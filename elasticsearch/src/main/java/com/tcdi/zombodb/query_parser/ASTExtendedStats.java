/* Generated By:JJTree: Do not edit this line. ASTExtendedStats.java Version 6.1 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.tcdi.zombodb.query_parser;

public
class ASTExtendedStats extends ASTAggregate {
  public ASTExtendedStats(int id) {
    super(id);
  }

  public ASTExtendedStats(QueryParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(QueryParserVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=455c09f1a1614ec857f7d9b822562fbe (do not edit this line) */
