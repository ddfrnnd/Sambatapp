
package config;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class koneksi {
    public static Connection Go(){
        try {
            MysqlDataSource m = new MysqlDataSource(); //untuk koneksi ke database MySQL
            m.setServerName("localhost"); 
            m.setDatabaseName("sambat"); 
//          m.setDatabaseName("sambatdb"); /      
            m.setUser("root"); 
            m.setPassword(""); 
            m.setPortNumber(3306); 
            m.setServerTimezone("Asia/Jakarta"); 
            
            Connection C = m.getConnection(); 
//membuka koneksi ke database dengan menggunakan parameter koneksi yang telah ditetapkan sebelumnya
//            System.out.println("Koneksi sukses");
            return C;
        } catch (SQLException e) { //digunakan untuk menangani kemungkinan terjadinya error
            System.err.println("Koneksi Gagal!\n"+
                    e.getMessage());
        }
//Jika koneksi berhasil dibuat, maka fungsi Go() akan mengembalikan objek Connection C. 
//Jika terjadi error, maka akan mengembalikan nilai null
        return null;
    }
}
