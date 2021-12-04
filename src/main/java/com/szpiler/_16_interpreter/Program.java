package com.szpiler._16_interpreter;

import com.szpiler._16_interpreter.expression.AndExpression;
import com.szpiler._16_interpreter.expression.TerminalExpression;
import com.szpiler._16_interpreter.expression.AbstractExpression;
import com.szpiler._16_interpreter.expression.OrExpression;

public class Program {
  public static void main(String[] args) {
    AbstractExpression janekString = new TerminalExpression("janek");
    AbstractExpression annString = new TerminalExpression("ann");
    AbstractExpression jamieString = new TerminalExpression("jamie");
    AbstractExpression kateString = new TerminalExpression("kate");

    AbstractExpression isSingle = new TerminalExpression("single");
    AbstractExpression isMarried = new TerminalExpression("married");

    AbstractExpression isMale = new OrExpression(janekString, jamieString);
    AbstractExpression isFemale = new OrExpression(annString, kateString);

    AbstractExpression isSingleFemale = new AndExpression(isSingle, isFemale);
    AbstractExpression isMarriedMale = new AndExpression(isMarried, isMale);

    System.out.println(isSingleFemale.interpret("currently kate is single, but she hope to meet someone"));
    System.out.println(isSingleFemale.interpret("bla bla bla"));
    System.out.println(isMarriedMale.interpret("his best friend jamie, he was lucky to meet ann and to be married with her"));

    String context = "today is 2020-10-10 which could be interpreted as X";

  }
}
