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
    
    $Id: StrongUpdates4.java,v 1.2 2006/04/04 20:00:41 livshits Exp $
 */
package securibench.v2.micro.strong_updates;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import securibench.v2.micro.BasicTestCase;
import securibench.v2.micro.MicroTestCase;

/**
 * @servlet description="a more tricky test of when we can't assume a strong
 *          update with multiple variables that are not thread-local"
 * @servlet vuln_count = "1"
 */
public class StrongUpdates4 extends BasicTestCase implements MicroTestCase {
	private static final String FIELD_NAME = "name";
	/*
	 * This is really tricky because the field is shared across multiple users of
	 * the same servlet. So, depending on the user interaction, we can have a data
	 * race with two users accessing field "name". Therefore, when u1 sets it, u1
	 * resets it, u2 sets it, u1 reads it, we can still have a problem.
	 */
	private String name;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		name = req.getParameter(FIELD_NAME);
		name = "abc";

		PrintWriter writer = resp.getWriter();
		writer.println(name); /* BAD */
	}

	public String getDescription() {
		return "a more tricky test of when we can't assume a strong "
				+ "update with multiple variables that are not thread-local";
	}

	public int getVulnerabilityCount() {
		return 1;
	}
}