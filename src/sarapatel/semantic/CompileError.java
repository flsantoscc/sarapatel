package sarapatel.semantic;

public class CompileError extends Exception {

    private String message = null;
    private int line = -1;
    private int pos = -1;

    public CompileError(int line, int pos, String message) {
        this.line = line;
        this.pos = pos;
        this.message = message;
    }

    public CompileError(String message) {
        this.message = message;
    }

    public void setLinePos(int line, int pos) {
        this.line = line;
        this.pos = pos;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public String getMessage() {
        if (message != null) {
            if (line == -1) {
                if (pos == -1) {
                    return message;
                } else {
                    return "position " + new Integer(pos) + "  : " + message;
                }
            } else {
                if (pos == -1) {
                    return "line " + new Integer(line) + "  : " + message;
                } else {
                    return "line " + new Integer(line) + " ,  position " + new Integer(pos) + "  : " + message;
                }
            }
        }
        return null;
    }

}
