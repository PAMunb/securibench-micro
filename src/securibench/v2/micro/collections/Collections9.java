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
    
    $Id: Collections9.java,v 1.1 2006/04/21 17:14:26 livshits Exp $
 */
package securibench.v2.micro.collections;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedList;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import securibench.v2.micro.BasicTestCase;
import securibench.v2.micro.MicroTestCase;

/**
 * @servlet description = "more complex collection copying"
 * @servlet vuln_count = "0"
 */
public class Collections9 extends BasicTestCase implements MicroTestCase {
	private static final String FIELD_NAME = "name";

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		String s1 = req.getParameter(FIELD_NAME);
		LinkedList c1 = new LinkedList();
		c1.addLast(s1);
		ArrayList c2 = new ArrayList();
		c2.add("abc");
		c2.retainAll(c1);
		String s2 = (String) c2.get(0);

		PrintWriter writer = resp.getWriter();
		writer.println(s2); /* OK */
	}

	public String getDescription() {
		return "more complex collection copying";
	}

	public int getVulnerabilityCount() {
		return 0; //FLAKY
	}
}