//import com.sun.rowset.CachedRowSetImpl;
//
//import javax.sql.rowset.CachedRowSet;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//

/**
 * Created by mega on 11.09.2016.
 */
//public class CachedRowSetExample {
//
//
//    public ResultSet executeQuery(String sql, String[] getValue)
//    {
//        Connection conn = null;
//        PreparedStatement pstmt = null;
//        ResultSet rs = null;
//        try
//        {
//            conn = getConn();
//            pstmt = conn.prepareStatement(sql);
//            if (getValue != null)
//            {
//                for (int i = 0; i < getValue.length; i++)
//                {
//                    pstmt.setString(i + 1, getValue[i]);
//                }
//            }
//            rs = pstmt.executeQuery();
//
////            CachedRowSet rowset = new CachedRowSetImpl();
////            rowset.populate(rs);
////
////            con.close();
//        } catch (Exception e)
//        {
//            e.printStackTrace();
//            closeAll(conn, pstmt, rs);
//        }
//        return rs;
//    }
//}
//
//// http://stackoverflow.com/questions/1910049/where-to-close-a-jdbc-connection-while-i-want-to-return-the-resultset?rq=1
//
//// Best Practices for JDBC Programming
//// http://java.sys-con.com/node/46653
//// http://stackoverflow.com/questions/1039419/when-to-close-connection-statement-preparedstatement-and-resultset-in-jdbc?rq=1

