// Autogenerated AST node
package org.python.antlr.ast;
import org.python.antlr.PythonTree;
import org.antlr.runtime.Token;
import java.io.DataOutputStream;
import java.io.IOException;

public class Subscript extends exprType {
    public exprType value;
    public sliceType slice;
    public expr_contextType ctx;

    public static final String[] _fields = new String[] {"value","slice","ctx"};

    public Subscript(Token token, exprType value, sliceType slice,
    expr_contextType ctx) {
        super(token);
        this.value = value;
        this.slice = slice;
        this.ctx = ctx;
    }

    public Subscript(PythonTree tree, exprType value, sliceType slice,
    expr_contextType ctx) {
        super(tree);
        this.value = value;
        this.slice = slice;
        this.ctx = ctx;
    }

    public String toString() {
        return "Subscript";
    }

    public <R> R accept(VisitorIF<R> visitor) throws Exception {
        return visitor.visitSubscript(this);
    }

    public void traverse(VisitorIF visitor) throws Exception {
        if (value != null)
            value.accept(visitor);
        if (slice != null)
            slice.accept(visitor);
    }

}