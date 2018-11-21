package org.esb.http.servlet;

import org.esb.common.URL;
import org.esb.http.AbstractHttpServer;
import org.esb.http.Handler;

public class ServletHttpServer extends AbstractHttpServer{

	public ServletHttpServer(URL url, Handler handler) {
		super(url, handler);
		DispatcherServlet.addHttpHandler(url.getPort(), handler);
	}

}
