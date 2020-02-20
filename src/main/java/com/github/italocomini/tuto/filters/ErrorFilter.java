package com.github.italocomini.tuto.filters;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

public class ErrorFilter extends ZuulFilter {
	private static Logger log = LoggerFactory.getLogger(ErrorFilter.class);

	@Override
	public String filterType() {
		return ZuulFilterType.ERROR.getType();
	}

	@Override
	public int filterOrder() {
		return 1;
	}

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() {
		RequestContext ctx = RequestContext.getCurrentContext();
		HttpServletRequest request = ctx.getRequest();
		
		log.info("{} request para {}", request.getMethod(), request.getRequestURL().toString());

		return null;
	}
}
