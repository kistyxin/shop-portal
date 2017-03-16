package com.taotao.portal.service;

import com.taotao.portal.pojo.SearchResult;

public interface SearchService {
	//要查询的字符串和当前页
	SearchResult search(String queryString,int page);

}
