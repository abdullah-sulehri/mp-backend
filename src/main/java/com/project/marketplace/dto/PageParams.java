package com.project.marketplace.dto;

public class PageParams {
    private int pageOffset;
    private int pageSize;

    public PageParams(){}

    public PageParams(int pageOffset, int pageSize) {
        this.pageOffset = pageOffset;
        this.pageSize = pageSize;
    }

    public int getPageOffset() {
        return pageOffset;
    }

    public void setPageOffset(int pageOffset) {
        this.pageOffset = pageOffset;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
