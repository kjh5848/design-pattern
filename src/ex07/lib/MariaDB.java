package ex07.lib;

public class MariaDB implements DB {
    private String path;

    //SQL 퀴리 전송(1은 성공, -1은 실패)
    public int execute(String sql) {
        if (path == null) {
            System.out.println("path : null pointe error");
            return -1;
        }

        if (sql.equals("select")) {
            System.out.println("query execute : " + path + "/" + sql);
            return 1;
        } else {
            System.out.println("query fail : syntax error");
            return -1;
        }
    }

    public void setUrl(String path) {
        this.path = path;
    }
}
