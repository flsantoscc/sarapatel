package sarapatel.table;

/**
 * NT
 */
public class NT {
    private String name;
    private ST il;

    public NT(String name, ST il) {
        this.name = name;
        this.il = il;
    }

    public ST getIl() {
        return il;
    }

    public void setIl(ST il) {
        this.il = il;
    }

    public Entry get(int i) {
        ST st = il;
        while (st.getNo() != i) {
            st = st.getIl();
            if (st == null) {
                return null;
            }
        }
        return st.getEntry();
    }

}
