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
   
   $Id: Pred4.java,v 1.4 2006/04/04 20:00:40 livshits Exp $
 */
package securibench.v1.micro.pred;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import securibench.v1.micro.BasicTestCase;
import securibench.v1.micro.MicroTestCase;

/** 
 *  @servlet description="correlated test with an int variable" 
 *  @servlet vuln_count = "1" 
 *  */
public class Pred4 extends BasicTestCase implements MicroTestCase {
    private static final String FIELD_NAME = "name";

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        int x = 3;
        
        String name = req.getParameter(FIELD_NAME);
        
        if(x == 3) {    // should always be taken
            PrintWriter writer = resp.getWriter();
            writer.println(name);              /* BAD */     // nothing bad gets here
        }
    }

    public String getDescription() {
        return "correlated test with an int variable";
    }

    public int getVulnerabilityCount() {
        return 1;
    }    
}