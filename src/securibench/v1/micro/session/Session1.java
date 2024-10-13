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
    
    $Id: Session1.java,v 1.3 2006/04/04 20:00:41 livshits Exp $
 */
package securibench.v1.micro.session;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import securibench.v1.micro.BasicTestCase;
import securibench.v1.micro.MicroTestCase;

/** 
 *  @servlet description="simple session test" 
 *  @servlet vuln_count = "1" 
 *  */
public class Session1 extends BasicTestCase implements MicroTestCase {
    private static final String FIELD_NAME = "name";

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
       String name = req.getParameter(FIELD_NAME);
       HttpSession session = req.getSession();
       session.setAttribute("name", name);
       String s2 = (String) session.getAttribute("name");
       
       PrintWriter writer = resp.getWriter();
       writer.println(s2);                              /* BAD */
    }
    
    public String getDescription() {
        return "simple session test";
    }
    
    public int getVulnerabilityCount() {
        return 1;
    }
}