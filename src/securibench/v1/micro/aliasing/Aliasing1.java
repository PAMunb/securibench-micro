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
    
    $Id: Aliasing1.java,v 1.1 2006/04/21 17:14:27 livshits Exp $
 */
package securibench.v1.micro.aliasing;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import securibench.v1.micro.BasicTestCase;
import securibench.v1.micro.MicroTestCase;

/** 
 *  @servlet description="simple aliasing because of assignment" 
 *  @servlet vuln_count = "1" 
 *  */
public class Aliasing1 extends BasicTestCase implements MicroTestCase {
	private static final String FIELD_NAME = "name";

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
       String name = req.getParameter(FIELD_NAME);
       String str = name;
              
       PrintWriter writer = resp.getWriter();
       writer.println(str);                              /* BAD */
    }
    
    public String getDescription() {
        return "simple test of field assignment";
    }
    
    public int getVulnerabilityCount() {
        return 1;
    }
}