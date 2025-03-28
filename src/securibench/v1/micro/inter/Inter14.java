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
    
    $Id: Inter14.java,v 1.1 2006/04/21 17:14:26 livshits Exp $
 */
package securibench.v1.micro.inter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import securibench.v1.micro.BasicTestCase;
import securibench.v1.micro.MicroTestCase;

/** 
 *  @servlet description="interprocedural loop" 
 *  @servlet vuln_count = "1" 
 *  */
public class Inter14 extends BasicTestCase implements MicroTestCase {
    private static final String FIELD_NAME = "name";

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String s1 = req.getParameter(FIELD_NAME);
        
        for(int i = 0; i < 1500; i++){
        	if(i > 1000 && i < 1200 && (i % 7 == 3)){
        		f(s1, 1000, resp);		
        	}
        }
    }
    
	private void f(String s1, int i, ServletResponse resp) throws IOException {
		if(i != 0) {
		    PrintWriter writer = resp.getWriter();
	        writer.println(s1);                    /* BAD */
		}		
	}

    public String getDescription() {
        return "interprocedural loop";
    }
    
    public int getVulnerabilityCount() {
        return 1;
    }
}