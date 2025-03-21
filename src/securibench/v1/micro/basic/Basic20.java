/*
   Copyright 2006 Benjamin Livshits

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */
/**
    @author Benjamin Livshits <livshits@cs.stanford.edu>
    
    $Id: Basic20.java,v 1.7 2006/04/04 20:00:40 livshits Exp $
 */
package securibench.v1.micro.basic;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import securibench.v1.micro.BasicTestCase;
import securibench.v1.micro.MicroTestCase;

/** 
 *  @servlet description="simple SQL injection" 
 *  @servlet vuln_count = "1" 
 *  */
public class Basic20 extends BasicTestCase implements MicroTestCase {
    private static final String FIELD_NAME = "name";

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String name = req.getParameter(FIELD_NAME);

        Connection con = null;
        try {
            con = DriverManager.getConnection(MicroTestCase.CONNECTION_STRING);
            Statement stmt = con.createStatement();
            stmt.execute("select * from Users where name=" + name);     /* BAD */
        } catch (SQLException e) {
            System.err.println("An error occurred");
        } finally {
            try {
                if(con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        
    }
    
    public String getDescription() {
        return "simple SQL injection";
    }
    
    public int getVulnerabilityCount() {
        return 1;
    }
}