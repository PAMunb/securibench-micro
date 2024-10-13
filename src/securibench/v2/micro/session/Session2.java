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
    
    $Id: Session2.java,v 1.3 2006/04/04 20:00:41 livshits Exp $
 */
package securibench.v2.micro.session;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import securibench.micro.BasicTestCase;
import securibench.micro.MicroTestCase;

/**
 * @servlet description="test of session false positives"
 * @servlet vuln_count = "1"
 */
public class Session2 extends BasicTestCase implements MicroTestCase {
	private static final String FIELD_NAME = "name";

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		String name = req.getParameter(FIELD_NAME);
		HttpSession session = req.getSession();
		session.setAttribute("name", name);
		String s2 = (String) session.getAttribute("name");
		String s3 = (String) session.getAttribute("nonsense");
		PrintWriter writer = resp.getWriter();

		writer.println(s2); /* BAD */
		writer.println(s3); /* OK */
	}

	public String getDescription() {
		return "test of session false positives";
	}

	public int getVulnerabilityCount() {
		return 1;
	}
}