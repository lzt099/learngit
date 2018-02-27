package com.xmg.shopping.base.query;


import lombok.Getter;
import lombok.Setter;


@Getter @Setter
public class QueryObject {
	    private int currentPage = 1;
	    private int pageSize = 5;
	    
	    //设置start
	    public int getStart(){
	    	return (this.currentPage-1)*this.pageSize;
	    }
}
