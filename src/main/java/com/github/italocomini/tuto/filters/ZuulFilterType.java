package com.github.italocomini.tuto.filters;

public enum ZuulFilterType {
	PRE("pre"), POST("post"), ROUTE("route"), ERROR("error");

	private final String type;

	ZuulFilterType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

}
