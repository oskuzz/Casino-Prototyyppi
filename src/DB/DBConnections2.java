/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.sql.SQLException;

public class DBConnections2 {
    private DBConnections stMan;

    public DBConnections2() throws ClassNotFoundException, SQLException {
        stMan = new DBConnections("Prototyyppi.accdb");
    }

    public DBConnections getStorageManager() {
        return stMan;
    }

}

