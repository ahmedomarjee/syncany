package org.syncany.gui.command;
/*
 * Syncany, www.syncany.org
 * Copyright (C) 2011-2014 Philipp C. Heckel <philipp.heckel@gmail.com> 
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */


import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.Test;
import org.syncany.operations.daemon.messages.ListWatchesManagementRequest;
import org.syncany.operations.daemon.messages.api.Request;
import org.syncany.operations.daemon.messages.api.Response;

public class GUIClientTest {	
	private static final Logger logger = Logger.getLogger(GUIClientTest.class.getSimpleName());
	
	@Test
	public void testGuiClient() throws Exception {
		GUIClient gc = new GUIClient();
		Request req = new ListWatchesManagementRequest();
		req.setId(Math.abs(new Random().nextInt()));
		Response response = gc.runCommand(req);
		logger.log(Level.FINE, response.toString());
	}	
}
