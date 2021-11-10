
package Storage;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexion {
    Connection conn;
    public Connection Conexion(){
    try{
        DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());
        Connection con = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/storage","root", "");
        // con.createStatement();
        this.conn=con;
    } catch (Exception e){
        //e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error en la Conexion");
    }
    return this.conn;

    }
}
