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
    
    $Id: Basic15.java,v 1.4 2006/04/04 20:00:40 livshits Exp $
 */
package securibench.v2.micro.basic;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import securibench.v2.micro.BasicTestCase;
import securibench.v2.micro.MicroTestCase;

/**
 * @servlet description="test casts more exhaustively"
 * @servlet vuln_count = "1"
 */
public class Basic15 extends BasicTestCase implements MicroTestCase {
	private static final String FIELD_NAME = "name";

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		String s1 = req.getParameter(FIELD_NAME);
		Object o = s1 + ";";
		String s2 = (String) o;
		StringBuffer buf = new StringBuffer(s2);
		Object o2 = buf;
		String s3 = ((StringBuffer) o2).toString();
		PrintWriter writer = resp.getWriter();
		writer.println(s3); /* BAD */
	}

	public String getDescription() {
		return "test casts more exhaustively";
	}

	public int getVulnerabilityCount() {
		return 1;
	}
}