package com.github.italocomini.tuto.filters;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

public class PostFilter extends ZuulFilter {
	private static Logger log = LoggerFactory.getLogger(PostFilter.class);

	@Override
	public String filterType() {
		return ZuulFilterType.POST.getType();
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

		ctx.addZuulRequestHeader("zull-api-gateway", "exemploRequestHeader");

		long tempoInicial = Long.parseLong(request.getAttribute("tempoInicial").toString());
		long duracao = System.currentTimeMillis() - tempoInicial;

		log.info("{} request para {} levou {}ms", request.getMethod(), request.getRequestURL().toString(), duracao);

		return null;
	}
}
