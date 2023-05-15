public class Main {
    public static void main(String[] args) {

        if (args[0].equals("MySQL")) {
            MySQL mySQL = new MySQL();
            Guide guide = new Guide(mySQL);
            guide.construct();
            String get_select = mySQL.select();
            System.out.println(select);
            String get_where = mySQL.where();
            System.out.println(where);
            String get_limit = mySQL.limit();
            System.out.println(limit);
            String get_SQL = mySQL.getSQL();
            System.out.println(getSQL);
        } 
        
        else if (args[0].equals("PostgreSQL")) {
            PostgreSQL postgreSQL = new PostgreSQL();
            Guide guide = new Guide(postgreSQL);
            guide.construct();
            String get_select = postgreSQL.select();
            System.out.println(select);
            String get_where = postgreSQL.where();
            System.out.println(where);
            String get_limit = postgreSQL.limit();
            System.out.println(limit);
            String get_SQL = postgreSQL.getSQL();
            System.out.println(getSQL);
        } 
        
        else {
            System.exit(0);
        }
    }
}
